package typingsJapgolly.azdata.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackupProvider extends DataProvider {
  def backup(connectionUri: String, backupInfo: StringDictionary[js.Any], taskExecutionMode: TaskExecutionMode): Thenable[BackupResponse]
  def getBackupConfigInfo(connectionUri: String): Thenable[BackupConfigInfo]
}

object BackupProvider {
  @scala.inline
  def apply(
    backup: (String, StringDictionary[js.Any], TaskExecutionMode) => CallbackTo[Thenable[BackupResponse]],
    getBackupConfigInfo: String => CallbackTo[Thenable[BackupConfigInfo]],
    providerId: String,
    handle: Int | Double = null
  ): BackupProvider = {
    val __obj = js.Dynamic.literal(providerId = providerId.asInstanceOf[js.Any])
    __obj.updateDynamic("backup")(js.Any.fromFunction3((t0: java.lang.String, t1: org.scalablytyped.runtime.StringDictionary[js.Any], t2: typingsJapgolly.azdata.mod.TaskExecutionMode) => backup(t0, t1, t2).runNow()))
    __obj.updateDynamic("getBackupConfigInfo")(js.Any.fromFunction1((t0: java.lang.String) => getBackupConfigInfo(t0).runNow()))
    if (handle != null) __obj.updateDynamic("handle")(handle.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackupProvider]
  }
}

