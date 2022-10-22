package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ASPxDesignerControlsFactory extends StObject {
  
  def createPopularBindingInfo(options: ASPxDesignerElementSerializationInfoWithBindings, isExpression: Boolean): ASPxDesignerElementSerializationInfoWithBindings
  
  def getControlInfo(controlType: String): ASPxDesignerToolboxItem
  
  def getControlType(model: Any): String
  
  def getPropertyInfo(controlType: String, propertyDisplayName: String): ASPxDesignerElementSerializationInfo
  
  def hideExpressionBindings(controlType: String, propertyNames: String*): Unit
  
  def inheritControl(parentType: String, extendedOptions: ASPxDesignerToolboxItem): ASPxDesignerToolboxItem
  
  def registerControl(typeName: String, metadata: ASPxDesignerToolboxItem): Unit
  
  def setExpressionBinding(
    controlType: String,
    propertyName: String,
    events: js.Array[String],
    group: String,
    objectProperties: js.Array[String]
  ): Unit
}
object ASPxDesignerControlsFactory {
  
  inline def apply(
    createPopularBindingInfo: (ASPxDesignerElementSerializationInfoWithBindings, Boolean) => ASPxDesignerElementSerializationInfoWithBindings,
    getControlInfo: String => ASPxDesignerToolboxItem,
    getControlType: Any => String,
    getPropertyInfo: (String, String) => ASPxDesignerElementSerializationInfo,
    hideExpressionBindings: (String, /* repeated */ String) => Callback,
    inheritControl: (String, ASPxDesignerToolboxItem) => ASPxDesignerToolboxItem,
    registerControl: (String, ASPxDesignerToolboxItem) => Callback,
    setExpressionBinding: (String, String, js.Array[String], String, js.Array[String]) => Callback
  ): ASPxDesignerControlsFactory = {
    val __obj = js.Dynamic.literal(createPopularBindingInfo = js.Any.fromFunction2(createPopularBindingInfo), getControlInfo = js.Any.fromFunction1(getControlInfo), getControlType = js.Any.fromFunction1(getControlType), getPropertyInfo = js.Any.fromFunction2(getPropertyInfo), hideExpressionBindings = js.Any.fromFunction2((t0: String, t1: /* repeated */ String) => (hideExpressionBindings(t0, t1)).runNow()), inheritControl = js.Any.fromFunction2(inheritControl), registerControl = js.Any.fromFunction2((t0: String, t1: ASPxDesignerToolboxItem) => (registerControl(t0, t1)).runNow()), setExpressionBinding = js.Any.fromFunction5((t0: String, t1: String, t2: js.Array[String], t3: String, t4: js.Array[String]) => (setExpressionBinding(t0, t1, t2, t3, t4)).runNow()))
    __obj.asInstanceOf[ASPxDesignerControlsFactory]
  }
  
  extension [Self <: ASPxDesignerControlsFactory](x: Self) {
    
    inline def setCreatePopularBindingInfo(
      value: (ASPxDesignerElementSerializationInfoWithBindings, Boolean) => ASPxDesignerElementSerializationInfoWithBindings
    ): Self = StObject.set(x, "createPopularBindingInfo", js.Any.fromFunction2(value))
    
    inline def setGetControlInfo(value: String => ASPxDesignerToolboxItem): Self = StObject.set(x, "getControlInfo", js.Any.fromFunction1(value))
    
    inline def setGetControlType(value: Any => String): Self = StObject.set(x, "getControlType", js.Any.fromFunction1(value))
    
    inline def setGetPropertyInfo(value: (String, String) => ASPxDesignerElementSerializationInfo): Self = StObject.set(x, "getPropertyInfo", js.Any.fromFunction2(value))
    
    inline def setHideExpressionBindings(value: (String, /* repeated */ String) => Callback): Self = StObject.set(x, "hideExpressionBindings", js.Any.fromFunction2((t0: String, t1: /* repeated */ String) => (value(t0, t1)).runNow()))
    
    inline def setInheritControl(value: (String, ASPxDesignerToolboxItem) => ASPxDesignerToolboxItem): Self = StObject.set(x, "inheritControl", js.Any.fromFunction2(value))
    
    inline def setRegisterControl(value: (String, ASPxDesignerToolboxItem) => Callback): Self = StObject.set(x, "registerControl", js.Any.fromFunction2((t0: String, t1: ASPxDesignerToolboxItem) => (value(t0, t1)).runNow()))
    
    inline def setSetExpressionBinding(value: (String, String, js.Array[String], String, js.Array[String]) => Callback): Self = StObject.set(x, "setExpressionBinding", js.Any.fromFunction5((t0: String, t1: String, t2: js.Array[String], t3: String, t4: js.Array[String]) => (value(t0, t1, t2, t3, t4)).runNow()))
  }
}
