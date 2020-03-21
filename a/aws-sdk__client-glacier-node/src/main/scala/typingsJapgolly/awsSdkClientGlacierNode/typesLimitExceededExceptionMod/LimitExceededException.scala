package typingsJapgolly.awsSdkClientGlacierNode.typesLimitExceededExceptionMod

import typingsJapgolly.awsSdkClientGlacierNode.addTagsToVaultExceptionsUnionMod.AddTagsToVaultExceptionsUnion
import typingsJapgolly.awsSdkClientGlacierNode.createVaultExceptionsUnionMod.CreateVaultExceptionsUnion
import typingsJapgolly.awsSdkClientGlacierNode.purchaseProvisionedCapacityExceptionsUnionMod.PurchaseProvisionedCapacityExceptionsUnion
import typingsJapgolly.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LimitExceededException
  extends ServiceException[LimitExceededExceptionDetails]
     with AddTagsToVaultExceptionsUnion
     with CreateVaultExceptionsUnion
     with PurchaseProvisionedCapacityExceptionsUnion {
  @JSName("name")
  var name_LimitExceededException: typingsJapgolly.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.LimitExceededException = js.native
}

