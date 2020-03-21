package typingsJapgolly.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DBEngineVersion extends js.Object {
  /**
    * The description of the database engine.
    */
  var DBEngineDescription: js.UndefOr[String] = js.native
  /**
    * The description of the database engine version.
    */
  var DBEngineVersionDescription: js.UndefOr[String] = js.native
  /**
    * The name of the DB parameter group family for the database engine.
    */
  var DBParameterGroupFamily: js.UndefOr[String] = js.native
  /**
    *  The default character set for new instances of this engine version, if the CharacterSetName parameter of the CreateDBInstance API isn't specified. 
    */
  var DefaultCharacterSet: js.UndefOr[CharacterSet] = js.native
  /**
    * The name of the database engine.
    */
  var Engine: js.UndefOr[String] = js.native
  /**
    * The version number of the database engine.
    */
  var EngineVersion: js.UndefOr[String] = js.native
  /**
    * The types of logs that the database engine has available for export to CloudWatch Logs.
    */
  var ExportableLogTypes: js.UndefOr[LogTypeList] = js.native
  /**
    * The status of the DB engine version, either available or deprecated.
    */
  var Status: js.UndefOr[String] = js.native
  /**
    *  A list of the character sets supported by this engine for the CharacterSetName parameter of the CreateDBInstance action. 
    */
  var SupportedCharacterSets: js.UndefOr[SupportedCharacterSetsList] = js.native
  /**
    * A list of the supported DB engine modes.
    */
  var SupportedEngineModes: js.UndefOr[EngineModeList] = js.native
  /**
    *  A list of features supported by the DB engine. Supported feature names include the following.    s3Import  
    */
  var SupportedFeatureNames: js.UndefOr[FeatureNameList] = js.native
  /**
    * A list of the time zones supported by this engine for the Timezone parameter of the CreateDBInstance action. 
    */
  var SupportedTimezones: js.UndefOr[SupportedTimezonesList] = js.native
  /**
    * A value that indicates whether the engine version supports exporting the log types specified by ExportableLogTypes to CloudWatch Logs.
    */
  var SupportsLogExportsToCloudwatchLogs: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether the database engine version supports Read Replicas.
    */
  var SupportsReadReplica: js.UndefOr[Boolean] = js.native
  /**
    * A list of engine versions that this database engine version can be upgraded to.
    */
  var ValidUpgradeTarget: js.UndefOr[ValidUpgradeTargetList] = js.native
}

object DBEngineVersion {
  @scala.inline
  def apply(
    DBEngineDescription: String = null,
    DBEngineVersionDescription: String = null,
    DBParameterGroupFamily: String = null,
    DefaultCharacterSet: CharacterSet = null,
    Engine: String = null,
    EngineVersion: String = null,
    ExportableLogTypes: LogTypeList = null,
    Status: String = null,
    SupportedCharacterSets: SupportedCharacterSetsList = null,
    SupportedEngineModes: EngineModeList = null,
    SupportedFeatureNames: FeatureNameList = null,
    SupportedTimezones: SupportedTimezonesList = null,
    SupportsLogExportsToCloudwatchLogs: js.UndefOr[scala.Boolean] = js.undefined,
    SupportsReadReplica: js.UndefOr[scala.Boolean] = js.undefined,
    ValidUpgradeTarget: ValidUpgradeTargetList = null
  ): DBEngineVersion = {
    val __obj = js.Dynamic.literal()
    if (DBEngineDescription != null) __obj.updateDynamic("DBEngineDescription")(DBEngineDescription.asInstanceOf[js.Any])
    if (DBEngineVersionDescription != null) __obj.updateDynamic("DBEngineVersionDescription")(DBEngineVersionDescription.asInstanceOf[js.Any])
    if (DBParameterGroupFamily != null) __obj.updateDynamic("DBParameterGroupFamily")(DBParameterGroupFamily.asInstanceOf[js.Any])
    if (DefaultCharacterSet != null) __obj.updateDynamic("DefaultCharacterSet")(DefaultCharacterSet.asInstanceOf[js.Any])
    if (Engine != null) __obj.updateDynamic("Engine")(Engine.asInstanceOf[js.Any])
    if (EngineVersion != null) __obj.updateDynamic("EngineVersion")(EngineVersion.asInstanceOf[js.Any])
    if (ExportableLogTypes != null) __obj.updateDynamic("ExportableLogTypes")(ExportableLogTypes.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (SupportedCharacterSets != null) __obj.updateDynamic("SupportedCharacterSets")(SupportedCharacterSets.asInstanceOf[js.Any])
    if (SupportedEngineModes != null) __obj.updateDynamic("SupportedEngineModes")(SupportedEngineModes.asInstanceOf[js.Any])
    if (SupportedFeatureNames != null) __obj.updateDynamic("SupportedFeatureNames")(SupportedFeatureNames.asInstanceOf[js.Any])
    if (SupportedTimezones != null) __obj.updateDynamic("SupportedTimezones")(SupportedTimezones.asInstanceOf[js.Any])
    if (!js.isUndefined(SupportsLogExportsToCloudwatchLogs)) __obj.updateDynamic("SupportsLogExportsToCloudwatchLogs")(SupportsLogExportsToCloudwatchLogs.asInstanceOf[js.Any])
    if (!js.isUndefined(SupportsReadReplica)) __obj.updateDynamic("SupportsReadReplica")(SupportsReadReplica.asInstanceOf[js.Any])
    if (ValidUpgradeTarget != null) __obj.updateDynamic("ValidUpgradeTarget")(ValidUpgradeTarget.asInstanceOf[js.Any])
    __obj.asInstanceOf[DBEngineVersion]
  }
}

