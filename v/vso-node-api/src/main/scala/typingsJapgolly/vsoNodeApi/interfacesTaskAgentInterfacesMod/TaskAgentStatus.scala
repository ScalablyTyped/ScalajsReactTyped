package typingsJapgolly.vsoNodeApi.interfacesTaskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TaskAgentStatus extends StObject
@JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TaskAgentStatus")
@js.native
object TaskAgentStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TaskAgentStatus & Double] = js.native
  
  @js.native
  sealed trait Offline
    extends StObject
       with TaskAgentStatus
  /* 1 */ val Offline: typingsJapgolly.vsoNodeApi.interfacesTaskAgentInterfacesMod.TaskAgentStatus.Offline & Double = js.native
  
  @js.native
  sealed trait Online
    extends StObject
       with TaskAgentStatus
  /* 2 */ val Online: typingsJapgolly.vsoNodeApi.interfacesTaskAgentInterfacesMod.TaskAgentStatus.Online & Double = js.native
}
