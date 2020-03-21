package typingsJapgolly.pulumiAws.samplingRuleMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SamplingRuleState extends js.Object {
  /**
    * The ARN of the sampling rule.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * Matches attributes derived from the request.
    */
  val attributes: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  /**
    * The percentage of matching requests to instrument, after the reservoir is exhausted.
    */
  val fixedRate: js.UndefOr[Input[Double]] = js.native
  /**
    * Matches the hostname from a request URL.
    */
  val host: js.UndefOr[Input[String]] = js.native
  /**
    * Matches the HTTP method of a request.
    */
  val httpMethod: js.UndefOr[Input[String]] = js.native
  /**
    * The priority of the sampling rule.
    */
  val priority: js.UndefOr[Input[Double]] = js.native
  /**
    * A fixed number of matching requests to instrument per second, prior to applying the fixed rate. The reservoir is not used directly by services, but applies to all services using the rule collectively.
    */
  val reservoirSize: js.UndefOr[Input[Double]] = js.native
  /**
    * Matches the ARN of the AWS resource on which the service runs.
    */
  val resourceArn: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the sampling rule.
    */
  val ruleName: js.UndefOr[Input[String]] = js.native
  /**
    * Matches the `name` that the service uses to identify itself in segments.
    */
  val serviceName: js.UndefOr[Input[String]] = js.native
  /**
    * Matches the `origin` that the service uses to identify its type in segments.
    */
  val serviceType: js.UndefOr[Input[String]] = js.native
  /**
    * Matches the path from a request URL.
    */
  val urlPath: js.UndefOr[Input[String]] = js.native
  /**
    * The version of the sampling rule format (`1` )
    */
  val version: js.UndefOr[Input[Double]] = js.native
}

object SamplingRuleState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    attributes: Input[StringDictionary[Input[String]]] = null,
    fixedRate: Input[Double] = null,
    host: Input[String] = null,
    httpMethod: Input[String] = null,
    priority: Input[Double] = null,
    reservoirSize: Input[Double] = null,
    resourceArn: Input[String] = null,
    ruleName: Input[String] = null,
    serviceName: Input[String] = null,
    serviceType: Input[String] = null,
    urlPath: Input[String] = null,
    version: Input[Double] = null
  ): SamplingRuleState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (fixedRate != null) __obj.updateDynamic("fixedRate")(fixedRate.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (httpMethod != null) __obj.updateDynamic("httpMethod")(httpMethod.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (reservoirSize != null) __obj.updateDynamic("reservoirSize")(reservoirSize.asInstanceOf[js.Any])
    if (resourceArn != null) __obj.updateDynamic("resourceArn")(resourceArn.asInstanceOf[js.Any])
    if (ruleName != null) __obj.updateDynamic("ruleName")(ruleName.asInstanceOf[js.Any])
    if (serviceName != null) __obj.updateDynamic("serviceName")(serviceName.asInstanceOf[js.Any])
    if (serviceType != null) __obj.updateDynamic("serviceType")(serviceType.asInstanceOf[js.Any])
    if (urlPath != null) __obj.updateDynamic("urlPath")(urlPath.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[SamplingRuleState]
  }
}

