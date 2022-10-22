package typingsJapgolly.vsoNodeApi.interfacesTaskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait VariableGroupActionFilter extends StObject
@JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "VariableGroupActionFilter")
@js.native
object VariableGroupActionFilter extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VariableGroupActionFilter & Double] = js.native
  
  @js.native
  sealed trait Manage
    extends StObject
       with VariableGroupActionFilter
  /* 2 */ val Manage: typingsJapgolly.vsoNodeApi.interfacesTaskAgentInterfacesMod.VariableGroupActionFilter.Manage & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with VariableGroupActionFilter
  /* 0 */ val None: typingsJapgolly.vsoNodeApi.interfacesTaskAgentInterfacesMod.VariableGroupActionFilter.None & Double = js.native
  
  @js.native
  sealed trait Use
    extends StObject
       with VariableGroupActionFilter
  /* 16 */ val Use: typingsJapgolly.vsoNodeApi.interfacesTaskAgentInterfacesMod.VariableGroupActionFilter.Use & Double = js.native
}
