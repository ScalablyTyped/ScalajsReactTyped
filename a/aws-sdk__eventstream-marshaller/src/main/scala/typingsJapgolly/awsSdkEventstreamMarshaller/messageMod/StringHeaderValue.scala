package typingsJapgolly.awsSdkEventstreamMarshaller.messageMod

import typingsJapgolly.awsSdkEventstreamMarshaller.awsSdkEventstreamMarshallerStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StringHeaderValue extends MessageHeaderValue {
  var `type`: string
  var value: String
}

object StringHeaderValue {
  @scala.inline
  def apply(`type`: string, value: String): StringHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringHeaderValue]
  }
}

