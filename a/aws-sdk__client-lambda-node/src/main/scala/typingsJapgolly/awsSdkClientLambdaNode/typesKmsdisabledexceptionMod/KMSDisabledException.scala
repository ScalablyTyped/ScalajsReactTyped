package typingsJapgolly.awsSdkClientLambdaNode.typesKmsdisabledexceptionMod

import typingsJapgolly.awsSdkClientLambdaNode.invokeExceptionsUnionMod.InvokeExceptionsUnion
import typingsJapgolly.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KMSDisabledException
  extends ServiceException[KMSDisabledExceptionDetails]
     with InvokeExceptionsUnion {
  @JSName("name")
  var name_KMSDisabledException: typingsJapgolly.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.KMSDisabledException = js.native
}

