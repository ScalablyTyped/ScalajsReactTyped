package typingsJapgolly.awsSdkClientXrayNode.typesRuleLimitExceededExceptionMod

import typingsJapgolly.awsSdkClientXrayNode.createSamplingRuleExceptionsUnionMod.CreateSamplingRuleExceptionsUnion
import typingsJapgolly.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RuleLimitExceededException
  extends ServiceException[RuleLimitExceededExceptionDetails]
     with CreateSamplingRuleExceptionsUnion {
  @JSName("name")
  var name_RuleLimitExceededException: typingsJapgolly.awsSdkClientXrayNode.awsSdkClientXrayNodeStrings.RuleLimitExceededException = js.native
}

