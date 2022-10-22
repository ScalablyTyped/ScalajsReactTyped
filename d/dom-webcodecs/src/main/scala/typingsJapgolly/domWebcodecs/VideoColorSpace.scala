package typingsJapgolly.domWebcodecs

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.VideoColorPrimaries
import typingsJapgolly.std.VideoMatrixCoefficients
import typingsJapgolly.std.VideoTransferCharacteristics
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoColorSpace extends StObject {
  
  val fullRange: Boolean | Null
  
  val matrix: VideoMatrixCoefficients | Null
  
  val primaries: VideoColorPrimaries | Null
  
  def toJSON(): VideoColorSpaceInit
  
  val transfer: VideoTransferCharacteristics | Null
}
object VideoColorSpace {
  
  inline def apply(toJSON: CallbackTo[VideoColorSpaceInit]): VideoColorSpace = {
    val __obj = js.Dynamic.literal(toJSON = toJSON.toJsFn, fullRange = null, matrix = null, primaries = null, transfer = null)
    __obj.asInstanceOf[VideoColorSpace]
  }
  
  extension [Self <: VideoColorSpace](x: Self) {
    
    inline def setFullRange(value: Boolean): Self = StObject.set(x, "fullRange", value.asInstanceOf[js.Any])
    
    inline def setFullRangeNull: Self = StObject.set(x, "fullRange", null)
    
    inline def setMatrix(value: VideoMatrixCoefficients): Self = StObject.set(x, "matrix", value.asInstanceOf[js.Any])
    
    inline def setMatrixNull: Self = StObject.set(x, "matrix", null)
    
    inline def setPrimaries(value: VideoColorPrimaries): Self = StObject.set(x, "primaries", value.asInstanceOf[js.Any])
    
    inline def setPrimariesNull: Self = StObject.set(x, "primaries", null)
    
    inline def setToJSON(value: CallbackTo[VideoColorSpaceInit]): Self = StObject.set(x, "toJSON", value.toJsFn)
    
    inline def setTransfer(value: VideoTransferCharacteristics): Self = StObject.set(x, "transfer", value.asInstanceOf[js.Any])
    
    inline def setTransferNull: Self = StObject.set(x, "transfer", null)
  }
}
