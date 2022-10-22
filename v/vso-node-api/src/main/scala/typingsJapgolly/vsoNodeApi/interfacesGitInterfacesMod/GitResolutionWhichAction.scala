package typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GitResolutionWhichAction extends StObject
@JSImport("vso-node-api/interfaces/GitInterfaces", "GitResolutionWhichAction")
@js.native
object GitResolutionWhichAction extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GitResolutionWhichAction & Double] = js.native
  
  @js.native
  sealed trait PickSourceAction
    extends StObject
       with GitResolutionWhichAction
  /* 1 */ val PickSourceAction: typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.GitResolutionWhichAction.PickSourceAction & Double = js.native
  
  @js.native
  sealed trait PickTargetAction
    extends StObject
       with GitResolutionWhichAction
  /* 2 */ val PickTargetAction: typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.GitResolutionWhichAction.PickTargetAction & Double = js.native
  
  @js.native
  sealed trait Undecided
    extends StObject
       with GitResolutionWhichAction
  /* 0 */ val Undecided: typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.GitResolutionWhichAction.Undecided & Double = js.native
}
