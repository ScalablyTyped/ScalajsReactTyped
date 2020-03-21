package typingsJapgolly.phonegap

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectoryReader extends js.Object {
  def readEntries(
    successCallback: js.Function1[/* entries */ FileSystemEntry, Unit],
    errorCallback: js.Function1[/* error */ FileError, Unit]
  ): Unit
}

object DirectoryReader {
  @scala.inline
  def apply(
    readEntries: (js.Function1[/* entries */ FileSystemEntry, Unit], js.Function1[/* error */ FileError, Unit]) => Callback
  ): DirectoryReader = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("readEntries")(js.Any.fromFunction2((t0: js.Function1[/* entries */ typingsJapgolly.phonegap.FileSystemEntry, scala.Unit], t1: js.Function1[/* error */ typingsJapgolly.phonegap.FileError, scala.Unit]) => readEntries(t0, t1).runNow()))
    __obj.asInstanceOf[DirectoryReader]
  }
}

