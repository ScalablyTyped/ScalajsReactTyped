package typingsJapgolly.awsSdkClientGlacierNode.typesInsufficientCapacityExceptionMod

import typingsJapgolly.awsSdkClientGlacierNode.initiateJobExceptionsUnionMod.InitiateJobExceptionsUnion
import typingsJapgolly.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InsufficientCapacityException
  extends ServiceException[InsufficientCapacityExceptionDetails]
     with InitiateJobExceptionsUnion {
  @JSName("name")
  var name_InsufficientCapacityException: typingsJapgolly.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.InsufficientCapacityException = js.native
}

