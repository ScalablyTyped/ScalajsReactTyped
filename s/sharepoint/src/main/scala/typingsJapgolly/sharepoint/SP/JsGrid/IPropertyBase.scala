package typingsJapgolly.sharepoint.SP.JsGrid

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
trait IPropertyBase extends js.Object {
  def Clone(): IPropertyBase
  def GetData(): js.Any
  def GetLocalized(): String
  def HasDataValue(): Boolean
  def HasLocalizedValue(): Boolean
  /** dataValue actually is cloned */
  def Update(dataValue: js.Any, localizedValue: String): Unit
}

object IPropertyBase {
  @scala.inline
  def apply(
    Clone: CallbackTo[IPropertyBase],
    GetData: CallbackTo[js.Any],
    GetLocalized: CallbackTo[String],
    HasDataValue: CallbackTo[Boolean],
    HasLocalizedValue: CallbackTo[Boolean],
    Update: (js.Any, String) => Callback
  ): IPropertyBase = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.updateDynamic("GetData")(GetData.toJsFn)
    __obj.updateDynamic("GetLocalized")(GetLocalized.toJsFn)
    __obj.updateDynamic("HasDataValue")(HasDataValue.toJsFn)
    __obj.updateDynamic("HasLocalizedValue")(HasLocalizedValue.toJsFn)
    __obj.updateDynamic("Update")(js.Any.fromFunction2((t0: js.Any, t1: java.lang.String) => Update(t0, t1).runNow()))
    __obj.asInstanceOf[IPropertyBase]
  }
}

