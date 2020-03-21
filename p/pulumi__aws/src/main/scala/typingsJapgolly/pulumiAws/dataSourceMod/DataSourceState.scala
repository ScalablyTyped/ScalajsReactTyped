package typingsJapgolly.pulumiAws.dataSourceMod

import typingsJapgolly.pulumiAws.inputMod.appsync.DataSourceDynamodbConfig
import typingsJapgolly.pulumiAws.inputMod.appsync.DataSourceElasticsearchConfig
import typingsJapgolly.pulumiAws.inputMod.appsync.DataSourceHttpConfig
import typingsJapgolly.pulumiAws.inputMod.appsync.DataSourceLambdaConfig
import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSourceState extends js.Object {
  /**
    * The API ID for the GraphQL API for the DataSource.
    */
  val apiId: js.UndefOr[Input[String]] = js.native
  /**
    * The ARN
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * A description of the DataSource.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * DynamoDB settings. See below
    */
  val dynamodbConfig: js.UndefOr[Input[DataSourceDynamodbConfig]] = js.native
  /**
    * Amazon Elasticsearch settings. See below
    */
  val elasticsearchConfig: js.UndefOr[Input[DataSourceElasticsearchConfig]] = js.native
  /**
    * HTTP settings. See below
    */
  val httpConfig: js.UndefOr[Input[DataSourceHttpConfig]] = js.native
  /**
    * AWS Lambda settings. See below
    */
  val lambdaConfig: js.UndefOr[Input[DataSourceLambdaConfig]] = js.native
  /**
    * A user-supplied name for the DataSource.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The IAM service role ARN for the data source.
    */
  val serviceRoleArn: js.UndefOr[Input[String]] = js.native
  /**
    * The type of the DataSource. Valid values: `AWS_LAMBDA`, `AMAZON_DYNAMODB`, `AMAZON_ELASTICSEARCH`, `HTTP`, `NONE`.
    */
  val `type`: js.UndefOr[Input[String]] = js.native
}

object DataSourceState {
  @scala.inline
  def apply(
    apiId: Input[String] = null,
    arn: Input[String] = null,
    description: Input[String] = null,
    dynamodbConfig: Input[DataSourceDynamodbConfig] = null,
    elasticsearchConfig: Input[DataSourceElasticsearchConfig] = null,
    httpConfig: Input[DataSourceHttpConfig] = null,
    lambdaConfig: Input[DataSourceLambdaConfig] = null,
    name: Input[String] = null,
    serviceRoleArn: Input[String] = null,
    `type`: Input[String] = null
  ): DataSourceState = {
    val __obj = js.Dynamic.literal()
    if (apiId != null) __obj.updateDynamic("apiId")(apiId.asInstanceOf[js.Any])
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (dynamodbConfig != null) __obj.updateDynamic("dynamodbConfig")(dynamodbConfig.asInstanceOf[js.Any])
    if (elasticsearchConfig != null) __obj.updateDynamic("elasticsearchConfig")(elasticsearchConfig.asInstanceOf[js.Any])
    if (httpConfig != null) __obj.updateDynamic("httpConfig")(httpConfig.asInstanceOf[js.Any])
    if (lambdaConfig != null) __obj.updateDynamic("lambdaConfig")(lambdaConfig.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (serviceRoleArn != null) __obj.updateDynamic("serviceRoleArn")(serviceRoleArn.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSourceState]
  }
}

