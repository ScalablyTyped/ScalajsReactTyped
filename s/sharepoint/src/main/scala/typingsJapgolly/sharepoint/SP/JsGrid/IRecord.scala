package typingsJapgolly.sharepoint.SP.JsGrid

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRecord extends StObject {
  
  /** Update the specified field with the specified value */
  def AddFieldValue(fieldKey: String, value: Any): Unit
  
  /** returns raw data value for the specified field */
  def GetDataValue(fieldKey: String): Any
  
  /** returns localized text value for the specified field */
  def GetLocalizedValue(fieldKey: String): String
  
  def GetProp(fieldKey: String): IPropertyBase
  
  /** returns true if data value for the specified field is available */
  def HasDataValue(fieldKey: String): Boolean
  
  /** returns true if localized text value for the specified field is available */
  def HasLocalizedValue(fieldKey: String): Boolean
  
  /** Removes value of the specified field.
    Does not refresh the view. */
  def RemoveFieldValue(fieldKey: String): Unit
  
  def SetProp(fieldKey: String, prop: IPropertyBase): Unit
  
  /** True if this is an entry row */
  var bIsNewRow: Boolean
  
  /** returns recordKey */
  def key(): Double
  
  /** Please use SetProp and GetProp */
  var properties: StringDictionary[IPropertyBase]
}
object IRecord {
  
  inline def apply(
    AddFieldValue: (String, Any) => Callback,
    GetDataValue: String => Any,
    GetLocalizedValue: String => String,
    GetProp: String => IPropertyBase,
    HasDataValue: String => Boolean,
    HasLocalizedValue: String => Boolean,
    RemoveFieldValue: String => Callback,
    SetProp: (String, IPropertyBase) => Callback,
    bIsNewRow: Boolean,
    key: CallbackTo[Double],
    properties: StringDictionary[IPropertyBase]
  ): IRecord = {
    val __obj = js.Dynamic.literal(AddFieldValue = js.Any.fromFunction2((t0: String, t1: Any) => (AddFieldValue(t0, t1)).runNow()), GetDataValue = js.Any.fromFunction1(GetDataValue), GetLocalizedValue = js.Any.fromFunction1(GetLocalizedValue), GetProp = js.Any.fromFunction1(GetProp), HasDataValue = js.Any.fromFunction1(HasDataValue), HasLocalizedValue = js.Any.fromFunction1(HasLocalizedValue), RemoveFieldValue = js.Any.fromFunction1((t0: String) => RemoveFieldValue(t0).runNow()), SetProp = js.Any.fromFunction2((t0: String, t1: IPropertyBase) => (SetProp(t0, t1)).runNow()), bIsNewRow = bIsNewRow.asInstanceOf[js.Any], key = key.toJsFn, properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRecord]
  }
  
  extension [Self <: IRecord](x: Self) {
    
    inline def setAddFieldValue(value: (String, Any) => Callback): Self = StObject.set(x, "AddFieldValue", js.Any.fromFunction2((t0: String, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setBIsNewRow(value: Boolean): Self = StObject.set(x, "bIsNewRow", value.asInstanceOf[js.Any])
    
    inline def setGetDataValue(value: String => Any): Self = StObject.set(x, "GetDataValue", js.Any.fromFunction1(value))
    
    inline def setGetLocalizedValue(value: String => String): Self = StObject.set(x, "GetLocalizedValue", js.Any.fromFunction1(value))
    
    inline def setGetProp(value: String => IPropertyBase): Self = StObject.set(x, "GetProp", js.Any.fromFunction1(value))
    
    inline def setHasDataValue(value: String => Boolean): Self = StObject.set(x, "HasDataValue", js.Any.fromFunction1(value))
    
    inline def setHasLocalizedValue(value: String => Boolean): Self = StObject.set(x, "HasLocalizedValue", js.Any.fromFunction1(value))
    
    inline def setKey(value: CallbackTo[Double]): Self = StObject.set(x, "key", value.toJsFn)
    
    inline def setProperties(value: StringDictionary[IPropertyBase]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setRemoveFieldValue(value: String => Callback): Self = StObject.set(x, "RemoveFieldValue", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetProp(value: (String, IPropertyBase) => Callback): Self = StObject.set(x, "SetProp", js.Any.fromFunction2((t0: String, t1: IPropertyBase) => (value(t0, t1)).runNow()))
  }
}
