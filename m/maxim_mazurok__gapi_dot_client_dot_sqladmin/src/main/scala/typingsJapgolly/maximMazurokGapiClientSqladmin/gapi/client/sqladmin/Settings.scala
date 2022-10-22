package typingsJapgolly.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Settings extends StObject {
  
  /**
    * The activation policy specifies when the instance is activated; it is applicable only when the instance state is RUNNABLE. Valid values: * `ALWAYS`: The instance is on, and remains
    * so even in the absence of connection requests. * `NEVER`: The instance is off; it is not activated, even if a connection request arrives.
    */
  var activationPolicy: js.UndefOr[String] = js.undefined
  
  /** Active Directory configuration, relevant only for Cloud SQL for SQL Server. */
  var activeDirectoryConfig: js.UndefOr[SqlActiveDirectoryConfig] = js.undefined
  
  /** The App Engine app IDs that can access this instance. (Deprecated) Applied to First Generation instances only. */
  var authorizedGaeApplications: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Availability type. Potential values: * `ZONAL`: The instance serves data from only one zone. Outages in that zone affect data accessibility. * `REGIONAL`: The instance can serve
    * data from more than one zone in a region (it is highly available)./ For more information, see [Overview of the High Availability
    * Configuration](https://cloud.google.com/sql/docs/mysql/high-availability).
    */
  var availabilityType: js.UndefOr[String] = js.undefined
  
  /** The daily backup configuration for the instance. */
  var backupConfiguration: js.UndefOr[BackupConfiguration] = js.undefined
  
  /** The name of server Instance collation. */
  var collation: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies if connections must use Cloud SQL connectors. Option values include the following: * `NOT_REQUIRED`: Cloud SQL instances can be connected without Cloud SQL Connectors. *
    * `REQUIRED`: Only allow connections that use Cloud SQL Connectors. Note that using REQUIRED disables all existing authorized networks. If this field is not specified when creating a
    * new instance, NOT_REQUIRED is used. If this field is not specified when patching or updating an existing instance, it is left unchanged in the instance.
    */
  var connectorEnforcement: js.UndefOr[String] = js.undefined
  
  /**
    * Configuration specific to read replica instances. Indicates whether database flags for crash-safe replication are enabled. This property was only applicable to First Generation
    * instances.
    */
  var crashSafeReplicationEnabled: js.UndefOr[Boolean] = js.undefined
  
  /** The size of data disk, in GB. The data disk size minimum is 10GB. */
  var dataDiskSizeGb: js.UndefOr[String] = js.undefined
  
  /** The type of data disk: `PD_SSD` (default) or `PD_HDD`. Not used for First Generation instances. */
  var dataDiskType: js.UndefOr[String] = js.undefined
  
  /** The database flags passed to the instance at startup. */
  var databaseFlags: js.UndefOr[js.Array[DatabaseFlags]] = js.undefined
  
  /** Configuration specific to read replica instances. Indicates whether replication is enabled or not. WARNING: Changing this restarts the instance. */
  var databaseReplicationEnabled: js.UndefOr[Boolean] = js.undefined
  
  /** Configuration to protect against accidental instance deletion. */
  var deletionProtectionEnabled: js.UndefOr[Boolean] = js.undefined
  
  /** Deny maintenance periods */
  var denyMaintenancePeriods: js.UndefOr[js.Array[DenyMaintenancePeriod]] = js.undefined
  
  /** Insights configuration, for now relevant only for Postgres. */
  var insightsConfig: js.UndefOr[InsightsConfig] = js.undefined
  
  /**
    * The settings for IP Management. This allows to enable or disable the instance IP and manage which external networks can connect to the instance. The IPv4 address cannot be disabled
    * for Second Generation instances.
    */
  var ipConfiguration: js.UndefOr[IpConfiguration] = js.undefined
  
  /** This is always `sql#settings`. */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The location preference settings. This allows the instance to be located as near as possible to either an App Engine app or Compute Engine zone for better performance. App Engine
    * co-location was only applicable to First Generation instances.
    */
  var locationPreference: js.UndefOr[LocationPreference] = js.undefined
  
  /** The maintenance window for this instance. This specifies when the instance can be restarted for maintenance purposes. */
  var maintenanceWindow: js.UndefOr[MaintenanceWindow] = js.undefined
  
  /** The local user password validation policy of the instance. */
  var passwordValidationPolicy: js.UndefOr[PasswordValidationPolicy] = js.undefined
  
  /** The pricing plan for this instance. This can be either `PER_USE` or `PACKAGE`. Only `PER_USE` is supported for Second Generation instances. */
  var pricingPlan: js.UndefOr[String] = js.undefined
  
  /** The type of replication this instance uses. This can be either `ASYNCHRONOUS` or `SYNCHRONOUS`. (Deprecated) This property was only applicable to First Generation instances. */
  var replicationType: js.UndefOr[String] = js.undefined
  
  /**
    * The version of instance settings. This is a required field for update method to make sure concurrent updates are handled properly. During update, use the most recent settingsVersion
    * value for this instance and do not try to update this value.
    */
  var settingsVersion: js.UndefOr[String] = js.undefined
  
  /** SQL Server specific audit configuration. */
  var sqlServerAuditConfig: js.UndefOr[SqlServerAuditConfig] = js.undefined
  
  /** Configuration to increase storage size automatically. The default value is true. */
  var storageAutoResize: js.UndefOr[Boolean] = js.undefined
  
  /** The maximum size to which storage capacity can be automatically increased. The default value is 0, which specifies that there is no limit. */
  var storageAutoResizeLimit: js.UndefOr[String] = js.undefined
  
  /** The tier (or machine type) for this instance, for example `db-custom-1-3840`. WARNING: Changing this restarts the instance. */
  var tier: js.UndefOr[String] = js.undefined
  
  /** User-provided labels, represented as a dictionary where each label is a single key value pair. */
  var userLabels: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
}
object Settings {
  
  inline def apply(): Settings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Settings]
  }
  
  extension [Self <: Settings](x: Self) {
    
    inline def setActivationPolicy(value: String): Self = StObject.set(x, "activationPolicy", value.asInstanceOf[js.Any])
    
    inline def setActivationPolicyUndefined: Self = StObject.set(x, "activationPolicy", js.undefined)
    
    inline def setActiveDirectoryConfig(value: SqlActiveDirectoryConfig): Self = StObject.set(x, "activeDirectoryConfig", value.asInstanceOf[js.Any])
    
    inline def setActiveDirectoryConfigUndefined: Self = StObject.set(x, "activeDirectoryConfig", js.undefined)
    
    inline def setAuthorizedGaeApplications(value: js.Array[String]): Self = StObject.set(x, "authorizedGaeApplications", value.asInstanceOf[js.Any])
    
    inline def setAuthorizedGaeApplicationsUndefined: Self = StObject.set(x, "authorizedGaeApplications", js.undefined)
    
    inline def setAuthorizedGaeApplicationsVarargs(value: String*): Self = StObject.set(x, "authorizedGaeApplications", js.Array(value*))
    
    inline def setAvailabilityType(value: String): Self = StObject.set(x, "availabilityType", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityTypeUndefined: Self = StObject.set(x, "availabilityType", js.undefined)
    
    inline def setBackupConfiguration(value: BackupConfiguration): Self = StObject.set(x, "backupConfiguration", value.asInstanceOf[js.Any])
    
    inline def setBackupConfigurationUndefined: Self = StObject.set(x, "backupConfiguration", js.undefined)
    
    inline def setCollation(value: String): Self = StObject.set(x, "collation", value.asInstanceOf[js.Any])
    
    inline def setCollationUndefined: Self = StObject.set(x, "collation", js.undefined)
    
    inline def setConnectorEnforcement(value: String): Self = StObject.set(x, "connectorEnforcement", value.asInstanceOf[js.Any])
    
    inline def setConnectorEnforcementUndefined: Self = StObject.set(x, "connectorEnforcement", js.undefined)
    
    inline def setCrashSafeReplicationEnabled(value: Boolean): Self = StObject.set(x, "crashSafeReplicationEnabled", value.asInstanceOf[js.Any])
    
    inline def setCrashSafeReplicationEnabledUndefined: Self = StObject.set(x, "crashSafeReplicationEnabled", js.undefined)
    
    inline def setDataDiskSizeGb(value: String): Self = StObject.set(x, "dataDiskSizeGb", value.asInstanceOf[js.Any])
    
    inline def setDataDiskSizeGbUndefined: Self = StObject.set(x, "dataDiskSizeGb", js.undefined)
    
    inline def setDataDiskType(value: String): Self = StObject.set(x, "dataDiskType", value.asInstanceOf[js.Any])
    
    inline def setDataDiskTypeUndefined: Self = StObject.set(x, "dataDiskType", js.undefined)
    
    inline def setDatabaseFlags(value: js.Array[DatabaseFlags]): Self = StObject.set(x, "databaseFlags", value.asInstanceOf[js.Any])
    
    inline def setDatabaseFlagsUndefined: Self = StObject.set(x, "databaseFlags", js.undefined)
    
    inline def setDatabaseFlagsVarargs(value: DatabaseFlags*): Self = StObject.set(x, "databaseFlags", js.Array(value*))
    
    inline def setDatabaseReplicationEnabled(value: Boolean): Self = StObject.set(x, "databaseReplicationEnabled", value.asInstanceOf[js.Any])
    
    inline def setDatabaseReplicationEnabledUndefined: Self = StObject.set(x, "databaseReplicationEnabled", js.undefined)
    
    inline def setDeletionProtectionEnabled(value: Boolean): Self = StObject.set(x, "deletionProtectionEnabled", value.asInstanceOf[js.Any])
    
    inline def setDeletionProtectionEnabledUndefined: Self = StObject.set(x, "deletionProtectionEnabled", js.undefined)
    
    inline def setDenyMaintenancePeriods(value: js.Array[DenyMaintenancePeriod]): Self = StObject.set(x, "denyMaintenancePeriods", value.asInstanceOf[js.Any])
    
    inline def setDenyMaintenancePeriodsUndefined: Self = StObject.set(x, "denyMaintenancePeriods", js.undefined)
    
    inline def setDenyMaintenancePeriodsVarargs(value: DenyMaintenancePeriod*): Self = StObject.set(x, "denyMaintenancePeriods", js.Array(value*))
    
    inline def setInsightsConfig(value: InsightsConfig): Self = StObject.set(x, "insightsConfig", value.asInstanceOf[js.Any])
    
    inline def setInsightsConfigUndefined: Self = StObject.set(x, "insightsConfig", js.undefined)
    
    inline def setIpConfiguration(value: IpConfiguration): Self = StObject.set(x, "ipConfiguration", value.asInstanceOf[js.Any])
    
    inline def setIpConfigurationUndefined: Self = StObject.set(x, "ipConfiguration", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLocationPreference(value: LocationPreference): Self = StObject.set(x, "locationPreference", value.asInstanceOf[js.Any])
    
    inline def setLocationPreferenceUndefined: Self = StObject.set(x, "locationPreference", js.undefined)
    
    inline def setMaintenanceWindow(value: MaintenanceWindow): Self = StObject.set(x, "maintenanceWindow", value.asInstanceOf[js.Any])
    
    inline def setMaintenanceWindowUndefined: Self = StObject.set(x, "maintenanceWindow", js.undefined)
    
    inline def setPasswordValidationPolicy(value: PasswordValidationPolicy): Self = StObject.set(x, "passwordValidationPolicy", value.asInstanceOf[js.Any])
    
    inline def setPasswordValidationPolicyUndefined: Self = StObject.set(x, "passwordValidationPolicy", js.undefined)
    
    inline def setPricingPlan(value: String): Self = StObject.set(x, "pricingPlan", value.asInstanceOf[js.Any])
    
    inline def setPricingPlanUndefined: Self = StObject.set(x, "pricingPlan", js.undefined)
    
    inline def setReplicationType(value: String): Self = StObject.set(x, "replicationType", value.asInstanceOf[js.Any])
    
    inline def setReplicationTypeUndefined: Self = StObject.set(x, "replicationType", js.undefined)
    
    inline def setSettingsVersion(value: String): Self = StObject.set(x, "settingsVersion", value.asInstanceOf[js.Any])
    
    inline def setSettingsVersionUndefined: Self = StObject.set(x, "settingsVersion", js.undefined)
    
    inline def setSqlServerAuditConfig(value: SqlServerAuditConfig): Self = StObject.set(x, "sqlServerAuditConfig", value.asInstanceOf[js.Any])
    
    inline def setSqlServerAuditConfigUndefined: Self = StObject.set(x, "sqlServerAuditConfig", js.undefined)
    
    inline def setStorageAutoResize(value: Boolean): Self = StObject.set(x, "storageAutoResize", value.asInstanceOf[js.Any])
    
    inline def setStorageAutoResizeLimit(value: String): Self = StObject.set(x, "storageAutoResizeLimit", value.asInstanceOf[js.Any])
    
    inline def setStorageAutoResizeLimitUndefined: Self = StObject.set(x, "storageAutoResizeLimit", js.undefined)
    
    inline def setStorageAutoResizeUndefined: Self = StObject.set(x, "storageAutoResize", js.undefined)
    
    inline def setTier(value: String): Self = StObject.set(x, "tier", value.asInstanceOf[js.Any])
    
    inline def setTierUndefined: Self = StObject.set(x, "tier", js.undefined)
    
    inline def setUserLabels(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "userLabels", value.asInstanceOf[js.Any])
    
    inline def setUserLabelsUndefined: Self = StObject.set(x, "userLabels", js.undefined)
  }
}
