package typingsJapgolly.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListBackupVaultsOutput extends js.Object {
  /**
    * An array of backup vault list members containing vault metadata, including Amazon Resource Name (ARN), display name, creation date, number of saved recovery points, and encryption information if the resources saved in the backup vault are encrypted.
    */
  var BackupVaultList: js.UndefOr[typingsJapgolly.awsSdk.backupMod.BackupVaultList] = js.native
  /**
    * The next item following a partial list of returned items. For example, if a request is made to return maxResults number of items, NextToken allows you to return more items in your list starting at the location pointed to by the next token.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object ListBackupVaultsOutput {
  @scala.inline
  def apply(BackupVaultList: BackupVaultList = null, NextToken: String = null): ListBackupVaultsOutput = {
    val __obj = js.Dynamic.literal()
    if (BackupVaultList != null) __obj.updateDynamic("BackupVaultList")(BackupVaultList.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListBackupVaultsOutput]
  }
}

