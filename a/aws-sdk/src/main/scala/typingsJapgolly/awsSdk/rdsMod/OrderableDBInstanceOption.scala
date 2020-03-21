package typingsJapgolly.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrderableDBInstanceOption extends js.Object {
  /**
    * A list of Availability Zones for a DB instance.
    */
  var AvailabilityZones: js.UndefOr[AvailabilityZoneList] = js.native
  /**
    * A list of the available processor features for the DB instance class of a DB instance.
    */
  var AvailableProcessorFeatures: js.UndefOr[AvailableProcessorFeatureList] = js.native
  /**
    * The DB instance class for a DB instance.
    */
  var DBInstanceClass: js.UndefOr[String] = js.native
  /**
    * The engine type of a DB instance.
    */
  var Engine: js.UndefOr[String] = js.native
  /**
    * The engine version of a DB instance.
    */
  var EngineVersion: js.UndefOr[String] = js.native
  /**
    * The license model for a DB instance.
    */
  var LicenseModel: js.UndefOr[String] = js.native
  /**
    * Maximum total provisioned IOPS for a DB instance.
    */
  var MaxIopsPerDbInstance: js.UndefOr[IntegerOptional] = js.native
  /**
    * Maximum provisioned IOPS per GiB for a DB instance.
    */
  var MaxIopsPerGib: js.UndefOr[DoubleOptional] = js.native
  /**
    * Maximum storage size for a DB instance.
    */
  var MaxStorageSize: js.UndefOr[IntegerOptional] = js.native
  /**
    * Minimum total provisioned IOPS for a DB instance.
    */
  var MinIopsPerDbInstance: js.UndefOr[IntegerOptional] = js.native
  /**
    * Minimum provisioned IOPS per GiB for a DB instance.
    */
  var MinIopsPerGib: js.UndefOr[DoubleOptional] = js.native
  /**
    * Minimum storage size for a DB instance.
    */
  var MinStorageSize: js.UndefOr[IntegerOptional] = js.native
  /**
    * Indicates whether a DB instance is Multi-AZ capable.
    */
  var MultiAZCapable: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether a DB instance can have a Read Replica.
    */
  var ReadReplicaCapable: js.UndefOr[Boolean] = js.native
  /**
    * Indicates the storage type for a DB instance.
    */
  var StorageType: js.UndefOr[String] = js.native
  /**
    * A list of the supported DB engine modes.
    */
  var SupportedEngineModes: js.UndefOr[EngineModeList] = js.native
  /**
    * Indicates whether a DB instance supports Enhanced Monitoring at intervals from 1 to 60 seconds.
    */
  var SupportsEnhancedMonitoring: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether a DB instance supports IAM database authentication.
    */
  var SupportsIAMDatabaseAuthentication: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether a DB instance supports provisioned IOPS.
    */
  var SupportsIops: js.UndefOr[Boolean] = js.native
  /**
    * Whether a DB instance supports Kerberos Authentication.
    */
  var SupportsKerberosAuthentication: js.UndefOr[BooleanOptional] = js.native
  /**
    * True if a DB instance supports Performance Insights, otherwise false.
    */
  var SupportsPerformanceInsights: js.UndefOr[Boolean] = js.native
  /**
    * Whether or not Amazon RDS can automatically scale storage for DB instances that use the specified instance class.
    */
  var SupportsStorageAutoscaling: js.UndefOr[BooleanOptional] = js.native
  /**
    * Indicates whether a DB instance supports encrypted storage.
    */
  var SupportsStorageEncryption: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether a DB instance is in a VPC.
    */
  var Vpc: js.UndefOr[Boolean] = js.native
}

object OrderableDBInstanceOption {
  @scala.inline
  def apply(
    AvailabilityZones: AvailabilityZoneList = null,
    AvailableProcessorFeatures: AvailableProcessorFeatureList = null,
    DBInstanceClass: String = null,
    Engine: String = null,
    EngineVersion: String = null,
    LicenseModel: String = null,
    MaxIopsPerDbInstance: Int | scala.Double = null,
    MaxIopsPerGib: Int | scala.Double = null,
    MaxStorageSize: Int | scala.Double = null,
    MinIopsPerDbInstance: Int | scala.Double = null,
    MinIopsPerGib: Int | scala.Double = null,
    MinStorageSize: Int | scala.Double = null,
    MultiAZCapable: js.UndefOr[scala.Boolean] = js.undefined,
    ReadReplicaCapable: js.UndefOr[scala.Boolean] = js.undefined,
    StorageType: String = null,
    SupportedEngineModes: EngineModeList = null,
    SupportsEnhancedMonitoring: js.UndefOr[scala.Boolean] = js.undefined,
    SupportsIAMDatabaseAuthentication: js.UndefOr[scala.Boolean] = js.undefined,
    SupportsIops: js.UndefOr[scala.Boolean] = js.undefined,
    SupportsKerberosAuthentication: js.UndefOr[scala.Boolean] = js.undefined,
    SupportsPerformanceInsights: js.UndefOr[scala.Boolean] = js.undefined,
    SupportsStorageAutoscaling: js.UndefOr[scala.Boolean] = js.undefined,
    SupportsStorageEncryption: js.UndefOr[scala.Boolean] = js.undefined,
    Vpc: js.UndefOr[scala.Boolean] = js.undefined
  ): OrderableDBInstanceOption = {
    val __obj = js.Dynamic.literal()
    if (AvailabilityZones != null) __obj.updateDynamic("AvailabilityZones")(AvailabilityZones.asInstanceOf[js.Any])
    if (AvailableProcessorFeatures != null) __obj.updateDynamic("AvailableProcessorFeatures")(AvailableProcessorFeatures.asInstanceOf[js.Any])
    if (DBInstanceClass != null) __obj.updateDynamic("DBInstanceClass")(DBInstanceClass.asInstanceOf[js.Any])
    if (Engine != null) __obj.updateDynamic("Engine")(Engine.asInstanceOf[js.Any])
    if (EngineVersion != null) __obj.updateDynamic("EngineVersion")(EngineVersion.asInstanceOf[js.Any])
    if (LicenseModel != null) __obj.updateDynamic("LicenseModel")(LicenseModel.asInstanceOf[js.Any])
    if (MaxIopsPerDbInstance != null) __obj.updateDynamic("MaxIopsPerDbInstance")(MaxIopsPerDbInstance.asInstanceOf[js.Any])
    if (MaxIopsPerGib != null) __obj.updateDynamic("MaxIopsPerGib")(MaxIopsPerGib.asInstanceOf[js.Any])
    if (MaxStorageSize != null) __obj.updateDynamic("MaxStorageSize")(MaxStorageSize.asInstanceOf[js.Any])
    if (MinIopsPerDbInstance != null) __obj.updateDynamic("MinIopsPerDbInstance")(MinIopsPerDbInstance.asInstanceOf[js.Any])
    if (MinIopsPerGib != null) __obj.updateDynamic("MinIopsPerGib")(MinIopsPerGib.asInstanceOf[js.Any])
    if (MinStorageSize != null) __obj.updateDynamic("MinStorageSize")(MinStorageSize.asInstanceOf[js.Any])
    if (!js.isUndefined(MultiAZCapable)) __obj.updateDynamic("MultiAZCapable")(MultiAZCapable.asInstanceOf[js.Any])
    if (!js.isUndefined(ReadReplicaCapable)) __obj.updateDynamic("ReadReplicaCapable")(ReadReplicaCapable.asInstanceOf[js.Any])
    if (StorageType != null) __obj.updateDynamic("StorageType")(StorageType.asInstanceOf[js.Any])
    if (SupportedEngineModes != null) __obj.updateDynamic("SupportedEngineModes")(SupportedEngineModes.asInstanceOf[js.Any])
    if (!js.isUndefined(SupportsEnhancedMonitoring)) __obj.updateDynamic("SupportsEnhancedMonitoring")(SupportsEnhancedMonitoring.asInstanceOf[js.Any])
    if (!js.isUndefined(SupportsIAMDatabaseAuthentication)) __obj.updateDynamic("SupportsIAMDatabaseAuthentication")(SupportsIAMDatabaseAuthentication.asInstanceOf[js.Any])
    if (!js.isUndefined(SupportsIops)) __obj.updateDynamic("SupportsIops")(SupportsIops.asInstanceOf[js.Any])
    if (!js.isUndefined(SupportsKerberosAuthentication)) __obj.updateDynamic("SupportsKerberosAuthentication")(SupportsKerberosAuthentication.asInstanceOf[js.Any])
    if (!js.isUndefined(SupportsPerformanceInsights)) __obj.updateDynamic("SupportsPerformanceInsights")(SupportsPerformanceInsights.asInstanceOf[js.Any])
    if (!js.isUndefined(SupportsStorageAutoscaling)) __obj.updateDynamic("SupportsStorageAutoscaling")(SupportsStorageAutoscaling.asInstanceOf[js.Any])
    if (!js.isUndefined(SupportsStorageEncryption)) __obj.updateDynamic("SupportsStorageEncryption")(SupportsStorageEncryption.asInstanceOf[js.Any])
    if (!js.isUndefined(Vpc)) __obj.updateDynamic("Vpc")(Vpc.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrderableDBInstanceOption]
  }
}

