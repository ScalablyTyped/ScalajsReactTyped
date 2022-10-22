package typingsJapgolly.vsoNodeApi.interfacesWorkInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PlanUserPermissions extends StObject
@JSImport("vso-node-api/interfaces/WorkInterfaces", "PlanUserPermissions")
@js.native
object PlanUserPermissions extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PlanUserPermissions & Double] = js.native
  
  /**
    * Full control permission for this plan.
    */
  @js.native
  sealed trait AllPermissions
    extends StObject
       with PlanUserPermissions
  /* 15 */ val AllPermissions: typingsJapgolly.vsoNodeApi.interfacesWorkInterfacesMod.PlanUserPermissions.AllPermissions & Double = js.native
  
  /**
    * Permission to delete this plan.
    */
  @js.native
  sealed trait Delete
    extends StObject
       with PlanUserPermissions
  /* 4 */ val Delete: typingsJapgolly.vsoNodeApi.interfacesWorkInterfacesMod.PlanUserPermissions.Delete & Double = js.native
  
  /**
    * Permission to update this plan.
    */
  @js.native
  sealed trait Edit
    extends StObject
       with PlanUserPermissions
  /* 2 */ val Edit: typingsJapgolly.vsoNodeApi.interfacesWorkInterfacesMod.PlanUserPermissions.Edit & Double = js.native
  
  /**
    * Permission to manage this plan.
    */
  @js.native
  sealed trait Manage
    extends StObject
       with PlanUserPermissions
  /* 8 */ val Manage: typingsJapgolly.vsoNodeApi.interfacesWorkInterfacesMod.PlanUserPermissions.Manage & Double = js.native
  
  /**
    * None
    */
  @js.native
  sealed trait None
    extends StObject
       with PlanUserPermissions
  /* 0 */ val None: typingsJapgolly.vsoNodeApi.interfacesWorkInterfacesMod.PlanUserPermissions.None & Double = js.native
  
  /**
    * Permission to view this plan.
    */
  @js.native
  sealed trait View
    extends StObject
       with PlanUserPermissions
  /* 1 */ val View: typingsJapgolly.vsoNodeApi.interfacesWorkInterfacesMod.PlanUserPermissions.View & Double = js.native
}
