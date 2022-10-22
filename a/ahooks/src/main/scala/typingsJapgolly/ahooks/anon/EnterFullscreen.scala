package typingsJapgolly.ahooks.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.ahooks.ahooksBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnterFullscreen extends StObject {
  
  def enterFullscreen(): Unit
  
  def exitFullscreen(): Unit
  
  val isEnabled: `true`
  
  def toggleFullscreen(): Unit
}
object EnterFullscreen {
  
  inline def apply(enterFullscreen: Callback, exitFullscreen: Callback, toggleFullscreen: Callback): EnterFullscreen = {
    val __obj = js.Dynamic.literal(enterFullscreen = enterFullscreen.toJsFn, exitFullscreen = exitFullscreen.toJsFn, isEnabled = true, toggleFullscreen = toggleFullscreen.toJsFn)
    __obj.asInstanceOf[EnterFullscreen]
  }
  
  extension [Self <: EnterFullscreen](x: Self) {
    
    inline def setEnterFullscreen(value: Callback): Self = StObject.set(x, "enterFullscreen", value.toJsFn)
    
    inline def setExitFullscreen(value: Callback): Self = StObject.set(x, "exitFullscreen", value.toJsFn)
    
    inline def setIsEnabled(value: `true`): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
    
    inline def setToggleFullscreen(value: Callback): Self = StObject.set(x, "toggleFullscreen", value.toJsFn)
  }
}
