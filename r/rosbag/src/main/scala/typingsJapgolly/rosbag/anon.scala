package typingsJapgolly.rosbag

import typingsJapgolly.rosbag.mod.ChunkInfo
import typingsJapgolly.rosbag.mod.Connection
import typingsJapgolly.rosbag.mod.Time
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ChunkInfos extends StObject {
    
    var chunkInfos: js.Array[ChunkInfo]
    
    var connections: js.Array[Connection]
  }
  object ChunkInfos {
    
    inline def apply(chunkInfos: js.Array[ChunkInfo], connections: js.Array[Connection]): ChunkInfos = {
      val __obj = js.Dynamic.literal(chunkInfos = chunkInfos.asInstanceOf[js.Any], connections = connections.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChunkInfos]
    }
    
    extension [Self <: ChunkInfos](x: Self) {
      
      inline def setChunkInfos(value: js.Array[ChunkInfo]): Self = StObject.set(x, "chunkInfos", value.asInstanceOf[js.Any])
      
      inline def setChunkInfosVarargs(value: ChunkInfo*): Self = StObject.set(x, "chunkInfos", js.Array(value*))
      
      inline def setConnections(value: js.Array[Connection]): Self = StObject.set(x, "connections", value.asInstanceOf[js.Any])
      
      inline def setConnectionsVarargs(value: Connection*): Self = StObject.set(x, "connections", js.Array(value*))
    }
  }
  
  trait Conn extends StObject {
    
    var conn: Double
    
    var count: Double
  }
  object Conn {
    
    inline def apply(conn: Double, count: Double): Conn = {
      val __obj = js.Dynamic.literal(conn = conn.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any])
      __obj.asInstanceOf[Conn]
    }
    
    extension [Self <: Conn](x: Self) {
      
      inline def setConn(value: Double): Self = StObject.set(x, "conn", value.asInstanceOf[js.Any])
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    }
  }
  
  trait Freeze extends StObject {
    
    var freeze: js.UndefOr[Boolean] = js.undefined
  }
  object Freeze {
    
    inline def apply(): Freeze = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Freeze]
    }
    
    extension [Self <: Freeze](x: Self) {
      
      inline def setFreeze(value: Boolean): Self = StObject.set(x, "freeze", value.asInstanceOf[js.Any])
      
      inline def setFreezeUndefined: Self = StObject.set(x, "freeze", js.undefined)
    }
  }
  
  trait Offset extends StObject {
    
    var offset: Double
    
    var time: Time
  }
  object Offset {
    
    inline def apply(offset: Double, time: Time): Offset = {
      val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
      __obj.asInstanceOf[Offset]
    }
    
    extension [Self <: Offset](x: Self) {
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setTime(value: Time): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    }
  }
  
  trait Opcode extends StObject {
    
    var opcode: Double
  }
  object Opcode {
    
    inline def apply(opcode: Double): Opcode = {
      val __obj = js.Dynamic.literal(opcode = opcode.asInstanceOf[js.Any])
      __obj.asInstanceOf[Opcode]
    }
    
    extension [Self <: Opcode](x: Self) {
      
      inline def setOpcode(value: Double): Self = StObject.set(x, "opcode", value.asInstanceOf[js.Any])
    }
  }
}
