package typingsJapgolly.awsSdk.kinesisvideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateStreamInput extends js.Object {
  /**
    * The number of hours that you want to retain the data in the stream. Kinesis Video Streams retains the data in a data store that is associated with the stream. The default value is 0, indicating that the stream does not persist data. When the DataRetentionInHours value is 0, consumers can still consume the fragments that remain in the service host buffer, which has a retention time limit of 5 minutes and a retention memory limit of 200 MB. Fragments are removed from the buffer when either limit is reached.
    */
  var DataRetentionInHours: js.UndefOr[typingsJapgolly.awsSdk.kinesisvideoMod.DataRetentionInHours] = js.native
  /**
    * The name of the device that is writing to the stream.   In the current implementation, Kinesis Video Streams does not use this name. 
    */
  var DeviceName: js.UndefOr[typingsJapgolly.awsSdk.kinesisvideoMod.DeviceName] = js.native
  /**
    * The ID of the AWS Key Management Service (AWS KMS) key that you want Kinesis Video Streams to use to encrypt stream data. If no key ID is specified, the default, Kinesis Video-managed key (aws/kinesisvideo) is used.  For more information, see DescribeKey. 
    */
  var KmsKeyId: js.UndefOr[typingsJapgolly.awsSdk.kinesisvideoMod.KmsKeyId] = js.native
  /**
    * The media type of the stream. Consumers of the stream can use this information when processing the stream. For more information about media types, see Media Types. If you choose to specify the MediaType, see Naming Requirements for guidelines. Example valid values include "video/h264" and "video/h264,audio/aac". This parameter is optional; the default value is null (or empty in JSON).
    */
  var MediaType: js.UndefOr[typingsJapgolly.awsSdk.kinesisvideoMod.MediaType] = js.native
  /**
    * A name for the stream that you are creating. The stream name is an identifier for the stream, and must be unique for each account and region.
    */
  var StreamName: typingsJapgolly.awsSdk.kinesisvideoMod.StreamName = js.native
  /**
    * A list of tags to associate with the specified stream. Each tag is a key-value pair (the value is optional).
    */
  var Tags: js.UndefOr[ResourceTags] = js.native
}

object CreateStreamInput {
  @scala.inline
  def apply(
    StreamName: StreamName,
    DataRetentionInHours: Int | Double = null,
    DeviceName: DeviceName = null,
    KmsKeyId: KmsKeyId = null,
    MediaType: MediaType = null,
    Tags: ResourceTags = null
  ): CreateStreamInput = {
    val __obj = js.Dynamic.literal(StreamName = StreamName.asInstanceOf[js.Any])
    if (DataRetentionInHours != null) __obj.updateDynamic("DataRetentionInHours")(DataRetentionInHours.asInstanceOf[js.Any])
    if (DeviceName != null) __obj.updateDynamic("DeviceName")(DeviceName.asInstanceOf[js.Any])
    if (KmsKeyId != null) __obj.updateDynamic("KmsKeyId")(KmsKeyId.asInstanceOf[js.Any])
    if (MediaType != null) __obj.updateDynamic("MediaType")(MediaType.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateStreamInput]
  }
}

