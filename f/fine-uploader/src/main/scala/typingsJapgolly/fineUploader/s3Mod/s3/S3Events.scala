package typingsJapgolly.fineUploader.s3Mod.s3

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Blob
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.XMLHttpRequest
import typingsJapgolly.fineUploader.coreMod.BlobDataObject
import typingsJapgolly.fineUploader.coreMod.ChunkData
import typingsJapgolly.fineUploader.coreMod.CoreEvents
import typingsJapgolly.fineUploader.coreMod.PromiseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait S3Events extends CoreEvents {
  /**
    * Called before a request is sent to S3 if the temporary credentials have expired.
    *
    * You must return a promise. If your attempt to refresh the temporary credentials is successful, you must fulfill the promise via the success method, passing the new credentials object.
    * Otherwise, call failure with a descriptive reason.
    */
  var onCredentialsExpired: js.UndefOr[OnCredentialsExpired] = js.undefined
}

object S3Events {
  @scala.inline
  def apply(
    onAllComplete: (/* succeeded */ js.Array[Double], /* failed */ js.Array[Double]) => Callback = null,
    onAutoRetry: (/* id */ Double, /* name */ String, /* attemptNumber */ Double) => Callback = null,
    onCancel: (/* id */ Double, /* name */ String) => CallbackTo[Boolean | PromiseOptions | Unit] = null,
    onComplete: (/* id */ Double, /* name */ String, /* responseJSON */ js.Any, /* xhr */ XMLHttpRequest) => Callback = null,
    onCredentialsExpired: js.UndefOr[CallbackTo[PromiseOptions]] = js.undefined,
    onDelete: /* id */ Double => Callback = null,
    onDeleteComplete: (/* id */ Double, /* xhr */ XMLHttpRequest, /* isError */ Boolean) => Callback = null,
    onError: (/* id */ Double, /* name */ String, /* errorReason */ String, /* xhr */ XMLHttpRequest) => Callback = null,
    onManualRetry: (/* id */ Double, /* name */ String) => CallbackTo[Boolean | Unit] = null,
    onPasteReceived: /* blob */ Blob => CallbackTo[PromiseOptions | Unit] = null,
    onProgress: (/* id */ Double, /* name */ String, /* uploadedBytes */ Double, /* totalBytes */ Double) => Callback = null,
    onResume: (/* id */ Double, /* name */ String, /* chunkData */ js.Any, /* customResumeData */ js.Any) => CallbackTo[Unit | js.Promise[js.Any]] = null,
    onSessionRequestComplete: (/* response */ js.Array[js.Any], /* success */ Boolean, /* xhrOrXdr */ XMLHttpRequest) => Callback = null,
    onStatusChange: (/* id */ Double, /* oldStatus */ String, /* newStatus */ String) => Callback = null,
    onSubmit: (/* id */ Double, /* name */ String) => CallbackTo[Boolean | PromiseOptions | Unit] = null,
    onSubmitDelete: /* id */ Double => CallbackTo[PromiseOptions | Unit] = null,
    onSubmitted: (/* id */ Double, /* name */ String) => Callback = null,
    onTotalProgress: (/* totalUploadedBytes */ Double, /* totalBytes */ Double) => Callback = null,
    onUpload: (/* id */ Double, /* name */ String) => Callback = null,
    onUploadChunk: (/* id */ Double, /* name */ String, /* chunkData */ ChunkData) => CallbackTo[Unit | js.Promise[js.Any]] = null,
    onUploadChunkSuccess: (/* id */ Double, /* chunkData */ ChunkData, /* responseJSON */ js.Any, /* xhr */ XMLHttpRequest) => Callback = null,
    onValidate: (/* data */ BlobDataObject, /* buttonContainer */ js.UndefOr[HTMLElement]) => CallbackTo[PromiseOptions | Unit] = null,
    onValidateBatch: (/* fileOrBlobDataArray */ js.Array[BlobDataObject], /* buttonContainer */ HTMLElement) => CallbackTo[PromiseOptions | Unit] = null
  ): S3Events = {
    val __obj = js.Dynamic.literal()
    if (onAllComplete != null) __obj.updateDynamic("onAllComplete")(js.Any.fromFunction2((t0: /* succeeded */ js.Array[scala.Double], t1: /* failed */ js.Array[scala.Double]) => onAllComplete(t0, t1).runNow()))
    if (onAutoRetry != null) __obj.updateDynamic("onAutoRetry")(js.Any.fromFunction3((t0: /* id */ scala.Double, t1: /* name */ java.lang.String, t2: /* attemptNumber */ scala.Double) => onAutoRetry(t0, t1, t2).runNow()))
    if (onCancel != null) __obj.updateDynamic("onCancel")(js.Any.fromFunction2((t0: /* id */ scala.Double, t1: /* name */ java.lang.String) => onCancel(t0, t1).runNow()))
    if (onComplete != null) __obj.updateDynamic("onComplete")(js.Any.fromFunction4((t0: /* id */ scala.Double, t1: /* name */ java.lang.String, t2: /* responseJSON */ js.Any, t3: /* xhr */ org.scalajs.dom.raw.XMLHttpRequest) => onComplete(t0, t1, t2, t3).runNow()))
    onCredentialsExpired.foreach(p => __obj.updateDynamic("onCredentialsExpired")(p.toJsFn))
    if (onDelete != null) __obj.updateDynamic("onDelete")(js.Any.fromFunction1((t0: /* id */ scala.Double) => onDelete(t0).runNow()))
    if (onDeleteComplete != null) __obj.updateDynamic("onDeleteComplete")(js.Any.fromFunction3((t0: /* id */ scala.Double, t1: /* xhr */ org.scalajs.dom.raw.XMLHttpRequest, t2: /* isError */ scala.Boolean) => onDeleteComplete(t0, t1, t2).runNow()))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction4((t0: /* id */ scala.Double, t1: /* name */ java.lang.String, t2: /* errorReason */ java.lang.String, t3: /* xhr */ org.scalajs.dom.raw.XMLHttpRequest) => onError(t0, t1, t2, t3).runNow()))
    if (onManualRetry != null) __obj.updateDynamic("onManualRetry")(js.Any.fromFunction2((t0: /* id */ scala.Double, t1: /* name */ java.lang.String) => onManualRetry(t0, t1).runNow()))
    if (onPasteReceived != null) __obj.updateDynamic("onPasteReceived")(js.Any.fromFunction1((t0: /* blob */ org.scalajs.dom.raw.Blob) => onPasteReceived(t0).runNow()))
    if (onProgress != null) __obj.updateDynamic("onProgress")(js.Any.fromFunction4((t0: /* id */ scala.Double, t1: /* name */ java.lang.String, t2: /* uploadedBytes */ scala.Double, t3: /* totalBytes */ scala.Double) => onProgress(t0, t1, t2, t3).runNow()))
    if (onResume != null) __obj.updateDynamic("onResume")(js.Any.fromFunction4((t0: /* id */ scala.Double, t1: /* name */ java.lang.String, t2: /* chunkData */ js.Any, t3: /* customResumeData */ js.Any) => onResume(t0, t1, t2, t3).runNow()))
    if (onSessionRequestComplete != null) __obj.updateDynamic("onSessionRequestComplete")(js.Any.fromFunction3((t0: /* response */ js.Array[js.Any], t1: /* success */ scala.Boolean, t2: /* xhrOrXdr */ org.scalajs.dom.raw.XMLHttpRequest) => onSessionRequestComplete(t0, t1, t2).runNow()))
    if (onStatusChange != null) __obj.updateDynamic("onStatusChange")(js.Any.fromFunction3((t0: /* id */ scala.Double, t1: /* oldStatus */ java.lang.String, t2: /* newStatus */ java.lang.String) => onStatusChange(t0, t1, t2).runNow()))
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(js.Any.fromFunction2((t0: /* id */ scala.Double, t1: /* name */ java.lang.String) => onSubmit(t0, t1).runNow()))
    if (onSubmitDelete != null) __obj.updateDynamic("onSubmitDelete")(js.Any.fromFunction1((t0: /* id */ scala.Double) => onSubmitDelete(t0).runNow()))
    if (onSubmitted != null) __obj.updateDynamic("onSubmitted")(js.Any.fromFunction2((t0: /* id */ scala.Double, t1: /* name */ java.lang.String) => onSubmitted(t0, t1).runNow()))
    if (onTotalProgress != null) __obj.updateDynamic("onTotalProgress")(js.Any.fromFunction2((t0: /* totalUploadedBytes */ scala.Double, t1: /* totalBytes */ scala.Double) => onTotalProgress(t0, t1).runNow()))
    if (onUpload != null) __obj.updateDynamic("onUpload")(js.Any.fromFunction2((t0: /* id */ scala.Double, t1: /* name */ java.lang.String) => onUpload(t0, t1).runNow()))
    if (onUploadChunk != null) __obj.updateDynamic("onUploadChunk")(js.Any.fromFunction3((t0: /* id */ scala.Double, t1: /* name */ java.lang.String, t2: /* chunkData */ typingsJapgolly.fineUploader.coreMod.ChunkData) => onUploadChunk(t0, t1, t2).runNow()))
    if (onUploadChunkSuccess != null) __obj.updateDynamic("onUploadChunkSuccess")(js.Any.fromFunction4((t0: /* id */ scala.Double, t1: /* chunkData */ typingsJapgolly.fineUploader.coreMod.ChunkData, t2: /* responseJSON */ js.Any, t3: /* xhr */ org.scalajs.dom.raw.XMLHttpRequest) => onUploadChunkSuccess(t0, t1, t2, t3).runNow()))
    if (onValidate != null) __obj.updateDynamic("onValidate")(js.Any.fromFunction2((t0: /* data */ typingsJapgolly.fineUploader.coreMod.BlobDataObject, t1: /* buttonContainer */ js.UndefOr[org.scalajs.dom.raw.HTMLElement]) => onValidate(t0, t1).runNow()))
    if (onValidateBatch != null) __obj.updateDynamic("onValidateBatch")(js.Any.fromFunction2((t0: /* fileOrBlobDataArray */ js.Array[typingsJapgolly.fineUploader.coreMod.BlobDataObject], t1: /* buttonContainer */ org.scalajs.dom.raw.HTMLElement) => onValidateBatch(t0, t1).runNow()))
    __obj.asInstanceOf[S3Events]
  }
}

