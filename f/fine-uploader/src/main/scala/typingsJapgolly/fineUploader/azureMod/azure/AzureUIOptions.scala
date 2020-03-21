package typingsJapgolly.fineUploader.azureMod.azure

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
- typingsJapgolly.fineUploader.azureMod.azure.AzureCoreOptions because var conflicts: autoUpload, blobs, button, callbacks, camera, chunking, cors, debug, deleteFile, disableCancelForFormUploads, extraButtons, form, formatFileName, maxConnections, messages, multiple, paste, request, resume, scaling, session, text, validation, warnBeforeUnload, workarounds. Inlined blobProperties, signature, uploadSuccess */ trait AzureUIOptions extends UIOptions {
  /**
    * blobProperties
    */
  var blobProperties: js.UndefOr[AzureBlobPropertyOptions] = js.undefined
  /**
    * chunking options
    */
  @JSName("chunking")
  var chunking_AzureUIOptions: js.UndefOr[AzureChunkingOptions] = js.undefined
  /**
    * cors options
    */
  @JSName("cors")
  var cors_AzureUIOptions: js.UndefOr[AzureCorsOptions] = js.undefined
  /**
    * failedUploadText options
    */
  @JSName("failedUploadTextDisplay")
  var failedUploadTextDisplay_AzureUIOptions: js.UndefOr[AzureFailedUploadTextDisplayOptions] = js.undefined
  /**
    * RequestOptions
    */
  @JSName("request")
  var request_AzureUIOptions: js.UndefOr[AzureRequestOptions] = js.undefined
  /**
    * AzureSignatureOptions
    */
  var signature: js.UndefOr[AzureSignatureOptions] = js.undefined
  /**
    * AzureUploadSuccessOptions
    */
  var uploadSuccess: js.UndefOr[AzureUploadSuccessOptions] = js.undefined
}

object AzureUIOptions {
  @scala.inline
  def apply(
    autoUpload: js.UndefOr[Boolean] = js.undefined,
    blobProperties: AzureBlobPropertyOptions = null,
    blobs: BlobsOptions = null,
    button: HTMLElement = null,
    callbacks: CoreEvents = null,
    camera: CameraOptions = null,
    chunking: AzureChunkingOptions = null,
    cors: AzureCorsOptions = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    deleteFile: UIDeleteFileOptions = null,
    disableCancelForFormUploads: js.UndefOr[Boolean] = js.undefined,
    display: UIDisplayOptions = null,
    dragAndDrop: UIDragAndDropOptions = null,
    element: HTMLElement = null,
    extraButtons: js.Array[ExtraButtonsOptions] = null,
    failedUploadTextDisplay: AzureFailedUploadTextDisplayOptions = null,
    form: FormOptions = null,
    formatFileName: /* fileOrBlobName */ String => CallbackTo[String] = null,
    listElement: HTMLElement = null,
    maxConnections: Int | Double = null,
    messages: UIMessages = null,
    multiple: js.UndefOr[Boolean] = js.undefined,
    paste: UIPasteOptions = null,
    request: AzureRequestOptions = null,
    resume: ResumeOptions = null,
    retry: UIRetryOptions = null,
    scaling: UIScalingOptions = null,
    session: SessionOptions = null,
    showConfirm: /* message */ String => CallbackTo[PromiseOptions | Unit] = null,
    showMessage: /* message */ String => CallbackTo[PromiseOptions | Unit] = null,
    showPrompt: (/* message */ String, /* defaultValue */ String) => CallbackTo[PromiseOptions | Unit] = null,
    signature: AzureSignatureOptions = null,
    template: String | HTMLElement = null,
    text: UITextOptions = null,
    thumbnails: UIThumbnailsOptions = null,
    uploadSuccess: AzureUploadSuccessOptions = null,
    validation: ValidationOptions = null,
    warnBeforeUnload: js.UndefOr[Boolean] = js.undefined,
    workarounds: WorkArounds = null
  ): AzureUIOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoUpload)) __obj.updateDynamic("autoUpload")(autoUpload.asInstanceOf[js.Any])
    if (blobProperties != null) __obj.updateDynamic("blobProperties")(blobProperties.asInstanceOf[js.Any])
    if (blobs != null) __obj.updateDynamic("blobs")(blobs.asInstanceOf[js.Any])
    if (button != null) __obj.updateDynamic("button")(button.asInstanceOf[js.Any])
    if (callbacks != null) __obj.updateDynamic("callbacks")(callbacks.asInstanceOf[js.Any])
    if (camera != null) __obj.updateDynamic("camera")(camera.asInstanceOf[js.Any])
    if (chunking != null) __obj.updateDynamic("chunking")(chunking.asInstanceOf[js.Any])
    if (cors != null) __obj.updateDynamic("cors")(cors.asInstanceOf[js.Any])
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
    if (listElement != null) __obj.updateDynamic("listElement")(listElement.asInstanceOf[js.Any])
    if (maxConnections != null) __obj.updateDynamic("maxConnections")(maxConnections.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[AzureUIOptions]
  }
}

