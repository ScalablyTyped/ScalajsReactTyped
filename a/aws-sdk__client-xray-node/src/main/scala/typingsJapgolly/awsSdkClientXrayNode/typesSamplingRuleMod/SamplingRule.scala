package typingsJapgolly.awsSdkClientXrayNode.typesSamplingRuleMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SamplingRule extends js.Object {
  /**
    * <p>Matches attributes derived from the request.</p>
    */
  var Attributes: js.UndefOr[StringDictionary[String] | (js.Iterable[js.Tuple2[String, String]])] = js.undefined
  /**
    * <p>The percentage of matching requests to instrument, after the reservoir is exhausted.</p>
    */
  var FixedRate: Double
  /**
    * <p>Matches the HTTP method of a request.</p>
    */
  var HTTPMethod: String
  /**
    * <p>Matches the hostname from a request URL.</p>
    */
  var Host: String
  /**
    * <p>The priority of the sampling rule.</p>
    */
  var Priority: Double
  /**
    * <p>A fixed number of matching requests to instrument per second, prior to applying the fixed rate. The reservoir is not used directly by services, but applies to all services using the rule collectively.</p>
    */
  var ReservoirSize: Double
  /**
    * <p>Matches the ARN of the AWS resource on which the service runs.</p>
    */
  var ResourceARN: String
  /**
    * <p>The ARN of the sampling rule. Specify a rule by either name or ARN, but not both.</p>
    */
  var RuleARN: js.UndefOr[String] = js.undefined
  /**
    * <p>The name of the sampling rule. Specify a rule by either name or ARN, but not both.</p>
    */
  var RuleName: js.UndefOr[String] = js.undefined
  /**
    * <p>Matches the <code>name</code> that the service uses to identify itself in segments.</p>
    */
  var ServiceName: String
  /**
    * <p>Matches the <code>origin</code> that the service uses to identify its type in segments.</p>
    */
  var ServiceType: String
  /**
    * <p>Matches the path from a request URL.</p>
    */
  var URLPath: String
  /**
    * <p>The version of the sampling rule format (<code>1</code>).</p>
    */
  var Version: Double
}

object SamplingRule {
  @scala.inline
  def apply(
    FixedRate: Double,
    HTTPMethod: String,
    Host: String,
    Priority: Double,
    ReservoirSize: Double,
    ResourceARN: String,
    ServiceName: String,
    ServiceType: String,
    URLPath: String,
    Version: Double,
    Attributes: StringDictionary[String] | (js.Iterable[js.Tuple2[String, String]]) = null,
    RuleARN: String = null,
    RuleName: String = null
  ): SamplingRule = {
    val __obj = js.Dynamic.literal(FixedRate = FixedRate.asInstanceOf[js.Any], HTTPMethod = HTTPMethod.asInstanceOf[js.Any], Host = Host.asInstanceOf[js.Any], Priority = Priority.asInstanceOf[js.Any], ReservoirSize = ReservoirSize.asInstanceOf[js.Any], ResourceARN = ResourceARN.asInstanceOf[js.Any], ServiceName = ServiceName.asInstanceOf[js.Any], ServiceType = ServiceType.asInstanceOf[js.Any], URLPath = URLPath.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes.asInstanceOf[js.Any])
    if (RuleARN != null) __obj.updateDynamic("RuleARN")(RuleARN.asInstanceOf[js.Any])
    if (RuleName != null) __obj.updateDynamic("RuleName")(RuleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SamplingRule]
  }
}

