package typingsJapgolly.awsSdkClientDynamodbBrowser.typesPointInTimeRecoveryUnavailableExceptionMod

import typingsJapgolly.awsSdkClientDynamodbBrowser.restoreTableToPointInTimeExceptionsUnionMod.RestoreTableToPointInTimeExceptionsUnion
import typingsJapgolly.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PointInTimeRecoveryUnavailableException
  extends ServiceException[PointInTimeRecoveryUnavailableExceptionDetails]
     with RestoreTableToPointInTimeExceptionsUnion {
  @JSName("name")
  var name_PointInTimeRecoveryUnavailableException: typingsJapgolly.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.PointInTimeRecoveryUnavailableException = js.native
}

