package typingsJapgolly.irc

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIdlength extends js.Object {
  var idlength: js.Array[String]
  var length: Double
  var limit: js.Array[String]
  var modes: StringDictionary[String]
  var types: String
}

object AnonIdlength {
  @scala.inline
  def apply(
    idlength: js.Array[String],
    length: Double,
    limit: js.Array[String],
    modes: StringDictionary[String],
    types: String
  ): AnonIdlength = {
    val __obj = js.Dynamic.literal(idlength = idlength.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], modes = modes.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonIdlength]
  }
}

