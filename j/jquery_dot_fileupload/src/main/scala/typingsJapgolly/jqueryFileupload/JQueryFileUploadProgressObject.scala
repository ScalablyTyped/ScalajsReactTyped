package typingsJapgolly.jqueryFileupload

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.Element
import typingsJapgolly.jquery.JQueryEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryFileUploadProgressObject
  extends JQueryFileInputOptions
     with JQueryFileUploadProgressAllObject

object JQueryFileUploadProgressObject {
  @scala.inline
  def apply(
    active: js.Function = null,
    add: (/* e */ JQueryEventObject, /* data */ JqueryFileUploadAddObject) => Callback = null,
    always: (/* e */ JQueryEventObject, /* data */ JQueryFileInputOptions) => Callback = null,
    autoUpload: js.UndefOr[Boolean] = js.undefined,
    bitrate: Int | Double = null,
    bitrateInterval: Int | Double = null,
    cache: js.UndefOr[Boolean] = js.undefined,
    change: (/* e */ JQueryEventObject, /* data */ JQueryFileUploadChangeObject) => Callback = null,
    chunkalways: (/* e */ JQueryEventObject, /* data */ JQueryFileUploadChunkObject) => Callback = null,
    chunkdone: (/* e */ JQueryEventObject, /* data */ JQueryFileUploadChunkObject) => Callback = null,
    chunkfail: (/* e */ JQueryEventObject, /* data */ JQueryFileUploadChunkObject) => Callback = null,
    chunksend: (/* e */ JQueryEventObject, /* data */ JQueryFileUploadChunkObject) => Callback = null,
    contentType: String = null,
    dataType: String = null,
    done: (/* e */ JQueryEventObject, /* data */ JQueryFileUploadDone) => Callback = null,
    dragover: /* e */ JQueryEventObject => Callback = null,
    drop: (/* e */ JQueryEventObject, /* data */ JQueryFileUploadFilesObject) => Callback = null,
    dropZone: Element | js.Array[Element] | JQuery | String = null,
    fail: (/* e */ JQueryEventObject, /* data */ JQueryFileUploadDone) => Callback = null,
    fileInput: Element | js.Array[Element] | JQuery | String = null,
    files: js.Any = null,
    forceIframeTransport: js.UndefOr[Boolean] = js.undefined,
    formData: js.Any = null,
    i18n: js.Any = null,
    limitConcurrentUploads: Int | Double = null,
    limitMultiFileUploadSize: Int | Double = null,
    limitMultiFileUploadSizeOverhead: Int | Double = null,
    limitMultiFileUploads: Int | Double = null,
    loaded: Int | Double = null,
    maxChunkSize: Int | Double = null,
    maxFileSize: Int | Double = null,
    messages: js.Any = null,
    multipart: js.UndefOr[Boolean] = js.undefined,
    paramName: js.Any = null,
    paste: (/* e */ JQueryEventObject, /* data */ JQueryFileUploadFilesObject) => Callback = null,
    pasteZone: Element | js.Array[Element] | JQuery | String = null,
    postMessage: String = null,
    processData: js.UndefOr[Boolean] = js.undefined,
    progress: (/* e */ JQueryEventObject, /* data */ JQueryFileUploadProgressObject) => Callback = null,
    progressInterval: Int | Double = null,
    progressall: (/* e */ JQueryEventObject, /* data */ JQueryFileUploadProgressAllObject) => Callback = null,
    recalculateProgress: js.UndefOr[Boolean] = js.undefined,
    redirect: String = null,
    redirectParamName: String = null,
    replaceFileInput: js.UndefOr[Boolean] = js.undefined,
    send: (/* e */ JQueryEventObject, /* data */ JQueryFileUploadProgressObject) => Callback = null,
    sequentialUploads: js.UndefOr[Boolean] = js.undefined,
    singleFileUploads: js.UndefOr[Boolean] = js.undefined,
    start: /* e */ JQueryEventObject => Callback = null,
    stop: /* e */ JQueryEventObject => Callback = null,
    submit: js.Function = null,
    timeout: Int | Double = null,
    total: Int | Double = null,
    `type`: String = null,
    uploadedBytes: Int | Double = null,
    url: String = null,
    xhrFields: js.Any = null
  ): JQueryFileUploadProgressObject = {
    val __obj = js.Dynamic.literal()
    if (active != null) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (add != null) __obj.updateDynamic("add")(js.Any.fromFunction2((t0: /* e */ typingsJapgolly.jquery.JQueryEventObject, t1: /* data */ typingsJapgolly.jqueryFileupload.JqueryFileUploadAddObject) => add(t0, t1).runNow()))
    if (always != null) __obj.updateDynamic("always")(js.Any.fromFunction2((t0: /* e */ typingsJapgolly.jquery.JQueryEventObject, t1: /* data */ typingsJapgolly.jqueryFileupload.JQueryFileInputOptions) => always(t0, t1).runNow()))
    if (!js.isUndefined(autoUpload)) __obj.updateDynamic("autoUpload")(autoUpload.asInstanceOf[js.Any])
    if (bitrate != null) __obj.updateDynamic("bitrate")(bitrate.asInstanceOf[js.Any])
    if (bitrateInterval != null) __obj.updateDynamic("bitrateInterval")(bitrateInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction2((t0: /* e */ typingsJapgolly.jquery.JQueryEventObject, t1: /* data */ typingsJapgolly.jqueryFileupload.JQueryFileUploadChangeObject) => change(t0, t1).runNow()))
    if (chunkalways != null) __obj.updateDynamic("chunkalways")(js.Any.fromFunction2((t0: /* e */ typingsJapgolly.jquery.JQueryEventObject, t1: /* data */ typingsJapgolly.jqueryFileupload.JQueryFileUploadChunkObject) => chunkalways(t0, t1).runNow()))
    if (chunkdone != null) __obj.updateDynamic("chunkdone")(js.Any.fromFunction2((t0: /* e */ typingsJapgolly.jquery.JQueryEventObject, t1: /* data */ typingsJapgolly.jqueryFileupload.JQueryFileUploadChunkObject) => chunkdone(t0, t1).runNow()))
    if (chunkfail != null) __obj.updateDynamic("chunkfail")(js.Any.fromFunction2((t0: /* e */ typingsJapgolly.jquery.JQueryEventObject, t1: /* data */ typingsJapgolly.jqueryFileupload.JQueryFileUploadChunkObject) => chunkfail(t0, t1).runNow()))
    if (chunksend != null) __obj.updateDynamic("chunksend")(js.Any.fromFunction2((t0: /* e */ typingsJapgolly.jquery.JQueryEventObject, t1: /* data */ typingsJapgolly.jqueryFileupload.JQueryFileUploadChunkObject) => chunksend(t0, t1).runNow()))
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (dataType != null) __obj.updateDynamic("dataType")(dataType.asInstanceOf[js.Any])
    if (done != null) __obj.updateDynamic("done")(js.Any.fromFunction2((t0: /* e */ typingsJapgolly.jquery.JQueryEventObject, t1: /* data */ typingsJapgolly.jqueryFileupload.JQueryFileUploadDone) => done(t0, t1).runNow()))
    if (dragover != null) __obj.updateDynamic("dragover")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.jquery.JQueryEventObject) => dragover(t0).runNow()))
    if (drop != null) __obj.updateDynamic("drop")(js.Any.fromFunction2((t0: /* e */ typingsJapgolly.jquery.JQueryEventObject, t1: /* data */ typingsJapgolly.jqueryFileupload.JQueryFileUploadFilesObject) => drop(t0, t1).runNow()))
    if (dropZone != null) __obj.updateDynamic("dropZone")(dropZone.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction2((t0: /* e */ typingsJapgolly.jquery.JQueryEventObject, t1: /* data */ typingsJapgolly.jqueryFileupload.JQueryFileUploadDone) => fail(t0, t1).runNow()))
    if (fileInput != null) __obj.updateDynamic("fileInput")(fileInput.asInstanceOf[js.Any])
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    if (!js.isUndefined(forceIframeTransport)) __obj.updateDynamic("forceIframeTransport")(forceIframeTransport.asInstanceOf[js.Any])
    if (formData != null) __obj.updateDynamic("formData")(formData.asInstanceOf[js.Any])
    if (i18n != null) __obj.updateDynamic("i18n")(i18n.asInstanceOf[js.Any])
    if (limitConcurrentUploads != null) __obj.updateDynamic("limitConcurrentUploads")(limitConcurrentUploads.asInstanceOf[js.Any])
    if (limitMultiFileUploadSize != null) __obj.updateDynamic("limitMultiFileUploadSize")(limitMultiFileUploadSize.asInstanceOf[js.Any])
    if (limitMultiFileUploadSizeOverhead != null) __obj.updateDynamic("limitMultiFileUploadSizeOverhead")(limitMultiFileUploadSizeOverhead.asInstanceOf[js.Any])
    if (limitMultiFileUploads != null) __obj.updateDynamic("limitMultiFileUploads")(limitMultiFileUploads.asInstanceOf[js.Any])
    if (loaded != null) __obj.updateDynamic("loaded")(loaded.asInstanceOf[js.Any])
    if (maxChunkSize != null) __obj.updateDynamic("maxChunkSize")(maxChunkSize.asInstanceOf[js.Any])
    if (maxFileSize != null) __obj.updateDynamic("maxFileSize")(maxFileSize.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    if (!js.isUndefined(multipart)) __obj.updateDynamic("multipart")(multipart.asInstanceOf[js.Any])
    if (paramName != null) __obj.updateDynamic("paramName")(paramName.asInstanceOf[js.Any])
    if (paste != null) __obj.updateDynamic("paste")(js.Any.fromFunction2((t0: /* e */ typingsJapgolly.jquery.JQueryEventObject, t1: /* data */ typingsJapgolly.jqueryFileupload.JQueryFileUploadFilesObject) => paste(t0, t1).runNow()))
    if (pasteZone != null) __obj.updateDynamic("pasteZone")(pasteZone.asInstanceOf[js.Any])
    if (postMessage != null) __obj.updateDynamic("postMessage")(postMessage.asInstanceOf[js.Any])
    if (!js.isUndefined(processData)) __obj.updateDynamic("processData")(processData.asInstanceOf[js.Any])
    if (progress != null) __obj.updateDynamic("progress")(js.Any.fromFunction2((t0: /* e */ typingsJapgolly.jquery.JQueryEventObject, t1: /* data */ typingsJapgolly.jqueryFileupload.JQueryFileUploadProgressObject) => progress(t0, t1).runNow()))
    if (progressInterval != null) __obj.updateDynamic("progressInterval")(progressInterval.asInstanceOf[js.Any])
    if (progressall != null) __obj.updateDynamic("progressall")(js.Any.fromFunction2((t0: /* e */ typingsJapgolly.jquery.JQueryEventObject, t1: /* data */ typingsJapgolly.jqueryFileupload.JQueryFileUploadProgressAllObject) => progressall(t0, t1).runNow()))
    if (!js.isUndefined(recalculateProgress)) __obj.updateDynamic("recalculateProgress")(recalculateProgress.asInstanceOf[js.Any])
    if (redirect != null) __obj.updateDynamic("redirect")(redirect.asInstanceOf[js.Any])
    if (redirectParamName != null) __obj.updateDynamic("redirectParamName")(redirectParamName.asInstanceOf[js.Any])
    if (!js.isUndefined(replaceFileInput)) __obj.updateDynamic("replaceFileInput")(replaceFileInput.asInstanceOf[js.Any])
    if (send != null) __obj.updateDynamic("send")(js.Any.fromFunction2((t0: /* e */ typingsJapgolly.jquery.JQueryEventObject, t1: /* data */ typingsJapgolly.jqueryFileupload.JQueryFileUploadProgressObject) => send(t0, t1).runNow()))
    if (!js.isUndefined(sequentialUploads)) __obj.updateDynamic("sequentialUploads")(sequentialUploads.asInstanceOf[js.Any])
    if (!js.isUndefined(singleFileUploads)) __obj.updateDynamic("singleFileUploads")(singleFileUploads.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.jquery.JQueryEventObject) => start(t0).runNow()))
    if (stop != null) __obj.updateDynamic("stop")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.jquery.JQueryEventObject) => stop(t0).runNow()))
    if (submit != null) __obj.updateDynamic("submit")(submit.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (total != null) __obj.updateDynamic("total")(total.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (uploadedBytes != null) __obj.updateDynamic("uploadedBytes")(uploadedBytes.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (xhrFields != null) __obj.updateDynamic("xhrFields")(xhrFields.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryFileUploadProgressObject]
  }
}

