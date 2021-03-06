package typingsJapgolly.vsoNodeApi.notificationInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NotificationSubscriberDeliveryPreference extends js.Object

@JSImport("vso-node-api/interfaces/NotificationInterfaces", "NotificationSubscriberDeliveryPreference")
@js.native
object NotificationSubscriberDeliveryPreference extends js.Object {
  @js.native
  sealed trait EachMember extends NotificationSubscriberDeliveryPreference
  
  @js.native
  sealed trait NoDelivery extends NotificationSubscriberDeliveryPreference
  
  @js.native
  sealed trait None extends NotificationSubscriberDeliveryPreference
  
  @js.native
  sealed trait NotSet extends NotificationSubscriberDeliveryPreference
  
  /**
    * Deliver notifications to the subscriber's preferred email address.
    */
  @js.native
  sealed trait PreferredEmailAddress extends NotificationSubscriberDeliveryPreference
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NotificationSubscriberDeliveryPreference with Double] = js.native
  /* 2 */ @js.native
  object EachMember extends TopLevel[EachMember with Double]
  
  /* -1 */ @js.native
  object NoDelivery extends TopLevel[NoDelivery with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* -2147483648 */ @js.native
  object NotSet extends TopLevel[NotSet with Double]
  
  /* 1 */ @js.native
  object PreferredEmailAddress extends TopLevel[PreferredEmailAddress with Double]
  
}

