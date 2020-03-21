package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mfiles.MFiles.MFDataType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITypedValue extends js.Object {
  val DataType: MFDataType
  val DisplayValue: String
  var Value: js.Any
  def Clone(): ITypedValue
  def CloneFrom(TypedValue: ITypedValue): Unit
  def CompareTo(TypedValue: ITypedValue): Double
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
  def SetValue(DataType: MFDataType, Value: js.Any): Unit
  def SetValueToLookup(Lookup: ILookup): Unit
  def SetValueToMultiSelectLookup(MultiSelectLookup: ILookups): Unit
  def SetValueToNULL(DataType: MFDataType): Unit
  def Unserialize(Bytes: js.Array[Double], ReadFromOldSerializingFormat: Boolean): Unit
}

object ITypedValue {
  @scala.inline
  def apply(
    Clone: CallbackTo[ITypedValue],
    CloneFrom: ITypedValue => Callback,
    CompareTo: ITypedValue => CallbackTo[Double],
    DataType: MFDataType,
    DisplayValue: String,
    GetLookupID: CallbackTo[Double],
    GetValueAsLocalizedText: CallbackTo[String],
    GetValueAsLookup: CallbackTo[ILookup],
    GetValueAsLookups: CallbackTo[ILookups],
    GetValueAsText: (Boolean, Boolean, Boolean, Boolean, Boolean, Boolean) => CallbackTo[String],
    GetValueAsTextWithExpression: (IExpression, Double) => CallbackTo[String],
    GetValueAsTimestamp: CallbackTo[ITimestamp],
    GetValueAsUnlocalizedText: CallbackTo[String],
    IsNULL: CallbackTo[Boolean],
    IsUninitialized: CallbackTo[Boolean],
    Serialize: CallbackTo[js.Array[Double]],
    SetValue: (MFDataType, js.Any) => Callback,
    SetValueToLookup: ILookup => Callback,
    SetValueToMultiSelectLookup: ILookups => Callback,
    SetValueToNULL: MFDataType => Callback,
    Unserialize: (js.Array[Double], Boolean) => Callback,
    Value: js.Any
  ): ITypedValue = {
    val __obj = js.Dynamic.literal(DataType = DataType.asInstanceOf[js.Any], DisplayValue = DisplayValue.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.updateDynamic("CloneFrom")(js.Any.fromFunction1((t0: typingsJapgolly.mfiles.ITypedValue) => CloneFrom(t0).runNow()))
    __obj.updateDynamic("CompareTo")(js.Any.fromFunction1((t0: typingsJapgolly.mfiles.ITypedValue) => CompareTo(t0).runNow()))
    __obj.updateDynamic("GetLookupID")(GetLookupID.toJsFn)
    __obj.updateDynamic("GetValueAsLocalizedText")(GetValueAsLocalizedText.toJsFn)
    __obj.updateDynamic("GetValueAsLookup")(GetValueAsLookup.toJsFn)
    __obj.updateDynamic("GetValueAsLookups")(GetValueAsLookups.toJsFn)
    __obj.updateDynamic("GetValueAsText")(js.Any.fromFunction6((t0: scala.Boolean, t1: scala.Boolean, t2: scala.Boolean, t3: scala.Boolean, t4: scala.Boolean, t5: scala.Boolean) => GetValueAsText(t0, t1, t2, t3, t4, t5).runNow()))
    __obj.updateDynamic("GetValueAsTextWithExpression")(js.Any.fromFunction2((t0: typingsJapgolly.mfiles.IExpression, t1: scala.Double) => GetValueAsTextWithExpression(t0, t1).runNow()))
    __obj.updateDynamic("GetValueAsTimestamp")(GetValueAsTimestamp.toJsFn)
    __obj.updateDynamic("GetValueAsUnlocalizedText")(GetValueAsUnlocalizedText.toJsFn)
    __obj.updateDynamic("IsNULL")(IsNULL.toJsFn)
    __obj.updateDynamic("IsUninitialized")(IsUninitialized.toJsFn)
    __obj.updateDynamic("Serialize")(Serialize.toJsFn)
    __obj.updateDynamic("SetValue")(js.Any.fromFunction2((t0: typingsJapgolly.mfiles.MFiles.MFDataType, t1: js.Any) => SetValue(t0, t1).runNow()))
    __obj.updateDynamic("SetValueToLookup")(js.Any.fromFunction1((t0: typingsJapgolly.mfiles.ILookup) => SetValueToLookup(t0).runNow()))
    __obj.updateDynamic("SetValueToMultiSelectLookup")(js.Any.fromFunction1((t0: typingsJapgolly.mfiles.ILookups) => SetValueToMultiSelectLookup(t0).runNow()))
    __obj.updateDynamic("SetValueToNULL")(js.Any.fromFunction1((t0: typingsJapgolly.mfiles.MFiles.MFDataType) => SetValueToNULL(t0).runNow()))
    __obj.updateDynamic("Unserialize")(js.Any.fromFunction2((t0: js.Array[scala.Double], t1: scala.Boolean) => Unserialize(t0, t1).runNow()))
    __obj.asInstanceOf[ITypedValue]
  }
}

