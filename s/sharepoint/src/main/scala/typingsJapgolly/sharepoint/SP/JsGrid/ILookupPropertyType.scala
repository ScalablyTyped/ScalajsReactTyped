package typingsJapgolly.sharepoint.SP.JsGrid

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.sharepoint.AnonBLimitToList
import typingsJapgolly.sharepoint.AnonDataValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
trait ILookupPropertyType extends IPropertyType {
  def DataToLocalized(dataValue: js.Any): String
  def GetImageSource(record: IRecord, dataValue: js.Any): String
  def GetIsLimitedToList(): Boolean
  def GetItems(fnCallback: js.Any): Unit
  def GetSerializableLookupPropType(): AnonBLimitToList
  def GetStyleId(dataValue: js.Any): String
  def LocalizedToData(localized: String): js.Any
}

object ILookupPropertyType {
  @scala.inline
  def apply(
    BeginValidateNormalizeConvert: (Double, String, js.Any, Boolean, js.Function1[/* args */ AnonDataValue, Unit], js.Any) => Callback,
    DataToLocalized: js.Any => CallbackTo[String],
    GetImageSource: (IRecord, js.Any) => CallbackTo[String],
    GetIsLimitedToList: CallbackTo[Boolean],
    GetItems: js.Any => Callback,
    GetSerializableLookupPropType: CallbackTo[AnonBLimitToList],
    GetStyleId: js.Any => CallbackTo[String],
    ID: String,
    LocalizedToData: String => CallbackTo[js.Any]
  ): ILookupPropertyType = {
    val __obj = js.Dynamic.literal(ID = ID.asInstanceOf[js.Any])
    __obj.updateDynamic("BeginValidateNormalizeConvert")(js.Any.fromFunction6((t0: scala.Double, t1: java.lang.String, t2: js.Any, t3: scala.Boolean, t4: js.Function1[/* args */ typingsJapgolly.sharepoint.AnonDataValue, scala.Unit], t5: js.Any) => BeginValidateNormalizeConvert(t0, t1, t2, t3, t4, t5).runNow()))
    __obj.updateDynamic("DataToLocalized")(js.Any.fromFunction1((t0: js.Any) => DataToLocalized(t0).runNow()))
    __obj.updateDynamic("GetImageSource")(js.Any.fromFunction2((t0: typingsJapgolly.sharepoint.SP.JsGrid.IRecord, t1: js.Any) => GetImageSource(t0, t1).runNow()))
    __obj.updateDynamic("GetIsLimitedToList")(GetIsLimitedToList.toJsFn)
    __obj.updateDynamic("GetItems")(js.Any.fromFunction1((t0: js.Any) => GetItems(t0).runNow()))
    __obj.updateDynamic("GetSerializableLookupPropType")(GetSerializableLookupPropType.toJsFn)
    __obj.updateDynamic("GetStyleId")(js.Any.fromFunction1((t0: js.Any) => GetStyleId(t0).runNow()))
    __obj.updateDynamic("LocalizedToData")(js.Any.fromFunction1((t0: java.lang.String) => LocalizedToData(t0).runNow()))
    __obj.asInstanceOf[ILookupPropertyType]
  }
}

