package typingsJapgolly.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WorkItemErrorPolicy extends StObject
@JSImport("vso-node-api/interfaces/WorkItemTrackingInterfaces", "WorkItemErrorPolicy")
@js.native
object WorkItemErrorPolicy extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WorkItemErrorPolicy & Double] = js.native
  
  @js.native
  sealed trait Fail
    extends StObject
       with WorkItemErrorPolicy
  /* 1 */ val Fail: typingsJapgolly.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod.WorkItemErrorPolicy.Fail & Double = js.native
  
  @js.native
  sealed trait Omit
    extends StObject
       with WorkItemErrorPolicy
  /* 2 */ val Omit: typingsJapgolly.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod.WorkItemErrorPolicy.Omit & Double = js.native
}
