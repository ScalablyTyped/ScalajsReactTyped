package typingsJapgolly.sharepoint.SP.JsGrid

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
trait IChangeKey extends js.Object {
  def CompareTo(changeKey: IChangeKey): Double
  def GetVersionNumber(): Double
  def Release(): Unit
  def Reserve(): Unit
}

object IChangeKey {
  @scala.inline
  def apply(
    CompareTo: IChangeKey => CallbackTo[Double],
    GetVersionNumber: CallbackTo[Double],
    Release: Callback,
    Reserve: Callback
  ): IChangeKey = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("CompareTo")(js.Any.fromFunction1((t0: typingsJapgolly.sharepoint.SP.JsGrid.IChangeKey) => CompareTo(t0).runNow()))
    __obj.updateDynamic("GetVersionNumber")(GetVersionNumber.toJsFn)
    __obj.updateDynamic("Release")(Release.toJsFn)
    __obj.updateDynamic("Reserve")(Reserve.toJsFn)
    __obj.asInstanceOf[IChangeKey]
  }
}

