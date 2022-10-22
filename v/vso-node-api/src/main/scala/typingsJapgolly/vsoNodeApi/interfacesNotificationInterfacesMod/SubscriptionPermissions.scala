package typingsJapgolly.vsoNodeApi.interfacesNotificationInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SubscriptionPermissions extends StObject
@JSImport("vso-node-api/interfaces/NotificationInterfaces", "SubscriptionPermissions")
@js.native
object SubscriptionPermissions extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SubscriptionPermissions & Double] = js.native
  
  /**
    * delete subscription
    */
  @js.native
  sealed trait Delete
    extends StObject
       with SubscriptionPermissions
  /* 4 */ val Delete: typingsJapgolly.vsoNodeApi.interfacesNotificationInterfacesMod.SubscriptionPermissions.Delete & Double = js.native
  
  /**
    * update subscription
    */
  @js.native
  sealed trait Edit
    extends StObject
       with SubscriptionPermissions
  /* 2 */ val Edit: typingsJapgolly.vsoNodeApi.interfacesNotificationInterfacesMod.SubscriptionPermissions.Edit & Double = js.native
  
  /**
    * None
    */
  @js.native
  sealed trait None
    extends StObject
       with SubscriptionPermissions
  /* 0 */ val None: typingsJapgolly.vsoNodeApi.interfacesNotificationInterfacesMod.SubscriptionPermissions.None & Double = js.native
  
  /**
    * full view of description, filters, etc. Not limited.
    */
  @js.native
  sealed trait View
    extends StObject
       with SubscriptionPermissions
  /* 1 */ val View: typingsJapgolly.vsoNodeApi.interfacesNotificationInterfacesMod.SubscriptionPermissions.View & Double = js.native
}
