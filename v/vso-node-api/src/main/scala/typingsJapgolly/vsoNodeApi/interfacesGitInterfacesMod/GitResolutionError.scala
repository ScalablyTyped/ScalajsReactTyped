package typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GitResolutionError extends StObject
@JSImport("vso-node-api/interfaces/GitInterfaces", "GitResolutionError")
@js.native
object GitResolutionError extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GitResolutionError & Double] = js.native
  
  /**
    * No error
    */
  @js.native
  sealed trait InvalidPath
    extends StObject
       with GitResolutionError
  /* 3 */ val InvalidPath: typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.GitResolutionError.InvalidPath & Double = js.native
  
  /**
    * User set a blob id for resolving a content merge, but blob was not found in repo during application
    */
  @js.native
  sealed trait MergeContentNotFound
    extends StObject
       with GitResolutionError
  /* 1 */ val MergeContentNotFound: typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.GitResolutionError.MergeContentNotFound & Double = js.native
  
  /**
    * No error
    */
  @js.native
  sealed trait None
    extends StObject
       with GitResolutionError
  /* 0 */ val None: typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.GitResolutionError.None & Double = js.native
  
  /**
    * Any error for which a more specific code doesn't apply
    */
  @js.native
  sealed trait OtherError
    extends StObject
       with GitResolutionError
  /* 255 */ val OtherError: typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.GitResolutionError.OtherError & Double = js.native
  
  /**
    * Attempted to resolve a conflict by moving a file to another path, but path was already in use
    */
  @js.native
  sealed trait PathInUse
    extends StObject
       with GitResolutionError
  /* 2 */ val PathInUse: typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.GitResolutionError.PathInUse & Double = js.native
  
  /**
    * GitResolutionAction was set to an unrecognized value
    */
  @js.native
  sealed trait UnknownAction
    extends StObject
       with GitResolutionError
  /* 4 */ val UnknownAction: typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.GitResolutionError.UnknownAction & Double = js.native
  
  /**
    * GitResolutionMergeType was set to an unrecognized value
    */
  @js.native
  sealed trait UnknownMergeType
    extends StObject
       with GitResolutionError
  /* 5 */ val UnknownMergeType: typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.GitResolutionError.UnknownMergeType & Double = js.native
}
