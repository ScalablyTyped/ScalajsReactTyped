package typingsJapgolly.simpleUrlCache.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaxAgeRegexRule extends RegexRule {
  var maxAge: Double
}

object MaxAgeRegexRule {
  @scala.inline
  def apply(maxAge: Double, regex: js.RegExp): MaxAgeRegexRule = {
    val __obj = js.Dynamic.literal(maxAge = maxAge.asInstanceOf[js.Any], regex = regex.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MaxAgeRegexRule]
  }
}

