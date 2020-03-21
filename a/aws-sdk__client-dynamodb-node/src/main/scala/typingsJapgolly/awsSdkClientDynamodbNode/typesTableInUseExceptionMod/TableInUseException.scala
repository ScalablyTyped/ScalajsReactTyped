package typingsJapgolly.awsSdkClientDynamodbNode.typesTableInUseExceptionMod

import typingsJapgolly.awsSdkClientDynamodbNode.createBackupExceptionsUnionMod.CreateBackupExceptionsUnion
import typingsJapgolly.awsSdkClientDynamodbNode.restoreTableFromBackupExceptionsUnionMod.RestoreTableFromBackupExceptionsUnion
import typingsJapgolly.awsSdkClientDynamodbNode.restoreTableToPointInTimeExceptionsUnionMod.RestoreTableToPointInTimeExceptionsUnion
import typingsJapgolly.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableInUseException
  extends ServiceException[TableInUseExceptionDetails]
     with CreateBackupExceptionsUnion
     with RestoreTableFromBackupExceptionsUnion
     with RestoreTableToPointInTimeExceptionsUnion {
  @JSName("name")
  var name_TableInUseException: typingsJapgolly.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.TableInUseException = js.native
}

