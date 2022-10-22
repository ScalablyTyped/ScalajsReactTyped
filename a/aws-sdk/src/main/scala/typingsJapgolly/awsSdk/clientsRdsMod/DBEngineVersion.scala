package typingsJapgolly.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DBEngineVersion extends StObject {
  
  /**
    * The creation time of the DB engine version.
    */
  var CreateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The description of the database engine.
    */
  var DBEngineDescription: js.UndefOr[String] = js.undefined
  
  /**
    * The ARN of the custom engine version.
    */
  var DBEngineVersionArn: js.UndefOr[String] = js.undefined
  
  /**
    * The description of the database engine version.
    */
  var DBEngineVersionDescription: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the DB parameter group family for the database engine.
    */
  var DBParameterGroupFamily: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the Amazon S3 bucket that contains your database installation files.
    */
  var DatabaseInstallationFilesS3BucketName: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon S3 directory that contains the database installation files. If not specified, then no prefix is assumed.
    */
  var DatabaseInstallationFilesS3Prefix: js.UndefOr[String] = js.undefined
  
  /**
    * The default character set for new instances of this engine version, if the CharacterSetName parameter of the CreateDBInstance API isn't specified.
    */
  var DefaultCharacterSet: js.UndefOr[CharacterSet] = js.undefined
  
  /**
    * The name of the database engine.
    */
  var Engine: js.UndefOr[String] = js.undefined
  
  /**
    * The version number of the database engine.
    */
  var EngineVersion: js.UndefOr[String] = js.undefined
  
  /**
    * The types of logs that the database engine has available for export to CloudWatch Logs.
    */
  var ExportableLogTypes: js.UndefOr[LogTypeList] = js.undefined
  
  /**
    * The Amazon Web Services KMS key identifier for an encrypted CEV. This parameter is required for RDS Custom, but optional for Amazon RDS.
    */
  var KMSKeyId: js.UndefOr[String] = js.undefined
  
  /**
    * The major engine version of the CEV.
    */
  var MajorEngineVersion: js.UndefOr[String] = js.undefined
  
  /**
    * The status of the DB engine version, either available or deprecated.
    */
  var Status: js.UndefOr[String] = js.undefined
  
  /**
    * A list of the character sets supported by this engine for the CharacterSetName parameter of the CreateDBInstance operation.
    */
  var SupportedCharacterSets: js.UndefOr[SupportedCharacterSetsList] = js.undefined
  
  /**
    * A list of the supported DB engine modes.
    */
  var SupportedEngineModes: js.UndefOr[EngineModeList] = js.undefined
  
  /**
    * A list of features supported by the DB engine. The supported features vary by DB engine and DB engine version. To determine the supported features for a specific DB engine and DB engine version using the CLI, use the following command:  aws rds describe-db-engine-versions --engine &lt;engine_name&gt; --engine-version &lt;engine_version&gt;  For example, to determine the supported features for RDS for PostgreSQL version 13.3 using the CLI, use the following command:  aws rds describe-db-engine-versions --engine postgres --engine-version 13.3  The supported features are listed under SupportedFeatureNames in the output.
    */
  var SupportedFeatureNames: js.UndefOr[FeatureNameList] = js.undefined
  
  /**
    * A list of the character sets supported by the Oracle DB engine for the NcharCharacterSetName parameter of the CreateDBInstance operation.
    */
  var SupportedNcharCharacterSets: js.UndefOr[SupportedCharacterSetsList] = js.undefined
  
  /**
    * A list of the time zones supported by this engine for the Timezone parameter of the CreateDBInstance action.
    */
  var SupportedTimezones: js.UndefOr[SupportedTimezonesList] = js.undefined
  
  /**
    * A value that indicates whether the engine version supports Babelfish for Aurora PostgreSQL.
    */
  var SupportsBabelfish: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A value that indicates whether you can use Aurora global databases with a specific DB engine version.
    */
  var SupportsGlobalDatabases: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A value that indicates whether the engine version supports exporting the log types specified by ExportableLogTypes to CloudWatch Logs.
    */
  var SupportsLogExportsToCloudwatchLogs: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A value that indicates whether you can use Aurora parallel query with a specific DB engine version.
    */
  var SupportsParallelQuery: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether the database engine version supports read replicas.
    */
  var SupportsReadReplica: js.UndefOr[Boolean] = js.undefined
  
  var TagList: js.UndefOr[typingsJapgolly.awsSdk.clientsRdsMod.TagList] = js.undefined
  
  /**
    * A list of engine versions that this database engine version can be upgraded to.
    */
  var ValidUpgradeTarget: js.UndefOr[ValidUpgradeTargetList] = js.undefined
}
object DBEngineVersion {
  
  inline def apply(): DBEngineVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBEngineVersion]
  }
  
  extension [Self <: DBEngineVersion](x: Self) {
    
    inline def setCreateTime(value: js.Date): Self = StObject.set(x, "CreateTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "CreateTime", js.undefined)
    
    inline def setDBEngineDescription(value: String): Self = StObject.set(x, "DBEngineDescription", value.asInstanceOf[js.Any])
    
    inline def setDBEngineDescriptionUndefined: Self = StObject.set(x, "DBEngineDescription", js.undefined)
    
    inline def setDBEngineVersionArn(value: String): Self = StObject.set(x, "DBEngineVersionArn", value.asInstanceOf[js.Any])
    
    inline def setDBEngineVersionArnUndefined: Self = StObject.set(x, "DBEngineVersionArn", js.undefined)
    
    inline def setDBEngineVersionDescription(value: String): Self = StObject.set(x, "DBEngineVersionDescription", value.asInstanceOf[js.Any])
    
    inline def setDBEngineVersionDescriptionUndefined: Self = StObject.set(x, "DBEngineVersionDescription", js.undefined)
    
    inline def setDBParameterGroupFamily(value: String): Self = StObject.set(x, "DBParameterGroupFamily", value.asInstanceOf[js.Any])
    
    inline def setDBParameterGroupFamilyUndefined: Self = StObject.set(x, "DBParameterGroupFamily", js.undefined)
    
    inline def setDatabaseInstallationFilesS3BucketName(value: String): Self = StObject.set(x, "DatabaseInstallationFilesS3BucketName", value.asInstanceOf[js.Any])
    
    inline def setDatabaseInstallationFilesS3BucketNameUndefined: Self = StObject.set(x, "DatabaseInstallationFilesS3BucketName", js.undefined)
    
    inline def setDatabaseInstallationFilesS3Prefix(value: String): Self = StObject.set(x, "DatabaseInstallationFilesS3Prefix", value.asInstanceOf[js.Any])
    
    inline def setDatabaseInstallationFilesS3PrefixUndefined: Self = StObject.set(x, "DatabaseInstallationFilesS3Prefix", js.undefined)
    
    inline def setDefaultCharacterSet(value: CharacterSet): Self = StObject.set(x, "DefaultCharacterSet", value.asInstanceOf[js.Any])
    
    inline def setDefaultCharacterSetUndefined: Self = StObject.set(x, "DefaultCharacterSet", js.undefined)
    
    inline def setEngine(value: String): Self = StObject.set(x, "Engine", value.asInstanceOf[js.Any])
    
    inline def setEngineUndefined: Self = StObject.set(x, "Engine", js.undefined)
    
    inline def setEngineVersion(value: String): Self = StObject.set(x, "EngineVersion", value.asInstanceOf[js.Any])
    
    inline def setEngineVersionUndefined: Self = StObject.set(x, "EngineVersion", js.undefined)
    
    inline def setExportableLogTypes(value: LogTypeList): Self = StObject.set(x, "ExportableLogTypes", value.asInstanceOf[js.Any])
    
    inline def setExportableLogTypesUndefined: Self = StObject.set(x, "ExportableLogTypes", js.undefined)
    
    inline def setExportableLogTypesVarargs(value: String*): Self = StObject.set(x, "ExportableLogTypes", js.Array(value*))
    
    inline def setKMSKeyId(value: String): Self = StObject.set(x, "KMSKeyId", value.asInstanceOf[js.Any])
    
    inline def setKMSKeyIdUndefined: Self = StObject.set(x, "KMSKeyId", js.undefined)
    
    inline def setMajorEngineVersion(value: String): Self = StObject.set(x, "MajorEngineVersion", value.asInstanceOf[js.Any])
    
    inline def setMajorEngineVersionUndefined: Self = StObject.set(x, "MajorEngineVersion", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setSupportedCharacterSets(value: SupportedCharacterSetsList): Self = StObject.set(x, "SupportedCharacterSets", value.asInstanceOf[js.Any])
    
    inline def setSupportedCharacterSetsUndefined: Self = StObject.set(x, "SupportedCharacterSets", js.undefined)
    
    inline def setSupportedCharacterSetsVarargs(value: CharacterSet*): Self = StObject.set(x, "SupportedCharacterSets", js.Array(value*))
    
    inline def setSupportedEngineModes(value: EngineModeList): Self = StObject.set(x, "SupportedEngineModes", value.asInstanceOf[js.Any])
    
    inline def setSupportedEngineModesUndefined: Self = StObject.set(x, "SupportedEngineModes", js.undefined)
    
    inline def setSupportedEngineModesVarargs(value: String*): Self = StObject.set(x, "SupportedEngineModes", js.Array(value*))
    
    inline def setSupportedFeatureNames(value: FeatureNameList): Self = StObject.set(x, "SupportedFeatureNames", value.asInstanceOf[js.Any])
    
    inline def setSupportedFeatureNamesUndefined: Self = StObject.set(x, "SupportedFeatureNames", js.undefined)
    
    inline def setSupportedFeatureNamesVarargs(value: String*): Self = StObject.set(x, "SupportedFeatureNames", js.Array(value*))
    
    inline def setSupportedNcharCharacterSets(value: SupportedCharacterSetsList): Self = StObject.set(x, "SupportedNcharCharacterSets", value.asInstanceOf[js.Any])
    
    inline def setSupportedNcharCharacterSetsUndefined: Self = StObject.set(x, "SupportedNcharCharacterSets", js.undefined)
    
    inline def setSupportedNcharCharacterSetsVarargs(value: CharacterSet*): Self = StObject.set(x, "SupportedNcharCharacterSets", js.Array(value*))
    
    inline def setSupportedTimezones(value: SupportedTimezonesList): Self = StObject.set(x, "SupportedTimezones", value.asInstanceOf[js.Any])
    
    inline def setSupportedTimezonesUndefined: Self = StObject.set(x, "SupportedTimezones", js.undefined)
    
    inline def setSupportedTimezonesVarargs(value: Timezone*): Self = StObject.set(x, "SupportedTimezones", js.Array(value*))
    
    inline def setSupportsBabelfish(value: Boolean): Self = StObject.set(x, "SupportsBabelfish", value.asInstanceOf[js.Any])
    
    inline def setSupportsBabelfishUndefined: Self = StObject.set(x, "SupportsBabelfish", js.undefined)
    
    inline def setSupportsGlobalDatabases(value: Boolean): Self = StObject.set(x, "SupportsGlobalDatabases", value.asInstanceOf[js.Any])
    
    inline def setSupportsGlobalDatabasesUndefined: Self = StObject.set(x, "SupportsGlobalDatabases", js.undefined)
    
    inline def setSupportsLogExportsToCloudwatchLogs(value: Boolean): Self = StObject.set(x, "SupportsLogExportsToCloudwatchLogs", value.asInstanceOf[js.Any])
    
    inline def setSupportsLogExportsToCloudwatchLogsUndefined: Self = StObject.set(x, "SupportsLogExportsToCloudwatchLogs", js.undefined)
    
    inline def setSupportsParallelQuery(value: Boolean): Self = StObject.set(x, "SupportsParallelQuery", value.asInstanceOf[js.Any])
    
    inline def setSupportsParallelQueryUndefined: Self = StObject.set(x, "SupportsParallelQuery", js.undefined)
    
    inline def setSupportsReadReplica(value: Boolean): Self = StObject.set(x, "SupportsReadReplica", value.asInstanceOf[js.Any])
    
    inline def setSupportsReadReplicaUndefined: Self = StObject.set(x, "SupportsReadReplica", js.undefined)
    
    inline def setTagList(value: TagList): Self = StObject.set(x, "TagList", value.asInstanceOf[js.Any])
    
    inline def setTagListUndefined: Self = StObject.set(x, "TagList", js.undefined)
    
    inline def setTagListVarargs(value: Tag*): Self = StObject.set(x, "TagList", js.Array(value*))
    
    inline def setValidUpgradeTarget(value: ValidUpgradeTargetList): Self = StObject.set(x, "ValidUpgradeTarget", value.asInstanceOf[js.Any])
    
    inline def setValidUpgradeTargetUndefined: Self = StObject.set(x, "ValidUpgradeTarget", js.undefined)
    
    inline def setValidUpgradeTargetVarargs(value: UpgradeTarget*): Self = StObject.set(x, "ValidUpgradeTarget", js.Array(value*))
  }
}
