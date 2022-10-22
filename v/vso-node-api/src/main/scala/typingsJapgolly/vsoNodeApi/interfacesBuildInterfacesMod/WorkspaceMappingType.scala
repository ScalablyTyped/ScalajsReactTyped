package typingsJapgolly.vsoNodeApi.interfacesBuildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WorkspaceMappingType extends StObject
@JSImport("vso-node-api/interfaces/BuildInterfaces", "WorkspaceMappingType")
@js.native
object WorkspaceMappingType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WorkspaceMappingType & Double] = js.native
  
  /**
    * The path is cloaked in the workspace.
    */
  @js.native
  sealed trait Cloak
    extends StObject
       with WorkspaceMappingType
  /* 1 */ val Cloak: typingsJapgolly.vsoNodeApi.interfacesBuildInterfacesMod.WorkspaceMappingType.Cloak & Double = js.native
  
  /**
    * The path is mapped in the workspace.
    */
  @js.native
  sealed trait Map
    extends StObject
       with WorkspaceMappingType
  /* 0 */ val Map: typingsJapgolly.vsoNodeApi.interfacesBuildInterfacesMod.WorkspaceMappingType.Map & Double = js.native
}
