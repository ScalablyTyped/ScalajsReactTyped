package typingsJapgolly.figma.mod.global

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////////////////////////////////////////////////////////////////
// Other
trait Image extends StObject {
  
  def getBytesAsync(): js.Promise[js.typedarray.Uint8Array]
  
  val hash: String
}
object Image {
  
  inline def apply(getBytesAsync: CallbackTo[js.Promise[js.typedarray.Uint8Array]], hash: String): Image = {
    val __obj = js.Dynamic.literal(getBytesAsync = getBytesAsync.toJsFn, hash = hash.asInstanceOf[js.Any])
    __obj.asInstanceOf[Image]
  }
  
  extension [Self <: Image](x: Self) {
    
    inline def setGetBytesAsync(value: CallbackTo[js.Promise[js.typedarray.Uint8Array]]): Self = StObject.set(x, "getBytesAsync", value.toJsFn)
    
    inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
  }
}
