package typingsJapgolly.materialUiCore.unstableUseMediaQueryMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MuiMediaQueryList extends js.Object {
  var matches: Boolean = js.native
  def addListener(listener: MuiMediaQueryListListener): Unit = js.native
  def removeListener(listener: MuiMediaQueryListListener): Unit = js.native
}

object MuiMediaQueryList {
  @scala.inline
  def apply(
    addListener: MuiMediaQueryListListener => Callback,
    matches: Boolean,
    removeListener: MuiMediaQueryListListener => Callback
  ): MuiMediaQueryList = {
    val __obj = js.Dynamic.literal(matches = matches.asInstanceOf[js.Any])
    __obj.updateDynamic("addListener")(js.Any.fromFunction1((t0: typingsJapgolly.materialUiCore.unstableUseMediaQueryMod.MuiMediaQueryListListener) => addListener(t0).runNow()))
    __obj.updateDynamic("removeListener")(js.Any.fromFunction1((t0: typingsJapgolly.materialUiCore.unstableUseMediaQueryMod.MuiMediaQueryListListener) => removeListener(t0).runNow()))
    __obj.asInstanceOf[MuiMediaQueryList]
  }
}

