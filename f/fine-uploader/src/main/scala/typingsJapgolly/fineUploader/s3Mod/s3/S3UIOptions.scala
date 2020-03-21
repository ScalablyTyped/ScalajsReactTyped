package typingsJapgolly.fineUploader.s3Mod.s3

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.fineUploader.coreMod.BlobsOptions
import typingsJapgolly.fineUploader.coreMod.CameraOptions
import typingsJapgolly.fineUploader.coreMod.CoreEvents
import typingsJapgolly.fineUploader.coreMod.ExtraButtonsOptions
import typingsJapgolly.fineUploader.coreMod.FormOptions
import typingsJapgolly.fineUploader.coreMod.PromiseOptions
import typingsJapgolly.fineUploader.coreMod.ResumeOptions
import typingsJapgolly.fineUploader.coreMod.SessionOptions
import typingsJapgolly.fineUploader.coreMod.ValidationOptions
import typingsJapgolly.fineUploader.coreMod.WorkArounds
import typingsJapgolly.fineUploader.mod.UIDeleteFileOptions
import typingsJapgolly.fineUploader.mod.UIDisplayOptions
import typingsJapgolly.fineUploader.mod.UIDragAndDropOptions
import typingsJapgolly.fineUploader.mod.UIMessages
import typingsJapgolly.fineUploader.mod.UIOptions
import typingsJapgolly.fineUploader.mod.UIPasteOptions
import typingsJapgolly.fineUploader.mod.UIRetryOptions
import typingsJapgolly.fineUploader.mod.UIScalingOptions
import typingsJapgolly.fineUploader.mod.UITextOptions
import typingsJapgolly.fineUploader.mod.UIThumbnailsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.fineUploader.coreMod.CoreOptions because Already inherited
- typingsJapgolly.fineUploader.s3Mod.s3.S3CoreOptions because var conflicts: autoUpload, blobs, button, callbacks, camera, chunking, cors, debug, deleteFile, disableCancelForFormUploads, extraButtons, form, formatFileName, maxConnections, messages, multiple, paste, request, resume, scaling, session, text, validation, warnBeforeUnload, workarounds. Inlined credentials, iframeSupport, objectProperties, signature, uploadSuccess */ trait S3UIOptions extends UIOptions {
  /**
    * chunking options
    */
  @JSName("chunking")
  var chunking_S3UIOptions: js.UndefOr[S3ChunkingOptions] = js.undefined
  /**
    * cors options
    */
  @JSName("cors")
  var cors_S3UIOptions: js.UndefOr[S3CorsOptions] = js.undefined
  /**
    * credentials
    */
  var credentials: js.UndefOr[S3CredentialsOptions] = js.undefined
  /**
    * failedUploadText options
    */
  @JSName("failedUploadTextDisplay")
  var failedUploadTextDisplay_S3UIOptions: js.UndefOr[S3FailedUploadTextDisplayOptions] = js.undefined
  /**
    * iframeSupport options
    */
  var iframeSupport: js.UndefOr[S3iFrameSupportOptions] = js.undefined
  /**
    * objectProperties
    */
  var objectProperties: js.UndefOr[S3ObjectPropertyOptions] = js.undefined
  /**
    * request options
    */
  @JSName("request")
  var request_S3UIOptions: js.UndefOr[S3RequestOptions] = js.undefined
  /**
    * signature options
    */
  var signature: js.UndefOr[S3SignatureOptions] = js.undefined
  /**
    * upload success options
    */
  var uploadSuccess: js.UndefOr[S3UploadSuccessOptions] = js.undefined
}

object S3UIOptions {
  @scala.inline
  def apply(
    autoUpload: js.UndefOr[Boolean] = js.undefined,
    blobs: BlobsOptions = null,
    button: HTMLElement = null,
    callbacks: CoreEvents = null,
    camera: CameraOptions = null,
    chunking: S3ChunkingOptions = null,
    cors: S3CorsOptions = null,
    credentials: S3CredentialsOptions = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    deleteFile: UIDeleteFileOptions = null,
    disableCancelForFormUploads: js.UndefOr[Boolean] = js.undefined,
    display: UIDisplayOptions = null,
    dragAndDrop: UIDragAndDropOptions = null,
    element: HTMLElement = null,
    extraButtons: js.Array[ExtraButtonsOptions] = null,
    failedUploadTextDisplay: S3FailedUploadTextDisplayOptions = null,
    form: FormOptions = null,
    formatFileName: /* fileOrBlobName */ String => CallbackTo[String] = null,
    iframeSupport: S3iFrameSupportOptions = null,
    listElement: HTMLElement = null,
    maxConnections: Int | Double = null,
    messages: UIMessages = null,
    multiple: js.UndefOr[Boolean] = js.undefined,
    objectProperties: S3ObjectPropertyOptions = null,
    paste: UIPasteOptions = null,
    request: S3RequestOptions = null,
    resume: ResumeOptions = null,
    retry: UIRetryOptions = null,
    scaling: UIScalingOptions = null,
    session: SessionOptions = null,
    showConfirm: /* message */ String => CallbackTo[PromiseOptions | Unit] = null,
    showMessage: /* message */ String => CallbackTo[PromiseOptions | Unit] = null,
    showPrompt: (/* message */ String, /* defaultValue */ String) => CallbackTo[PromiseOptions | Unit] = null,
    signature: S3SignatureOptions = null,
    template: String | HTMLElement = null,
    text: UITextOptions = null,
    thumbnails: UIThumbnailsOptions = null,
    uploadSuccess: S3UploadSuccessOptions = null,
    validation: ValidationOptions = null,
    warnBeforeUnload: js.UndefOr[Boolean] = js.undefined,
    workarounds: WorkArounds = null
  ): S3UIOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoUpload)) __obj.updateDynamic("autoUpload")(autoUpload.asInstanceOf[js.Any])
    if (blobs != null) __obj.updateDynamic("blobs")(blobs.asInstanceOf[js.Any])
    if (button != null) __obj.updateDynamic("button")(button.asInstanceOf[js.Any])
    if (callbacks != null) __obj.updateDynamic("callbacks")(callbacks.asInstanceOf[js.Any])
    if (camera != null) __obj.updateDynamic("camera")(camera.asInstanceOf[js.Any])
    if (chunking != null) __obj.updateDynamic("chunking")(chunking.asInstanceOf[js.Any])
    if (cors != null) __obj.updateDynamic("cors")(cors.asInstanceOf[js.Any])
    if (credentials != null) __obj.updateDynamic("credentials")(credentials.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (deleteFile != null) __obj.updateDynamic("deleteFile")(deleteFile.asInstanceOf[js.Any])
    if (!js.isUndefined(disableCancelForFormUploads)) __obj.updateDynamic("disableCancelForFormUploads")(disableCancelForFormUploads.asInstanceOf[js.Any])
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (dragAndDrop != null) __obj.updateDynamic("dragAndDrop")(dragAndDrop.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (extraButtons != null) __obj.updateDynamic("extraButtons")(extraButtons.asInstanceOf[js.Any])
    if (failedUploadTextDisplay != null) __obj.updateDynamic("failedUploadTextDisplay")(failedUploadTextDisplay.asInstanceOf[js.Any])
    if (form != null) __obj.updateDynamic("form")(form.asInstanceOf[js.Any])
    if (formatFileName != null) __obj.updateDynamic("formatFileName")(js.Any.fromFunction1((t0: /* fileOrBlobName */ java.lang.String) => formatFileName(t0).runNow()))
    if (iframeSupport != null) __obj.updateDynamic("iframeSupport")(iframeSupport.asInstanceOf[js.Any])
    if (listElement != null) __obj.updateDynamic("listElement")(listElement.asInstanceOf[js.Any])
    if (maxConnections != null) __obj.updateDynamic("maxConnections")(maxConnections.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.asInstanceOf[js.Any])
    if (objectProperties != null) __obj.updateDynamic("objectProperties")(objectProperties.asInstanceOf[js.Any])
    if (paste != null) __obj.updateDynamic("paste")(paste.asInstanceOf[js.Any])
    if (request != null) __obj.updateDynamic("request")(request.asInstanceOf[js.Any])
    if (resume != null) __obj.updateDynamic("resume")(resume.asInstanceOf[js.Any])
    if (retry != null) __obj.updateDynamic("retry")(retry.asInstanceOf[js.Any])
    if (scaling != null) __obj.updateDynamic("scaling")(scaling.asInstanceOf[js.Any])
    if (session != null) __obj.updateDynamic("session")(session.asInstanceOf[js.Any])
    if (showConfirm != null) __obj.updateDynamic("showConfirm")(js.Any.fromFunction1((t0: /* message */ java.lang.String) => showConfirm(t0).runNow()))
    if (showMessage != null) __obj.updateDynamic("showMessage")(js.Any.fromFunction1((t0: /* message */ java.lang.String) => showMessage(t0).runNow()))
    if (showPrompt != null) __obj.updateDynamic("showPrompt")(js.Any.fromFunction2((t0: /* message */ java.lang.String, t1: /* defaultValue */ java.lang.String) => showPrompt(t0, t1).runNow()))
    if (signature != null) __obj.updateDynamic("signature")(signature.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (thumbnails != null) __obj.updateDynamic("thumbnails")(thumbnails.asInstanceOf[js.Any])
    if (uploadSuccess != null) __obj.updateDynamic("uploadSuccess")(uploadSuccess.asInstanceOf[js.Any])
    if (validation != null) __obj.updateDynamic("validation")(validation.asInstanceOf[js.Any])
    if (!js.isUndefined(warnBeforeUnload)) __obj.updateDynamic("warnBeforeUnload")(warnBeforeUnload.asInstanceOf[js.Any])
    if (workarounds != null) __obj.updateDynamic("workarounds")(workarounds.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3UIOptions]
  }
}

