package typingsJapgolly.bmapgl.BMapGL

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MenuItem extends StObject {
  
  def disable(): Unit
  
  def enable(): Unit
  
  def setIcon(iconUrl: String): Unit
  
  def setText(text: String): Unit
}
object MenuItem {
  
  inline def apply(
    disable: japgolly.scalajs.react.Callback,
    enable: japgolly.scalajs.react.Callback,
    setIcon: String => japgolly.scalajs.react.Callback,
    setText: String => japgolly.scalajs.react.Callback
  ): MenuItem = {
    val __obj = js.Dynamic.literal(disable = disable.toJsFn, enable = enable.toJsFn, setIcon = js.Any.fromFunction1((t0: String) => setIcon(t0).runNow()), setText = js.Any.fromFunction1((t0: String) => setText(t0).runNow()))
    __obj.asInstanceOf[MenuItem]
  }
  
  extension [Self <: MenuItem](x: Self) {
    
    inline def setDisable(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "disable", value.toJsFn)
    
    inline def setEnable(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "enable", value.toJsFn)
    
    inline def setSetIcon(value: String => japgolly.scalajs.react.Callback): Self = StObject.set(x, "setIcon", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetText(value: String => japgolly.scalajs.react.Callback): Self = StObject.set(x, "setText", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
