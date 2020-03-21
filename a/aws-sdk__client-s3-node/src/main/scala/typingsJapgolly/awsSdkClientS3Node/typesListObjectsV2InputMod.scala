package typingsJapgolly.awsSdkClientS3Node

import typingsJapgolly.awsSdkClientS3Node.awsSdkClientS3NodeStrings.requester_
import typingsJapgolly.awsSdkClientS3Node.awsSdkClientS3NodeStrings.url
import typingsJapgolly.awsSdkClientS3Node.inputTypesUnionMod._InputTypesUnion
import typingsJapgolly.awsSdkTypes.abortMod.AbortSignal
import typingsJapgolly.awsSdkTypes.httpMod.NodeHttpOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/types/ListObjectsV2Input", JSImport.Namespace)
@js.native
object typesListObjectsV2InputMod extends js.Object {
  @js.native
  trait ListObjectsV2Input extends _InputTypesUnion {
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
      * <p>Name of the bucket to list.</p>
      */
    var Bucket: String = js.native
    /**
      * <p>ContinuationToken indicates Amazon S3 that the list is being continued on this bucket with a token. ContinuationToken is obfuscated and is not a real key</p>
      */
    var ContinuationToken: js.UndefOr[String] = js.native
    /**
      * <p>A delimiter is a character you use to group keys.</p>
      */
    var Delimiter: js.UndefOr[String] = js.native
    /**
      * <p>Encoding type used by Amazon S3 to encode object keys in the response.</p>
      */
    var EncodingType: js.UndefOr[url | String] = js.native
    /**
      * <p>The owner field is not present in listV2 by default, if you want to return owner field with each key in the result then set the fetch owner field to true</p>
      */
    var FetchOwner: js.UndefOr[Boolean] = js.native
    /**
      * <p>Sets the maximum number of keys returned in the response. The response might contain fewer keys but will never contain more.</p>
      */
    var MaxKeys: js.UndefOr[Double] = js.native
    /**
      * <p>Limits the response to keys that begin with the specified prefix.</p>
      */
    var Prefix: js.UndefOr[String] = js.native
    /**
      * <p>Confirms that the requester knows that she or he will be charged for the list objects request in V2 style. Bucket owners need not specify this parameter in their requests.</p>
      */
    var RequestPayer: js.UndefOr[requester_ | String] = js.native
    /**
      * <p>StartAfter is where you want Amazon S3 to start listing from. Amazon S3 starts listing after this specified key. StartAfter can be any key in the bucket</p>
      */
    var StartAfter: js.UndefOr[String] = js.native
  }
  
}

