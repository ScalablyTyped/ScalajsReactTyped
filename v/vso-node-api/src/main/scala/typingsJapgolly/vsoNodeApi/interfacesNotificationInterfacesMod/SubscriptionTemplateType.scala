package typingsJapgolly.vsoNodeApi.interfacesNotificationInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SubscriptionTemplateType extends StObject
@JSImport("vso-node-api/interfaces/NotificationInterfaces", "SubscriptionTemplateType")
@js.native
object SubscriptionTemplateType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SubscriptionTemplateType & Double] = js.native
  
  @js.native
  sealed trait Both
    extends StObject
       with SubscriptionTemplateType
  /* 2 */ val Both: typingsJapgolly.vsoNodeApi.interfacesNotificationInterfacesMod.SubscriptionTemplateType.Both & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with SubscriptionTemplateType
  /* 3 */ val None: typingsJapgolly.vsoNodeApi.interfacesNotificationInterfacesMod.SubscriptionTemplateType.None & Double = js.native
  
  @js.native
  sealed trait Team
    extends StObject
       with SubscriptionTemplateType
  /* 1 */ val Team: typingsJapgolly.vsoNodeApi.interfacesNotificationInterfacesMod.SubscriptionTemplateType.Team & Double = js.native
  
  @js.native
  sealed trait User
    extends StObject
       with SubscriptionTemplateType
  /* 0 */ val User: typingsJapgolly.vsoNodeApi.interfacesNotificationInterfacesMod.SubscriptionTemplateType.User & Double = js.native
}
