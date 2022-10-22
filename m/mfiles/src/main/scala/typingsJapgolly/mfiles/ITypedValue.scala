package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mfiles.MFiles.MFDataType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITypedValue extends StObject {
  
  def Clone(): ITypedValue
  
  def CloneFrom(TypedValue: ITypedValue): Unit
  
  def CompareTo(TypedValue: ITypedValue): Double
  
  val DataType: MFDataType
  
  val DisplayValue: String
  
  def GetLookupID(): Double
  
  def GetValueAsLocalizedText(): String
  
  def GetValueAsLookup(): ILookup
  
  def GetValueAsLookups(): ILookups
  
  def GetValueAsText(
    Localized: Boolean,
    NULLAsEmptyString: Boolean,
    EmptyLookupDisplayValuesAsHidden: Boolean,
    LongDateFormat: Boolean,
    NoSeconds: Boolean,
    NumericValueAsKilobytes: Boolean
  ): String
  
  def GetValueAsTextWithExpression(Expression: IExpression, Locale: Double): String
  
  def GetValueAsTimestamp(): ITimestamp
  
  def GetValueAsUnlocalizedText(): String
  
  def IsNULL(): Boolean
  
  def IsUninitialized(): Boolean
  
  def Serialize(): js.Array[Double]
  
  def SetValue(DataType: MFDataType, Value: Any): Unit
  
  def SetValueToLookup(Lookup: ILookup): Unit
  
  def SetValueToMultiSelectLookup(MultiSelectLookup: ILookups): Unit
  
  def SetValueToNULL(DataType: MFDataType): Unit
  
  def Unserialize(Bytes: js.Array[Double], ReadFromOldSerializingFormat: Boolean): Unit
  
  var Value: Any
}
object ITypedValue {
  
  inline def apply(
    Clone: CallbackTo[ITypedValue],
    CloneFrom: ITypedValue => Callback,
    CompareTo: ITypedValue => Double,
    DataType: MFDataType,
    DisplayValue: String,
    GetLookupID: CallbackTo[Double],
    GetValueAsLocalizedText: CallbackTo[String],
    GetValueAsLookup: CallbackTo[ILookup],
    GetValueAsLookups: CallbackTo[ILookups],
    GetValueAsText: (Boolean, Boolean, Boolean, Boolean, Boolean, Boolean) => String,
    GetValueAsTextWithExpression: (IExpression, Double) => String,
    GetValueAsTimestamp: CallbackTo[ITimestamp],
    GetValueAsUnlocalizedText: CallbackTo[String],
    IsNULL: CallbackTo[Boolean],
    IsUninitialized: CallbackTo[Boolean],
    Serialize: CallbackTo[js.Array[Double]],
    SetValue: (MFDataType, Any) => Callback,
    SetValueToLookup: ILookup => Callback,
    SetValueToMultiSelectLookup: ILookups => Callback,
    SetValueToNULL: MFDataType => Callback,
    Unserialize: (js.Array[Double], Boolean) => Callback,
    Value: Any
  ): ITypedValue = {
    val __obj = js.Dynamic.literal(Clone = Clone.toJsFn, CloneFrom = js.Any.fromFunction1((t0: ITypedValue) => CloneFrom(t0).runNow()), CompareTo = js.Any.fromFunction1(CompareTo), DataType = DataType.asInstanceOf[js.Any], DisplayValue = DisplayValue.asInstanceOf[js.Any], GetLookupID = GetLookupID.toJsFn, GetValueAsLocalizedText = GetValueAsLocalizedText.toJsFn, GetValueAsLookup = GetValueAsLookup.toJsFn, GetValueAsLookups = GetValueAsLookups.toJsFn, GetValueAsText = js.Any.fromFunction6(GetValueAsText), GetValueAsTextWithExpression = js.Any.fromFunction2(GetValueAsTextWithExpression), GetValueAsTimestamp = GetValueAsTimestamp.toJsFn, GetValueAsUnlocalizedText = GetValueAsUnlocalizedText.toJsFn, IsNULL = IsNULL.toJsFn, IsUninitialized = IsUninitialized.toJsFn, Serialize = Serialize.toJsFn, SetValue = js.Any.fromFunction2((t0: MFDataType, t1: Any) => (SetValue(t0, t1)).runNow()), SetValueToLookup = js.Any.fromFunction1((t0: ILookup) => SetValueToLookup(t0).runNow()), SetValueToMultiSelectLookup = js.Any.fromFunction1((t0: ILookups) => SetValueToMultiSelectLookup(t0).runNow()), SetValueToNULL = js.Any.fromFunction1((t0: MFDataType) => SetValueToNULL(t0).runNow()), Unserialize = js.Any.fromFunction2((t0: js.Array[Double], t1: Boolean) => (Unserialize(t0, t1)).runNow()), Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITypedValue]
  }
  
  extension [Self <: ITypedValue](x: Self) {
    
    inline def setClone(value: CallbackTo[ITypedValue]): Self = StObject.set(x, "Clone", value.toJsFn)
    
    inline def setCloneFrom(value: ITypedValue => Callback): Self = StObject.set(x, "CloneFrom", js.Any.fromFunction1((t0: ITypedValue) => value(t0).runNow()))
    
    inline def setCompareTo(value: ITypedValue => Double): Self = StObject.set(x, "CompareTo", js.Any.fromFunction1(value))
    
    inline def setDataType(value: MFDataType): Self = StObject.set(x, "DataType", value.asInstanceOf[js.Any])
    
    inline def setDisplayValue(value: String): Self = StObject.set(x, "DisplayValue", value.asInstanceOf[js.Any])
    
    inline def setGetLookupID(value: CallbackTo[Double]): Self = StObject.set(x, "GetLookupID", value.toJsFn)
    
    inline def setGetValueAsLocalizedText(value: CallbackTo[String]): Self = StObject.set(x, "GetValueAsLocalizedText", value.toJsFn)
    
    inline def setGetValueAsLookup(value: CallbackTo[ILookup]): Self = StObject.set(x, "GetValueAsLookup", value.toJsFn)
    
    inline def setGetValueAsLookups(value: CallbackTo[ILookups]): Self = StObject.set(x, "GetValueAsLookups", value.toJsFn)
    
    inline def setGetValueAsText(value: (Boolean, Boolean, Boolean, Boolean, Boolean, Boolean) => String): Self = StObject.set(x, "GetValueAsText", js.Any.fromFunction6(value))
    
    inline def setGetValueAsTextWithExpression(value: (IExpression, Double) => String): Self = StObject.set(x, "GetValueAsTextWithExpression", js.Any.fromFunction2(value))
    
    inline def setGetValueAsTimestamp(value: CallbackTo[ITimestamp]): Self = StObject.set(x, "GetValueAsTimestamp", value.toJsFn)
    
    inline def setGetValueAsUnlocalizedText(value: CallbackTo[String]): Self = StObject.set(x, "GetValueAsUnlocalizedText", value.toJsFn)
    
    inline def setIsNULL(value: CallbackTo[Boolean]): Self = StObject.set(x, "IsNULL", value.toJsFn)
    
    inline def setIsUninitialized(value: CallbackTo[Boolean]): Self = StObject.set(x, "IsUninitialized", value.toJsFn)
    
    inline def setSerialize(value: CallbackTo[js.Array[Double]]): Self = StObject.set(x, "Serialize", value.toJsFn)
    
    inline def setSetValue(value: (MFDataType, Any) => Callback): Self = StObject.set(x, "SetValue", js.Any.fromFunction2((t0: MFDataType, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setSetValueToLookup(value: ILookup => Callback): Self = StObject.set(x, "SetValueToLookup", js.Any.fromFunction1((t0: ILookup) => value(t0).runNow()))
    
    inline def setSetValueToMultiSelectLookup(value: ILookups => Callback): Self = StObject.set(x, "SetValueToMultiSelectLookup", js.Any.fromFunction1((t0: ILookups) => value(t0).runNow()))
    
    inline def setSetValueToNULL(value: MFDataType => Callback): Self = StObject.set(x, "SetValueToNULL", js.Any.fromFunction1((t0: MFDataType) => value(t0).runNow()))
    
    inline def setUnserialize(value: (js.Array[Double], Boolean) => Callback): Self = StObject.set(x, "Unserialize", js.Any.fromFunction2((t0: js.Array[Double], t1: Boolean) => (value(t0, t1)).runNow()))
    
    inline def setValue(value: Any): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
