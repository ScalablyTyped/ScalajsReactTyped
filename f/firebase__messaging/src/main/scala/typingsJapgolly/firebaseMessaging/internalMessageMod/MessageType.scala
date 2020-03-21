package typingsJapgolly.firebaseMessaging.internalMessageMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MessageType extends js.Object

@JSImport("@firebase/messaging/dist/interfaces/internal-message", "MessageType")
@js.native
object MessageType extends js.Object {
  @js.native
  sealed trait NOTIFICATION_CLICKED extends MessageType
  
  @js.native
  sealed trait PUSH_RECEIVED extends MessageType
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[MessageType with String] = js.native
  /* "notification-clicked" */ @js.native
  object NOTIFICATION_CLICKED extends TopLevel[NOTIFICATION_CLICKED with String]
  
  /* "push-received" */ @js.native
  object PUSH_RECEIVED extends TopLevel[PUSH_RECEIVED with String]
  
}

