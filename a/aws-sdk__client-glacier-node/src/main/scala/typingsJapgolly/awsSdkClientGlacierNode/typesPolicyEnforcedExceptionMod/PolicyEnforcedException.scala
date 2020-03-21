package typingsJapgolly.awsSdkClientGlacierNode.typesPolicyEnforcedExceptionMod

import typingsJapgolly.awsSdkClientGlacierNode.initiateJobExceptionsUnionMod.InitiateJobExceptionsUnion
import typingsJapgolly.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyEnforcedException
  extends ServiceException[PolicyEnforcedExceptionDetails]
     with InitiateJobExceptionsUnion {
  @JSName("name")
  var name_PolicyEnforcedException: typingsJapgolly.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.PolicyEnforcedException = js.native
}

