package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mfiles.MFiles.MFBuiltInPropertyDef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPropertyValue extends js.Object {
  var PropertyDef: MFBuiltInPropertyDef | Double
  var TypedValue: ITypedValue
  var Value: ITypedValue
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
}

object IPropertyValue {
  @scala.inline
  def apply(
    Clone: CallbackTo[IPropertyValue],
    CloneFrom: IPropertyValue => Callback,
    GetValueAsLocalizedText: CallbackTo[String],
    GetValueAsText: (Boolean, Boolean, Boolean, Boolean, Boolean, Boolean) => CallbackTo[String],
    GetValueAsUnlocalizedText: CallbackTo[String],
    PropertyDef: MFBuiltInPropertyDef | Double,
    TypedValue: ITypedValue,
    Value: ITypedValue
  ): IPropertyValue = {
    val __obj = js.Dynamic.literal(PropertyDef = PropertyDef.asInstanceOf[js.Any], TypedValue = TypedValue.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.updateDynamic("CloneFrom")(js.Any.fromFunction1((t0: typingsJapgolly.mfiles.IPropertyValue) => CloneFrom(t0).runNow()))
    __obj.updateDynamic("GetValueAsLocalizedText")(GetValueAsLocalizedText.toJsFn)
    __obj.updateDynamic("GetValueAsText")(js.Any.fromFunction6((t0: scala.Boolean, t1: scala.Boolean, t2: scala.Boolean, t3: scala.Boolean, t4: scala.Boolean, t5: scala.Boolean) => GetValueAsText(t0, t1, t2, t3, t4, t5).runNow()))
    __obj.updateDynamic("GetValueAsUnlocalizedText")(GetValueAsUnlocalizedText.toJsFn)
    __obj.asInstanceOf[IPropertyValue]
  }
}

