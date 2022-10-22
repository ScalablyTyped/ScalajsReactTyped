package typingsJapgolly.vsoNodeApi.interfacesNotificationInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SubscriptionFlags extends StObject
@JSImport("vso-node-api/interfaces/NotificationInterfaces", "SubscriptionFlags")
@js.native
object SubscriptionFlags extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SubscriptionFlags & Double] = js.native
  
  /**
    * A user that is member of the subscription's subscriber group can opt in/out of the subscription.
    */
  @js.native
  sealed trait CanOptOut
    extends StObject
       with SubscriptionFlags
  /* 4 */ val CanOptOut: typingsJapgolly.vsoNodeApi.interfacesNotificationInterfacesMod.SubscriptionFlags.CanOptOut & Double = js.native
  
  /**
    * Subscription is contributed and not persisted. This means certain fields of the subscription, like Filter, are read-only.
    */
  @js.native
  sealed trait ContributedSubscription
    extends StObject
       with SubscriptionFlags
  /* 2 */ val ContributedSubscription: typingsJapgolly.vsoNodeApi.interfacesNotificationInterfacesMod.SubscriptionFlags.ContributedSubscription & Double = js.native
  
  /**
    * Subscription's subscriber is a group, not a user
    */
  @js.native
  sealed trait GroupSubscription
    extends StObject
       with SubscriptionFlags
  /* 1 */ val GroupSubscription: typingsJapgolly.vsoNodeApi.interfacesNotificationInterfacesMod.SubscriptionFlags.GroupSubscription & Double = js.native
  
  /**
    * None
    */
  @js.native
  sealed trait None
    extends StObject
       with SubscriptionFlags
  /* 0 */ val None: typingsJapgolly.vsoNodeApi.interfacesNotificationInterfacesMod.SubscriptionFlags.None & Double = js.native
  
  /**
    * If the subscriber is a group, is it a team.
    */
  @js.native
  sealed trait TeamSubscription
    extends StObject
       with SubscriptionFlags
  /* 8 */ val TeamSubscription: typingsJapgolly.vsoNodeApi.interfacesNotificationInterfacesMod.SubscriptionFlags.TeamSubscription & Double = js.native
}
