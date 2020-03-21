package typingsJapgolly.storybookReactNative.listMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.storybookAddons.distMod.Collection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var addonSelected: String
  var panels: Collection
  def onPressAddon(id: String): Unit
}

object Props {
  @scala.inline
  def apply(addonSelected: String, onPressAddon: String => Callback, panels: Collection): Props = {
    val __obj = js.Dynamic.literal(addonSelected = addonSelected.asInstanceOf[js.Any], panels = panels.asInstanceOf[js.Any])
    __obj.updateDynamic("onPressAddon")(js.Any.fromFunction1((t0: java.lang.String) => onPressAddon(t0).runNow()))
    __obj.asInstanceOf[Props]
  }
}

