package typingsJapgolly.fineUploader.azureMod.azure

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.fineUploader.coreMod.BlobsOptions
import typingsJapgolly.fineUploader.coreMod.CameraOptions
import typingsJapgolly.fineUploader.coreMod.CoreEvents
import typingsJapgolly.fineUploader.coreMod.CoreOptions
import typingsJapgolly.fineUploader.coreMod.DeleteFileOptions
import typingsJapgolly.fineUploader.coreMod.ExtraButtonsOptions
import typingsJapgolly.fineUploader.coreMod.FormOptions
import typingsJapgolly.fineUploader.coreMod.Messages
import typingsJapgolly.fineUploader.coreMod.PasteOptions
import typingsJapgolly.fineUploader.coreMod.ResumeOptions
import typingsJapgolly.fineUploader.coreMod.ScalingOptions
import typingsJapgolly.fineUploader.coreMod.SessionOptions
import typingsJapgolly.fineUploader.coreMod.TextOptions
import typingsJapgolly.fineUploader.coreMod.ValidationOptions
import typingsJapgolly.fineUploader.coreMod.WorkArounds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AzureCoreOptions extends CoreOptions {
  /**
    * blobProperties
    */
  var blobProperties: js.UndefOr[AzureBlobPropertyOptions] = js.undefined
  /**
    * chunking options
    */
  @JSName("chunking")
  var chunking_AzureCoreOptions: js.UndefOr[AzureChunkingOptions] = js.undefined
  /**
    * cors options
    */
  @JSName("cors")
  var cors_AzureCoreOptions: js.UndefOr[AzureCorsOptions] = js.undefined
  /**
    * RequestOptions
    */
  @JSName("request")
  var request_AzureCoreOptions: js.UndefOr[AzureRequestOptions] = js.undefined
  /**
    * AzureSignatureOptions
    */
  var signature: js.UndefOr[AzureSignatureOptions] = js.undefined
  /**
    * AzureUploadSuccessOptions
    */
  var uploadSuccess: js.UndefOr[AzureUploadSuccessOptions] = js.undefined
}

object AzureCoreOptions {
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
    deleteFile: DeleteFileOptions = null,
    disableCancelForFormUploads: js.UndefOr[Boolean] = js.undefined,
    extraButtons: js.Array[ExtraButtonsOptions] = null,
    form: FormOptions = null,
    formatFileName: /* fileOrBlobName */ String => CallbackTo[String] = null,
    maxConnections: Int | Double = null,
    messages: Messages = null,
    multiple: js.UndefOr[Boolean] = js.undefined,
    paste: PasteOptions = null,
    request: AzureRequestOptions = null,
    resume: ResumeOptions = null,
    scaling: ScalingOptions = null,
    session: SessionOptions = null,
    signature: AzureSignatureOptions = null,
    text: TextOptions = null,
    uploadSuccess: AzureUploadSuccessOptions = null,
    validation: ValidationOptions = null,
    warnBeforeUnload: js.UndefOr[Boolean] = js.undefined,
    workarounds: WorkArounds = null
  ): AzureCoreOptions = {
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
    if (extraButtons != null) __obj.updateDynamic("extraButtons")(extraButtons.asInstanceOf[js.Any])
    if (form != null) __obj.updateDynamic("form")(form.asInstanceOf[js.Any])
    if (formatFileName != null) __obj.updateDynamic("formatFileName")(js.Any.fromFunction1((t0: /* fileOrBlobName */ java.lang.String) => formatFileName(t0).runNow()))
    if (maxConnections != null) __obj.updateDynamic("maxConnections")(maxConnections.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.asInstanceOf[js.Any])
    if (paste != null) __obj.updateDynamic("paste")(paste.asInstanceOf[js.Any])
    if (request != null) __obj.updateDynamic("request")(request.asInstanceOf[js.Any])
    if (resume != null) __obj.updateDynamic("resume")(resume.asInstanceOf[js.Any])
    if (scaling != null) __obj.updateDynamic("scaling")(scaling.asInstanceOf[js.Any])
    if (session != null) __obj.updateDynamic("session")(session.asInstanceOf[js.Any])
    if (signature != null) __obj.updateDynamic("signature")(signature.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (uploadSuccess != null) __obj.updateDynamic("uploadSuccess")(uploadSuccess.asInstanceOf[js.Any])
    if (validation != null) __obj.updateDynamic("validation")(validation.asInstanceOf[js.Any])
    if (!js.isUndefined(warnBeforeUnload)) __obj.updateDynamic("warnBeforeUnload")(warnBeforeUnload.asInstanceOf[js.Any])
    if (workarounds != null) __obj.updateDynamic("workarounds")(workarounds.asInstanceOf[js.Any])
    __obj.asInstanceOf[AzureCoreOptions]
  }
}

