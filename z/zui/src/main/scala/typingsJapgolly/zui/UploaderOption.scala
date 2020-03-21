package typingsJapgolly.zui

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * uploader
  */
trait UploaderOption extends js.Object {
  var autoUpload: js.UndefOr[Boolean] = js.undefined
  var browseByClickList: js.UndefOr[Boolean] = js.undefined
  var browse_button: js.UndefOr[String] = js.undefined
  var chunk_size: js.UndefOr[String] = js.undefined
  var deleteActionOnDone: js.UndefOr[Boolean] = js.undefined
  var deleteConfirm: js.UndefOr[Boolean | String] = js.undefined
  var dropPlaceholder: js.UndefOr[Boolean] = js.undefined
  var drop_element: js.UndefOr[String] = js.undefined
  var fileFormater: js.UndefOr[js.Function3[/* $file */ JQuery, /* file */ FileObj, /* status */ STATUS, Unit]] = js.undefined
  var fileIconCreator: js.UndefOr[
    js.Function3[/* fileType */ String, /* file */ FileObj, /* uploader */ Uploader, Unit]
  ] = js.undefined
  var fileList: js.UndefOr[String] = js.undefined
  var fileTemplate: js.UndefOr[String] = js.undefined
  var file_data_name: js.UndefOr[String] = js.undefined
  var filters: js.UndefOr[AnonMaxfilesize] = js.undefined
  var flash_swf_url: js.UndefOr[String] = js.undefined
  var headers: js.UndefOr[js.Object] = js.undefined
  var lang: js.UndefOr[String] = js.undefined
  var limitFilesCount: js.UndefOr[Boolean | Double] = js.undefined
  var max_retries: js.UndefOr[Double] = js.undefined
  var multi_selection: js.UndefOr[Boolean] = js.undefined
  var multipart: js.UndefOr[Boolean] = js.undefined
  var multipart_params: js.UndefOr[js.Object | CallBack] = js.undefined
  var onBeforeUpload: js.UndefOr[js.Function1[/* file */ FileObj, Unit]] = js.undefined
  var onChunkUploaded: js.UndefOr[js.Function2[/* file */ FileObj, /* responseObject */ ResponseObject, Unit]] = js.undefined
  var onError: js.UndefOr[js.Function1[/* error */ AnonError, Unit]] = js.undefined
  var onFileUploaded: js.UndefOr[js.Function2[/* file */ FileObj, /* responseObject */ ResponseObject, Unit]] = js.undefined
  var onFilesAdded: js.UndefOr[js.Function1[/* fiels */ js.Array[FileObj], Unit]] = js.undefined
  var onFilesRemoved: js.UndefOr[js.Function1[/* files */ js.Array[FileObj], Unit]] = js.undefined
  var onInit: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onQueueChanged: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onStateChanged: js.UndefOr[js.Function1[/* status */ STATUS, Unit]] = js.undefined
  var onUploadComplete: js.UndefOr[js.Function1[/* files */ js.Array[FileObj], Unit]] = js.undefined
  var onUploadFile: js.UndefOr[js.Function1[/* file */ FileObj, Unit]] = js.undefined
  var onUploadProgress: js.UndefOr[js.Function1[/* file */ FileObj, Unit]] = js.undefined
  var previewImageIcon: js.UndefOr[Boolean] = js.undefined
  var previewImageSize: js.UndefOr[AnonHeight] = js.undefined
  var qiniu: js.UndefOr[js.Object] = js.undefined
  var removeUploaded: js.UndefOr[Boolean] = js.undefined
  var rename: js.UndefOr[Boolean] = js.undefined
  var renameActionOnDone: js.UndefOr[Boolean] = js.undefined
  var renameByClick: js.UndefOr[Boolean] = js.undefined
  var renameExtension: js.UndefOr[Boolean] = js.undefined
  var resize: js.UndefOr[AnonCrop] = js.undefined
  var responseHandler: js.UndefOr[Boolean | CallBack] = js.undefined
  var runtimes: js.UndefOr[String] = js.undefined
  var sendFileId: js.UndefOr[Boolean] = js.undefined
  var sendFileName: js.UndefOr[Boolean] = js.undefined
  var silverlight_xap_url: js.UndefOr[String] = js.undefined
  var staticFiles: js.UndefOr[js.Array[AnonId]] = js.undefined
  var statusCreator: js.UndefOr[
    js.Function3[/* total */ UploadProgress, /* state */ STATUS, /* uploader */ Uploader, Unit]
  ] = js.undefined
  var unique_names: js.UndefOr[Boolean] = js.undefined
  var uploadedMessage: js.UndefOr[Boolean] = js.undefined
  var url: String
}

object UploaderOption {
  @scala.inline
  def apply(
    url: String,
    autoUpload: js.UndefOr[Boolean] = js.undefined,
    browseByClickList: js.UndefOr[Boolean] = js.undefined,
    browse_button: String = null,
    chunk_size: String = null,
    deleteActionOnDone: js.UndefOr[Boolean] = js.undefined,
    deleteConfirm: Boolean | String = null,
    dropPlaceholder: js.UndefOr[Boolean] = js.undefined,
    drop_element: String = null,
    fileFormater: (/* $file */ JQuery, /* file */ FileObj, /* status */ STATUS) => Callback = null,
    fileIconCreator: (/* fileType */ String, /* file */ FileObj, /* uploader */ Uploader) => Callback = null,
    fileList: String = null,
    fileTemplate: String = null,
    file_data_name: String = null,
    filters: AnonMaxfilesize = null,
    flash_swf_url: String = null,
    headers: js.Object = null,
    lang: String = null,
    limitFilesCount: Boolean | Double = null,
    max_retries: Int | Double = null,
    multi_selection: js.UndefOr[Boolean] = js.undefined,
    multipart: js.UndefOr[Boolean] = js.undefined,
    multipart_params: js.Object | CallBack = null,
    onBeforeUpload: /* file */ FileObj => Callback = null,
    onChunkUploaded: (/* file */ FileObj, /* responseObject */ ResponseObject) => Callback = null,
    onError: /* error */ AnonError => Callback = null,
    onFileUploaded: (/* file */ FileObj, /* responseObject */ ResponseObject) => Callback = null,
    onFilesAdded: /* fiels */ js.Array[FileObj] => Callback = null,
    onFilesRemoved: /* files */ js.Array[FileObj] => Callback = null,
    onInit: js.UndefOr[Callback] = js.undefined,
    onQueueChanged: js.UndefOr[Callback] = js.undefined,
    onStateChanged: /* status */ STATUS => Callback = null,
    onUploadComplete: /* files */ js.Array[FileObj] => Callback = null,
    onUploadFile: /* file */ FileObj => Callback = null,
    onUploadProgress: /* file */ FileObj => Callback = null,
    previewImageIcon: js.UndefOr[Boolean] = js.undefined,
    previewImageSize: AnonHeight = null,
    qiniu: js.Object = null,
    removeUploaded: js.UndefOr[Boolean] = js.undefined,
    rename: js.UndefOr[Boolean] = js.undefined,
    renameActionOnDone: js.UndefOr[Boolean] = js.undefined,
    renameByClick: js.UndefOr[Boolean] = js.undefined,
    renameExtension: js.UndefOr[Boolean] = js.undefined,
    resize: AnonCrop = null,
    responseHandler: Boolean | CallBack = null,
    runtimes: String = null,
    sendFileId: js.UndefOr[Boolean] = js.undefined,
    sendFileName: js.UndefOr[Boolean] = js.undefined,
    silverlight_xap_url: String = null,
    staticFiles: js.Array[AnonId] = null,
    statusCreator: (/* total */ UploadProgress, /* state */ STATUS, /* uploader */ Uploader) => Callback = null,
    unique_names: js.UndefOr[Boolean] = js.undefined,
    uploadedMessage: js.UndefOr[Boolean] = js.undefined
  ): UploaderOption = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (!js.isUndefined(autoUpload)) __obj.updateDynamic("autoUpload")(autoUpload.asInstanceOf[js.Any])
    if (!js.isUndefined(browseByClickList)) __obj.updateDynamic("browseByClickList")(browseByClickList.asInstanceOf[js.Any])
    if (browse_button != null) __obj.updateDynamic("browse_button")(browse_button.asInstanceOf[js.Any])
    if (chunk_size != null) __obj.updateDynamic("chunk_size")(chunk_size.asInstanceOf[js.Any])
    if (!js.isUndefined(deleteActionOnDone)) __obj.updateDynamic("deleteActionOnDone")(deleteActionOnDone.asInstanceOf[js.Any])
    if (deleteConfirm != null) __obj.updateDynamic("deleteConfirm")(deleteConfirm.asInstanceOf[js.Any])
    if (!js.isUndefined(dropPlaceholder)) __obj.updateDynamic("dropPlaceholder")(dropPlaceholder.asInstanceOf[js.Any])
    if (drop_element != null) __obj.updateDynamic("drop_element")(drop_element.asInstanceOf[js.Any])
    if (fileFormater != null) __obj.updateDynamic("fileFormater")(js.Any.fromFunction3((t0: /* $file */ typingsJapgolly.zui.JQuery, t1: /* file */ typingsJapgolly.zui.FileObj, t2: /* status */ typingsJapgolly.zui.STATUS) => fileFormater(t0, t1, t2).runNow()))
    if (fileIconCreator != null) __obj.updateDynamic("fileIconCreator")(js.Any.fromFunction3((t0: /* fileType */ java.lang.String, t1: /* file */ typingsJapgolly.zui.FileObj, t2: /* uploader */ typingsJapgolly.zui.Uploader) => fileIconCreator(t0, t1, t2).runNow()))
    if (fileList != null) __obj.updateDynamic("fileList")(fileList.asInstanceOf[js.Any])
    if (fileTemplate != null) __obj.updateDynamic("fileTemplate")(fileTemplate.asInstanceOf[js.Any])
    if (file_data_name != null) __obj.updateDynamic("file_data_name")(file_data_name.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (flash_swf_url != null) __obj.updateDynamic("flash_swf_url")(flash_swf_url.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (limitFilesCount != null) __obj.updateDynamic("limitFilesCount")(limitFilesCount.asInstanceOf[js.Any])
    if (max_retries != null) __obj.updateDynamic("max_retries")(max_retries.asInstanceOf[js.Any])
    if (!js.isUndefined(multi_selection)) __obj.updateDynamic("multi_selection")(multi_selection.asInstanceOf[js.Any])
    if (!js.isUndefined(multipart)) __obj.updateDynamic("multipart")(multipart.asInstanceOf[js.Any])
    if (multipart_params != null) __obj.updateDynamic("multipart_params")(multipart_params.asInstanceOf[js.Any])
    if (onBeforeUpload != null) __obj.updateDynamic("onBeforeUpload")(js.Any.fromFunction1((t0: /* file */ typingsJapgolly.zui.FileObj) => onBeforeUpload(t0).runNow()))
    if (onChunkUploaded != null) __obj.updateDynamic("onChunkUploaded")(js.Any.fromFunction2((t0: /* file */ typingsJapgolly.zui.FileObj, t1: /* responseObject */ typingsJapgolly.zui.ResponseObject) => onChunkUploaded(t0, t1).runNow()))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1((t0: /* error */ typingsJapgolly.zui.AnonError) => onError(t0).runNow()))
    if (onFileUploaded != null) __obj.updateDynamic("onFileUploaded")(js.Any.fromFunction2((t0: /* file */ typingsJapgolly.zui.FileObj, t1: /* responseObject */ typingsJapgolly.zui.ResponseObject) => onFileUploaded(t0, t1).runNow()))
    if (onFilesAdded != null) __obj.updateDynamic("onFilesAdded")(js.Any.fromFunction1((t0: /* fiels */ js.Array[typingsJapgolly.zui.FileObj]) => onFilesAdded(t0).runNow()))
    if (onFilesRemoved != null) __obj.updateDynamic("onFilesRemoved")(js.Any.fromFunction1((t0: /* files */ js.Array[typingsJapgolly.zui.FileObj]) => onFilesRemoved(t0).runNow()))
    onInit.foreach(p => __obj.updateDynamic("onInit")(p.toJsFn))
    onQueueChanged.foreach(p => __obj.updateDynamic("onQueueChanged")(p.toJsFn))
    if (onStateChanged != null) __obj.updateDynamic("onStateChanged")(js.Any.fromFunction1((t0: /* status */ typingsJapgolly.zui.STATUS) => onStateChanged(t0).runNow()))
    if (onUploadComplete != null) __obj.updateDynamic("onUploadComplete")(js.Any.fromFunction1((t0: /* files */ js.Array[typingsJapgolly.zui.FileObj]) => onUploadComplete(t0).runNow()))
    if (onUploadFile != null) __obj.updateDynamic("onUploadFile")(js.Any.fromFunction1((t0: /* file */ typingsJapgolly.zui.FileObj) => onUploadFile(t0).runNow()))
    if (onUploadProgress != null) __obj.updateDynamic("onUploadProgress")(js.Any.fromFunction1((t0: /* file */ typingsJapgolly.zui.FileObj) => onUploadProgress(t0).runNow()))
    if (!js.isUndefined(previewImageIcon)) __obj.updateDynamic("previewImageIcon")(previewImageIcon.asInstanceOf[js.Any])
    if (previewImageSize != null) __obj.updateDynamic("previewImageSize")(previewImageSize.asInstanceOf[js.Any])
    if (qiniu != null) __obj.updateDynamic("qiniu")(qiniu.asInstanceOf[js.Any])
    if (!js.isUndefined(removeUploaded)) __obj.updateDynamic("removeUploaded")(removeUploaded.asInstanceOf[js.Any])
    if (!js.isUndefined(rename)) __obj.updateDynamic("rename")(rename.asInstanceOf[js.Any])
    if (!js.isUndefined(renameActionOnDone)) __obj.updateDynamic("renameActionOnDone")(renameActionOnDone.asInstanceOf[js.Any])
    if (!js.isUndefined(renameByClick)) __obj.updateDynamic("renameByClick")(renameByClick.asInstanceOf[js.Any])
    if (!js.isUndefined(renameExtension)) __obj.updateDynamic("renameExtension")(renameExtension.asInstanceOf[js.Any])
    if (resize != null) __obj.updateDynamic("resize")(resize.asInstanceOf[js.Any])
    if (responseHandler != null) __obj.updateDynamic("responseHandler")(responseHandler.asInstanceOf[js.Any])
    if (runtimes != null) __obj.updateDynamic("runtimes")(runtimes.asInstanceOf[js.Any])
    if (!js.isUndefined(sendFileId)) __obj.updateDynamic("sendFileId")(sendFileId.asInstanceOf[js.Any])
    if (!js.isUndefined(sendFileName)) __obj.updateDynamic("sendFileName")(sendFileName.asInstanceOf[js.Any])
    if (silverlight_xap_url != null) __obj.updateDynamic("silverlight_xap_url")(silverlight_xap_url.asInstanceOf[js.Any])
    if (staticFiles != null) __obj.updateDynamic("staticFiles")(staticFiles.asInstanceOf[js.Any])
    if (statusCreator != null) __obj.updateDynamic("statusCreator")(js.Any.fromFunction3((t0: /* total */ typingsJapgolly.zui.UploadProgress, t1: /* state */ typingsJapgolly.zui.STATUS, t2: /* uploader */ typingsJapgolly.zui.Uploader) => statusCreator(t0, t1, t2).runNow()))
    if (!js.isUndefined(unique_names)) __obj.updateDynamic("unique_names")(unique_names.asInstanceOf[js.Any])
    if (!js.isUndefined(uploadedMessage)) __obj.updateDynamic("uploadedMessage")(uploadedMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploaderOption]
  }
}

