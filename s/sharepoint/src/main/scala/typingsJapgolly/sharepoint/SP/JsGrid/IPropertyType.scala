package typingsJapgolly.sharepoint.SP.JsGrid

import japgolly.scalajs.react.Callback
import typingsJapgolly.sharepoint.AnonDataValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
trait IPropertyType extends js.Object {
  var ID: String
  def BeginValidateNormalizeConvert(
    recordKey: Double,
    fieldKey: String,
    newValue: js.Any,
    bIsLocalized: Boolean,
    fnCallback: js.Function1[/* args */ AnonDataValue, Unit],
    fnError: js.Any
  ): Unit
}

object IPropertyType {
  @scala.inline
  def apply(
    BeginValidateNormalizeConvert: (Double, String, js.Any, Boolean, js.Function1[/* args */ AnonDataValue, Unit], js.Any) => Callback,
    ID: String
  ): IPropertyType = {
    val __obj = js.Dynamic.literal(ID = ID.asInstanceOf[js.Any])
    __obj.updateDynamic("BeginValidateNormalizeConvert")(js.Any.fromFunction6((t0: scala.Double, t1: java.lang.String, t2: js.Any, t3: scala.Boolean, t4: js.Function1[/* args */ typingsJapgolly.sharepoint.AnonDataValue, scala.Unit], t5: js.Any) => BeginValidateNormalizeConvert(t0, t1, t2, t3, t4, t5).runNow()))
    __obj.asInstanceOf[IPropertyType]
  }
}

