package typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GitResolutionPathConflictAction extends StObject
@JSImport("vso-node-api/interfaces/GitInterfaces", "GitResolutionPathConflictAction")
@js.native
object GitResolutionPathConflictAction extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GitResolutionPathConflictAction & Double] = js.native
  
  @js.native
  sealed trait KeepSourceDeleteTarget
    extends StObject
       with GitResolutionPathConflictAction
  /* 2 */ val KeepSourceDeleteTarget: typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.GitResolutionPathConflictAction.KeepSourceDeleteTarget & Double = js.native
  
  @js.native
  sealed trait KeepSourceRenameTarget
    extends StObject
       with GitResolutionPathConflictAction
  /* 1 */ val KeepSourceRenameTarget: typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.GitResolutionPathConflictAction.KeepSourceRenameTarget & Double = js.native
  
  @js.native
  sealed trait KeepTargetDeleteSource
    extends StObject
       with GitResolutionPathConflictAction
  /* 4 */ val KeepTargetDeleteSource: typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.GitResolutionPathConflictAction.KeepTargetDeleteSource & Double = js.native
  
  @js.native
  sealed trait KeepTargetRenameSource
    extends StObject
       with GitResolutionPathConflictAction
  /* 3 */ val KeepTargetRenameSource: typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.GitResolutionPathConflictAction.KeepTargetRenameSource & Double = js.native
  
  @js.native
  sealed trait Undecided
    extends StObject
       with GitResolutionPathConflictAction
  /* 0 */ val Undecided: typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.GitResolutionPathConflictAction.Undecided & Double = js.native
}
