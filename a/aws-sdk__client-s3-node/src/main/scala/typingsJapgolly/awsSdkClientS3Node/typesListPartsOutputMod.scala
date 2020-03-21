package typingsJapgolly.awsSdkClientS3Node

import typingsJapgolly.awsSdkClientS3Node.awsSdkClientS3NodeStrings.ONEZONE_IA
import typingsJapgolly.awsSdkClientS3Node.awsSdkClientS3NodeStrings.REDUCED_REDUNDANCY
import typingsJapgolly.awsSdkClientS3Node.awsSdkClientS3NodeStrings.STANDARD
import typingsJapgolly.awsSdkClientS3Node.awsSdkClientS3NodeStrings.STANDARD_IA
import typingsJapgolly.awsSdkClientS3Node.awsSdkClientS3NodeStrings.requester_
import typingsJapgolly.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typingsJapgolly.awsSdkClientS3Node.typesInitiatorMod.UnmarshalledInitiator
import typingsJapgolly.awsSdkClientS3Node.typesOwnerMod.UnmarshalledOwner
import typingsJapgolly.awsSdkClientS3Node.typesPartMod.UnmarshalledPart
import typingsJapgolly.awsSdkTypes.responseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/types/ListPartsOutput", JSImport.Namespace)
@js.native
object typesListPartsOutputMod extends js.Object {
  @js.native
  trait ListPartsOutput
    extends MetadataBearer
       with _OutputTypesUnion {
    /**
      * <p>Date when multipart upload will become eligible for abort operation by lifecycle.</p>
      */
    var AbortDate: js.UndefOr[js.Date] = js.native
    /**
      * <p>Id of the lifecycle rule that makes a multipart upload eligible for abort operation.</p>
      */
    var AbortRuleId: js.UndefOr[String] = js.native
    /**
      * <p>Name of the bucket to which the multipart upload was initiated.</p>
      */
    var Bucket: js.UndefOr[String] = js.native
    /**
      * <p>Identifies who initiated the multipart upload.</p>
      */
    var Initiator: js.UndefOr[UnmarshalledInitiator] = js.native
    /**
      * <p>Indicates whether the returned list of parts is truncated.</p>
      */
    var IsTruncated: js.UndefOr[Boolean] = js.native
    /**
      * <p>Object key for which the multipart upload was initiated.</p>
      */
    var Key: js.UndefOr[String] = js.native
    /**
      * <p>Maximum number of parts that were allowed in the response.</p>
      */
    var MaxParts: js.UndefOr[Double] = js.native
    /**
      * <p>When a list is truncated, this element specifies the last part in the list, as well as the value to use for the part-number-marker request parameter in a subsequent request.</p>
      */
    var NextPartNumberMarker: js.UndefOr[Double] = js.native
    /**
      * _Owner shape
      */
    var Owner: js.UndefOr[UnmarshalledOwner] = js.native
    /**
      * <p>Part number after which listing begins.</p>
      */
    var PartNumberMarker: js.UndefOr[Double] = js.native
    /**
      * _Parts shape
      */
    var Parts: js.UndefOr[js.Array[UnmarshalledPart]] = js.native
    /**
      * <p>If present, indicates that the requester was successfully charged for the request.</p>
      */
    var RequestCharged: js.UndefOr[requester_ | String] = js.native
    /**
      * <p>The class of storage used to store the object.</p>
      */
    var StorageClass: js.UndefOr[STANDARD | REDUCED_REDUNDANCY | STANDARD_IA | ONEZONE_IA | String] = js.native
    /**
      * <p>Upload ID identifying the multipart upload whose parts are being listed.</p>
      */
    var UploadId: js.UndefOr[String] = js.native
  }
  
}

