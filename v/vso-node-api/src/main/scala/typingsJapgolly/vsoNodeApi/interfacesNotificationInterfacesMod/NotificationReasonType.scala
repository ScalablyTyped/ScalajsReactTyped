package typingsJapgolly.vsoNodeApi.interfacesNotificationInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NotificationReasonType extends StObject
@JSImport("vso-node-api/interfaces/NotificationInterfaces", "NotificationReasonType")
@js.native
object NotificationReasonType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NotificationReasonType & Double] = js.native
  
  @js.native
  sealed trait AliasMemberGroupRole
    extends StObject
       with NotificationReasonType
  /* 11 */ val AliasMemberGroupRole: typingsJapgolly.vsoNodeApi.interfacesNotificationInterfacesMod.NotificationReasonType.AliasMemberGroupRole & Double = js.native
  
  @js.native
  sealed trait DirectMember
    extends StObject
       with NotificationReasonType
  /* 4 */ val DirectMember: typingsJapgolly.vsoNodeApi.interfacesNotificationInterfacesMod.NotificationReasonType.DirectMember & Double = js.native
  
  @js.native
  sealed trait DirectMemberGroupRole
    extends StObject
       with NotificationReasonType
  /* 9 */ val DirectMemberGroupRole: typingsJapgolly.vsoNodeApi.interfacesNotificationInterfacesMod.NotificationReasonType.DirectMemberGroupRole & Double = js.native
  
  @js.native
  sealed trait Follows
    extends StObject
       with NotificationReasonType
  /* 1 */ val Follows: typingsJapgolly.vsoNodeApi.interfacesNotificationInterfacesMod.NotificationReasonType.Follows & Double = js.native
  
  @js.native
  sealed trait GroupAlias
    extends StObject
       with NotificationReasonType
  /* 6 */ val GroupAlias: typingsJapgolly.vsoNodeApi.interfacesNotificationInterfacesMod.NotificationReasonType.GroupAlias & Double = js.native
  
  @js.native
  sealed trait InDirectMemberGroupRole
    extends StObject
       with NotificationReasonType
  /* 10 */ val InDirectMemberGroupRole: typingsJapgolly.vsoNodeApi.interfacesNotificationInterfacesMod.NotificationReasonType.InDirectMemberGroupRole & Double = js.native
  
  @js.native
  sealed trait IndirectMember
    extends StObject
       with NotificationReasonType
  /* 5 */ val IndirectMember: typingsJapgolly.vsoNodeApi.interfacesNotificationInterfacesMod.NotificationReasonType.IndirectMember & Double = js.native
  
  @js.native
  sealed trait Personal
    extends StObject
       with NotificationReasonType
  /* 2 */ val Personal: typingsJapgolly.vsoNodeApi.interfacesNotificationInterfacesMod.NotificationReasonType.Personal & Double = js.native
  
  @js.native
  sealed trait PersonalAlias
    extends StObject
       with NotificationReasonType
  /* 3 */ val PersonalAlias: typingsJapgolly.vsoNodeApi.interfacesNotificationInterfacesMod.NotificationReasonType.PersonalAlias & Double = js.native
  
  @js.native
  sealed trait SingleRole
    extends StObject
       with NotificationReasonType
  /* 8 */ val SingleRole: typingsJapgolly.vsoNodeApi.interfacesNotificationInterfacesMod.NotificationReasonType.SingleRole & Double = js.native
  
  @js.native
  sealed trait SubscriptionAlias
    extends StObject
       with NotificationReasonType
  /* 7 */ val SubscriptionAlias: typingsJapgolly.vsoNodeApi.interfacesNotificationInterfacesMod.NotificationReasonType.SubscriptionAlias & Double = js.native
  
  @js.native
  sealed trait Unknown
    extends StObject
       with NotificationReasonType
  /* 0 */ val Unknown: typingsJapgolly.vsoNodeApi.interfacesNotificationInterfacesMod.NotificationReasonType.Unknown & Double = js.native
}
