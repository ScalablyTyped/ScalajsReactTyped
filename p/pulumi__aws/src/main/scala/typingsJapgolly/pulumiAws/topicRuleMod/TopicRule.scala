package typingsJapgolly.pulumiAws.topicRuleMod

import typingsJapgolly.pulumiAws.outputMod.iot.TopicRuleCloudwatchAlarm
import typingsJapgolly.pulumiAws.outputMod.iot.TopicRuleCloudwatchMetric
import typingsJapgolly.pulumiAws.outputMod.iot.TopicRuleDynamodb
import typingsJapgolly.pulumiAws.outputMod.iot.TopicRuleElasticsearch
import typingsJapgolly.pulumiAws.outputMod.iot.TopicRuleFirehose
import typingsJapgolly.pulumiAws.outputMod.iot.TopicRuleKinesis
import typingsJapgolly.pulumiAws.outputMod.iot.TopicRuleLambda
import typingsJapgolly.pulumiAws.outputMod.iot.TopicRuleRepublish
import typingsJapgolly.pulumiAws.outputMod.iot.TopicRuleS3
import typingsJapgolly.pulumiAws.outputMod.iot.TopicRuleSns
import typingsJapgolly.pulumiAws.outputMod.iot.TopicRuleSqs
import typingsJapgolly.pulumiPulumi.mod.CustomResource
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.outputMod.Output_
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/iot/topicRule", "TopicRule")
@js.native
class TopicRule protected () extends CustomResource {
  /**
    * Create a TopicRule resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: TopicRuleArgs) = this()
  def this(name: String, args: TopicRuleArgs, opts: CustomResourceOptions) = this()
  /**
    * The ARN of the topic rule
    */
  val arn: Output_[String] = js.native
  val cloudwatchAlarm: Output_[js.UndefOr[TopicRuleCloudwatchAlarm]] = js.native
  val cloudwatchMetric: Output_[js.UndefOr[TopicRuleCloudwatchMetric]] = js.native
  /**
    * The description of the rule.
    */
  val description: Output_[js.UndefOr[String]] = js.native
  val dynamodb: Output_[js.UndefOr[TopicRuleDynamodb]] = js.native
  val elasticsearch: Output_[js.UndefOr[TopicRuleElasticsearch]] = js.native
  /**
    * Specifies whether the rule is enabled.
    */
  val enabled: Output_[Boolean] = js.native
  val firehose: Output_[js.UndefOr[TopicRuleFirehose]] = js.native
  val kinesis: Output_[js.UndefOr[TopicRuleKinesis]] = js.native
  val lambda: Output_[js.UndefOr[TopicRuleLambda]] = js.native
  /**
    * The name of the rule.
    */
  val name: Output_[String] = js.native
  val republish: Output_[js.UndefOr[TopicRuleRepublish]] = js.native
  val s3: Output_[js.UndefOr[TopicRuleS3]] = js.native
  val sns: Output_[js.UndefOr[TopicRuleSns]] = js.native
  /**
    * The SQL statement used to query the topic. For more information, see AWS IoT SQL Reference (http://docs.aws.amazon.com/iot/latest/developerguide/iot-rules.html#aws-iot-sql-reference) in the AWS IoT Developer Guide.
    */
  val sql: Output_[String] = js.native
  /**
    * The version of the SQL rules engine to use when evaluating the rule.
    */
  val sqlVersion: Output_[String] = js.native
  val sqs: Output_[js.UndefOr[TopicRuleSqs]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/iot/topicRule", "TopicRule")
@js.native
object TopicRule extends js.Object {
  /**
    * Get an existing TopicRule resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): TopicRule = js.native
  def get(name: String, id: Input[ID], state: TopicRuleState): TopicRule = js.native
  def get(name: String, id: Input[ID], state: TopicRuleState, opts: CustomResourceOptions): TopicRule = js.native
  /**
    * Returns true if the given object is an instance of TopicRule.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iot/topicRule.TopicRule */ Boolean = js.native
}

