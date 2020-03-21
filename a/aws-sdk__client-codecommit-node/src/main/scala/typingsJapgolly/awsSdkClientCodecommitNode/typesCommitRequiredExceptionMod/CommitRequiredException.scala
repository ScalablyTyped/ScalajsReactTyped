package typingsJapgolly.awsSdkClientCodecommitNode.typesCommitRequiredExceptionMod

import typingsJapgolly.awsSdkClientCodecommitNode.getDifferencesExceptionsUnionMod.GetDifferencesExceptionsUnion
import typingsJapgolly.awsSdkClientCodecommitNode.getMergeConflictsExceptionsUnionMod.GetMergeConflictsExceptionsUnion
import typingsJapgolly.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommitRequiredException
  extends ServiceException[CommitRequiredExceptionDetails]
     with GetDifferencesExceptionsUnion
     with GetMergeConflictsExceptionsUnion {
  @JSName("name")
  var name_CommitRequiredException: typingsJapgolly.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.CommitRequiredException = js.native
}

