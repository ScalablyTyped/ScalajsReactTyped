package typingsJapgolly.webvrApi

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Navigator extends StObject {
  
  val activeVRDisplays: js.Array[VRDisplay]
  
  def getVRDisplays(): js.Promise[js.Array[VRDisplay]]
}
object Navigator {
  
  inline def apply(activeVRDisplays: js.Array[VRDisplay], getVRDisplays: CallbackTo[js.Promise[js.Array[VRDisplay]]]): Navigator = {
    val __obj = js.Dynamic.literal(activeVRDisplays = activeVRDisplays.asInstanceOf[js.Any], getVRDisplays = getVRDisplays.toJsFn)
    __obj.asInstanceOf[Navigator]
  }
  
  extension [Self <: Navigator](x: Self) {
    
    inline def setActiveVRDisplays(value: js.Array[VRDisplay]): Self = StObject.set(x, "activeVRDisplays", value.asInstanceOf[js.Any])
    
    inline def setActiveVRDisplaysVarargs(value: VRDisplay*): Self = StObject.set(x, "activeVRDisplays", js.Array(value*))
    
    inline def setGetVRDisplays(value: CallbackTo[js.Promise[js.Array[VRDisplay]]]): Self = StObject.set(x, "getVRDisplays", value.toJsFn)
  }
}
