package typingsJapgolly.jqueryFileupload

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Element
import typingsJapgolly.jquery.JQueryEventObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Interface options for the plugin
trait JQueryFileInputOptions extends StObject {
  
  var active: js.UndefOr[js.Function] = js.undefined
  
  /**
    * The add callback is invoked as soon as files are added to the fileupload
    * widget (via file input selection, drag & drop, paste or add API call).
    * If the singleFileUploads option is enabled, this callback will be
    * called once for each file in the selection for XHR file uploads, else
    * once for each file selection.
    *
    * The upload starts when the submit method is invoked on the data parameter.
    * The data object contains a files property holding the added files
    * and allows you to override plugin options as well as define ajax settings.
    *
    * Listeners for this callback can also be bound the following way:
    * .bind('fileuploadadd', func);
    *
    * data.submit() returns a Promise object and allows to attach additional
    * handlers using jQuery's Deferred callbacks:
    * data.submit().done(func).fail(func).always(func);
    */
  var add: js.UndefOr[
    js.Function2[/* e */ JQueryEventObject, /* data */ JqueryFileUploadAddObject, Unit]
  ] = js.undefined
  
  var always: js.UndefOr[js.Function2[/* e */ JQueryEventObject, /* data */ this.type, Unit]] = js.undefined
  
  /**
    * By default, uploads are started automatically when adding files:
    */
  var autoUpload: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Interval in milliseconds to calculate progress bitrate:
    */
  var bitrateInterval: js.UndefOr[Double] = js.undefined
  
  var cache: js.UndefOr[Boolean] = js.undefined
  
  var change: js.UndefOr[
    js.Function2[/* e */ JQueryEventObject, /* data */ JQueryFileUploadChangeObject, Unit]
  ] = js.undefined
  
  var chunkalways: js.UndefOr[
    js.Function2[/* e */ JQueryEventObject, /* data */ JQueryFileUploadChunkObject, Unit]
  ] = js.undefined
  
  var chunkdone: js.UndefOr[
    js.Function2[/* e */ JQueryEventObject, /* data */ JQueryFileUploadChunkObject, Unit]
  ] = js.undefined
  
  var chunkfail: js.UndefOr[
    js.Function2[/* e */ JQueryEventObject, /* data */ JQueryFileUploadChunkObject, Unit]
  ] = js.undefined
  
  var chunksend: js.UndefOr[
    js.Function2[/* e */ JQueryEventObject, /* data */ JQueryFileUploadChunkObject, Unit]
  ] = js.undefined
  
  var contentType: js.UndefOr[String] = js.undefined
  
  /**
    * The type of data that is expected back from the server.
    */
  var dataType: js.UndefOr[String] = js.undefined
  
  var done: js.UndefOr[js.Function2[/* e */ JQueryEventObject, /* data */ JQueryFileUploadDone, Unit]] = js.undefined
  
  var dragover: js.UndefOr[js.Function1[/* e */ JQueryEventObject, Unit]] = js.undefined
  
  var drop: js.UndefOr[
    js.Function2[/* e */ JQueryEventObject, /* data */ JQueryFileUploadFilesObject, Unit]
  ] = js.undefined
  
  /**
    * The drop target element(s), by the default the complete document.
    * Set to null to disable drag & drop support:
    */
  var dropZone: js.UndefOr[Element | js.Array[Element] | JQuery | String] = js.undefined
  
  var fail: js.UndefOr[js.Function2[/* e */ JQueryEventObject, /* data */ JQueryFileUploadDone, Unit]] = js.undefined
  
  /**
    * The file input field(s), that are listened to for change events.
    * If undefined, it is set to the file input fields inside
    * of the widget element on plugin initialization.
    * Set to null to disable the change listener.
    */
  var fileInput: js.UndefOr[Element | js.Array[Element] | JQuery | String] = js.undefined
  
  var files: js.UndefOr[Any] = js.undefined
  
  /**
    * Set the following option to true to force iframe transport uploads:
    */
  var forceIframeTransport: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Additional form data to be sent along with the file uploads can be set
    * using this option, which accepts an array of objects with name and
    * value properties, a function returning such an array, a FormData
    * object (for XHR file uploads), or a simple object.
    * The form of the first fileInput is given as parameter to the function:
    */
  var formData: js.UndefOr[Any] = js.undefined
  
  /**
    * Translation function, gets the message key to be translated
    * and an object with context specific data as arguments:
    */
  var i18n: js.UndefOr[Any] = js.undefined
  
  /**
    * To limit the number of concurrent uploads,
    * set the following option to an integer greater than 0:
    */
  var limitConcurrentUploads: js.UndefOr[Double] = js.undefined
  
  /**
    * The following option limits the number of files uploaded with one
    * XHR request to keep the request size under or equal to the defined
    * limit in bytes
    */
  var limitMultiFileUploadSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Multipart file uploads add a number of bytes to each uploaded file,
    * therefore the following option adds an overhead for each file used
    * in the limitMultiFileUploadSize configuration:
    */
  var limitMultiFileUploadSizeOverhead: js.UndefOr[Double] = js.undefined
  
  /**
    * To limit the number of files uploaded with one XHR request,
    * set the following option to an integer greater than 0:
    */
  var limitMultiFileUploads: js.UndefOr[Double] = js.undefined
  
  /**
    * To upload large files in smaller chunks, set the following option
    * to a preferred maximum chunk size. If set to 0, null or undefined,
    * or the browser does not support the required Blob API, files will
    * be uploaded as a whole.
    */
  var maxChunkSize: js.UndefOr[Double] = js.undefined
  
  // Validation
  /**
    * The maximum allowed file size in bytes.
    * Type: integer
    * Default: undefined
    * Example: 10000000 // 10 MB
    * Note: This option has only an effect for browsers supporting the File API.
    * @see https://github.com/blueimp/jQuery-File-Upload/wiki/Options#maxfilesize
    */
  var maxFileSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Error and info messages:
    */
  var messages: js.UndefOr[Any] = js.undefined
  
  /**
    * By default, XHR file uploads are sent as multipart/form-data.
    * The iframe transport is always using multipart/form-data.
    * Set to false to enable non-multipart XHR uploads:
    */
  var multipart: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The parameter name for the file form data (the request argument name).
    * If undefined or empty, the name property of the file input field is
    * used, or "files[]" if the file input name property is also empty,
    * can be a string or an array of strings:
    */
  var paramName: js.UndefOr[Any] = js.undefined
  
  var paste: js.UndefOr[
    js.Function2[/* e */ JQueryEventObject, /* data */ JQueryFileUploadFilesObject, Unit]
  ] = js.undefined
  
  /**
    * The paste target element(s), by the default the complete document.
    * Set to null to disable paste support:
    */
  var pasteZone: js.UndefOr[Element | js.Array[Element] | JQuery | String] = js.undefined
  
  /**
    * Set the following option to the location of a postMessage window,
    * to enable postMessage transport uploads:
    */
  var postMessage: js.UndefOr[String] = js.undefined
  
  // The plugin options are used as settings object for the ajax calls.
  // The following are jQuery ajax settings required for the file uploads:
  var processData: js.UndefOr[Boolean] = js.undefined
  
  var progress: js.UndefOr[
    js.Function2[/* e */ JQueryEventObject, /* data */ JQueryFileUploadProgressObject, Unit]
  ] = js.undefined
  
  /**
    * Interval in milliseconds to calculate and trigger progress events:
    */
  var progressInterval: js.UndefOr[Double] = js.undefined
  
  var progressall: js.UndefOr[
    js.Function2[/* e */ JQueryEventObject, /* data */ JQueryFileUploadProgressAllObject, Unit]
  ] = js.undefined
  
  /**
    * By default, failed (abort or error) file uploads are removed from the
    * global progress calculation. Set the following option to false to
    * prevent recalculating the global progress data:
    */
  var recalculateProgress: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Set the following option to the location of a redirect url on the
    * origin server, for cross-domain iframe transport uploads:
    */
  var redirect: js.UndefOr[String] = js.undefined
  
  /**
    * The parameter name for the redirect url, sent as part of the form
    * data and set to 'redirect' if this option is empty:
    */
  var redirectParamName: js.UndefOr[String] = js.undefined
  
  /**
    * By default, the file input field is replaced with a clone after
    * each input field change event. This is required for iframe transport
    * queues and allows change events to be fired for the same file
    * selection, but can be disabled by setting the following option to false:
    */
  var replaceFileInput: js.UndefOr[Boolean] = js.undefined
  
  var send: js.UndefOr[
    js.Function2[/* e */ JQueryEventObject, /* data */ JQueryFileUploadProgressObject, Unit]
  ] = js.undefined
  
  /**
    * Set the following option to true to issue all file upload requests
    * in a sequential order:
    */
  var sequentialUploads: js.UndefOr[Boolean] = js.undefined
  
  /**
    * By default, each file of a selection is uploaded using an individual
    * request for XHR type uploads. Set to false to upload file
    * selections in one request each:
    */
  var singleFileUploads: js.UndefOr[Boolean] = js.undefined
  
  var start: js.UndefOr[js.Function1[/* e */ JQueryEventObject, Unit]] = js.undefined
  
  var stop: js.UndefOr[js.Function1[/* e */ JQueryEventObject, Unit]] = js.undefined
  
  // Other callbacks:
  var submit: js.UndefOr[js.Function] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
  
  // The HTTP request method must be "POST" or "PUT"
  var `type`: js.UndefOr[String] = js.undefined
  
  /**
    * When a non-multipart upload or a chunked multipart upload has been
    * aborted, this option can be used to resume the upload by setting
    * it to the size of the already uploaded bytes. This option is most
    * useful when modifying the options object inside of the "add" or
    * "send" callbacks, as the options are cloned for each file upload.
    */
  var uploadedBytes: js.UndefOr[Double] = js.undefined
  
  // Others
  var url: js.UndefOr[String] = js.undefined
  
  // Cross-site XMLHttpRequest file uploads
  var xhrFields: js.UndefOr[Any] = js.undefined
}
object JQueryFileInputOptions {
  
  inline def apply(): JQueryFileInputOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JQueryFileInputOptions]
  }
  
  extension [Self <: JQueryFileInputOptions](x: Self) {
    
    inline def setActive(value: js.Function): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setAdd(value: (/* e */ JQueryEventObject, /* data */ JqueryFileUploadAddObject) => Callback): Self = StObject.set(x, "add", js.Any.fromFunction2((t0: /* e */ JQueryEventObject, t1: /* data */ JqueryFileUploadAddObject) => (value(t0, t1)).runNow()))
    
    inline def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
    
    inline def setAlways(value: (/* e */ JQueryEventObject, JQueryFileInputOptions) => Callback): Self = StObject.set(x, "always", js.Any.fromFunction2((t0: /* e */ JQueryEventObject, t1: JQueryFileInputOptions) => (value(t0, t1)).runNow()))
    
    inline def setAlwaysUndefined: Self = StObject.set(x, "always", js.undefined)
    
    inline def setAutoUpload(value: Boolean): Self = StObject.set(x, "autoUpload", value.asInstanceOf[js.Any])
    
    inline def setAutoUploadUndefined: Self = StObject.set(x, "autoUpload", js.undefined)
    
    inline def setBitrateInterval(value: Double): Self = StObject.set(x, "bitrateInterval", value.asInstanceOf[js.Any])
    
    inline def setBitrateIntervalUndefined: Self = StObject.set(x, "bitrateInterval", js.undefined)
    
    inline def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
    
    inline def setChange(value: (/* e */ JQueryEventObject, /* data */ JQueryFileUploadChangeObject) => Callback): Self = StObject.set(x, "change", js.Any.fromFunction2((t0: /* e */ JQueryEventObject, t1: /* data */ JQueryFileUploadChangeObject) => (value(t0, t1)).runNow()))
    
    inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    inline def setChunkalways(value: (/* e */ JQueryEventObject, /* data */ JQueryFileUploadChunkObject) => Callback): Self = StObject.set(x, "chunkalways", js.Any.fromFunction2((t0: /* e */ JQueryEventObject, t1: /* data */ JQueryFileUploadChunkObject) => (value(t0, t1)).runNow()))
    
    inline def setChunkalwaysUndefined: Self = StObject.set(x, "chunkalways", js.undefined)
    
    inline def setChunkdone(value: (/* e */ JQueryEventObject, /* data */ JQueryFileUploadChunkObject) => Callback): Self = StObject.set(x, "chunkdone", js.Any.fromFunction2((t0: /* e */ JQueryEventObject, t1: /* data */ JQueryFileUploadChunkObject) => (value(t0, t1)).runNow()))
    
    inline def setChunkdoneUndefined: Self = StObject.set(x, "chunkdone", js.undefined)
    
    inline def setChunkfail(value: (/* e */ JQueryEventObject, /* data */ JQueryFileUploadChunkObject) => Callback): Self = StObject.set(x, "chunkfail", js.Any.fromFunction2((t0: /* e */ JQueryEventObject, t1: /* data */ JQueryFileUploadChunkObject) => (value(t0, t1)).runNow()))
    
    inline def setChunkfailUndefined: Self = StObject.set(x, "chunkfail", js.undefined)
    
    inline def setChunksend(value: (/* e */ JQueryEventObject, /* data */ JQueryFileUploadChunkObject) => Callback): Self = StObject.set(x, "chunksend", js.Any.fromFunction2((t0: /* e */ JQueryEventObject, t1: /* data */ JQueryFileUploadChunkObject) => (value(t0, t1)).runNow()))
    
    inline def setChunksendUndefined: Self = StObject.set(x, "chunksend", js.undefined)
    
    inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setDataType(value: String): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    inline def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
    
    inline def setDone(value: (/* e */ JQueryEventObject, /* data */ JQueryFileUploadDone) => Callback): Self = StObject.set(x, "done", js.Any.fromFunction2((t0: /* e */ JQueryEventObject, t1: /* data */ JQueryFileUploadDone) => (value(t0, t1)).runNow()))
    
    inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
    
    inline def setDragover(value: /* e */ JQueryEventObject => Callback): Self = StObject.set(x, "dragover", js.Any.fromFunction1((t0: /* e */ JQueryEventObject) => value(t0).runNow()))
    
    inline def setDragoverUndefined: Self = StObject.set(x, "dragover", js.undefined)
    
    inline def setDrop(value: (/* e */ JQueryEventObject, /* data */ JQueryFileUploadFilesObject) => Callback): Self = StObject.set(x, "drop", js.Any.fromFunction2((t0: /* e */ JQueryEventObject, t1: /* data */ JQueryFileUploadFilesObject) => (value(t0, t1)).runNow()))
    
    inline def setDropUndefined: Self = StObject.set(x, "drop", js.undefined)
    
    inline def setDropZone(value: Element | js.Array[Element] | JQuery | String): Self = StObject.set(x, "dropZone", value.asInstanceOf[js.Any])
    
    inline def setDropZoneUndefined: Self = StObject.set(x, "dropZone", js.undefined)
    
    inline def setDropZoneVarargs(value: Element*): Self = StObject.set(x, "dropZone", js.Array(value*))
    
    inline def setFail(value: (/* e */ JQueryEventObject, /* data */ JQueryFileUploadDone) => Callback): Self = StObject.set(x, "fail", js.Any.fromFunction2((t0: /* e */ JQueryEventObject, t1: /* data */ JQueryFileUploadDone) => (value(t0, t1)).runNow()))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setFileInput(value: Element | js.Array[Element] | JQuery | String): Self = StObject.set(x, "fileInput", value.asInstanceOf[js.Any])
    
    inline def setFileInputUndefined: Self = StObject.set(x, "fileInput", js.undefined)
    
    inline def setFileInputVarargs(value: Element*): Self = StObject.set(x, "fileInput", js.Array(value*))
    
    inline def setFiles(value: Any): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
    
    inline def setForceIframeTransport(value: Boolean): Self = StObject.set(x, "forceIframeTransport", value.asInstanceOf[js.Any])
    
    inline def setForceIframeTransportUndefined: Self = StObject.set(x, "forceIframeTransport", js.undefined)
    
    inline def setFormData(value: Any): Self = StObject.set(x, "formData", value.asInstanceOf[js.Any])
    
    inline def setFormDataUndefined: Self = StObject.set(x, "formData", js.undefined)
    
    inline def setI18n(value: Any): Self = StObject.set(x, "i18n", value.asInstanceOf[js.Any])
    
    inline def setI18nUndefined: Self = StObject.set(x, "i18n", js.undefined)
    
    inline def setLimitConcurrentUploads(value: Double): Self = StObject.set(x, "limitConcurrentUploads", value.asInstanceOf[js.Any])
    
    inline def setLimitConcurrentUploadsUndefined: Self = StObject.set(x, "limitConcurrentUploads", js.undefined)
    
    inline def setLimitMultiFileUploadSize(value: Double): Self = StObject.set(x, "limitMultiFileUploadSize", value.asInstanceOf[js.Any])
    
    inline def setLimitMultiFileUploadSizeOverhead(value: Double): Self = StObject.set(x, "limitMultiFileUploadSizeOverhead", value.asInstanceOf[js.Any])
    
    inline def setLimitMultiFileUploadSizeOverheadUndefined: Self = StObject.set(x, "limitMultiFileUploadSizeOverhead", js.undefined)
    
    inline def setLimitMultiFileUploadSizeUndefined: Self = StObject.set(x, "limitMultiFileUploadSize", js.undefined)
    
    inline def setLimitMultiFileUploads(value: Double): Self = StObject.set(x, "limitMultiFileUploads", value.asInstanceOf[js.Any])
    
    inline def setLimitMultiFileUploadsUndefined: Self = StObject.set(x, "limitMultiFileUploads", js.undefined)
    
    inline def setMaxChunkSize(value: Double): Self = StObject.set(x, "maxChunkSize", value.asInstanceOf[js.Any])
    
    inline def setMaxChunkSizeUndefined: Self = StObject.set(x, "maxChunkSize", js.undefined)
    
    inline def setMaxFileSize(value: Double): Self = StObject.set(x, "maxFileSize", value.asInstanceOf[js.Any])
    
    inline def setMaxFileSizeUndefined: Self = StObject.set(x, "maxFileSize", js.undefined)
    
    inline def setMessages(value: Any): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    inline def setMultipart(value: Boolean): Self = StObject.set(x, "multipart", value.asInstanceOf[js.Any])
    
    inline def setMultipartUndefined: Self = StObject.set(x, "multipart", js.undefined)
    
    inline def setParamName(value: Any): Self = StObject.set(x, "paramName", value.asInstanceOf[js.Any])
    
    inline def setParamNameUndefined: Self = StObject.set(x, "paramName", js.undefined)
    
    inline def setPaste(value: (/* e */ JQueryEventObject, /* data */ JQueryFileUploadFilesObject) => Callback): Self = StObject.set(x, "paste", js.Any.fromFunction2((t0: /* e */ JQueryEventObject, t1: /* data */ JQueryFileUploadFilesObject) => (value(t0, t1)).runNow()))
    
    inline def setPasteUndefined: Self = StObject.set(x, "paste", js.undefined)
    
    inline def setPasteZone(value: Element | js.Array[Element] | JQuery | String): Self = StObject.set(x, "pasteZone", value.asInstanceOf[js.Any])
    
    inline def setPasteZoneUndefined: Self = StObject.set(x, "pasteZone", js.undefined)
    
    inline def setPasteZoneVarargs(value: Element*): Self = StObject.set(x, "pasteZone", js.Array(value*))
    
    inline def setPostMessage(value: String): Self = StObject.set(x, "postMessage", value.asInstanceOf[js.Any])
    
    inline def setPostMessageUndefined: Self = StObject.set(x, "postMessage", js.undefined)
    
    inline def setProcessData(value: Boolean): Self = StObject.set(x, "processData", value.asInstanceOf[js.Any])
    
    inline def setProcessDataUndefined: Self = StObject.set(x, "processData", js.undefined)
    
    inline def setProgress(value: (/* e */ JQueryEventObject, /* data */ JQueryFileUploadProgressObject) => Callback): Self = StObject.set(x, "progress", js.Any.fromFunction2((t0: /* e */ JQueryEventObject, t1: /* data */ JQueryFileUploadProgressObject) => (value(t0, t1)).runNow()))
    
    inline def setProgressInterval(value: Double): Self = StObject.set(x, "progressInterval", value.asInstanceOf[js.Any])
    
    inline def setProgressIntervalUndefined: Self = StObject.set(x, "progressInterval", js.undefined)
    
    inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
    
    inline def setProgressall(value: (/* e */ JQueryEventObject, /* data */ JQueryFileUploadProgressAllObject) => Callback): Self = StObject.set(x, "progressall", js.Any.fromFunction2((t0: /* e */ JQueryEventObject, t1: /* data */ JQueryFileUploadProgressAllObject) => (value(t0, t1)).runNow()))
    
    inline def setProgressallUndefined: Self = StObject.set(x, "progressall", js.undefined)
    
    inline def setRecalculateProgress(value: Boolean): Self = StObject.set(x, "recalculateProgress", value.asInstanceOf[js.Any])
    
    inline def setRecalculateProgressUndefined: Self = StObject.set(x, "recalculateProgress", js.undefined)
    
    inline def setRedirect(value: String): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
    
    inline def setRedirectParamName(value: String): Self = StObject.set(x, "redirectParamName", value.asInstanceOf[js.Any])
    
    inline def setRedirectParamNameUndefined: Self = StObject.set(x, "redirectParamName", js.undefined)
    
    inline def setRedirectUndefined: Self = StObject.set(x, "redirect", js.undefined)
    
    inline def setReplaceFileInput(value: Boolean): Self = StObject.set(x, "replaceFileInput", value.asInstanceOf[js.Any])
    
    inline def setReplaceFileInputUndefined: Self = StObject.set(x, "replaceFileInput", js.undefined)
    
    inline def setSend(value: (/* e */ JQueryEventObject, /* data */ JQueryFileUploadProgressObject) => Callback): Self = StObject.set(x, "send", js.Any.fromFunction2((t0: /* e */ JQueryEventObject, t1: /* data */ JQueryFileUploadProgressObject) => (value(t0, t1)).runNow()))
    
    inline def setSendUndefined: Self = StObject.set(x, "send", js.undefined)
    
    inline def setSequentialUploads(value: Boolean): Self = StObject.set(x, "sequentialUploads", value.asInstanceOf[js.Any])
    
    inline def setSequentialUploadsUndefined: Self = StObject.set(x, "sequentialUploads", js.undefined)
    
    inline def setSingleFileUploads(value: Boolean): Self = StObject.set(x, "singleFileUploads", value.asInstanceOf[js.Any])
    
    inline def setSingleFileUploadsUndefined: Self = StObject.set(x, "singleFileUploads", js.undefined)
    
    inline def setStart(value: /* e */ JQueryEventObject => Callback): Self = StObject.set(x, "start", js.Any.fromFunction1((t0: /* e */ JQueryEventObject) => value(t0).runNow()))
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setStop(value: /* e */ JQueryEventObject => Callback): Self = StObject.set(x, "stop", js.Any.fromFunction1((t0: /* e */ JQueryEventObject) => value(t0).runNow()))
    
    inline def setStopUndefined: Self = StObject.set(x, "stop", js.undefined)
    
    inline def setSubmit(value: js.Function): Self = StObject.set(x, "submit", value.asInstanceOf[js.Any])
    
    inline def setSubmitUndefined: Self = StObject.set(x, "submit", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUploadedBytes(value: Double): Self = StObject.set(x, "uploadedBytes", value.asInstanceOf[js.Any])
    
    inline def setUploadedBytesUndefined: Self = StObject.set(x, "uploadedBytes", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setXhrFields(value: Any): Self = StObject.set(x, "xhrFields", value.asInstanceOf[js.Any])
    
    inline def setXhrFieldsUndefined: Self = StObject.set(x, "xhrFields", js.undefined)
  }
}
