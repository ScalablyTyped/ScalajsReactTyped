package typingsJapgolly.webcl.WEBCL

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// 3.6.2
trait WebCLImage
  extends StObject
     with WebCLMemoryObject {
  
  def getInfo(): WebCLImageDescriptor
}
object WebCLImage {
  
  inline def apply(getInfo: CallbackTo[WebCLImageDescriptor], release: Callback): WebCLImage = {
    val __obj = js.Dynamic.literal(getInfo = getInfo.toJsFn, release = release.toJsFn)
    __obj.asInstanceOf[WebCLImage]
  }
  
  extension [Self <: WebCLImage](x: Self) {
    
    inline def setGetInfo(value: CallbackTo[WebCLImageDescriptor]): Self = StObject.set(x, "getInfo", value.toJsFn)
  }
}
