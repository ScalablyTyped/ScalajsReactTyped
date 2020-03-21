package typingsJapgolly.nodemailer.mimeFuncsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParsedHeaderValue extends HeaderValue {
  @JSName("params")
  var params_ParsedHeaderValue: StringDictionary[String]
}

object ParsedHeaderValue {
  @scala.inline
  def apply(params: StringDictionary[String], value: String): ParsedHeaderValue = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ParsedHeaderValue]
  }
}

