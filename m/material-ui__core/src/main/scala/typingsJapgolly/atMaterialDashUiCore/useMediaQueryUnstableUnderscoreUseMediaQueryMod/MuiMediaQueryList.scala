package typingsJapgolly.atMaterialDashUiCore.useMediaQueryUnstableUnderscoreUseMediaQueryMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MuiMediaQueryList extends js.Object {
  var matches: Boolean
  def addListener(listener: MuiMediaQueryListListener): Unit
  def removeListener(listener: MuiMediaQueryListListener): Unit
}

object MuiMediaQueryList {
  @scala.inline
  def apply(
    addListener: MuiMediaQueryListListener => Callback,
    matches: Boolean,
    removeListener: MuiMediaQueryListListener => Callback
  ): MuiMediaQueryList = {
    val __obj = js.Dynamic.literal(matches = matches.asInstanceOf[js.Any])
    __obj.updateDynamic("addListener")(js.Any.fromFunction1((t0: typingsJapgolly.atMaterialDashUiCore.useMediaQueryUnstableUnderscoreUseMediaQueryMod.MuiMediaQueryListListener) => addListener(t0).runNow()))
    __obj.updateDynamic("removeListener")(js.Any.fromFunction1((t0: typingsJapgolly.atMaterialDashUiCore.useMediaQueryUnstableUnderscoreUseMediaQueryMod.MuiMediaQueryListListener) => removeListener(t0).runNow()))
    __obj.asInstanceOf[MuiMediaQueryList]
  }
}

