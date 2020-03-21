package typingsJapgolly.twilioSync.servicesMod

import typingsJapgolly.twilioSync.subscriptionsMod.Subscriptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Services extends js.Object {
  var config: Configuration
  var network: Network
  var notifications: Notifications
  var router: typingsJapgolly.twilioSync.routerMod.Router
  var storage: Storage
  var subscriptions: Subscriptions
  var twilsock: typingsJapgolly.twilsock.mod.Twilsock
}

object Services {
  @scala.inline
  def apply(
    config: Configuration,
    network: Network,
    notifications: Notifications,
    router: typingsJapgolly.twilioSync.routerMod.Router,
    storage: Storage,
    subscriptions: Subscriptions,
    twilsock: typingsJapgolly.twilsock.mod.Twilsock
  ): Services = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], network = network.asInstanceOf[js.Any], notifications = notifications.asInstanceOf[js.Any], router = router.asInstanceOf[js.Any], storage = storage.asInstanceOf[js.Any], subscriptions = subscriptions.asInstanceOf[js.Any], twilsock = twilsock.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Services]
  }
}

