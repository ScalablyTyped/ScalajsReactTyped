package typingsJapgolly.vsoNodeApi.interfacesNotificationInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EventTypeQueryFlags extends StObject
@JSImport("vso-node-api/interfaces/NotificationInterfaces", "EventTypeQueryFlags")
@js.native
object EventTypeQueryFlags extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EventTypeQueryFlags & Double] = js.native
  
  /**
    * IncludeFields will include all fields and their types
    */
  @js.native
  sealed trait IncludeFields
    extends StObject
       with EventTypeQueryFlags
  /* 1 */ val IncludeFields: typingsJapgolly.vsoNodeApi.interfacesNotificationInterfacesMod.EventTypeQueryFlags.IncludeFields & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with EventTypeQueryFlags
  /* 0 */ val None: typingsJapgolly.vsoNodeApi.interfacesNotificationInterfacesMod.EventTypeQueryFlags.None & Double = js.native
}
