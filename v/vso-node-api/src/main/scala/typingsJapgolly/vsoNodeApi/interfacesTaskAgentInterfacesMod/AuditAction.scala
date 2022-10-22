package typingsJapgolly.vsoNodeApi.interfacesTaskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AuditAction extends StObject
@JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "AuditAction")
@js.native
object AuditAction extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AuditAction & Double] = js.native
  
  @js.native
  sealed trait Add
    extends StObject
       with AuditAction
  /* 1 */ val Add: typingsJapgolly.vsoNodeApi.interfacesTaskAgentInterfacesMod.AuditAction.Add & Double = js.native
  
  @js.native
  sealed trait Delete
    extends StObject
       with AuditAction
  /* 3 */ val Delete: typingsJapgolly.vsoNodeApi.interfacesTaskAgentInterfacesMod.AuditAction.Delete & Double = js.native
  
  @js.native
  sealed trait Update
    extends StObject
       with AuditAction
  /* 2 */ val Update: typingsJapgolly.vsoNodeApi.interfacesTaskAgentInterfacesMod.AuditAction.Update & Double = js.native
}
