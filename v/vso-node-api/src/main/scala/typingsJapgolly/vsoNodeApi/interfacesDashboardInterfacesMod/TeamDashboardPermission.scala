package typingsJapgolly.vsoNodeApi.interfacesDashboardInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TeamDashboardPermission extends StObject
@JSImport("vso-node-api/interfaces/DashboardInterfaces", "TeamDashboardPermission")
@js.native
object TeamDashboardPermission extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TeamDashboardPermission & Double] = js.native
  
  @js.native
  sealed trait Create
    extends StObject
       with TeamDashboardPermission
  /* 2 */ val Create: typingsJapgolly.vsoNodeApi.interfacesDashboardInterfacesMod.TeamDashboardPermission.Create & Double = js.native
  
  @js.native
  sealed trait Delete
    extends StObject
       with TeamDashboardPermission
  /* 8 */ val Delete: typingsJapgolly.vsoNodeApi.interfacesDashboardInterfacesMod.TeamDashboardPermission.Delete & Double = js.native
  
  @js.native
  sealed trait Edit
    extends StObject
       with TeamDashboardPermission
  /* 4 */ val Edit: typingsJapgolly.vsoNodeApi.interfacesDashboardInterfacesMod.TeamDashboardPermission.Edit & Double = js.native
  
  @js.native
  sealed trait ManagePermissions
    extends StObject
       with TeamDashboardPermission
  /* 16 */ val ManagePermissions: typingsJapgolly.vsoNodeApi.interfacesDashboardInterfacesMod.TeamDashboardPermission.ManagePermissions & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with TeamDashboardPermission
  /* 0 */ val None: typingsJapgolly.vsoNodeApi.interfacesDashboardInterfacesMod.TeamDashboardPermission.None & Double = js.native
  
  @js.native
  sealed trait Read
    extends StObject
       with TeamDashboardPermission
  /* 1 */ val Read: typingsJapgolly.vsoNodeApi.interfacesDashboardInterfacesMod.TeamDashboardPermission.Read & Double = js.native
}
