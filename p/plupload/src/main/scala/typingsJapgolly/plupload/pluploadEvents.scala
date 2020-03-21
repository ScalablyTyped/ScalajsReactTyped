package typingsJapgolly.plupload

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.plupload.plupload.Uploader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait pluploadEvents extends js.Object {
  var BeforeUpload: js.UndefOr[pluploadEventFile] = js.undefined
  var ChunkUploaded: js.UndefOr[pluploadEventChunkUploaded] = js.undefined
  var Destroy: js.UndefOr[pluploadEvent] = js.undefined
  var Error: js.UndefOr[pluploadEventError] = js.undefined
  var FileFiltered: js.UndefOr[pluploadEventFile] = js.undefined
  var FileUploaded: js.UndefOr[pluploadEventFileUploaded] = js.undefined
  var FilesAdded: js.UndefOr[pluploadEventFiles] = js.undefined
  var FilesRemoved: js.UndefOr[pluploadEventFiles] = js.undefined
  var Init: js.UndefOr[pluploadEvent] = js.undefined
  var OptionChanged: js.UndefOr[pluploadEventOptionChanged] = js.undefined
  var PostInit: js.UndefOr[pluploadEvent] = js.undefined
  var QueueChanged: js.UndefOr[pluploadEvent] = js.undefined
  var Refresh: js.UndefOr[pluploadEvent] = js.undefined
  var StateChanged: js.UndefOr[pluploadEvent] = js.undefined
  var UploadComplete: js.UndefOr[pluploadEventFiles] = js.undefined
  var UploadFile: js.UndefOr[pluploadEventFile] = js.undefined
  var UploadProgress: js.UndefOr[pluploadEventFile] = js.undefined
}

object pluploadEvents {
  @scala.inline
  def apply(
    BeforeUpload: (/* uploader */ Uploader, /* file */ js.Any) => CallbackTo[js.Any] = null,
    ChunkUploaded: (/* uploader */ Uploader, /* file */ js.Any, /* response */ pluploadChunkResponse) => CallbackTo[js.Any] = null,
    Destroy: /* uploader */ Uploader => CallbackTo[js.Any] = null,
    Error: (/* uploader */ Uploader, /* error */ pluploadError) => CallbackTo[js.Any] = null,
    FileFiltered: (/* uploader */ Uploader, /* file */ js.Any) => CallbackTo[js.Any] = null,
    FileUploaded: (/* uploader */ Uploader, /* file */ js.Any, /* response */ pluploadResponse) => CallbackTo[js.Any] = null,
    FilesAdded: (/* uploader */ Uploader, /* files */ js.Array[js.Any]) => CallbackTo[js.Any] = null,
    FilesRemoved: (/* uploader */ Uploader, /* files */ js.Array[js.Any]) => CallbackTo[js.Any] = null,
    Init: /* uploader */ Uploader => CallbackTo[js.Any] = null,
    OptionChanged: (/* uploader */ Uploader, /* name */ String, /* value */ js.Any, /* oldValue */ js.Any) => CallbackTo[js.Any] = null,
    PostInit: /* uploader */ Uploader => CallbackTo[js.Any] = null,
    QueueChanged: /* uploader */ Uploader => CallbackTo[js.Any] = null,
    Refresh: /* uploader */ Uploader => CallbackTo[js.Any] = null,
    StateChanged: /* uploader */ Uploader => CallbackTo[js.Any] = null,
    UploadComplete: (/* uploader */ Uploader, /* files */ js.Array[js.Any]) => CallbackTo[js.Any] = null,
    UploadFile: (/* uploader */ Uploader, /* file */ js.Any) => CallbackTo[js.Any] = null,
    UploadProgress: (/* uploader */ Uploader, /* file */ js.Any) => CallbackTo[js.Any] = null
  ): pluploadEvents = {
    val __obj = js.Dynamic.literal()
    if (BeforeUpload != null) __obj.updateDynamic("BeforeUpload")(js.Any.fromFunction2((t0: /* uploader */ typingsJapgolly.plupload.plupload.Uploader, t1: /* file */ js.Any) => BeforeUpload(t0, t1).runNow()))
    if (ChunkUploaded != null) __obj.updateDynamic("ChunkUploaded")(js.Any.fromFunction3((t0: /* uploader */ typingsJapgolly.plupload.plupload.Uploader, t1: /* file */ js.Any, t2: /* response */ typingsJapgolly.plupload.pluploadChunkResponse) => ChunkUploaded(t0, t1, t2).runNow()))
    if (Destroy != null) __obj.updateDynamic("Destroy")(js.Any.fromFunction1((t0: /* uploader */ typingsJapgolly.plupload.plupload.Uploader) => Destroy(t0).runNow()))
    if (Error != null) __obj.updateDynamic("Error")(js.Any.fromFunction2((t0: /* uploader */ typingsJapgolly.plupload.plupload.Uploader, t1: /* error */ typingsJapgolly.plupload.pluploadError) => Error(t0, t1).runNow()))
    if (FileFiltered != null) __obj.updateDynamic("FileFiltered")(js.Any.fromFunction2((t0: /* uploader */ typingsJapgolly.plupload.plupload.Uploader, t1: /* file */ js.Any) => FileFiltered(t0, t1).runNow()))
    if (FileUploaded != null) __obj.updateDynamic("FileUploaded")(js.Any.fromFunction3((t0: /* uploader */ typingsJapgolly.plupload.plupload.Uploader, t1: /* file */ js.Any, t2: /* response */ typingsJapgolly.plupload.pluploadResponse) => FileUploaded(t0, t1, t2).runNow()))
    if (FilesAdded != null) __obj.updateDynamic("FilesAdded")(js.Any.fromFunction2((t0: /* uploader */ typingsJapgolly.plupload.plupload.Uploader, t1: /* files */ js.Array[js.Any]) => FilesAdded(t0, t1).runNow()))
    if (FilesRemoved != null) __obj.updateDynamic("FilesRemoved")(js.Any.fromFunction2((t0: /* uploader */ typingsJapgolly.plupload.plupload.Uploader, t1: /* files */ js.Array[js.Any]) => FilesRemoved(t0, t1).runNow()))
    if (Init != null) __obj.updateDynamic("Init")(js.Any.fromFunction1((t0: /* uploader */ typingsJapgolly.plupload.plupload.Uploader) => Init(t0).runNow()))
    if (OptionChanged != null) __obj.updateDynamic("OptionChanged")(js.Any.fromFunction4((t0: /* uploader */ typingsJapgolly.plupload.plupload.Uploader, t1: /* name */ java.lang.String, t2: /* value */ js.Any, t3: /* oldValue */ js.Any) => OptionChanged(t0, t1, t2, t3).runNow()))
    if (PostInit != null) __obj.updateDynamic("PostInit")(js.Any.fromFunction1((t0: /* uploader */ typingsJapgolly.plupload.plupload.Uploader) => PostInit(t0).runNow()))
    if (QueueChanged != null) __obj.updateDynamic("QueueChanged")(js.Any.fromFunction1((t0: /* uploader */ typingsJapgolly.plupload.plupload.Uploader) => QueueChanged(t0).runNow()))
    if (Refresh != null) __obj.updateDynamic("Refresh")(js.Any.fromFunction1((t0: /* uploader */ typingsJapgolly.plupload.plupload.Uploader) => Refresh(t0).runNow()))
    if (StateChanged != null) __obj.updateDynamic("StateChanged")(js.Any.fromFunction1((t0: /* uploader */ typingsJapgolly.plupload.plupload.Uploader) => StateChanged(t0).runNow()))
    if (UploadComplete != null) __obj.updateDynamic("UploadComplete")(js.Any.fromFunction2((t0: /* uploader */ typingsJapgolly.plupload.plupload.Uploader, t1: /* files */ js.Array[js.Any]) => UploadComplete(t0, t1).runNow()))
    if (UploadFile != null) __obj.updateDynamic("UploadFile")(js.Any.fromFunction2((t0: /* uploader */ typingsJapgolly.plupload.plupload.Uploader, t1: /* file */ js.Any) => UploadFile(t0, t1).runNow()))
    if (UploadProgress != null) __obj.updateDynamic("UploadProgress")(js.Any.fromFunction2((t0: /* uploader */ typingsJapgolly.plupload.plupload.Uploader, t1: /* file */ js.Any) => UploadProgress(t0, t1).runNow()))
    __obj.asInstanceOf[pluploadEvents]
  }
}

