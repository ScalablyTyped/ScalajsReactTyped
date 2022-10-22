package typingsJapgolly.rosbag.mod

import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BagHeader
  extends StObject
     with Record {
  
  var chunkCount: Double
  
  var connectionCount: Double
  
  var indexPosition: Double
}
object BagHeader {
  
  inline def apply(
    chunkCount: Double,
    connectionCount: Double,
    dataOffset: Double,
    end: Double,
    indexPosition: Double,
    length: Double,
    offset: Double,
    parseData: Buffer => japgolly.scalajs.react.Callback
  ): BagHeader = {
    val __obj = js.Dynamic.literal(chunkCount = chunkCount.asInstanceOf[js.Any], connectionCount = connectionCount.asInstanceOf[js.Any], dataOffset = dataOffset.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], indexPosition = indexPosition.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], parseData = js.Any.fromFunction1((t0: Buffer) => parseData(t0).runNow()))
    __obj.asInstanceOf[BagHeader]
  }
  
  extension [Self <: BagHeader](x: Self) {
    
    inline def setChunkCount(value: Double): Self = StObject.set(x, "chunkCount", value.asInstanceOf[js.Any])
    
    inline def setConnectionCount(value: Double): Self = StObject.set(x, "connectionCount", value.asInstanceOf[js.Any])
    
    inline def setIndexPosition(value: Double): Self = StObject.set(x, "indexPosition", value.asInstanceOf[js.Any])
  }
}
