package typingsJapgolly.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ApprovalStatus extends js.Object

@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "ApprovalStatus")
@js.native
object ApprovalStatus extends js.Object {
  @js.native
  sealed trait Approved extends ApprovalStatus
  
  @js.native
  sealed trait Canceled extends ApprovalStatus
  
  @js.native
  sealed trait Pending extends ApprovalStatus
  
  @js.native
  sealed trait Reassigned extends ApprovalStatus
  
  @js.native
  sealed trait Rejected extends ApprovalStatus
  
  @js.native
  sealed trait Skipped extends ApprovalStatus
  
  @js.native
  sealed trait Undefined extends ApprovalStatus
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ApprovalStatus with Double] = js.native
  /* 2 */ @js.native
  object Approved extends TopLevel[Approved with Double]
  
  /* 7 */ @js.native
  object Canceled extends TopLevel[Canceled with Double]
  
  /* 1 */ @js.native
  object Pending extends TopLevel[Pending with Double]
  
  /* 6 */ @js.native
  object Reassigned extends TopLevel[Reassigned with Double]
  
  /* 4 */ @js.native
  object Rejected extends TopLevel[Rejected with Double]
  
  /* 8 */ @js.native
  object Skipped extends TopLevel[Skipped with Double]
  
  /* 0 */ @js.native
  object Undefined extends TopLevel[Undefined with Double]
  
}

