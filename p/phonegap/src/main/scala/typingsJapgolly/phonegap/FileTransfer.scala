package typingsJapgolly.phonegap

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileTransfer extends js.Object {
  var onprogress: js.Function = js.native
  def abort(): Unit = js.native
  def download(
    source: String,
    target: String,
    successCallback: js.Function1[/* fileEntry */ FileEntry, Unit],
    errorCallback: js.Function1[/* error */ FileError, Unit]
  ): Unit = js.native
  def download(
    source: String,
    target: String,
    successCallback: js.Function1[/* fileEntry */ FileEntry, Unit],
    errorCallback: js.Function1[/* error */ FileError, Unit],
    options: js.Any
  ): Unit = js.native
  //upload(filePath: string, server: string, successCallback: (metadata: Metadata) => void , errorCallback: (error: FileError) => void , options?: any): void;
  def upload(
    filePath: String,
    server: String,
    successCallback: js.Function1[/* result */ FileUploadResult, Unit],
    errorCallback: js.Function1[/* error */ FileError, Unit]
  ): Unit = js.native
  def upload(
    filePath: String,
    server: String,
    successCallback: js.Function1[/* result */ FileUploadResult, Unit],
    errorCallback: js.Function1[/* error */ FileError, Unit],
    options: js.Any
  ): Unit = js.native
}

@JSGlobal("FileTransfer")
@js.native
object FileTransfer extends Instantiable0[FileTransfer]

