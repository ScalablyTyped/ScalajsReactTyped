package typingsJapgolly.awsSdk.browserDefaultMod

import typingsJapgolly.awsSdk.managedUploadMod.ManagedUpload.ManagedUploadOptions
import typingsJapgolly.awsSdk.s3Mod.ClientConfiguration
import typingsJapgolly.awsSdk.s3Mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/browser_default", "S3")
@js.native
/**
  * Constructs a service object. This object has one method for each API operation.
  */
class S3 () extends ^ {
  def this(options: ClientConfiguration) = this()
}

@JSImport("aws-sdk/clients/browser_default", "S3")
@js.native
object S3 extends js.Object {
  @js.native
  class ManagedUpload protected ()
    extends typingsJapgolly.awsSdk.s3Mod.ManagedUpload {
    /**
      * Creates a managed upload object with a set of configuration options.
      */
    def this(options: ManagedUploadOptions) = this()
  }
  
  @js.native
  class PresignedPost ()
    extends typingsJapgolly.awsSdk.presignedPostMod.PresignedPost
  
  /* static members */
  @js.native
  object ManagedUpload extends js.Object {
    /**
      * Default value: 10000
      */
    var maxTotalParts: Double = js.native
    /**
      * Returns the minimum number of bytes for an individual part upload.
      * Note: Minimum allowed size is 5 MB.
      * 1024 * 5
      */
    var minPartSize: Double = js.native
  }
  
}

