package typingsJapgolly.rsocketTypes.reactiveSocketTypesMod

import typingsJapgolly.rsocketTypes.rsocketTypesInts.`0x04`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestResponseFrame
  extends StObject
     with Frame {
  
  var data: js.UndefOr[Encodable] = js.undefined
  
  var flags: Double
  
  var length: js.UndefOr[Double] = js.undefined
  
  var metadata: js.UndefOr[Encodable] = js.undefined
  
  var streamId: Double
  
  var `type`: `0x04`
}
object RequestResponseFrame {
  
  inline def apply(flags: Double, streamId: Double): RequestResponseFrame = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], streamId = streamId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(0x04)
    __obj.asInstanceOf[RequestResponseFrame]
  }
  
  extension [Self <: RequestResponseFrame](x: Self) {
    
    inline def setData(value: Encodable): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setFlags(value: Double): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setMetadata(value: Encodable): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setStreamId(value: Double): Self = StObject.set(x, "streamId", value.asInstanceOf[js.Any])
    
    inline def setType(value: `0x04`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
