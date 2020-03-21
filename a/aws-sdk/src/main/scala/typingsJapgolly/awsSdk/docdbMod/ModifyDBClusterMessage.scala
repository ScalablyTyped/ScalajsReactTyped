package typingsJapgolly.awsSdk.docdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyDBClusterMessage extends js.Object {
  /**
    * A value that specifies whether the changes in this request and any pending changes are asynchronously applied as soon as possible, regardless of the PreferredMaintenanceWindow setting for the cluster. If this parameter is set to false, changes to the cluster are applied during the next maintenance window. The ApplyImmediately parameter affects only the NewDBClusterIdentifier and MasterUserPassword values. If you set this parameter value to false, the changes to the NewDBClusterIdentifier and MasterUserPassword values are applied during the next maintenance window. All other changes are applied immediately, regardless of the value of the ApplyImmediately parameter. Default: false 
    */
  var ApplyImmediately: js.UndefOr[Boolean] = js.native
  /**
    * The number of days for which automated backups are retained. You must specify a minimum value of 1. Default: 1 Constraints:   Must be a value from 1 to 35.  
    */
  var BackupRetentionPeriod: js.UndefOr[IntegerOptional] = js.native
  /**
    * The configuration setting for the log types to be enabled for export to Amazon CloudWatch Logs for a specific instance or cluster. The EnableLogTypes and DisableLogTypes arrays determine which logs are exported (or not exported) to CloudWatch Logs.
    */
  var CloudwatchLogsExportConfiguration: js.UndefOr[typingsJapgolly.awsSdk.docdbMod.CloudwatchLogsExportConfiguration] = js.native
  /**
    * The cluster identifier for the cluster that is being modified. This parameter is not case sensitive. Constraints:   Must match the identifier of an existing DBCluster.  
    */
  var DBClusterIdentifier: String = js.native
  /**
    * The name of the cluster parameter group to use for the cluster.
    */
  var DBClusterParameterGroupName: js.UndefOr[String] = js.native
  /**
    * Specifies whether this cluster can be deleted. If DeletionProtection is enabled, the cluster cannot be deleted unless it is modified and DeletionProtection is disabled. DeletionProtection protects clusters from being accidentally deleted.
    */
  var DeletionProtection: js.UndefOr[BooleanOptional] = js.native
  /**
    * The version number of the database engine to which you want to upgrade. Changing this parameter results in an outage. The change is applied during the next maintenance window unless the ApplyImmediately parameter is set to true.
    */
  var EngineVersion: js.UndefOr[String] = js.native
  /**
    * The password for the master database user. This password can contain any printable ASCII character except forward slash (/), double quote ("), or the "at" symbol (@). Constraints: Must contain from 8 to 100 characters.
    */
  var MasterUserPassword: js.UndefOr[String] = js.native
  /**
    * The new cluster identifier for the cluster when renaming a cluster. This value is stored as a lowercase string. Constraints:   Must contain from 1 to 63 letters, numbers, or hyphens.   The first character must be a letter.   Cannot end with a hyphen or contain two consecutive hyphens.   Example: my-cluster2 
    */
  var NewDBClusterIdentifier: js.UndefOr[String] = js.native
  /**
    * The port number on which the cluster accepts connections. Constraints: Must be a value from 1150 to 65535.  Default: The same port as the original cluster.
    */
  var Port: js.UndefOr[IntegerOptional] = js.native
  /**
    * The daily time range during which automated backups are created if automated backups are enabled, using the BackupRetentionPeriod parameter.  The default is a 30-minute window selected at random from an 8-hour block of time for each AWS Region.  Constraints:   Must be in the format hh24:mi-hh24:mi.   Must be in Universal Coordinated Time (UTC).   Must not conflict with the preferred maintenance window.   Must be at least 30 minutes.  
    */
  var PreferredBackupWindow: js.UndefOr[String] = js.native
  /**
    * The weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC). Format: ddd:hh24:mi-ddd:hh24:mi  The default is a 30-minute window selected at random from an 8-hour block of time for each AWS Region, occurring on a random day of the week.  Valid days: Mon, Tue, Wed, Thu, Fri, Sat, Sun Constraints: Minimum 30-minute window.
    */
  var PreferredMaintenanceWindow: js.UndefOr[String] = js.native
  /**
    * A list of virtual private cloud (VPC) security groups that the cluster will belong to.
    */
  var VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.native
}

object ModifyDBClusterMessage {
  @scala.inline
  def apply(
    DBClusterIdentifier: String,
    ApplyImmediately: js.UndefOr[scala.Boolean] = js.undefined,
    BackupRetentionPeriod: Int | Double = null,
    CloudwatchLogsExportConfiguration: CloudwatchLogsExportConfiguration = null,
    DBClusterParameterGroupName: String = null,
    DeletionProtection: js.UndefOr[scala.Boolean] = js.undefined,
    EngineVersion: String = null,
    MasterUserPassword: String = null,
    NewDBClusterIdentifier: String = null,
    Port: Int | Double = null,
    PreferredBackupWindow: String = null,
    PreferredMaintenanceWindow: String = null,
    VpcSecurityGroupIds: VpcSecurityGroupIdList = null
  ): ModifyDBClusterMessage = {
    val __obj = js.Dynamic.literal(DBClusterIdentifier = DBClusterIdentifier.asInstanceOf[js.Any])
    if (!js.isUndefined(ApplyImmediately)) __obj.updateDynamic("ApplyImmediately")(ApplyImmediately.asInstanceOf[js.Any])
    if (BackupRetentionPeriod != null) __obj.updateDynamic("BackupRetentionPeriod")(BackupRetentionPeriod.asInstanceOf[js.Any])
    if (CloudwatchLogsExportConfiguration != null) __obj.updateDynamic("CloudwatchLogsExportConfiguration")(CloudwatchLogsExportConfiguration.asInstanceOf[js.Any])
    if (DBClusterParameterGroupName != null) __obj.updateDynamic("DBClusterParameterGroupName")(DBClusterParameterGroupName.asInstanceOf[js.Any])
    if (!js.isUndefined(DeletionProtection)) __obj.updateDynamic("DeletionProtection")(DeletionProtection.asInstanceOf[js.Any])
    if (EngineVersion != null) __obj.updateDynamic("EngineVersion")(EngineVersion.asInstanceOf[js.Any])
    if (MasterUserPassword != null) __obj.updateDynamic("MasterUserPassword")(MasterUserPassword.asInstanceOf[js.Any])
    if (NewDBClusterIdentifier != null) __obj.updateDynamic("NewDBClusterIdentifier")(NewDBClusterIdentifier.asInstanceOf[js.Any])
    if (Port != null) __obj.updateDynamic("Port")(Port.asInstanceOf[js.Any])
    if (PreferredBackupWindow != null) __obj.updateDynamic("PreferredBackupWindow")(PreferredBackupWindow.asInstanceOf[js.Any])
    if (PreferredMaintenanceWindow != null) __obj.updateDynamic("PreferredMaintenanceWindow")(PreferredMaintenanceWindow.asInstanceOf[js.Any])
    if (VpcSecurityGroupIds != null) __obj.updateDynamic("VpcSecurityGroupIds")(VpcSecurityGroupIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyDBClusterMessage]
  }
}

