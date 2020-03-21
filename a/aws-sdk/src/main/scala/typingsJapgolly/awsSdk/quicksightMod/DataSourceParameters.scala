package typingsJapgolly.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSourceParameters extends js.Object {
  /**
    * Amazon Elasticsearch Service parameters.
    */
  var AmazonElasticsearchParameters: js.UndefOr[typingsJapgolly.awsSdk.quicksightMod.AmazonElasticsearchParameters] = js.native
  /**
    * Amazon Athena parameters.
    */
  var AthenaParameters: js.UndefOr[typingsJapgolly.awsSdk.quicksightMod.AthenaParameters] = js.native
  /**
    * Amazon Aurora MySQL parameters.
    */
  var AuroraParameters: js.UndefOr[typingsJapgolly.awsSdk.quicksightMod.AuroraParameters] = js.native
  /**
    * Aurora PostgreSQL parameters.
    */
  var AuroraPostgreSqlParameters: js.UndefOr[typingsJapgolly.awsSdk.quicksightMod.AuroraPostgreSqlParameters] = js.native
  /**
    * AWS IoT Analytics parameters.
    */
  var AwsIotAnalyticsParameters: js.UndefOr[typingsJapgolly.awsSdk.quicksightMod.AwsIotAnalyticsParameters] = js.native
  /**
    * Jira parameters.
    */
  var JiraParameters: js.UndefOr[typingsJapgolly.awsSdk.quicksightMod.JiraParameters] = js.native
  /**
    * MariaDB parameters.
    */
  var MariaDbParameters: js.UndefOr[typingsJapgolly.awsSdk.quicksightMod.MariaDbParameters] = js.native
  /**
    * MySQL parameters.
    */
  var MySqlParameters: js.UndefOr[typingsJapgolly.awsSdk.quicksightMod.MySqlParameters] = js.native
  /**
    * PostgreSQL parameters.
    */
  var PostgreSqlParameters: js.UndefOr[typingsJapgolly.awsSdk.quicksightMod.PostgreSqlParameters] = js.native
  /**
    * Presto parameters.
    */
  var PrestoParameters: js.UndefOr[typingsJapgolly.awsSdk.quicksightMod.PrestoParameters] = js.native
  /**
    * Amazon RDS parameters.
    */
  var RdsParameters: js.UndefOr[typingsJapgolly.awsSdk.quicksightMod.RdsParameters] = js.native
  /**
    * Amazon Redshift parameters.
    */
  var RedshiftParameters: js.UndefOr[typingsJapgolly.awsSdk.quicksightMod.RedshiftParameters] = js.native
  /**
    * S3 parameters.
    */
  var S3Parameters: js.UndefOr[typingsJapgolly.awsSdk.quicksightMod.S3Parameters] = js.native
  /**
    * ServiceNow parameters.
    */
  var ServiceNowParameters: js.UndefOr[typingsJapgolly.awsSdk.quicksightMod.ServiceNowParameters] = js.native
  /**
    * Snowflake parameters.
    */
  var SnowflakeParameters: js.UndefOr[typingsJapgolly.awsSdk.quicksightMod.SnowflakeParameters] = js.native
  /**
    * Spark parameters.
    */
  var SparkParameters: js.UndefOr[typingsJapgolly.awsSdk.quicksightMod.SparkParameters] = js.native
  /**
    * SQL Server parameters.
    */
  var SqlServerParameters: js.UndefOr[typingsJapgolly.awsSdk.quicksightMod.SqlServerParameters] = js.native
  /**
    * Teradata parameters.
    */
  var TeradataParameters: js.UndefOr[typingsJapgolly.awsSdk.quicksightMod.TeradataParameters] = js.native
  /**
    * Twitter parameters.
    */
  var TwitterParameters: js.UndefOr[typingsJapgolly.awsSdk.quicksightMod.TwitterParameters] = js.native
}

object DataSourceParameters {
  @scala.inline
  def apply(
    AmazonElasticsearchParameters: AmazonElasticsearchParameters = null,
    AthenaParameters: AthenaParameters = null,
    AuroraParameters: AuroraParameters = null,
    AuroraPostgreSqlParameters: AuroraPostgreSqlParameters = null,
    AwsIotAnalyticsParameters: AwsIotAnalyticsParameters = null,
    JiraParameters: JiraParameters = null,
    MariaDbParameters: MariaDbParameters = null,
    MySqlParameters: MySqlParameters = null,
    PostgreSqlParameters: PostgreSqlParameters = null,
    PrestoParameters: PrestoParameters = null,
    RdsParameters: RdsParameters = null,
    RedshiftParameters: RedshiftParameters = null,
    S3Parameters: S3Parameters = null,
    ServiceNowParameters: ServiceNowParameters = null,
    SnowflakeParameters: SnowflakeParameters = null,
    SparkParameters: SparkParameters = null,
    SqlServerParameters: SqlServerParameters = null,
    TeradataParameters: TeradataParameters = null,
    TwitterParameters: TwitterParameters = null
  ): DataSourceParameters = {
    val __obj = js.Dynamic.literal()
    if (AmazonElasticsearchParameters != null) __obj.updateDynamic("AmazonElasticsearchParameters")(AmazonElasticsearchParameters.asInstanceOf[js.Any])
    if (AthenaParameters != null) __obj.updateDynamic("AthenaParameters")(AthenaParameters.asInstanceOf[js.Any])
    if (AuroraParameters != null) __obj.updateDynamic("AuroraParameters")(AuroraParameters.asInstanceOf[js.Any])
    if (AuroraPostgreSqlParameters != null) __obj.updateDynamic("AuroraPostgreSqlParameters")(AuroraPostgreSqlParameters.asInstanceOf[js.Any])
    if (AwsIotAnalyticsParameters != null) __obj.updateDynamic("AwsIotAnalyticsParameters")(AwsIotAnalyticsParameters.asInstanceOf[js.Any])
    if (JiraParameters != null) __obj.updateDynamic("JiraParameters")(JiraParameters.asInstanceOf[js.Any])
    if (MariaDbParameters != null) __obj.updateDynamic("MariaDbParameters")(MariaDbParameters.asInstanceOf[js.Any])
    if (MySqlParameters != null) __obj.updateDynamic("MySqlParameters")(MySqlParameters.asInstanceOf[js.Any])
    if (PostgreSqlParameters != null) __obj.updateDynamic("PostgreSqlParameters")(PostgreSqlParameters.asInstanceOf[js.Any])
    if (PrestoParameters != null) __obj.updateDynamic("PrestoParameters")(PrestoParameters.asInstanceOf[js.Any])
    if (RdsParameters != null) __obj.updateDynamic("RdsParameters")(RdsParameters.asInstanceOf[js.Any])
    if (RedshiftParameters != null) __obj.updateDynamic("RedshiftParameters")(RedshiftParameters.asInstanceOf[js.Any])
    if (S3Parameters != null) __obj.updateDynamic("S3Parameters")(S3Parameters.asInstanceOf[js.Any])
    if (ServiceNowParameters != null) __obj.updateDynamic("ServiceNowParameters")(ServiceNowParameters.asInstanceOf[js.Any])
    if (SnowflakeParameters != null) __obj.updateDynamic("SnowflakeParameters")(SnowflakeParameters.asInstanceOf[js.Any])
    if (SparkParameters != null) __obj.updateDynamic("SparkParameters")(SparkParameters.asInstanceOf[js.Any])
    if (SqlServerParameters != null) __obj.updateDynamic("SqlServerParameters")(SqlServerParameters.asInstanceOf[js.Any])
    if (TeradataParameters != null) __obj.updateDynamic("TeradataParameters")(TeradataParameters.asInstanceOf[js.Any])
    if (TwitterParameters != null) __obj.updateDynamic("TwitterParameters")(TwitterParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSourceParameters]
  }
}

