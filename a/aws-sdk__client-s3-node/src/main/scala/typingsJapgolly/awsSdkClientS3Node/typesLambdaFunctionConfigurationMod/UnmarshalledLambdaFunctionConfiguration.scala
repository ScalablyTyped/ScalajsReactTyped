package typingsJapgolly.awsSdkClientS3Node.typesLambdaFunctionConfigurationMod

import typingsJapgolly.awsSdkClientS3Node.awsSdkClientS3NodeStrings.s3ColonObjectCreatedColonAsterisk
import typingsJapgolly.awsSdkClientS3Node.awsSdkClientS3NodeStrings.s3ColonObjectCreatedColonCompleteMultipartUpload
import typingsJapgolly.awsSdkClientS3Node.awsSdkClientS3NodeStrings.s3ColonObjectCreatedColonCopy
import typingsJapgolly.awsSdkClientS3Node.awsSdkClientS3NodeStrings.s3ColonObjectCreatedColonPost
import typingsJapgolly.awsSdkClientS3Node.awsSdkClientS3NodeStrings.s3ColonObjectCreatedColonPut
import typingsJapgolly.awsSdkClientS3Node.awsSdkClientS3NodeStrings.s3ColonObjectRemovedColonAsterisk
import typingsJapgolly.awsSdkClientS3Node.awsSdkClientS3NodeStrings.s3ColonObjectRemovedColonDelete
import typingsJapgolly.awsSdkClientS3Node.awsSdkClientS3NodeStrings.s3ColonObjectRemovedColonDeleteMarkerCreated
import typingsJapgolly.awsSdkClientS3Node.awsSdkClientS3NodeStrings.s3ColonReducedRedundancyLostObject
import typingsJapgolly.awsSdkClientS3Node.typesNotificationConfigurationFilterMod.UnmarshalledNotificationConfigurationFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledLambdaFunctionConfiguration extends LambdaFunctionConfiguration {
  /**
    * _EventList shape
    */
  @JSName("Events")
  var Events_UnmarshalledLambdaFunctionConfiguration: js.Array[
    s3ColonReducedRedundancyLostObject | s3ColonObjectCreatedColonAsterisk | s3ColonObjectCreatedColonPut | s3ColonObjectCreatedColonPost | s3ColonObjectCreatedColonCopy | s3ColonObjectCreatedColonCompleteMultipartUpload | s3ColonObjectRemovedColonAsterisk | s3ColonObjectRemovedColonDelete | s3ColonObjectRemovedColonDeleteMarkerCreated | String
  ]
  /**
    * <p>Container for object key name filtering rules. For information about key name filtering, go to <a href="http://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html">Configuring Event Notifications</a> in the Amazon Simple Storage Service Developer Guide.</p>
    */
  @JSName("Filter")
  var Filter_UnmarshalledLambdaFunctionConfiguration: js.UndefOr[UnmarshalledNotificationConfigurationFilter] = js.undefined
}

object UnmarshalledLambdaFunctionConfiguration {
  @scala.inline
  def apply(
    Events: js.Array[
      s3ColonReducedRedundancyLostObject | s3ColonObjectCreatedColonAsterisk | s3ColonObjectCreatedColonPut | s3ColonObjectCreatedColonPost | s3ColonObjectCreatedColonCopy | s3ColonObjectCreatedColonCompleteMultipartUpload | s3ColonObjectRemovedColonAsterisk | s3ColonObjectRemovedColonDelete | s3ColonObjectRemovedColonDeleteMarkerCreated | String
    ],
    LambdaFunctionArn: String,
    Filter: UnmarshalledNotificationConfigurationFilter = null,
    Id: String = null
  ): UnmarshalledLambdaFunctionConfiguration = {
    val __obj = js.Dynamic.literal(Events = Events.asInstanceOf[js.Any], LambdaFunctionArn = LambdaFunctionArn.asInstanceOf[js.Any])
    if (Filter != null) __obj.updateDynamic("Filter")(Filter.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledLambdaFunctionConfiguration]
  }
}

