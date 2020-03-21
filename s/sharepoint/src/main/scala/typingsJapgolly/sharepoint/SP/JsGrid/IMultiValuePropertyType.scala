package typingsJapgolly.sharepoint.SP.JsGrid

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.sharepoint.AnonBDelayInit
import typingsJapgolly.sharepoint.AnonDataValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
trait IMultiValuePropertyType extends IPropertyType {
  var bMultiValue: Boolean
  var separator: String
  var singleValuePropType: String
  def GetSerializableMultiValuePropType(): AnonBDelayInit
  def InitSingleValuePropType(): Unit
  def LocStrArrayToLocStr(locStrArray: js.Array[String]): String
  def LocStrToLocStrArray(locStr: String): js.Array[String]
}

object IMultiValuePropertyType {
  @scala.inline
  def apply(
    BeginValidateNormalizeConvert: (Double, String, js.Any, Boolean, js.Function1[/* args */ AnonDataValue, Unit], js.Any) => Callback,
    GetSerializableMultiValuePropType: CallbackTo[AnonBDelayInit],
    ID: String,
    InitSingleValuePropType: Callback,
    LocStrArrayToLocStr: js.Array[String] => CallbackTo[String],
    LocStrToLocStrArray: String => CallbackTo[js.Array[String]],
    bMultiValue: Boolean,
    separator: String,
    singleValuePropType: String
  ): IMultiValuePropertyType = {
    val __obj = js.Dynamic.literal(ID = ID.asInstanceOf[js.Any], bMultiValue = bMultiValue.asInstanceOf[js.Any], separator = separator.asInstanceOf[js.Any], singleValuePropType = singleValuePropType.asInstanceOf[js.Any])
    __obj.updateDynamic("BeginValidateNormalizeConvert")(js.Any.fromFunction6((t0: scala.Double, t1: java.lang.String, t2: js.Any, t3: scala.Boolean, t4: js.Function1[/* args */ typingsJapgolly.sharepoint.AnonDataValue, scala.Unit], t5: js.Any) => BeginValidateNormalizeConvert(t0, t1, t2, t3, t4, t5).runNow()))
    __obj.updateDynamic("GetSerializableMultiValuePropType")(GetSerializableMultiValuePropType.toJsFn)
    __obj.updateDynamic("InitSingleValuePropType")(InitSingleValuePropType.toJsFn)
    __obj.updateDynamic("LocStrArrayToLocStr")(js.Any.fromFunction1((t0: js.Array[java.lang.String]) => LocStrArrayToLocStr(t0).runNow()))
    __obj.updateDynamic("LocStrToLocStrArray")(js.Any.fromFunction1((t0: java.lang.String) => LocStrToLocStrArray(t0).runNow()))
    __obj.asInstanceOf[IMultiValuePropertyType]
  }
}

