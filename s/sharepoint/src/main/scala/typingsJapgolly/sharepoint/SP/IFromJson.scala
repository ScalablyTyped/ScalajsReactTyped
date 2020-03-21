package typingsJapgolly.sharepoint.SP

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
trait IFromJson extends js.Object {
  def customFromJson(initValue: js.Any): Boolean
  def fromJson(initValue: js.Any): Unit
}

object IFromJson {
  @scala.inline
  def apply(customFromJson: js.Any => CallbackTo[Boolean], fromJson: js.Any => Callback): IFromJson = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("customFromJson")(js.Any.fromFunction1((t0: js.Any) => customFromJson(t0).runNow()))
    __obj.updateDynamic("fromJson")(js.Any.fromFunction1((t0: js.Any) => fromJson(t0).runNow()))
    __obj.asInstanceOf[IFromJson]
  }
}

