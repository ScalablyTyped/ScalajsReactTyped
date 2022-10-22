package typingsJapgolly.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WorkItemRecentActivityType extends StObject
@JSImport("vso-node-api/interfaces/WorkItemTrackingInterfaces", "WorkItemRecentActivityType")
@js.native
object WorkItemRecentActivityType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WorkItemRecentActivityType & Double] = js.native
  
  @js.native
  sealed trait Deleted
    extends StObject
       with WorkItemRecentActivityType
  /* 2 */ val Deleted: typingsJapgolly.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod.WorkItemRecentActivityType.Deleted & Double = js.native
  
  @js.native
  sealed trait Edited
    extends StObject
       with WorkItemRecentActivityType
  /* 1 */ val Edited: typingsJapgolly.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod.WorkItemRecentActivityType.Edited & Double = js.native
  
  @js.native
  sealed trait Restored
    extends StObject
       with WorkItemRecentActivityType
  /* 3 */ val Restored: typingsJapgolly.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod.WorkItemRecentActivityType.Restored & Double = js.native
  
  @js.native
  sealed trait Visited
    extends StObject
       with WorkItemRecentActivityType
  /* 0 */ val Visited: typingsJapgolly.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod.WorkItemRecentActivityType.Visited & Double = js.native
}
