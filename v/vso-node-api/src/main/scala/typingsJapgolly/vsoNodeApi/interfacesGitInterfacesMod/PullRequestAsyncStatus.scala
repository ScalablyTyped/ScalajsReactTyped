package typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PullRequestAsyncStatus extends StObject
@JSImport("vso-node-api/interfaces/GitInterfaces", "PullRequestAsyncStatus")
@js.native
object PullRequestAsyncStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PullRequestAsyncStatus & Double] = js.native
  
  /**
    * Pull request merge failed due to conflicts.
    */
  @js.native
  sealed trait Conflicts
    extends StObject
       with PullRequestAsyncStatus
  /* 2 */ val Conflicts: typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.PullRequestAsyncStatus.Conflicts & Double = js.native
  
  /**
    * Pull request merge failed.
    */
  @js.native
  sealed trait Failure
    extends StObject
       with PullRequestAsyncStatus
  /* 5 */ val Failure: typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.PullRequestAsyncStatus.Failure & Double = js.native
  
  /**
    * Status is not set. Default state.
    */
  @js.native
  sealed trait NotSet
    extends StObject
       with PullRequestAsyncStatus
  /* 0 */ val NotSet: typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.PullRequestAsyncStatus.NotSet & Double = js.native
  
  /**
    * Pull request merge is queued.
    */
  @js.native
  sealed trait Queued
    extends StObject
       with PullRequestAsyncStatus
  /* 1 */ val Queued: typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.PullRequestAsyncStatus.Queued & Double = js.native
  
  /**
    * Pull request merge rejected by policy.
    */
  @js.native
  sealed trait RejectedByPolicy
    extends StObject
       with PullRequestAsyncStatus
  /* 4 */ val RejectedByPolicy: typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.PullRequestAsyncStatus.RejectedByPolicy & Double = js.native
  
  /**
    * Pull request merge succeeded.
    */
  @js.native
  sealed trait Succeeded
    extends StObject
       with PullRequestAsyncStatus
  /* 3 */ val Succeeded: typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.PullRequestAsyncStatus.Succeeded & Double = js.native
}
