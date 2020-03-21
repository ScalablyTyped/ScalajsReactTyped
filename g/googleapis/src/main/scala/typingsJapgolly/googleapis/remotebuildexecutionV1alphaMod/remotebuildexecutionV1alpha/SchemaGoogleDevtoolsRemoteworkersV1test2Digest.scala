package typingsJapgolly.googleapis.remotebuildexecutionV1alphaMod.remotebuildexecutionV1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The CommandTask and CommandResult messages assume the existence of a
  * service that can serve blobs of content, identified by a hash and size
  * known as a &quot;digest.&quot; The method by which these blobs may be
  * retrieved is not specified here, but a model implementation is in the
  * Remote Execution API&#39;s &quot;ContentAddressibleStorage&quot; interface.
  * In the context of the RWAPI, a Digest will virtually always refer to the
  * contents of a file or a directory. The latter is represented by the
  * byte-encoded Directory message.
  */
@js.native
trait SchemaGoogleDevtoolsRemoteworkersV1test2Digest extends js.Object {
  /**
    * A string-encoded hash (eg &quot;1a2b3c&quot;, not the byte array [0x1a,
    * 0x2b, 0x3c]) using an implementation-defined hash algorithm (eg SHA-256).
    */
  var hash: js.UndefOr[String] = js.native
  /**
    * The size of the contents. While this is not strictly required as part of
    * an identifier (after all, any given hash will have exactly one canonical
    * size), it&#39;s useful in almost all cases when one might want to send or
    * retrieve blobs of content and is included here for this reason.
    */
  var sizeBytes: js.UndefOr[String] = js.native
}

object SchemaGoogleDevtoolsRemoteworkersV1test2Digest {
  @scala.inline
  def apply(hash: String = null, sizeBytes: String = null): SchemaGoogleDevtoolsRemoteworkersV1test2Digest = {
    val __obj = js.Dynamic.literal()
    if (hash != null) __obj.updateDynamic("hash")(hash.asInstanceOf[js.Any])
    if (sizeBytes != null) __obj.updateDynamic("sizeBytes")(sizeBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemoteworkersV1test2Digest]
  }
}

