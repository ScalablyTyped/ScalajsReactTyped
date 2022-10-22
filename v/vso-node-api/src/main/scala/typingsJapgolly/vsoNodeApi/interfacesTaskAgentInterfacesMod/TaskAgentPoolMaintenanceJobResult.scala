package typingsJapgolly.vsoNodeApi.interfacesTaskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TaskAgentPoolMaintenanceJobResult extends StObject
@JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TaskAgentPoolMaintenanceJobResult")
@js.native
object TaskAgentPoolMaintenanceJobResult extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TaskAgentPoolMaintenanceJobResult & Double] = js.native
  
  @js.native
  sealed trait Canceled
    extends StObject
       with TaskAgentPoolMaintenanceJobResult
  /* 4 */ val Canceled: typingsJapgolly.vsoNodeApi.interfacesTaskAgentInterfacesMod.TaskAgentPoolMaintenanceJobResult.Canceled & Double = js.native
  
  @js.native
  sealed trait Failed
    extends StObject
       with TaskAgentPoolMaintenanceJobResult
  /* 2 */ val Failed: typingsJapgolly.vsoNodeApi.interfacesTaskAgentInterfacesMod.TaskAgentPoolMaintenanceJobResult.Failed & Double = js.native
  
  @js.native
  sealed trait Succeeded
    extends StObject
       with TaskAgentPoolMaintenanceJobResult
  /* 1 */ val Succeeded: typingsJapgolly.vsoNodeApi.interfacesTaskAgentInterfacesMod.TaskAgentPoolMaintenanceJobResult.Succeeded & Double = js.native
}
