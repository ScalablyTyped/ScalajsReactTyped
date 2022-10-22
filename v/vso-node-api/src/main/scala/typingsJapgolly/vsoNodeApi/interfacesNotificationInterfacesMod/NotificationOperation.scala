package typingsJapgolly.vsoNodeApi.interfacesNotificationInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NotificationOperation extends StObject
@JSImport("vso-node-api/interfaces/NotificationInterfaces", "NotificationOperation")
@js.native
object NotificationOperation extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NotificationOperation & Double] = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with NotificationOperation
  /* 0 */ val None: typingsJapgolly.vsoNodeApi.interfacesNotificationInterfacesMod.NotificationOperation.None & Double = js.native
  
  @js.native
  sealed trait SuspendUnprocessed
    extends StObject
       with NotificationOperation
  /* 1 */ val SuspendUnprocessed: typingsJapgolly.vsoNodeApi.interfacesNotificationInterfacesMod.NotificationOperation.SuspendUnprocessed & Double = js.native
}
