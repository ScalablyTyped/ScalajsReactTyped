package typingsJapgolly.sharepoint

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CalloutAction extends StObject {
  
  def getDisabledToolTip(): String
  
  def getIsDisabledCallback(action: CalloutAction): Boolean
  
  def getIsMenu(): Boolean
  
  def getIsVisibleCallback(action: CalloutAction): Boolean
  
  def getMenuEntries(): js.Array[CalloutActionMenuEntry]
  
  def getOnClickCallback(event: Any, action: CalloutAction): Any
  
  def getText(): String
  
  def getToolTop(): String
  
  def isEnabled(): Boolean
  
  def isVisible(): Boolean
  
  def render(): Unit
  
  def set(options: CalloutActionOptions): Unit
}
object CalloutAction {
  
  inline def apply(
    getDisabledToolTip: CallbackTo[String],
    getIsDisabledCallback: CalloutAction => Boolean,
    getIsMenu: CallbackTo[Boolean],
    getIsVisibleCallback: CalloutAction => Boolean,
    getMenuEntries: CallbackTo[js.Array[CalloutActionMenuEntry]],
    getOnClickCallback: (Any, CalloutAction) => Any,
    getText: CallbackTo[String],
    getToolTop: CallbackTo[String],
    isEnabled: CallbackTo[Boolean],
    isVisible: CallbackTo[Boolean],
    render: Callback,
    set: CalloutActionOptions => Callback
  ): CalloutAction = {
    val __obj = js.Dynamic.literal(getDisabledToolTip = getDisabledToolTip.toJsFn, getIsDisabledCallback = js.Any.fromFunction1(getIsDisabledCallback), getIsMenu = getIsMenu.toJsFn, getIsVisibleCallback = js.Any.fromFunction1(getIsVisibleCallback), getMenuEntries = getMenuEntries.toJsFn, getOnClickCallback = js.Any.fromFunction2(getOnClickCallback), getText = getText.toJsFn, getToolTop = getToolTop.toJsFn, isEnabled = isEnabled.toJsFn, isVisible = isVisible.toJsFn, render = render.toJsFn, set = js.Any.fromFunction1((t0: CalloutActionOptions) => set(t0).runNow()))
    __obj.asInstanceOf[CalloutAction]
  }
  
  extension [Self <: CalloutAction](x: Self) {
    
    inline def setGetDisabledToolTip(value: CallbackTo[String]): Self = StObject.set(x, "getDisabledToolTip", value.toJsFn)
    
    inline def setGetIsDisabledCallback(value: CalloutAction => Boolean): Self = StObject.set(x, "getIsDisabledCallback", js.Any.fromFunction1(value))
    
    inline def setGetIsMenu(value: CallbackTo[Boolean]): Self = StObject.set(x, "getIsMenu", value.toJsFn)
    
    inline def setGetIsVisibleCallback(value: CalloutAction => Boolean): Self = StObject.set(x, "getIsVisibleCallback", js.Any.fromFunction1(value))
    
    inline def setGetMenuEntries(value: CallbackTo[js.Array[CalloutActionMenuEntry]]): Self = StObject.set(x, "getMenuEntries", value.toJsFn)
    
    inline def setGetOnClickCallback(value: (Any, CalloutAction) => Any): Self = StObject.set(x, "getOnClickCallback", js.Any.fromFunction2(value))
    
    inline def setGetText(value: CallbackTo[String]): Self = StObject.set(x, "getText", value.toJsFn)
    
    inline def setGetToolTop(value: CallbackTo[String]): Self = StObject.set(x, "getToolTop", value.toJsFn)
    
    inline def setIsEnabled(value: CallbackTo[Boolean]): Self = StObject.set(x, "isEnabled", value.toJsFn)
    
    inline def setIsVisible(value: CallbackTo[Boolean]): Self = StObject.set(x, "isVisible", value.toJsFn)
    
    inline def setRender(value: Callback): Self = StObject.set(x, "render", value.toJsFn)
    
    inline def setSet(value: CalloutActionOptions => Callback): Self = StObject.set(x, "set", js.Any.fromFunction1((t0: CalloutActionOptions) => value(t0).runNow()))
  }
}
