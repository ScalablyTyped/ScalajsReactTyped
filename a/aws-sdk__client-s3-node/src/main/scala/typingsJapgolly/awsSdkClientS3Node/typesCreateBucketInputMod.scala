package typingsJapgolly.awsSdkClientS3Node

import typingsJapgolly.awsSdkClientS3Node.awsSdkClientS3NodeStrings.`authenticated-read`
import typingsJapgolly.awsSdkClientS3Node.awsSdkClientS3NodeStrings.`private`
import typingsJapgolly.awsSdkClientS3Node.awsSdkClientS3NodeStrings.`public-read-write`
import typingsJapgolly.awsSdkClientS3Node.awsSdkClientS3NodeStrings.`public-read`
import typingsJapgolly.awsSdkClientS3Node.inputTypesUnionMod._InputTypesUnion
import typingsJapgolly.awsSdkTypes.abortMod.AbortSignal
import typingsJapgolly.awsSdkTypes.httpMod.NodeHttpOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/types/CreateBucketInput", JSImport.Namespace)
@js.native
object typesCreateBucketInputMod extends js.Object {
  @js.native
  trait CreateBucketInput extends _InputTypesUnion {
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
      * <p>The canned ACL to apply to the bucket.</p>
      */
    var ACL: js.UndefOr[`private` | `public-read` | `public-read-write` | `authenticated-read` | String] = js.native
    /**
      * _BucketName shape
      */
    var Bucket: String = js.native
    /**
      * _CreateBucketConfiguration shape
      */
    var CreateBucketConfiguration: js.UndefOr[
        typingsJapgolly.awsSdkClientS3Node.typesCreateBucketConfigurationMod.CreateBucketConfiguration
      ] = js.native
    /**
      * <p>Allows grantee the read, write, read ACP, and write ACP permissions on the bucket.</p>
      */
    var GrantFullControl: js.UndefOr[String] = js.native
    /**
      * <p>Allows grantee to list the objects in the bucket.</p>
      */
    var GrantRead: js.UndefOr[String] = js.native
    /**
      * <p>Allows grantee to read the bucket ACL.</p>
      */
    var GrantReadACP: js.UndefOr[String] = js.native
    /**
      * <p>Allows grantee to create, overwrite, and delete any object in the bucket.</p>
      */
    var GrantWrite: js.UndefOr[String] = js.native
    /**
      * <p>Allows grantee to write the ACL for the applicable bucket.</p>
      */
    var GrantWriteACP: js.UndefOr[String] = js.native
  }
  
}

