package typingsJapgolly.sharepoint.SP.JsGrid

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPropertyBase extends StObject {
  
  def Clone(): IPropertyBase
  
  def GetData(): Any
  
  def GetLocalized(): String
  
  def HasDataValue(): Boolean
  
  def HasLocalizedValue(): Boolean
  
  /** dataValue actually is cloned */
  def Update(dataValue: Any, localizedValue: String): Unit
}
object IPropertyBase {
  
  inline def apply(
    Clone: CallbackTo[IPropertyBase],
    GetData: CallbackTo[Any],
    GetLocalized: CallbackTo[String],
    HasDataValue: CallbackTo[Boolean],
    HasLocalizedValue: CallbackTo[Boolean],
    Update: (Any, String) => Callback
  ): IPropertyBase = {
    val __obj = js.Dynamic.literal(Clone = Clone.toJsFn, GetData = GetData.toJsFn, GetLocalized = GetLocalized.toJsFn, HasDataValue = HasDataValue.toJsFn, HasLocalizedValue = HasLocalizedValue.toJsFn, Update = js.Any.fromFunction2((t0: Any, t1: String) => (Update(t0, t1)).runNow()))
    __obj.asInstanceOf[IPropertyBase]
  }
  
  extension [Self <: IPropertyBase](x: Self) {
    
    inline def setClone(value: CallbackTo[IPropertyBase]): Self = StObject.set(x, "Clone", value.toJsFn)
    
    inline def setGetData(value: CallbackTo[Any]): Self = StObject.set(x, "GetData", value.toJsFn)
    
    inline def setGetLocalized(value: CallbackTo[String]): Self = StObject.set(x, "GetLocalized", value.toJsFn)
    
    inline def setHasDataValue(value: CallbackTo[Boolean]): Self = StObject.set(x, "HasDataValue", value.toJsFn)
    
    inline def setHasLocalizedValue(value: CallbackTo[Boolean]): Self = StObject.set(x, "HasLocalizedValue", value.toJsFn)
    
    inline def setUpdate(value: (Any, String) => Callback): Self = StObject.set(x, "Update", js.Any.fromFunction2((t0: Any, t1: String) => (value(t0, t1)).runNow()))
  }
}
