package tech.zxuuu.hotel24h.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.zxuuu.hotel24h.entity.Room;
import tech.zxuuu.hotel24h.mapper.RoomMapper;
import tech.zxuuu.hotel24h.service.RoomService;

import java.util.Date;
import java.util.List;

@Service
public class RoomServiceImpl implements RoomService {

  @Autowired
  private RoomMapper roomMapper;

  @Override
  public List<Room> getAllRooms() {
    return roomMapper.selectAllRooms();
  }

  @Override
  public void updateRoom(int id,String state)
  {
    roomMapper.changeRoomState(state,id);
  }

  @Override
  public int cost(int id)
  {
    return roomMapper.selectRoomCost(id);
  }

  /**
   * 状态码：0：成功添加；1：房间重复
   */
   /* @Override
  public Integer addRoom(Room room) {
    Room roomTest = roomMapper.selectRoomById(room.getId());
    if (roomTest != null) {
      return 1;
    }
    roomMapper.insertRoom(room);
    return 0;
  }

  @Override
  public Integer updateRoom(Room room) {
    roomMapper.updateRoom(room);
    return 0;
  }*/

  /**
   * 状态码：1：房间不存在；2：删除成功
   */
  /*
  @Override
  public Integer deleteRoom(Integer roomId) {
    if (roomMapper.selectRoomById(roomId) == null) {
      return 1;
    } else {
      roomMapper.deleteRoom(roomId);
      return 0;
    }
  }*/
}
