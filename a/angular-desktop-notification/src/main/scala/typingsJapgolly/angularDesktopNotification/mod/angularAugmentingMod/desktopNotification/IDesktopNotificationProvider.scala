package typingsJapgolly.angularDesktopNotification.mod.angularAugmentingMod.desktopNotification

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-name
trait IDesktopNotificationProvider extends js.Object {
  /**
    * Set the default app-wide configuration for desktopNotification
    */
  def config(options: IDesktopNotificationOptions): Unit
}

object IDesktopNotificationProvider {
  @scala.inline
  def apply(config: IDesktopNotificationOptions => Callback): IDesktopNotificationProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("config")(js.Any.fromFunction1((t0: typingsJapgolly.angularDesktopNotification.mod.angularAugmentingMod.desktopNotification.IDesktopNotificationOptions) => config(t0).runNow()))
    __obj.asInstanceOf[IDesktopNotificationProvider]
  }
}

