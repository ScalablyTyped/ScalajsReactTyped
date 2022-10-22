package typingsJapgolly.antDesignReactNative.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactNative.mod.View
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionTextActiveOpacity extends StObject {
  
  var WrapComponent: View
  
  var actionTextActiveOpacity: Double
  
  var actionTextUnderlayColor: String
  
  var dismissText: String
  
  var okText: String
  
  def onDismiss(): Unit
  
  def onOk(_underscore: Any): Unit
  
  def onVisibleChange(_underscore: Any): Unit
  
  var title: String
  
  var triggerType: String
}
object ActionTextActiveOpacity {
  
  inline def apply(
    WrapComponent: View,
    actionTextActiveOpacity: Double,
    actionTextUnderlayColor: String,
    dismissText: String,
    okText: String,
    onDismiss: Callback,
    onOk: Any => Callback,
    onVisibleChange: Any => Callback,
    title: String,
    triggerType: String
  ): ActionTextActiveOpacity = {
    val __obj = js.Dynamic.literal(WrapComponent = WrapComponent.asInstanceOf[js.Any], actionTextActiveOpacity = actionTextActiveOpacity.asInstanceOf[js.Any], actionTextUnderlayColor = actionTextUnderlayColor.asInstanceOf[js.Any], dismissText = dismissText.asInstanceOf[js.Any], okText = okText.asInstanceOf[js.Any], onDismiss = onDismiss.toJsFn, onOk = js.Any.fromFunction1((t0: Any) => onOk(t0).runNow()), onVisibleChange = js.Any.fromFunction1((t0: Any) => onVisibleChange(t0).runNow()), title = title.asInstanceOf[js.Any], triggerType = triggerType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionTextActiveOpacity]
  }
  
  extension [Self <: ActionTextActiveOpacity](x: Self) {
    
    inline def setActionTextActiveOpacity(value: Double): Self = StObject.set(x, "actionTextActiveOpacity", value.asInstanceOf[js.Any])
    
    inline def setActionTextUnderlayColor(value: String): Self = StObject.set(x, "actionTextUnderlayColor", value.asInstanceOf[js.Any])
    
    inline def setDismissText(value: String): Self = StObject.set(x, "dismissText", value.asInstanceOf[js.Any])
    
    inline def setOkText(value: String): Self = StObject.set(x, "okText", value.asInstanceOf[js.Any])
    
    inline def setOnDismiss(value: Callback): Self = StObject.set(x, "onDismiss", value.toJsFn)
    
    inline def setOnOk(value: Any => Callback): Self = StObject.set(x, "onOk", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setOnVisibleChange(value: Any => Callback): Self = StObject.set(x, "onVisibleChange", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTriggerType(value: String): Self = StObject.set(x, "triggerType", value.asInstanceOf[js.Any])
    
    inline def setWrapComponent(value: View): Self = StObject.set(x, "WrapComponent", value.asInstanceOf[js.Any])
  }
}
