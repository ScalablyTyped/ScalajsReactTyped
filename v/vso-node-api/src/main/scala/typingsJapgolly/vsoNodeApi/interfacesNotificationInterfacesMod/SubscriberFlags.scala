package typingsJapgolly.vsoNodeApi.interfacesNotificationInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SubscriberFlags extends StObject
@JSImport("vso-node-api/interfaces/NotificationInterfaces", "SubscriberFlags")
@js.native
object SubscriberFlags extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SubscriberFlags & Double] = js.native
  
  /**
    * Subscriber's delivery preferences could be updated
    */
  @js.native
  sealed trait DeliveryPreferencesEditable
    extends StObject
       with SubscriberFlags
  /* 2 */ val DeliveryPreferencesEditable: typingsJapgolly.vsoNodeApi.interfacesNotificationInterfacesMod.SubscriberFlags.DeliveryPreferencesEditable & Double = js.native
  
  /**
    * Subscriber is a group
    */
  @js.native
  sealed trait IsGroup
    extends StObject
       with SubscriberFlags
  /* 64 */ val IsGroup: typingsJapgolly.vsoNodeApi.interfacesNotificationInterfacesMod.SubscriberFlags.IsGroup & Double = js.native
  
  /**
    * Subscriber is a team
    */
  @js.native
  sealed trait IsTeam
    extends StObject
       with SubscriberFlags
  /* 128 */ val IsTeam: typingsJapgolly.vsoNodeApi.interfacesNotificationInterfacesMod.SubscriberFlags.IsTeam & Double = js.native
  
  /**
    * Subscriber is a user
    */
  @js.native
  sealed trait IsUser
    extends StObject
       with SubscriberFlags
  /* 32 */ val IsUser: typingsJapgolly.vsoNodeApi.interfacesNotificationInterfacesMod.SubscriberFlags.IsUser & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with SubscriberFlags
  /* 0 */ val None: typingsJapgolly.vsoNodeApi.interfacesNotificationInterfacesMod.SubscriberFlags.None & Double = js.native
  
  /**
    * Subscriber's delivery preferences supports individual members delivery(group expansion)
    */
  @js.native
  sealed trait SupportsEachMemberDelivery
    extends StObject
       with SubscriberFlags
  /* 8 */ val SupportsEachMemberDelivery: typingsJapgolly.vsoNodeApi.interfacesNotificationInterfacesMod.SubscriberFlags.SupportsEachMemberDelivery & Double = js.native
  
  /**
    * Subscriber's delivery preferences supports no delivery
    */
  @js.native
  sealed trait SupportsNoDelivery
    extends StObject
       with SubscriberFlags
  /* 16 */ val SupportsNoDelivery: typingsJapgolly.vsoNodeApi.interfacesNotificationInterfacesMod.SubscriberFlags.SupportsNoDelivery & Double = js.native
  
  /**
    * Subscriber's delivery preferences supports email delivery
    */
  @js.native
  sealed trait SupportsPreferredEmailAddressDelivery
    extends StObject
       with SubscriberFlags
  /* 4 */ val SupportsPreferredEmailAddressDelivery: typingsJapgolly.vsoNodeApi.interfacesNotificationInterfacesMod.SubscriberFlags.SupportsPreferredEmailAddressDelivery & Double = js.native
}
