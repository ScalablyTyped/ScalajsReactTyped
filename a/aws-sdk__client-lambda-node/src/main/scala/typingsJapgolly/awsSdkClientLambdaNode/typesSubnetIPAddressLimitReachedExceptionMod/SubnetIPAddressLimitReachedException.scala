package typingsJapgolly.awsSdkClientLambdaNode.typesSubnetIPAddressLimitReachedExceptionMod

import typingsJapgolly.awsSdkClientLambdaNode.invokeExceptionsUnionMod.InvokeExceptionsUnion
import typingsJapgolly.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubnetIPAddressLimitReachedException
  extends ServiceException[SubnetIPAddressLimitReachedExceptionDetails]
     with InvokeExceptionsUnion {
  @JSName("name")
  var name_SubnetIPAddressLimitReachedException: typingsJapgolly.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.SubnetIPAddressLimitReachedException = js.native
}

