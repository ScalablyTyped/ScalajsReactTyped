package typingsJapgolly.vsoNodeApi.interfacesTaskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TaskDefinitionStatus extends StObject
@JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TaskDefinitionStatus")
@js.native
object TaskDefinitionStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TaskDefinitionStatus & Double] = js.native
  
  @js.native
  sealed trait AlreadyUpToDate
    extends StObject
       with TaskDefinitionStatus
  /* 8 */ val AlreadyUpToDate: typingsJapgolly.vsoNodeApi.interfacesTaskAgentInterfacesMod.TaskDefinitionStatus.AlreadyUpToDate & Double = js.native
  
  @js.native
  sealed trait InlineUpdateReceived
    extends StObject
       with TaskDefinitionStatus
  /* 9 */ val InlineUpdateReceived: typingsJapgolly.vsoNodeApi.interfacesTaskAgentInterfacesMod.TaskDefinitionStatus.InlineUpdateReceived & Double = js.native
  
  @js.native
  sealed trait Installed
    extends StObject
       with TaskDefinitionStatus
  /* 3 */ val Installed: typingsJapgolly.vsoNodeApi.interfacesTaskAgentInterfacesMod.TaskDefinitionStatus.Installed & Double = js.native
  
  @js.native
  sealed trait Preinstalled
    extends StObject
       with TaskDefinitionStatus
  /* 1 */ val Preinstalled: typingsJapgolly.vsoNodeApi.interfacesTaskAgentInterfacesMod.TaskDefinitionStatus.Preinstalled & Double = js.native
  
  @js.native
  sealed trait ReceivedInstallOrUpdate
    extends StObject
       with TaskDefinitionStatus
  /* 2 */ val ReceivedInstallOrUpdate: typingsJapgolly.vsoNodeApi.interfacesTaskAgentInterfacesMod.TaskDefinitionStatus.ReceivedInstallOrUpdate & Double = js.native
  
  @js.native
  sealed trait ReceivedUninstall
    extends StObject
       with TaskDefinitionStatus
  /* 4 */ val ReceivedUninstall: typingsJapgolly.vsoNodeApi.interfacesTaskAgentInterfacesMod.TaskDefinitionStatus.ReceivedUninstall & Double = js.native
  
  @js.native
  sealed trait RequestedUpdate
    extends StObject
       with TaskDefinitionStatus
  /* 6 */ val RequestedUpdate: typingsJapgolly.vsoNodeApi.interfacesTaskAgentInterfacesMod.TaskDefinitionStatus.RequestedUpdate & Double = js.native
  
  @js.native
  sealed trait Uninstalled
    extends StObject
       with TaskDefinitionStatus
  /* 5 */ val Uninstalled: typingsJapgolly.vsoNodeApi.interfacesTaskAgentInterfacesMod.TaskDefinitionStatus.Uninstalled & Double = js.native
  
  @js.native
  sealed trait Updated
    extends StObject
       with TaskDefinitionStatus
  /* 7 */ val Updated: typingsJapgolly.vsoNodeApi.interfacesTaskAgentInterfacesMod.TaskDefinitionStatus.Updated & Double = js.native
}
