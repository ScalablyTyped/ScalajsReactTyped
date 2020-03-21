package typingsJapgolly.pulumiAws.outputMod.applicationloadbalancing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListenerRuleConditionSourceIp extends js.Object {
  /**
    * Query string pairs or values to match. Query String Value blocks documented below. Multiple `values` blocks can be specified, see example above. Maximum size of each string is 128 characters. Comparison is case insensitive. Wildcard characters supported: * (matches 0 or more characters) and ? (matches exactly 1 character). To search for a literal '\*' or '?' character in a query string, escape the character with a backslash (\\). Only one pair needs to match for the condition to be satisfied.
    */
  var values: js.Array[String] = js.native
}

object ListenerRuleConditionSourceIp {
  @scala.inline
  def apply(values: js.Array[String]): ListenerRuleConditionSourceIp = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ListenerRuleConditionSourceIp]
  }
}

