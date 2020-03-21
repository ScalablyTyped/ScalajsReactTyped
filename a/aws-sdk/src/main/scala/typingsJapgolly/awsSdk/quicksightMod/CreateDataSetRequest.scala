package typingsJapgolly.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDataSetRequest extends js.Object {
  /**
    * The AWS account ID.
    */
  var AwsAccountId: typingsJapgolly.awsSdk.quicksightMod.AwsAccountId = js.native
  /**
    * Groupings of columns that work together in certain QuickSight features. Currently, only geospatial hierarchy is supported.
    */
  var ColumnGroups: js.UndefOr[ColumnGroupList] = js.native
  /**
    * An ID for the dataset that you want to create. This ID is unique per AWS Region for each AWS account.
    */
  var DataSetId: ResourceId = js.native
  /**
    * Indicates whether you want to import the data into SPICE.
    */
  var ImportMode: DataSetImportMode = js.native
  /**
    * Configures the combination and transformation of the data from the physical tables.
    */
  var LogicalTableMap: js.UndefOr[typingsJapgolly.awsSdk.quicksightMod.LogicalTableMap] = js.native
  /**
    * The display name for the dataset.
    */
  var Name: ResourceName = js.native
  /**
    * A list of resource permissions on the dataset.
    */
  var Permissions: js.UndefOr[ResourcePermissionList] = js.native
  /**
    * Declares the physical tables that are available in the underlying data sources.
    */
  var PhysicalTableMap: typingsJapgolly.awsSdk.quicksightMod.PhysicalTableMap = js.native
  /**
    * The row-level security configuration for the data that you want to create.
    */
  var RowLevelPermissionDataSet: js.UndefOr[typingsJapgolly.awsSdk.quicksightMod.RowLevelPermissionDataSet] = js.native
  /**
    * Contains a map of the key-value pairs for the resource tag or tags assigned to the dataset.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object CreateDataSetRequest {
  @scala.inline
  def apply(
    AwsAccountId: AwsAccountId,
    DataSetId: ResourceId,
    ImportMode: DataSetImportMode,
    Name: ResourceName,
    PhysicalTableMap: PhysicalTableMap,
    ColumnGroups: ColumnGroupList = null,
    LogicalTableMap: LogicalTableMap = null,
    Permissions: ResourcePermissionList = null,
    RowLevelPermissionDataSet: RowLevelPermissionDataSet = null,
    Tags: TagList = null
  ): CreateDataSetRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], DataSetId = DataSetId.asInstanceOf[js.Any], ImportMode = ImportMode.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PhysicalTableMap = PhysicalTableMap.asInstanceOf[js.Any])
    if (ColumnGroups != null) __obj.updateDynamic("ColumnGroups")(ColumnGroups.asInstanceOf[js.Any])
    if (LogicalTableMap != null) __obj.updateDynamic("LogicalTableMap")(LogicalTableMap.asInstanceOf[js.Any])
    if (Permissions != null) __obj.updateDynamic("Permissions")(Permissions.asInstanceOf[js.Any])
    if (RowLevelPermissionDataSet != null) __obj.updateDynamic("RowLevelPermissionDataSet")(RowLevelPermissionDataSet.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDataSetRequest]
  }
}

