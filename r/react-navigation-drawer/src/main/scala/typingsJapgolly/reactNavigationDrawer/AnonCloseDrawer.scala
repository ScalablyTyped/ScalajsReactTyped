package typingsJapgolly.reactNavigationDrawer

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCloseDrawer extends js.Object {
  def closeDrawer(): js.Any
  def openDrawer(): js.Any
  def toggleDrawer(): js.Any
}

object AnonCloseDrawer {
  @scala.inline
  def apply(closeDrawer: CallbackTo[js.Any], openDrawer: CallbackTo[js.Any], toggleDrawer: CallbackTo[js.Any]): AnonCloseDrawer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("closeDrawer")(closeDrawer.toJsFn)
    __obj.updateDynamic("openDrawer")(openDrawer.toJsFn)
    __obj.updateDynamic("toggleDrawer")(toggleDrawer.toJsFn)
    __obj.asInstanceOf[AnonCloseDrawer]
  }
}

