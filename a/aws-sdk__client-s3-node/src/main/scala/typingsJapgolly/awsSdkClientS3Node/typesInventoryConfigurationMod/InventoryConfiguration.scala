package typingsJapgolly.awsSdkClientS3Node.typesInventoryConfigurationMod

import typingsJapgolly.awsSdkClientS3Node.awsSdkClientS3NodeStrings.All
import typingsJapgolly.awsSdkClientS3Node.awsSdkClientS3NodeStrings.Current
import typingsJapgolly.awsSdkClientS3Node.awsSdkClientS3NodeStrings.ETag
import typingsJapgolly.awsSdkClientS3Node.awsSdkClientS3NodeStrings.EncryptionStatus
import typingsJapgolly.awsSdkClientS3Node.awsSdkClientS3NodeStrings.IsMultipartUploaded
import typingsJapgolly.awsSdkClientS3Node.awsSdkClientS3NodeStrings.LastModifiedDate
import typingsJapgolly.awsSdkClientS3Node.awsSdkClientS3NodeStrings.ReplicationStatus
import typingsJapgolly.awsSdkClientS3Node.awsSdkClientS3NodeStrings.Size
import typingsJapgolly.awsSdkClientS3Node.awsSdkClientS3NodeStrings.StorageClass
import typingsJapgolly.awsSdkClientS3Node.typesInventoryDestinationMod.InventoryDestination
import typingsJapgolly.awsSdkClientS3Node.typesInventoryFilterMod.InventoryFilter
import typingsJapgolly.awsSdkClientS3Node.typesInventoryScheduleMod.InventorySchedule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InventoryConfiguration extends js.Object {
  /**
    * <p>Contains information about where to publish the inventory results.</p>
    */
  var Destination: InventoryDestination
  /**
    * <p>Specifies an inventory filter. The inventory only includes objects that meet the filter's criteria.</p>
    */
  var Filter: js.UndefOr[InventoryFilter] = js.undefined
  /**
    * <p>The ID used to identify the inventory configuration.</p>
    */
  var Id: String
  /**
    * <p>Specifies which object version(s) to included in the inventory results.</p>
    */
  var IncludedObjectVersions: All | Current | String
  /**
    * <p>Specifies whether the inventory is enabled or disabled.</p>
    */
  var IsEnabled: Boolean
  /**
    * <p>Contains the optional fields that are included in the inventory results.</p>
    */
  var OptionalFields: js.UndefOr[
    (js.Array[
      Size | LastModifiedDate | StorageClass | ETag | IsMultipartUploaded | ReplicationStatus | EncryptionStatus | String
    ]) | (js.Iterable[
      Size | LastModifiedDate | StorageClass | ETag | IsMultipartUploaded | ReplicationStatus | EncryptionStatus | String
    ])
  ] = js.undefined
  /**
    * <p>Specifies the schedule for generating inventory results.</p>
    */
  var Schedule: InventorySchedule
}

object InventoryConfiguration {
  @scala.inline
  def apply(
    Destination: InventoryDestination,
    Id: String,
    IncludedObjectVersions: All | Current | String,
    IsEnabled: Boolean,
    Schedule: InventorySchedule,
    Filter: InventoryFilter = null,
    OptionalFields: (js.Array[
      Size | LastModifiedDate | StorageClass | ETag | IsMultipartUploaded | ReplicationStatus | EncryptionStatus | String
    ]) | (js.Iterable[
      Size | LastModifiedDate | StorageClass | ETag | IsMultipartUploaded | ReplicationStatus | EncryptionStatus | String
    ]) = null
  ): InventoryConfiguration = {
    val __obj = js.Dynamic.literal(Destination = Destination.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], IncludedObjectVersions = IncludedObjectVersions.asInstanceOf[js.Any], IsEnabled = IsEnabled.asInstanceOf[js.Any], Schedule = Schedule.asInstanceOf[js.Any])
    if (Filter != null) __obj.updateDynamic("Filter")(Filter.asInstanceOf[js.Any])
    if (OptionalFields != null) __obj.updateDynamic("OptionalFields")(OptionalFields.asInstanceOf[js.Any])
    __obj.asInstanceOf[InventoryConfiguration]
  }
}

