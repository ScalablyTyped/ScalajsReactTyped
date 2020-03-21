package typingsJapgolly.awsSdkClientDynamodbBrowser.typesBackupNotFoundExceptionMod

import typingsJapgolly.awsSdkClientDynamodbBrowser.deleteBackupExceptionsUnionMod.DeleteBackupExceptionsUnion
import typingsJapgolly.awsSdkClientDynamodbBrowser.describeBackupExceptionsUnionMod.DescribeBackupExceptionsUnion
import typingsJapgolly.awsSdkClientDynamodbBrowser.restoreTableFromBackupExceptionsUnionMod.RestoreTableFromBackupExceptionsUnion
import typingsJapgolly.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackupNotFoundException
  extends ServiceException[BackupNotFoundExceptionDetails]
     with DeleteBackupExceptionsUnion
     with DescribeBackupExceptionsUnion
     with RestoreTableFromBackupExceptionsUnion {
  @JSName("name")
  var name_BackupNotFoundException: typingsJapgolly.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.BackupNotFoundException = js.native
}

