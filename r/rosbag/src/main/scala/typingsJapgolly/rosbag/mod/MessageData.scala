package typingsJapgolly.rosbag.mod

import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageData
  extends StObject
     with Record {
  
  var conn: Double
  
  var data: Buffer
  
  var time: Time
}
object MessageData {
  
  inline def apply(
    conn: Double,
    data: Buffer,
    dataOffset: Double,
    end: Double,
    length: Double,
    offset: Double,
    parseData: Buffer => japgolly.scalajs.react.Callback,
    time: Time
  ): MessageData = {
    val __obj = js.Dynamic.literal(conn = conn.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], dataOffset = dataOffset.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], parseData = js.Any.fromFunction1((t0: Buffer) => parseData(t0).runNow()), time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageData]
  }
  
  extension [Self <: MessageData](x: Self) {
    
    inline def setConn(value: Double): Self = StObject.set(x, "conn", value.asInstanceOf[js.Any])
    
    inline def setData(value: Buffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setTime(value: Time): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
  }
}
