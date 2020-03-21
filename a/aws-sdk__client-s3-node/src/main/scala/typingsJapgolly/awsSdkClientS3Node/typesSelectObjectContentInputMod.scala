package typingsJapgolly.awsSdkClientS3Node

import typingsJapgolly.awsSdkClientS3Node.awsSdkClientS3NodeStrings.SQL
import typingsJapgolly.awsSdkClientS3Node.inputTypesUnionMod._InputTypesUnion
import typingsJapgolly.awsSdkTypes.abortMod.AbortSignal
import typingsJapgolly.awsSdkTypes.cryptoMod.SourceData
import typingsJapgolly.awsSdkTypes.httpMod.NodeHttpOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/types/SelectObjectContentInput", JSImport.Namespace)
@js.native
object typesSelectObjectContentInputMod extends js.Object {
  @js.native
  trait SelectObjectContentInput extends _InputTypesUnion {
    /**
      * An object that may be queried to determine if the underlying operation has been aborted.
      *
      * @see https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal
      */
    @JSName("$abortSignal")
    var $abortSignal: js.UndefOr[AbortSignal] = js.native
    /**
      * Whether to use the bucket name as the endpoint for this request. The bucket
      * name must be a domain name with a CNAME record alias to an appropriate virtual
      * hosted-style S3 hostname, e.g. a bucket of `images.johnsmith.net` and a DNS
      * record of:
      *
      * ```
      * images.johnsmith.net CNAME 			images.johnsmith.net.s3.amazonaws.com.
      * ```
      *
      * @see https://docs.aws.amazon.com/AmazonS3/latest/dev/VirtualHosting.html#VirtualHostingCustomURLs
      */
    @JSName("$bucketEndpoint")
    var $bucketEndpoint: js.UndefOr[String] = js.native
    /**
      * Whether to force path style URLs for S3 objects (e.g., https://s3.amazonaws.com/<bucketName>/<key> instead of https://<bucketName>.s3.amazonaws.com/<key>
      */
    @JSName("$forcePathStyle")
    var $forcePathStyle: js.UndefOr[Boolean] = js.native
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
      * Specifies the customer-provided encryption key for Amazon S3 to use in encrypting data. This value is used to store the object and then it is discarded; Amazon does not store the encryption key. The key must be appropriate for use with the algorithm specified in the `SSECustomerAlgorithm` parameter
      */
    @JSName("$serverSideEncryptionKey")
    var $serverSideEncryptionKey: js.UndefOr[SourceData] = js.native
    /**
      * Whether to use the S3 Transfer Acceleration endpoint by default
      */
    @JSName("$useAccelerateEndpoint")
    var $useAccelerateEndpoint: js.UndefOr[Boolean] = js.native
    /**
      * Enables IPv6/IPv4 dualstack endpoint. When a DNS lookup is performed on an endpoint of this type, it returns an “A” record with an IPv4 address and an “AAAA” record with an IPv6 address. In most cases the network stack in the client environment will automatically prefer the AAAA record and make a connection using the IPv6 address. Note, however, that currently on Windows, the IPv4 address will be preferred.
      */
    @JSName("$useDualstackEndpoint")
    var $useDualstackEndpoint: js.UndefOr[Boolean] = js.native
    /**
      * <p>The S3 Bucket.</p>
      */
    var Bucket: String = js.native
    /**
      * <p>The expression that is used to query the object.</p>
      */
    var Expression: String = js.native
    /**
      * <p>The type of the provided expression (e.g., SQL).</p>
      */
    var ExpressionType: SQL | String = js.native
    /**
      * <p>Describes the format of the data in the object that is being queried.</p>
      */
    var InputSerialization: typingsJapgolly.awsSdkClientS3Node.typesInputSerializationMod.InputSerialization = js.native
    /**
      * <p>The Object Key.</p>
      */
    var Key: String = js.native
    /**
      * <p>Describes the format of the data that you want Amazon S3 to return in response.</p>
      */
    var OutputSerialization: typingsJapgolly.awsSdkClientS3Node.typesOutputSerializationMod.OutputSerialization = js.native
    /**
      * <p>Specifies if periodic request progress information should be enabled.</p>
      */
    var RequestProgress: js.UndefOr[typingsJapgolly.awsSdkClientS3Node.typesRequestProgressMod.RequestProgress] = js.native
    /**
      * <p>The SSE Algorithm used to encrypt the object. For more information, go to <a href="http://docs.aws.amazon.com/AmazonS3/latest/dev/ServerSideEncryptionCustomerKeys.html"> Server-Side Encryption (Using Customer-Provided Encryption Keys</a>. </p>
      */
    var SSECustomerAlgorithm: js.UndefOr[String] = js.native
  }
  
}

