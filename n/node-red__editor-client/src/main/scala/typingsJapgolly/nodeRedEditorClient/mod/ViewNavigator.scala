package typingsJapgolly.nodeRedEditorClient.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewNavigator extends StObject {
  
  def init(): Unit
  
  def refresh(): Unit
  
  def resize(): Unit
  
  def toggle(): Unit
}
object ViewNavigator {
  
  inline def apply(init: Callback, refresh: Callback, resize: Callback, toggle: Callback): ViewNavigator = {
    val __obj = js.Dynamic.literal(init = init.toJsFn, refresh = refresh.toJsFn, resize = resize.toJsFn, toggle = toggle.toJsFn)
    __obj.asInstanceOf[ViewNavigator]
  }
  
  extension [Self <: ViewNavigator](x: Self) {
    
    inline def setInit(value: Callback): Self = StObject.set(x, "init", value.toJsFn)
    
    inline def setRefresh(value: Callback): Self = StObject.set(x, "refresh", value.toJsFn)
    
    inline def setResize(value: Callback): Self = StObject.set(x, "resize", value.toJsFn)
    
    inline def setToggle(value: Callback): Self = StObject.set(x, "toggle", value.toJsFn)
  }
}
