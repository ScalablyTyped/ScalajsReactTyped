package typingsJapgolly.contentType.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParsedMediaType extends js.Object {
  var parameters: StringDictionary[String]
  var `type`: String
}

object ParsedMediaType {
  @scala.inline
  def apply(parameters: StringDictionary[String], `type`: String): ParsedMediaType = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedMediaType]
  }
}

