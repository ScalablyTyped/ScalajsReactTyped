package typingsJapgolly.angularEnvironment.angular.environment

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  /**
    * Map of domains to their environments
    */
  var domains: StringDictionary[js.Array[String]]
  /**
    * List of variables split by environment
    */
  var vars: StringDictionary[StringDictionary[js.Any]]
}

object Config {
  @scala.inline
  def apply(domains: StringDictionary[js.Array[String]], vars: StringDictionary[StringDictionary[js.Any]]): Config = {
    val __obj = js.Dynamic.literal(domains = domains.asInstanceOf[js.Any], vars = vars.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Config]
  }
}

