package typingsJapgolly.awsSdkEventstreamMarshaller.messageMod

import typingsJapgolly.awsSdkEventstreamMarshaller.awsSdkEventstreamMarshallerStrings.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntegerHeaderValue extends MessageHeaderValue {
  var `type`: integer
  var value: Double
}

object IntegerHeaderValue {
  @scala.inline
  def apply(`type`: integer, value: Double): IntegerHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntegerHeaderValue]
  }
}

