package typingsJapgolly.reactSelect

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactSelect.menuMod.MenuState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGetPortalPlacement extends js.Object {
  def getPortalPlacement(state: MenuState): Unit
}

object AnonGetPortalPlacement {
  @scala.inline
  def apply(getPortalPlacement: MenuState => Callback): AnonGetPortalPlacement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getPortalPlacement")(js.Any.fromFunction1((t0: typingsJapgolly.reactSelect.menuMod.MenuState) => getPortalPlacement(t0).runNow()))
    __obj.asInstanceOf[AnonGetPortalPlacement]
  }
}

