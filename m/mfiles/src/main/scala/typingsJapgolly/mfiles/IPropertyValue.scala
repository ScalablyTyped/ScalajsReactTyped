package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mfiles.MFiles.MFBuiltInPropertyDef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPropertyValue extends StObject {
  
  def Clone(): IPropertyValue
  
  def CloneFrom(PropertyValue: IPropertyValue): Unit
  
  def GetValueAsLocalizedText(): String
  
  def GetValueAsText(
    Localized: Boolean,
    NULLAsEmptyString: Boolean,
    EmptyLookupDisplayValuesAsHidden: Boolean,
    LongDateFormat: Boolean,
    NoSeconds: Boolean,
    NumericValueAsKilobytes: Boolean
  ): String
  
  def GetValueAsUnlocalizedText(): String
  
  var PropertyDef: MFBuiltInPropertyDef | Double
  
  var TypedValue: ITypedValue
  
  var Value: ITypedValue
}
object IPropertyValue {
  
  inline def apply(
    Clone: CallbackTo[IPropertyValue],
    CloneFrom: IPropertyValue => Callback,
    GetValueAsLocalizedText: CallbackTo[String],
    GetValueAsText: (Boolean, Boolean, Boolean, Boolean, Boolean, Boolean) => String,
    GetValueAsUnlocalizedText: CallbackTo[String],
    PropertyDef: MFBuiltInPropertyDef | Double,
    TypedValue: ITypedValue,
    Value: ITypedValue
  ): IPropertyValue = {
    val __obj = js.Dynamic.literal(Clone = Clone.toJsFn, CloneFrom = js.Any.fromFunction1((t0: IPropertyValue) => CloneFrom(t0).runNow()), GetValueAsLocalizedText = GetValueAsLocalizedText.toJsFn, GetValueAsText = js.Any.fromFunction6(GetValueAsText), GetValueAsUnlocalizedText = GetValueAsUnlocalizedText.toJsFn, PropertyDef = PropertyDef.asInstanceOf[js.Any], TypedValue = TypedValue.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPropertyValue]
  }
  
  extension [Self <: IPropertyValue](x: Self) {
    
    inline def setClone(value: CallbackTo[IPropertyValue]): Self = StObject.set(x, "Clone", value.toJsFn)
    
    inline def setCloneFrom(value: IPropertyValue => Callback): Self = StObject.set(x, "CloneFrom", js.Any.fromFunction1((t0: IPropertyValue) => value(t0).runNow()))
    
    inline def setGetValueAsLocalizedText(value: CallbackTo[String]): Self = StObject.set(x, "GetValueAsLocalizedText", value.toJsFn)
    
    inline def setGetValueAsText(value: (Boolean, Boolean, Boolean, Boolean, Boolean, Boolean) => String): Self = StObject.set(x, "GetValueAsText", js.Any.fromFunction6(value))
    
    inline def setGetValueAsUnlocalizedText(value: CallbackTo[String]): Self = StObject.set(x, "GetValueAsUnlocalizedText", value.toJsFn)
    
    inline def setPropertyDef(value: MFBuiltInPropertyDef | Double): Self = StObject.set(x, "PropertyDef", value.asInstanceOf[js.Any])
    
    inline def setTypedValue(value: ITypedValue): Self = StObject.set(x, "TypedValue", value.asInstanceOf[js.Any])
    
    inline def setValue(value: ITypedValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
