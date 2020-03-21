package typingsJapgolly.sharepoint.SP.JsGrid

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
trait IRecord extends js.Object {
  /** True if this is an entry row */
  var bIsNewRow: Boolean
  /** Please use SetProp and GetProp */
  var properties: StringDictionary[IPropertyBase]
  /** Update the specified field with the specified value */
  def AddFieldValue(fieldKey: String, value: js.Any): Unit
  /** returns raw data value for the specified field */
  def GetDataValue(fieldKey: String): js.Any
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
  /** returns recordKey */
  def key(): Double
}

object IRecord {
  @scala.inline
  def apply(
    AddFieldValue: (String, js.Any) => Callback,
    GetDataValue: String => CallbackTo[js.Any],
    GetLocalizedValue: String => CallbackTo[String],
    GetProp: String => CallbackTo[IPropertyBase],
    HasDataValue: String => CallbackTo[Boolean],
    HasLocalizedValue: String => CallbackTo[Boolean],
    RemoveFieldValue: String => Callback,
    SetProp: (String, IPropertyBase) => Callback,
    bIsNewRow: Boolean,
    key: CallbackTo[Double],
    properties: StringDictionary[IPropertyBase]
  ): IRecord = {
    val __obj = js.Dynamic.literal(bIsNewRow = bIsNewRow.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("AddFieldValue")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => AddFieldValue(t0, t1).runNow()))
    __obj.updateDynamic("GetDataValue")(js.Any.fromFunction1((t0: java.lang.String) => GetDataValue(t0).runNow()))
    __obj.updateDynamic("GetLocalizedValue")(js.Any.fromFunction1((t0: java.lang.String) => GetLocalizedValue(t0).runNow()))
    __obj.updateDynamic("GetProp")(js.Any.fromFunction1((t0: java.lang.String) => GetProp(t0).runNow()))
    __obj.updateDynamic("HasDataValue")(js.Any.fromFunction1((t0: java.lang.String) => HasDataValue(t0).runNow()))
    __obj.updateDynamic("HasLocalizedValue")(js.Any.fromFunction1((t0: java.lang.String) => HasLocalizedValue(t0).runNow()))
    __obj.updateDynamic("RemoveFieldValue")(js.Any.fromFunction1((t0: java.lang.String) => RemoveFieldValue(t0).runNow()))
    __obj.updateDynamic("SetProp")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.sharepoint.SP.JsGrid.IPropertyBase) => SetProp(t0, t1).runNow()))
    __obj.updateDynamic("key")(key.toJsFn)
    __obj.asInstanceOf[IRecord]
  }
}

