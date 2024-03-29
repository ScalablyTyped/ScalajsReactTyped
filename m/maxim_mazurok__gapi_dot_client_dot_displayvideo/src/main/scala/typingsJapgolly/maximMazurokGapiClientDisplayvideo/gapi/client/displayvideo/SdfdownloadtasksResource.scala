package typingsJapgolly.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientDisplayvideo.anon.CallbackFieldsKeyOauthtoken
import typingsJapgolly.maximMazurokGapiClientDisplayvideo.anon.PrettyPrintQuotaUserUploadType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SdfdownloadtasksResource extends StObject {
  
  /**
    * Creates an SDF Download Task. Returns an Operation. An SDF Download Task is a long-running, asynchronous operation. The metadata type of this operation is SdfDownloadTaskMetadata.
    * If the request is successful, the response type of the operation is SdfDownloadTask. The response will not include the download files, which must be retrieved with media.download.
    * The state of operation can be retrieved with sdfdownloadtask.operations.get. Any errors can be found in the error.message. Note that error.details is expected to be empty.
    */
  def create(request: CallbackFieldsKeyOauthtoken): Request[Operation] = js.native
  def create(request: PrettyPrintQuotaUserUploadType, body: CreateSdfDownloadTaskRequest): Request[Operation] = js.native
  
  var operations: OperationsResource = js.native
}
