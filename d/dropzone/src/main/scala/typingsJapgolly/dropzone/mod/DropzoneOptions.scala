package typingsJapgolly.dropzone.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Blob
import org.scalajs.dom.raw.DragEvent
import org.scalajs.dom.raw.FormData
import org.scalajs.dom.raw.XMLHttpRequest
import typingsJapgolly.dropzone.dropzoneStrings.contain
import typingsJapgolly.dropzone.dropzoneStrings.crop
import typingsJapgolly.dropzone.mod._Global_.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropzoneOptions extends js.Object {
  var accept: js.UndefOr[
    js.Function2[
      /* file */ DropzoneFile, 
      /* done */ js.Function1[/* error */ js.UndefOr[String | js.Error], Unit], 
      Unit
    ]
  ] = js.undefined
  var acceptedFiles: js.UndefOr[String] = js.undefined
  var addRemoveLinks: js.UndefOr[Boolean] = js.undefined
  var addedfile: js.UndefOr[js.Function1[/* file */ DropzoneFile, Unit]] = js.undefined
  var addedfiles: js.UndefOr[js.Function1[/* files */ js.Array[DropzoneFile], Unit]] = js.undefined
  var autoProcessQueue: js.UndefOr[Boolean] = js.undefined
  var autoQueue: js.UndefOr[Boolean] = js.undefined
  var canceled: js.UndefOr[js.Function1[/* file */ DropzoneFile, Unit]] = js.undefined
  var canceledmultiple: js.UndefOr[js.Function1[/* file */ js.Array[DropzoneFile], Unit]] = js.undefined
  var capture: js.UndefOr[String] = js.undefined
  var chunkSize: js.UndefOr[Double] = js.undefined
  var chunking: js.UndefOr[Boolean] = js.undefined
  var chunksUploaded: js.UndefOr[
    js.Function2[
      /* file */ DropzoneFile, 
      /* done */ js.Function1[/* error */ js.UndefOr[String | js.Error], Unit], 
      Unit
    ]
  ] = js.undefined
  var clickable: js.UndefOr[Boolean | String | HTMLElement | (js.Array[String | HTMLElement])] = js.undefined
  var complete: js.UndefOr[js.Function1[/* file */ DropzoneFile, Unit]] = js.undefined
  var completemultiple: js.UndefOr[js.Function1[/* file */ js.Array[DropzoneFile], Unit]] = js.undefined
  var createImageThumbnails: js.UndefOr[Boolean] = js.undefined
  var dictCancelUpload: js.UndefOr[String] = js.undefined
  var dictCancelUploadConfirmation: js.UndefOr[String] = js.undefined
  var dictDefaultMessage: js.UndefOr[String] = js.undefined
  var dictFallbackMessage: js.UndefOr[String] = js.undefined
  var dictFallbackText: js.UndefOr[String] = js.undefined
  var dictFileSizeUnits: js.UndefOr[DropzoneDictFileSizeUnits] = js.undefined
  var dictFileTooBig: js.UndefOr[String] = js.undefined
  var dictInvalidFileType: js.UndefOr[String] = js.undefined
  var dictMaxFilesExceeded: js.UndefOr[String] = js.undefined
  var dictRemoveFile: js.UndefOr[String] = js.undefined
  var dictRemoveFileConfirmation: js.UndefOr[String] = js.undefined
  var dictResponseError: js.UndefOr[String] = js.undefined
  var dictUploadCanceled: js.UndefOr[String] = js.undefined
  var dragend: js.UndefOr[js.Function1[/* e */ DragEvent, Unit]] = js.undefined
  var dragenter: js.UndefOr[js.Function1[/* e */ DragEvent, Unit]] = js.undefined
  var dragleave: js.UndefOr[js.Function1[/* e */ DragEvent, Unit]] = js.undefined
  var dragover: js.UndefOr[js.Function1[/* e */ DragEvent, Unit]] = js.undefined
  var dragstart: js.UndefOr[js.Function1[/* e */ DragEvent, Unit]] = js.undefined
  var drop: js.UndefOr[js.Function1[/* e */ DragEvent, Unit]] = js.undefined
  var error: js.UndefOr[
    js.Function3[
      /* file */ DropzoneFile, 
      /* message */ String | js.Error, 
      /* xhr */ XMLHttpRequest, 
      Unit
    ]
  ] = js.undefined
  var errormultiple: js.UndefOr[
    js.Function3[
      /* files */ js.Array[DropzoneFile], 
      /* message */ String | js.Error, 
      /* xhr */ XMLHttpRequest, 
      Unit
    ]
  ] = js.undefined
  var fallback: js.UndefOr[js.Function0[Unit]] = js.undefined
  var filesizeBase: js.UndefOr[Double] = js.undefined
  var forceChunking: js.UndefOr[Boolean] = js.undefined
  var forceFallback: js.UndefOr[Boolean] = js.undefined
  var headers: js.UndefOr[StringDictionary[String]] = js.undefined
  var hiddenInputContainer: js.UndefOr[HTMLElement] = js.undefined
  var ignoreHiddenFiles: js.UndefOr[Boolean] = js.undefined
  var init: js.UndefOr[js.ThisFunction0[/* this */ Dropzone, Unit]] = js.undefined
  var maxFiles: js.UndefOr[Double] = js.undefined
  var maxFilesize: js.UndefOr[Double] = js.undefined
  var maxThumbnailFilesize: js.UndefOr[Double] = js.undefined
  var maxfilesexceeded: js.UndefOr[js.Function1[/* file */ DropzoneFile, Unit]] = js.undefined
  var maxfilesreached: js.UndefOr[js.Function1[/* files */ js.Array[DropzoneFile], Unit]] = js.undefined
  var method: js.UndefOr[(js.Function1[/* files */ js.Array[DropzoneFile], String]) | String] = js.undefined
  var parallelChunkUploads: js.UndefOr[Boolean] = js.undefined
  var parallelUploads: js.UndefOr[Double] = js.undefined
  var paramName: js.UndefOr[String] = js.undefined
  var params: js.UndefOr[js.Object] = js.undefined
  var paste: js.UndefOr[js.Function1[/* e */ DragEvent, Unit]] = js.undefined
  var previewTemplate: js.UndefOr[String] = js.undefined
  var previewsContainer: js.UndefOr[Boolean | String | HTMLElement] = js.undefined
  var processing: js.UndefOr[js.Function1[/* file */ DropzoneFile, Unit]] = js.undefined
  var processingmultiple: js.UndefOr[js.Function1[/* files */ js.Array[DropzoneFile], Unit]] = js.undefined
  var queuecomplete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var removedfile: js.UndefOr[js.Function1[/* file */ DropzoneFile, Unit]] = js.undefined
  var renameFilename: js.UndefOr[js.Function1[/* name */ String, String]] = js.undefined
  var reset: js.UndefOr[js.Function0[Unit]] = js.undefined
  var resize: js.UndefOr[
    js.Function4[
      /* file */ DropzoneFile, 
      /* width */ js.UndefOr[Double], 
      /* height */ js.UndefOr[Double], 
      /* resizeMethod */ js.UndefOr[String], 
      DropzoneResizeInfo
    ]
  ] = js.undefined
  var resizeHeight: js.UndefOr[Double] = js.undefined
  var resizeMethod: js.UndefOr[contain | crop] = js.undefined
  var resizeMimeType: js.UndefOr[String] = js.undefined
  var resizeQuality: js.UndefOr[Double] = js.undefined
  var resizeWidth: js.UndefOr[Double] = js.undefined
  var retryChunks: js.UndefOr[Boolean] = js.undefined
  var retryChunksLimit: js.UndefOr[Double] = js.undefined
  var sending: js.UndefOr[
    js.Function3[/* file */ DropzoneFile, /* xhr */ XMLHttpRequest, /* formData */ FormData, Unit]
  ] = js.undefined
  var sendingmultiple: js.UndefOr[
    js.Function3[
      /* files */ js.Array[DropzoneFile], 
      /* xhr */ XMLHttpRequest, 
      /* formData */ FormData, 
      Unit
    ]
  ] = js.undefined
  var success: js.UndefOr[js.Function1[/* file */ DropzoneFile, Unit]] = js.undefined
  var successmultiple: js.UndefOr[
    js.Function2[/* files */ js.Array[DropzoneFile], /* responseText */ String, Unit]
  ] = js.undefined
  var thumbnail: js.UndefOr[js.Function2[/* file */ DropzoneFile, /* dataUrl */ String, Unit]] = js.undefined
  var thumbnailHeight: js.UndefOr[Double] = js.undefined
  var thumbnailMethod: js.UndefOr[contain | crop] = js.undefined
  var thumbnailWidth: js.UndefOr[Double] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var totaluploadprogress: js.UndefOr[
    js.Function3[/* totalProgress */ Double, /* totalBytes */ Double, /* totalBytesSent */ Double, Unit]
  ] = js.undefined
  var transformFile: js.UndefOr[
    js.Function2[
      /* file */ DropzoneFile, 
      /* done */ js.Function1[/* file */ String | Blob, Unit], 
      Unit
    ]
  ] = js.undefined
  var uploadMultiple: js.UndefOr[Boolean] = js.undefined
  var uploadprogress: js.UndefOr[
    js.Function3[/* file */ DropzoneFile, /* progress */ Double, /* bytesSent */ Double, Unit]
  ] = js.undefined
  var url: js.UndefOr[(js.Function1[/* files */ js.Array[DropzoneFile], String]) | String] = js.undefined
  var withCredentials: js.UndefOr[Boolean] = js.undefined
}

object DropzoneOptions {
  @scala.inline
  def apply(
    accept: (/* file */ DropzoneFile, /* done */ js.Function1[/* error */ js.UndefOr[String | js.Error], Unit]) => Callback = null,
    acceptedFiles: String = null,
    addRemoveLinks: js.UndefOr[Boolean] = js.undefined,
    addedfile: /* file */ DropzoneFile => Callback = null,
    addedfiles: /* files */ js.Array[DropzoneFile] => Callback = null,
    autoProcessQueue: js.UndefOr[Boolean] = js.undefined,
    autoQueue: js.UndefOr[Boolean] = js.undefined,
    canceled: /* file */ DropzoneFile => Callback = null,
    canceledmultiple: /* file */ js.Array[DropzoneFile] => Callback = null,
    capture: String = null,
    chunkSize: Int | Double = null,
    chunking: js.UndefOr[Boolean] = js.undefined,
    chunksUploaded: (/* file */ DropzoneFile, /* done */ js.Function1[/* error */ js.UndefOr[String | js.Error], Unit]) => Callback = null,
    clickable: Boolean | String | HTMLElement | (js.Array[String | HTMLElement]) = null,
    complete: /* file */ DropzoneFile => Callback = null,
    completemultiple: /* file */ js.Array[DropzoneFile] => Callback = null,
    createImageThumbnails: js.UndefOr[Boolean] = js.undefined,
    dictCancelUpload: String = null,
    dictCancelUploadConfirmation: String = null,
    dictDefaultMessage: String = null,
    dictFallbackMessage: String = null,
    dictFallbackText: String = null,
    dictFileSizeUnits: DropzoneDictFileSizeUnits = null,
    dictFileTooBig: String = null,
    dictInvalidFileType: String = null,
    dictMaxFilesExceeded: String = null,
    dictRemoveFile: String = null,
    dictRemoveFileConfirmation: String = null,
    dictResponseError: String = null,
    dictUploadCanceled: String = null,
    dragend: /* e */ DragEvent => Callback = null,
    dragenter: /* e */ DragEvent => Callback = null,
    dragleave: /* e */ DragEvent => Callback = null,
    dragover: /* e */ DragEvent => Callback = null,
    dragstart: /* e */ DragEvent => Callback = null,
    drop: /* e */ DragEvent => Callback = null,
    error: (/* file */ DropzoneFile, /* message */ String | js.Error, /* xhr */ XMLHttpRequest) => Callback = null,
    errormultiple: (/* files */ js.Array[DropzoneFile], /* message */ String | js.Error, /* xhr */ XMLHttpRequest) => Callback = null,
    fallback: js.UndefOr[Callback] = js.undefined,
    filesizeBase: Int | Double = null,
    forceChunking: js.UndefOr[Boolean] = js.undefined,
    forceFallback: js.UndefOr[Boolean] = js.undefined,
    headers: StringDictionary[String] = null,
    hiddenInputContainer: HTMLElement = null,
    ignoreHiddenFiles: js.UndefOr[Boolean] = js.undefined,
    init: js.ThisFunction0[/* this */ Dropzone, Unit] = null,
    maxFiles: Int | Double = null,
    maxFilesize: Int | Double = null,
    maxThumbnailFilesize: Int | Double = null,
    maxfilesexceeded: /* file */ DropzoneFile => Callback = null,
    maxfilesreached: /* files */ js.Array[DropzoneFile] => Callback = null,
    method: (js.Function1[/* files */ js.Array[DropzoneFile], String]) | String = null,
    parallelChunkUploads: js.UndefOr[Boolean] = js.undefined,
    parallelUploads: Int | Double = null,
    paramName: String = null,
    params: js.Object = null,
    paste: /* e */ DragEvent => Callback = null,
    previewTemplate: String = null,
    previewsContainer: Boolean | String | HTMLElement = null,
    processing: /* file */ DropzoneFile => Callback = null,
    processingmultiple: /* files */ js.Array[DropzoneFile] => Callback = null,
    queuecomplete: js.UndefOr[Callback] = js.undefined,
    removedfile: /* file */ DropzoneFile => Callback = null,
    renameFilename: /* name */ String => CallbackTo[String] = null,
    reset: js.UndefOr[Callback] = js.undefined,
    resize: (/* file */ DropzoneFile, /* width */ js.UndefOr[Double], /* height */ js.UndefOr[Double], /* resizeMethod */ js.UndefOr[String]) => CallbackTo[DropzoneResizeInfo] = null,
    resizeHeight: Int | Double = null,
    resizeMethod: contain | crop = null,
    resizeMimeType: String = null,
    resizeQuality: Int | Double = null,
    resizeWidth: Int | Double = null,
    retryChunks: js.UndefOr[Boolean] = js.undefined,
    retryChunksLimit: Int | Double = null,
    sending: (/* file */ DropzoneFile, /* xhr */ XMLHttpRequest, /* formData */ FormData) => Callback = null,
    sendingmultiple: (/* files */ js.Array[DropzoneFile], /* xhr */ XMLHttpRequest, /* formData */ FormData) => Callback = null,
    success: /* file */ DropzoneFile => Callback = null,
    successmultiple: (/* files */ js.Array[DropzoneFile], /* responseText */ String) => Callback = null,
    thumbnail: (/* file */ DropzoneFile, /* dataUrl */ String) => Callback = null,
    thumbnailHeight: Int | Double = null,
    thumbnailMethod: contain | crop = null,
    thumbnailWidth: Int | Double = null,
    timeout: Int | Double = null,
    totaluploadprogress: (/* totalProgress */ Double, /* totalBytes */ Double, /* totalBytesSent */ Double) => Callback = null,
    transformFile: (/* file */ DropzoneFile, /* done */ js.Function1[/* file */ String | Blob, Unit]) => Callback = null,
    uploadMultiple: js.UndefOr[Boolean] = js.undefined,
    uploadprogress: (/* file */ DropzoneFile, /* progress */ Double, /* bytesSent */ Double) => Callback = null,
    url: (js.Function1[/* files */ js.Array[DropzoneFile], String]) | String = null,
    withCredentials: js.UndefOr[Boolean] = js.undefined
  ): DropzoneOptions = {
    val __obj = js.Dynamic.literal()
    if (accept != null) __obj.updateDynamic("accept")(js.Any.fromFunction2((t0: /* file */ typingsJapgolly.dropzone.mod.DropzoneFile, t1: /* done */ js.Function1[/* error */ js.UndefOr[java.lang.String | js.Error], scala.Unit]) => accept(t0, t1).runNow()))
    if (acceptedFiles != null) __obj.updateDynamic("acceptedFiles")(acceptedFiles.asInstanceOf[js.Any])
    if (!js.isUndefined(addRemoveLinks)) __obj.updateDynamic("addRemoveLinks")(addRemoveLinks.asInstanceOf[js.Any])
    if (addedfile != null) __obj.updateDynamic("addedfile")(js.Any.fromFunction1((t0: /* file */ typingsJapgolly.dropzone.mod.DropzoneFile) => addedfile(t0).runNow()))
    if (addedfiles != null) __obj.updateDynamic("addedfiles")(js.Any.fromFunction1((t0: /* files */ js.Array[typingsJapgolly.dropzone.mod.DropzoneFile]) => addedfiles(t0).runNow()))
    if (!js.isUndefined(autoProcessQueue)) __obj.updateDynamic("autoProcessQueue")(autoProcessQueue.asInstanceOf[js.Any])
    if (!js.isUndefined(autoQueue)) __obj.updateDynamic("autoQueue")(autoQueue.asInstanceOf[js.Any])
    if (canceled != null) __obj.updateDynamic("canceled")(js.Any.fromFunction1((t0: /* file */ typingsJapgolly.dropzone.mod.DropzoneFile) => canceled(t0).runNow()))
    if (canceledmultiple != null) __obj.updateDynamic("canceledmultiple")(js.Any.fromFunction1((t0: /* file */ js.Array[typingsJapgolly.dropzone.mod.DropzoneFile]) => canceledmultiple(t0).runNow()))
    if (capture != null) __obj.updateDynamic("capture")(capture.asInstanceOf[js.Any])
    if (chunkSize != null) __obj.updateDynamic("chunkSize")(chunkSize.asInstanceOf[js.Any])
    if (!js.isUndefined(chunking)) __obj.updateDynamic("chunking")(chunking.asInstanceOf[js.Any])
    if (chunksUploaded != null) __obj.updateDynamic("chunksUploaded")(js.Any.fromFunction2((t0: /* file */ typingsJapgolly.dropzone.mod.DropzoneFile, t1: /* done */ js.Function1[/* error */ js.UndefOr[java.lang.String | js.Error], scala.Unit]) => chunksUploaded(t0, t1).runNow()))
    if (clickable != null) __obj.updateDynamic("clickable")(clickable.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* file */ typingsJapgolly.dropzone.mod.DropzoneFile) => complete(t0).runNow()))
    if (completemultiple != null) __obj.updateDynamic("completemultiple")(js.Any.fromFunction1((t0: /* file */ js.Array[typingsJapgolly.dropzone.mod.DropzoneFile]) => completemultiple(t0).runNow()))
    if (!js.isUndefined(createImageThumbnails)) __obj.updateDynamic("createImageThumbnails")(createImageThumbnails.asInstanceOf[js.Any])
    if (dictCancelUpload != null) __obj.updateDynamic("dictCancelUpload")(dictCancelUpload.asInstanceOf[js.Any])
    if (dictCancelUploadConfirmation != null) __obj.updateDynamic("dictCancelUploadConfirmation")(dictCancelUploadConfirmation.asInstanceOf[js.Any])
    if (dictDefaultMessage != null) __obj.updateDynamic("dictDefaultMessage")(dictDefaultMessage.asInstanceOf[js.Any])
    if (dictFallbackMessage != null) __obj.updateDynamic("dictFallbackMessage")(dictFallbackMessage.asInstanceOf[js.Any])
    if (dictFallbackText != null) __obj.updateDynamic("dictFallbackText")(dictFallbackText.asInstanceOf[js.Any])
    if (dictFileSizeUnits != null) __obj.updateDynamic("dictFileSizeUnits")(dictFileSizeUnits.asInstanceOf[js.Any])
    if (dictFileTooBig != null) __obj.updateDynamic("dictFileTooBig")(dictFileTooBig.asInstanceOf[js.Any])
    if (dictInvalidFileType != null) __obj.updateDynamic("dictInvalidFileType")(dictInvalidFileType.asInstanceOf[js.Any])
    if (dictMaxFilesExceeded != null) __obj.updateDynamic("dictMaxFilesExceeded")(dictMaxFilesExceeded.asInstanceOf[js.Any])
    if (dictRemoveFile != null) __obj.updateDynamic("dictRemoveFile")(dictRemoveFile.asInstanceOf[js.Any])
    if (dictRemoveFileConfirmation != null) __obj.updateDynamic("dictRemoveFileConfirmation")(dictRemoveFileConfirmation.asInstanceOf[js.Any])
    if (dictResponseError != null) __obj.updateDynamic("dictResponseError")(dictResponseError.asInstanceOf[js.Any])
    if (dictUploadCanceled != null) __obj.updateDynamic("dictUploadCanceled")(dictUploadCanceled.asInstanceOf[js.Any])
    if (dragend != null) __obj.updateDynamic("dragend")(js.Any.fromFunction1((t0: /* e */ org.scalajs.dom.raw.DragEvent) => dragend(t0).runNow()))
    if (dragenter != null) __obj.updateDynamic("dragenter")(js.Any.fromFunction1((t0: /* e */ org.scalajs.dom.raw.DragEvent) => dragenter(t0).runNow()))
    if (dragleave != null) __obj.updateDynamic("dragleave")(js.Any.fromFunction1((t0: /* e */ org.scalajs.dom.raw.DragEvent) => dragleave(t0).runNow()))
    if (dragover != null) __obj.updateDynamic("dragover")(js.Any.fromFunction1((t0: /* e */ org.scalajs.dom.raw.DragEvent) => dragover(t0).runNow()))
    if (dragstart != null) __obj.updateDynamic("dragstart")(js.Any.fromFunction1((t0: /* e */ org.scalajs.dom.raw.DragEvent) => dragstart(t0).runNow()))
    if (drop != null) __obj.updateDynamic("drop")(js.Any.fromFunction1((t0: /* e */ org.scalajs.dom.raw.DragEvent) => drop(t0).runNow()))
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction3((t0: /* file */ typingsJapgolly.dropzone.mod.DropzoneFile, t1: /* message */ java.lang.String | js.Error, t2: /* xhr */ org.scalajs.dom.raw.XMLHttpRequest) => error(t0, t1, t2).runNow()))
    if (errormultiple != null) __obj.updateDynamic("errormultiple")(js.Any.fromFunction3((t0: /* files */ js.Array[typingsJapgolly.dropzone.mod.DropzoneFile], t1: /* message */ java.lang.String | js.Error, t2: /* xhr */ org.scalajs.dom.raw.XMLHttpRequest) => errormultiple(t0, t1, t2).runNow()))
    fallback.foreach(p => __obj.updateDynamic("fallback")(p.toJsFn))
    if (filesizeBase != null) __obj.updateDynamic("filesizeBase")(filesizeBase.asInstanceOf[js.Any])
    if (!js.isUndefined(forceChunking)) __obj.updateDynamic("forceChunking")(forceChunking.asInstanceOf[js.Any])
    if (!js.isUndefined(forceFallback)) __obj.updateDynamic("forceFallback")(forceFallback.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (hiddenInputContainer != null) __obj.updateDynamic("hiddenInputContainer")(hiddenInputContainer.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreHiddenFiles)) __obj.updateDynamic("ignoreHiddenFiles")(ignoreHiddenFiles.asInstanceOf[js.Any])
    if (init != null) __obj.updateDynamic("init")(init.asInstanceOf[js.Any])
    if (maxFiles != null) __obj.updateDynamic("maxFiles")(maxFiles.asInstanceOf[js.Any])
    if (maxFilesize != null) __obj.updateDynamic("maxFilesize")(maxFilesize.asInstanceOf[js.Any])
    if (maxThumbnailFilesize != null) __obj.updateDynamic("maxThumbnailFilesize")(maxThumbnailFilesize.asInstanceOf[js.Any])
    if (maxfilesexceeded != null) __obj.updateDynamic("maxfilesexceeded")(js.Any.fromFunction1((t0: /* file */ typingsJapgolly.dropzone.mod.DropzoneFile) => maxfilesexceeded(t0).runNow()))
    if (maxfilesreached != null) __obj.updateDynamic("maxfilesreached")(js.Any.fromFunction1((t0: /* files */ js.Array[typingsJapgolly.dropzone.mod.DropzoneFile]) => maxfilesreached(t0).runNow()))
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (!js.isUndefined(parallelChunkUploads)) __obj.updateDynamic("parallelChunkUploads")(parallelChunkUploads.asInstanceOf[js.Any])
    if (parallelUploads != null) __obj.updateDynamic("parallelUploads")(parallelUploads.asInstanceOf[js.Any])
    if (paramName != null) __obj.updateDynamic("paramName")(paramName.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (paste != null) __obj.updateDynamic("paste")(js.Any.fromFunction1((t0: /* e */ org.scalajs.dom.raw.DragEvent) => paste(t0).runNow()))
    if (previewTemplate != null) __obj.updateDynamic("previewTemplate")(previewTemplate.asInstanceOf[js.Any])
    if (previewsContainer != null) __obj.updateDynamic("previewsContainer")(previewsContainer.asInstanceOf[js.Any])
    if (processing != null) __obj.updateDynamic("processing")(js.Any.fromFunction1((t0: /* file */ typingsJapgolly.dropzone.mod.DropzoneFile) => processing(t0).runNow()))
    if (processingmultiple != null) __obj.updateDynamic("processingmultiple")(js.Any.fromFunction1((t0: /* files */ js.Array[typingsJapgolly.dropzone.mod.DropzoneFile]) => processingmultiple(t0).runNow()))
    queuecomplete.foreach(p => __obj.updateDynamic("queuecomplete")(p.toJsFn))
    if (removedfile != null) __obj.updateDynamic("removedfile")(js.Any.fromFunction1((t0: /* file */ typingsJapgolly.dropzone.mod.DropzoneFile) => removedfile(t0).runNow()))
    if (renameFilename != null) __obj.updateDynamic("renameFilename")(js.Any.fromFunction1((t0: /* name */ java.lang.String) => renameFilename(t0).runNow()))
    reset.foreach(p => __obj.updateDynamic("reset")(p.toJsFn))
    if (resize != null) __obj.updateDynamic("resize")(js.Any.fromFunction4((t0: /* file */ typingsJapgolly.dropzone.mod.DropzoneFile, t1: /* width */ js.UndefOr[scala.Double], t2: /* height */ js.UndefOr[scala.Double], t3: /* resizeMethod */ js.UndefOr[java.lang.String]) => resize(t0, t1, t2, t3).runNow()))
    if (resizeHeight != null) __obj.updateDynamic("resizeHeight")(resizeHeight.asInstanceOf[js.Any])
    if (resizeMethod != null) __obj.updateDynamic("resizeMethod")(resizeMethod.asInstanceOf[js.Any])
    if (resizeMimeType != null) __obj.updateDynamic("resizeMimeType")(resizeMimeType.asInstanceOf[js.Any])
    if (resizeQuality != null) __obj.updateDynamic("resizeQuality")(resizeQuality.asInstanceOf[js.Any])
    if (resizeWidth != null) __obj.updateDynamic("resizeWidth")(resizeWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(retryChunks)) __obj.updateDynamic("retryChunks")(retryChunks.asInstanceOf[js.Any])
    if (retryChunksLimit != null) __obj.updateDynamic("retryChunksLimit")(retryChunksLimit.asInstanceOf[js.Any])
    if (sending != null) __obj.updateDynamic("sending")(js.Any.fromFunction3((t0: /* file */ typingsJapgolly.dropzone.mod.DropzoneFile, t1: /* xhr */ org.scalajs.dom.raw.XMLHttpRequest, t2: /* formData */ org.scalajs.dom.raw.FormData) => sending(t0, t1, t2).runNow()))
    if (sendingmultiple != null) __obj.updateDynamic("sendingmultiple")(js.Any.fromFunction3((t0: /* files */ js.Array[typingsJapgolly.dropzone.mod.DropzoneFile], t1: /* xhr */ org.scalajs.dom.raw.XMLHttpRequest, t2: /* formData */ org.scalajs.dom.raw.FormData) => sendingmultiple(t0, t1, t2).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* file */ typingsJapgolly.dropzone.mod.DropzoneFile) => success(t0).runNow()))
    if (successmultiple != null) __obj.updateDynamic("successmultiple")(js.Any.fromFunction2((t0: /* files */ js.Array[typingsJapgolly.dropzone.mod.DropzoneFile], t1: /* responseText */ java.lang.String) => successmultiple(t0, t1).runNow()))
    if (thumbnail != null) __obj.updateDynamic("thumbnail")(js.Any.fromFunction2((t0: /* file */ typingsJapgolly.dropzone.mod.DropzoneFile, t1: /* dataUrl */ java.lang.String) => thumbnail(t0, t1).runNow()))
    if (thumbnailHeight != null) __obj.updateDynamic("thumbnailHeight")(thumbnailHeight.asInstanceOf[js.Any])
    if (thumbnailMethod != null) __obj.updateDynamic("thumbnailMethod")(thumbnailMethod.asInstanceOf[js.Any])
    if (thumbnailWidth != null) __obj.updateDynamic("thumbnailWidth")(thumbnailWidth.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (totaluploadprogress != null) __obj.updateDynamic("totaluploadprogress")(js.Any.fromFunction3((t0: /* totalProgress */ scala.Double, t1: /* totalBytes */ scala.Double, t2: /* totalBytesSent */ scala.Double) => totaluploadprogress(t0, t1, t2).runNow()))
    if (transformFile != null) __obj.updateDynamic("transformFile")(js.Any.fromFunction2((t0: /* file */ typingsJapgolly.dropzone.mod.DropzoneFile, t1: /* done */ js.Function1[/* file */ java.lang.String | org.scalajs.dom.raw.Blob, scala.Unit]) => transformFile(t0, t1).runNow()))
    if (!js.isUndefined(uploadMultiple)) __obj.updateDynamic("uploadMultiple")(uploadMultiple.asInstanceOf[js.Any])
    if (uploadprogress != null) __obj.updateDynamic("uploadprogress")(js.Any.fromFunction3((t0: /* file */ typingsJapgolly.dropzone.mod.DropzoneFile, t1: /* progress */ scala.Double, t2: /* bytesSent */ scala.Double) => uploadprogress(t0, t1, t2).runNow()))
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropzoneOptions]
  }
}

