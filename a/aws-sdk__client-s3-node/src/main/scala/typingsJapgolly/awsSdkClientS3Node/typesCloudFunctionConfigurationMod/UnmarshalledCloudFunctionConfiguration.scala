package typingsJapgolly.awsSdkClientS3Node.typesCloudFunctionConfigurationMod

import typingsJapgolly.awsSdkClientS3Node.awsSdkClientS3NodeStrings.s3ColonObjectCreatedColonAsterisk
import typingsJapgolly.awsSdkClientS3Node.awsSdkClientS3NodeStrings.s3ColonObjectCreatedColonCompleteMultipartUpload
import typingsJapgolly.awsSdkClientS3Node.awsSdkClientS3NodeStrings.s3ColonObjectCreatedColonCopy
import typingsJapgolly.awsSdkClientS3Node.awsSdkClientS3NodeStrings.s3ColonObjectCreatedColonPost
import typingsJapgolly.awsSdkClientS3Node.awsSdkClientS3NodeStrings.s3ColonObjectCreatedColonPut
import typingsJapgolly.awsSdkClientS3Node.awsSdkClientS3NodeStrings.s3ColonObjectRemovedColonAsterisk
import typingsJapgolly.awsSdkClientS3Node.awsSdkClientS3NodeStrings.s3ColonObjectRemovedColonDelete
import typingsJapgolly.awsSdkClientS3Node.awsSdkClientS3NodeStrings.s3ColonObjectRemovedColonDeleteMarkerCreated
import typingsJapgolly.awsSdkClientS3Node.awsSdkClientS3NodeStrings.s3ColonReducedRedundancyLostObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledCloudFunctionConfiguration extends CloudFunctionConfiguration {
  /**
    * _EventList shape
    */
  @JSName("Events")
  var Events_UnmarshalledCloudFunctionConfiguration: js.UndefOr[
    js.Array[
      s3ColonReducedRedundancyLostObject | s3ColonObjectCreatedColonAsterisk | s3ColonObjectCreatedColonPut | s3ColonObjectCreatedColonPost | s3ColonObjectCreatedColonCopy | s3ColonObjectCreatedColonCompleteMultipartUpload | s3ColonObjectRemovedColonAsterisk | s3ColonObjectRemovedColonDelete | s3ColonObjectRemovedColonDeleteMarkerCreated | String
    ]
  ] = js.undefined
}

object UnmarshalledCloudFunctionConfiguration {
  @scala.inline
  def apply(
    CloudFunction: String = null,
    Event: s3ColonReducedRedundancyLostObject | s3ColonObjectCreatedColonAsterisk | s3ColonObjectCreatedColonPut | s3ColonObjectCreatedColonPost | s3ColonObjectCreatedColonCopy | s3ColonObjectCreatedColonCompleteMultipartUpload | s3ColonObjectRemovedColonAsterisk | s3ColonObjectRemovedColonDelete | s3ColonObjectRemovedColonDeleteMarkerCreated | String = null,
    Events: js.Array[
      s3ColonReducedRedundancyLostObject | s3ColonObjectCreatedColonAsterisk | s3ColonObjectCreatedColonPut | s3ColonObjectCreatedColonPost | s3ColonObjectCreatedColonCopy | s3ColonObjectCreatedColonCompleteMultipartUpload | s3ColonObjectRemovedColonAsterisk | s3ColonObjectRemovedColonDelete | s3ColonObjectRemovedColonDeleteMarkerCreated | String
    ] = null,
    Id: String = null,
    InvocationRole: String = null
  ): UnmarshalledCloudFunctionConfiguration = {
    val __obj = js.Dynamic.literal()
    if (CloudFunction != null) __obj.updateDynamic("CloudFunction")(CloudFunction.asInstanceOf[js.Any])
    if (Event != null) __obj.updateDynamic("Event")(Event.asInstanceOf[js.Any])
    if (Events != null) __obj.updateDynamic("Events")(Events.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (InvocationRole != null) __obj.updateDynamic("InvocationRole")(InvocationRole.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledCloudFunctionConfiguration]
  }
}

