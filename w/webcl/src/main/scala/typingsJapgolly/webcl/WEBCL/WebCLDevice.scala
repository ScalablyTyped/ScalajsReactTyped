package typingsJapgolly.webcl.WEBCL

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// 3.3
trait WebCLDevice extends StObject {
  
  def enableExtension(extensionName: String): Boolean
  
  def getInfo(name: DeviceInfo): Any
  
  def getSupportedExtensions(): js.Array[String]
}
object WebCLDevice {
  
  inline def apply(
    enableExtension: String => Boolean,
    getInfo: DeviceInfo => Any,
    getSupportedExtensions: CallbackTo[js.Array[String]]
  ): WebCLDevice = {
    val __obj = js.Dynamic.literal(enableExtension = js.Any.fromFunction1(enableExtension), getInfo = js.Any.fromFunction1(getInfo), getSupportedExtensions = getSupportedExtensions.toJsFn)
    __obj.asInstanceOf[WebCLDevice]
  }
  
  extension [Self <: WebCLDevice](x: Self) {
    
    inline def setEnableExtension(value: String => Boolean): Self = StObject.set(x, "enableExtension", js.Any.fromFunction1(value))
    
    inline def setGetInfo(value: DeviceInfo => Any): Self = StObject.set(x, "getInfo", js.Any.fromFunction1(value))
    
    inline def setGetSupportedExtensions(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "getSupportedExtensions", value.toJsFn)
  }
}
