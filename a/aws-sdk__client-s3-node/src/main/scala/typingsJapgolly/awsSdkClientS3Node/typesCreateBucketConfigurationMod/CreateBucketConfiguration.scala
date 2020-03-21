package typingsJapgolly.awsSdkClientS3Node.typesCreateBucketConfigurationMod

import typingsJapgolly.awsSdkClientS3Node.awsSdkClientS3NodeStrings.EU
import typingsJapgolly.awsSdkClientS3Node.awsSdkClientS3NodeStrings.`ap-northeast-1`
import typingsJapgolly.awsSdkClientS3Node.awsSdkClientS3NodeStrings.`ap-south-1`
import typingsJapgolly.awsSdkClientS3Node.awsSdkClientS3NodeStrings.`ap-southeast-1`
import typingsJapgolly.awsSdkClientS3Node.awsSdkClientS3NodeStrings.`ap-southeast-2`
import typingsJapgolly.awsSdkClientS3Node.awsSdkClientS3NodeStrings.`cn-north-1`
import typingsJapgolly.awsSdkClientS3Node.awsSdkClientS3NodeStrings.`eu-central-1`
import typingsJapgolly.awsSdkClientS3Node.awsSdkClientS3NodeStrings.`eu-west-1`
import typingsJapgolly.awsSdkClientS3Node.awsSdkClientS3NodeStrings.`sa-east-1`
import typingsJapgolly.awsSdkClientS3Node.awsSdkClientS3NodeStrings.`us-west-1`
import typingsJapgolly.awsSdkClientS3Node.awsSdkClientS3NodeStrings.`us-west-2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateBucketConfiguration extends js.Object {
  /**
    * <p>Specifies the region where the bucket will be created. If you don't specify a region, the bucket will be created in US Standard.</p>
    */
  var LocationConstraint: js.UndefOr[
    EU | `eu-west-1` | `us-west-1` | `us-west-2` | `ap-south-1` | `ap-southeast-1` | `ap-southeast-2` | `ap-northeast-1` | `sa-east-1` | `cn-north-1` | `eu-central-1` | String
  ] = js.undefined
}

object CreateBucketConfiguration {
  @scala.inline
  def apply(
    LocationConstraint: EU | `eu-west-1` | `us-west-1` | `us-west-2` | `ap-south-1` | `ap-southeast-1` | `ap-southeast-2` | `ap-northeast-1` | `sa-east-1` | `cn-north-1` | `eu-central-1` | String = null
  ): CreateBucketConfiguration = {
    val __obj = js.Dynamic.literal()
    if (LocationConstraint != null) __obj.updateDynamic("LocationConstraint")(LocationConstraint.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBucketConfiguration]
  }
}

