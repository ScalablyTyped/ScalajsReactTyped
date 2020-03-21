package typingsJapgolly.awsSdkClientGlacierNode

import typingsJapgolly.awsSdkTypes.abortMod.AbortSignal
import typingsJapgolly.awsSdkTypes.httpMod.NodeHttpOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-glacier-node/types/UploadArchiveInput", JSImport.Namespace)
@js.native
object typesUploadArchiveInputMod extends js.Object {
  @js.native
  trait UploadArchiveInput[StreamType] extends js.Object {
    /**
      * An object that may be queried to determine if the underlying operation has been aborted.
      *
      * @see https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal
      */
    @JSName("$abortSignal")
    var $abortSignal: js.UndefOr[AbortSignal] = js.native
    /**
      * Per-request HTTP configuration options. If set, any options specified will override the corresponding HTTP option set on the client for this command.
      */
    @JSName("$httpOptions")
    var $httpOptions: js.UndefOr[NodeHttpOptions] = js.native
    /**
      * The maximum number of times this operation should be retried. If set, this value will override the `maxRetries` configuration set on the client for this command.
      */
    @JSName("$maxRetries")
    var $maxRetries: js.UndefOr[Double] = js.native
    /**
      * <p>The <code>AccountId</code> value is the AWS account ID of the account that owns the vault. You can either specify an AWS account ID or optionally a single '<code>-</code>' (hyphen), in which case Amazon Glacier uses the AWS account ID associated with the credentials used to sign the request. If you use an account ID, do not include any hyphens ('-') in the ID. </p>
      */
    var accountId: String = js.native
    /**
      * <p>The optional description of the archive you are uploading.</p>
      */
    var archiveDescription: js.UndefOr[String] = js.native
    /**
      * <p>The data to upload.</p>
      */
    var body: js.UndefOr[
        scala.scalajs.js.typedarray.ArrayBuffer | scala.scalajs.js.typedarray.ArrayBufferView | String | StreamType
      ] = js.native
    /**
      * <p>The SHA256 tree hash of the data being uploaded.</p>
      */
    var checksum: js.UndefOr[String] = js.native
    /**
      * <p>The name of the vault.</p>
      */
    var vaultName: String = js.native
  }
  
}

