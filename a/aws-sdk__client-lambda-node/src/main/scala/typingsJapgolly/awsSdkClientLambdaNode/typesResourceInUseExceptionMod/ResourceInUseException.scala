package typingsJapgolly.awsSdkClientLambdaNode.typesResourceInUseExceptionMod

import typingsJapgolly.awsSdkClientLambdaNode.deleteEventSourceMappingExceptionsUnionMod.DeleteEventSourceMappingExceptionsUnion
import typingsJapgolly.awsSdkClientLambdaNode.updateEventSourceMappingExceptionsUnionMod.UpdateEventSourceMappingExceptionsUnion
import typingsJapgolly.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceInUseException
  extends ServiceException[ResourceInUseExceptionDetails]
     with DeleteEventSourceMappingExceptionsUnion
     with UpdateEventSourceMappingExceptionsUnion {
  @JSName("name")
  var name_ResourceInUseException: typingsJapgolly.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.ResourceInUseException = js.native
}

