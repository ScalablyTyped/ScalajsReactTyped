package typingsJapgolly.vsoNodeApi.interfacesReleaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ApprovalExecutionOrder extends StObject
@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "ApprovalExecutionOrder")
@js.native
object ApprovalExecutionOrder extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ApprovalExecutionOrder & Double] = js.native
  
  @js.native
  sealed trait AfterGatesAlways
    extends StObject
       with ApprovalExecutionOrder
  /* 4 */ val AfterGatesAlways: typingsJapgolly.vsoNodeApi.interfacesReleaseInterfacesMod.ApprovalExecutionOrder.AfterGatesAlways & Double = js.native
  
  @js.native
  sealed trait AfterSuccessfulGates
    extends StObject
       with ApprovalExecutionOrder
  /* 2 */ val AfterSuccessfulGates: typingsJapgolly.vsoNodeApi.interfacesReleaseInterfacesMod.ApprovalExecutionOrder.AfterSuccessfulGates & Double = js.native
  
  @js.native
  sealed trait BeforeGates
    extends StObject
       with ApprovalExecutionOrder
  /* 1 */ val BeforeGates: typingsJapgolly.vsoNodeApi.interfacesReleaseInterfacesMod.ApprovalExecutionOrder.BeforeGates & Double = js.native
}
