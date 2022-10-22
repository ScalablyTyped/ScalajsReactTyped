package typingsJapgolly.vsoNodeApi.interfacesIdentitiesInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GroupScopeType extends StObject
@JSImport("vso-node-api/interfaces/IdentitiesInterfaces", "GroupScopeType")
@js.native
object GroupScopeType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GroupScopeType & Double] = js.native
  
  @js.native
  sealed trait Generic
    extends StObject
       with GroupScopeType
  /* 0 */ val Generic: typingsJapgolly.vsoNodeApi.interfacesIdentitiesInterfacesMod.GroupScopeType.Generic & Double = js.native
  
  @js.native
  sealed trait ServiceHost
    extends StObject
       with GroupScopeType
  /* 1 */ val ServiceHost: typingsJapgolly.vsoNodeApi.interfacesIdentitiesInterfacesMod.GroupScopeType.ServiceHost & Double = js.native
  
  @js.native
  sealed trait TeamProject
    extends StObject
       with GroupScopeType
  /* 2 */ val TeamProject: typingsJapgolly.vsoNodeApi.interfacesIdentitiesInterfacesMod.GroupScopeType.TeamProject & Double = js.native
}
