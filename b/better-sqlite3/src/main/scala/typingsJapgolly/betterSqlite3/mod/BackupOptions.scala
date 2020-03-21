package typingsJapgolly.betterSqlite3.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackupOptions extends js.Object {
  def progress(info: BackupMetadata): Double
}

object BackupOptions {
  @scala.inline
  def apply(progress: BackupMetadata => CallbackTo[Double]): BackupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("progress")(js.Any.fromFunction1((t0: typingsJapgolly.betterSqlite3.mod.BackupMetadata) => progress(t0).runNow()))
    __obj.asInstanceOf[BackupOptions]
  }
}

