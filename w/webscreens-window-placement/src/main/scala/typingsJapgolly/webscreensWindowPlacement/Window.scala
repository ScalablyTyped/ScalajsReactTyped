package typingsJapgolly.webscreensWindowPlacement

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// enhance window.Window with getScreenDetails method.
trait Window extends StObject {
  
  def getScreenDetails(): js.Promise[ScreenDetails]
}
object Window {
  
  inline def apply(getScreenDetails: CallbackTo[js.Promise[ScreenDetails]]): Window = {
    val __obj = js.Dynamic.literal(getScreenDetails = getScreenDetails.toJsFn)
    __obj.asInstanceOf[Window]
  }
  
  extension [Self <: Window](x: Self) {
    
    inline def setGetScreenDetails(value: CallbackTo[js.Promise[ScreenDetails]]): Self = StObject.set(x, "getScreenDetails", value.toJsFn)
  }
}
