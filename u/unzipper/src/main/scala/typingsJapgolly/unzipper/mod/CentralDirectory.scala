package typingsJapgolly.unzipper.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CentralDirectory extends js.Object {
  var commentLength: Double
  var diskNumber: Double
  var diskStart: Double
  var files: js.Array[File]
  var numberOfRecords: Double
  var numberOfRecordsOnDisk: Double
  var offsetToStartOfCentralDirectory: Double
  var signature: Double
  var sizeOfCentralDirectory: Double
  def extract(opts: ParseOptions): js.Promise[Unit]
}

object CentralDirectory {
  @scala.inline
  def apply(
    commentLength: Double,
    diskNumber: Double,
    diskStart: Double,
    extract: ParseOptions => CallbackTo[js.Promise[Unit]],
    files: js.Array[File],
    numberOfRecords: Double,
    numberOfRecordsOnDisk: Double,
    offsetToStartOfCentralDirectory: Double,
    signature: Double,
    sizeOfCentralDirectory: Double
  ): CentralDirectory = {
    val __obj = js.Dynamic.literal(commentLength = commentLength.asInstanceOf[js.Any], diskNumber = diskNumber.asInstanceOf[js.Any], diskStart = diskStart.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], numberOfRecords = numberOfRecords.asInstanceOf[js.Any], numberOfRecordsOnDisk = numberOfRecordsOnDisk.asInstanceOf[js.Any], offsetToStartOfCentralDirectory = offsetToStartOfCentralDirectory.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any], sizeOfCentralDirectory = sizeOfCentralDirectory.asInstanceOf[js.Any])
    __obj.updateDynamic("extract")(js.Any.fromFunction1((t0: typingsJapgolly.unzipper.mod.ParseOptions) => extract(t0).runNow()))
    __obj.asInstanceOf[CentralDirectory]
  }
}

