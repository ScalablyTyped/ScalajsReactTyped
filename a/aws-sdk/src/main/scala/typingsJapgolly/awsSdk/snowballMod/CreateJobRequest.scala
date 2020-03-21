package typingsJapgolly.awsSdk.snowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateJobRequest extends js.Object {
  /**
    * The ID for the address that you want the Snowball shipped to.
    */
  var AddressId: js.UndefOr[typingsJapgolly.awsSdk.snowballMod.AddressId] = js.native
  /**
    * The ID of a cluster. If you're creating a job for a node in a cluster, you need to provide only this clusterId value. The other job attributes are inherited from the cluster.
    */
  var ClusterId: js.UndefOr[typingsJapgolly.awsSdk.snowballMod.ClusterId] = js.native
  /**
    * Defines an optional description of this specific job, for example Important Photos 2016-08-11.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The forwarding address ID for a job. This field is not supported in most regions.
    */
  var ForwardingAddressId: js.UndefOr[AddressId] = js.native
  /**
    * Defines the type of job that you're creating. 
    */
  var JobType: js.UndefOr[typingsJapgolly.awsSdk.snowballMod.JobType] = js.native
  /**
    * The KmsKeyARN that you want to associate with this job. KmsKeyARNs are created using the CreateKey AWS Key Management Service (KMS) API action.
    */
  var KmsKeyARN: js.UndefOr[typingsJapgolly.awsSdk.snowballMod.KmsKeyARN] = js.native
  /**
    * Defines the Amazon Simple Notification Service (Amazon SNS) notification settings for this job.
    */
  var Notification: js.UndefOr[typingsJapgolly.awsSdk.snowballMod.Notification] = js.native
  /**
    * Defines the Amazon S3 buckets associated with this job. With IMPORT jobs, you specify the bucket or buckets that your transferred data will be imported into. With EXPORT jobs, you specify the bucket or buckets that your transferred data will be exported from. Optionally, you can also specify a KeyRange value. If you choose to export a range, you define the length of the range by providing either an inclusive BeginMarker value, an inclusive EndMarker value, or both. Ranges are UTF-8 binary sorted.
    */
  var Resources: js.UndefOr[JobResource] = js.native
  /**
    * The RoleARN that you want to associate with this job. RoleArns are created using the CreateRole AWS Identity and Access Management (IAM) API action.
    */
  var RoleARN: js.UndefOr[typingsJapgolly.awsSdk.snowballMod.RoleARN] = js.native
  /**
    * The shipping speed for this job. This speed doesn't dictate how soon you'll get the Snowball, rather it represents how quickly the Snowball moves to its destination while in transit. Regional shipping speeds are as follows:   In Australia, you have access to express shipping. Typically, Snowballs shipped express are delivered in about a day.   In the European Union (EU), you have access to express shipping. Typically, Snowballs shipped express are delivered in about a day. In addition, most countries in the EU have access to standard shipping, which typically takes less than a week, one way.   In India, Snowballs are delivered in one to seven days.   In the US, you have access to one-day shipping and two-day shipping.  
    */
  var ShippingOption: js.UndefOr[typingsJapgolly.awsSdk.snowballMod.ShippingOption] = js.native
  /**
    * If your job is being created in one of the US regions, you have the option of specifying what size Snowball you'd like for this job. In all other regions, Snowballs come with 80 TB in storage capacity.
    */
  var SnowballCapacityPreference: js.UndefOr[SnowballCapacity] = js.native
  /**
    * The type of AWS Snowball device to use for this job. Currently, the only supported device type for cluster jobs is EDGE.
    */
  var SnowballType: js.UndefOr[typingsJapgolly.awsSdk.snowballMod.SnowballType] = js.native
}

object CreateJobRequest {
  @scala.inline
  def apply(
    AddressId: AddressId = null,
    ClusterId: ClusterId = null,
    Description: String = null,
    ForwardingAddressId: AddressId = null,
    JobType: JobType = null,
    KmsKeyARN: KmsKeyARN = null,
    Notification: Notification = null,
    Resources: JobResource = null,
    RoleARN: RoleARN = null,
    ShippingOption: ShippingOption = null,
    SnowballCapacityPreference: SnowballCapacity = null,
    SnowballType: SnowballType = null
  ): CreateJobRequest = {
    val __obj = js.Dynamic.literal()
    if (AddressId != null) __obj.updateDynamic("AddressId")(AddressId.asInstanceOf[js.Any])
    if (ClusterId != null) __obj.updateDynamic("ClusterId")(ClusterId.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (ForwardingAddressId != null) __obj.updateDynamic("ForwardingAddressId")(ForwardingAddressId.asInstanceOf[js.Any])
    if (JobType != null) __obj.updateDynamic("JobType")(JobType.asInstanceOf[js.Any])
    if (KmsKeyARN != null) __obj.updateDynamic("KmsKeyARN")(KmsKeyARN.asInstanceOf[js.Any])
    if (Notification != null) __obj.updateDynamic("Notification")(Notification.asInstanceOf[js.Any])
    if (Resources != null) __obj.updateDynamic("Resources")(Resources.asInstanceOf[js.Any])
    if (RoleARN != null) __obj.updateDynamic("RoleARN")(RoleARN.asInstanceOf[js.Any])
    if (ShippingOption != null) __obj.updateDynamic("ShippingOption")(ShippingOption.asInstanceOf[js.Any])
    if (SnowballCapacityPreference != null) __obj.updateDynamic("SnowballCapacityPreference")(SnowballCapacityPreference.asInstanceOf[js.Any])
    if (SnowballType != null) __obj.updateDynamic("SnowballType")(SnowballType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateJobRequest]
  }
}

