package typingsJapgolly.firebaseMessagingTypes.mod.firebaseComponentAugmentingMod

import typingsJapgolly.firebaseMessagingTypes.mod.FirebaseMessaging
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NameServiceMapping extends js.Object {
  var messaging: FirebaseMessaging
}

object NameServiceMapping {
  @scala.inline
  def apply(messaging: FirebaseMessaging): NameServiceMapping = {
    val __obj = js.Dynamic.literal(messaging = messaging.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NameServiceMapping]
  }
}

