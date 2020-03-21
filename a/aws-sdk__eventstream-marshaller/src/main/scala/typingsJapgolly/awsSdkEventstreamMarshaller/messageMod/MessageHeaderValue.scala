package typingsJapgolly.awsSdkEventstreamMarshaller.messageMod

import typingsJapgolly.awsSdkEventstreamMarshaller.awsSdkEventstreamMarshallerStrings.binary
import typingsJapgolly.awsSdkEventstreamMarshaller.awsSdkEventstreamMarshallerStrings.boolean
import typingsJapgolly.awsSdkEventstreamMarshaller.awsSdkEventstreamMarshallerStrings.byte
import typingsJapgolly.awsSdkEventstreamMarshaller.awsSdkEventstreamMarshallerStrings.integer
import typingsJapgolly.awsSdkEventstreamMarshaller.awsSdkEventstreamMarshallerStrings.long
import typingsJapgolly.awsSdkEventstreamMarshaller.awsSdkEventstreamMarshallerStrings.short
import typingsJapgolly.awsSdkEventstreamMarshaller.awsSdkEventstreamMarshallerStrings.string
import typingsJapgolly.awsSdkEventstreamMarshaller.awsSdkEventstreamMarshallerStrings.timestamp
import typingsJapgolly.awsSdkEventstreamMarshaller.awsSdkEventstreamMarshallerStrings.uuid
import typingsJapgolly.awsSdkEventstreamMarshaller.int64Mod.Int64
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdkEventstreamMarshaller.messageMod.BooleanHeaderValue
  - typingsJapgolly.awsSdkEventstreamMarshaller.messageMod.ByteHeaderValue
  - typingsJapgolly.awsSdkEventstreamMarshaller.messageMod.ShortHeaderValue
  - typingsJapgolly.awsSdkEventstreamMarshaller.messageMod.IntegerHeaderValue
  - typingsJapgolly.awsSdkEventstreamMarshaller.messageMod.LongHeaderValue
  - typingsJapgolly.awsSdkEventstreamMarshaller.messageMod.BinaryHeaderValue
  - typingsJapgolly.awsSdkEventstreamMarshaller.messageMod.StringHeaderValue
  - typingsJapgolly.awsSdkEventstreamMarshaller.messageMod.TimestampHeaderValue
  - typingsJapgolly.awsSdkEventstreamMarshaller.messageMod.UuidHeaderValue
*/
trait MessageHeaderValue extends js.Object

object MessageHeaderValue {
  @scala.inline
  def UuidHeaderValue(`type`: uuid, value: String): MessageHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageHeaderValue]
  }
  @scala.inline
  def IntegerHeaderValue(`type`: integer, value: Double): MessageHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageHeaderValue]
  }
  @scala.inline
  def TimestampHeaderValue(`type`: timestamp, value: js.Date): MessageHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageHeaderValue]
  }
  @scala.inline
  def StringHeaderValue(`type`: string, value: String): MessageHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageHeaderValue]
  }
  @scala.inline
  def BinaryHeaderValue(`type`: binary, value: scala.scalajs.js.typedarray.Uint8Array): MessageHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageHeaderValue]
  }
  @scala.inline
  def BooleanHeaderValue(`type`: boolean, value: Boolean): MessageHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageHeaderValue]
  }
  @scala.inline
  def LongHeaderValue(`type`: long, value: Int64): MessageHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageHeaderValue]
  }
  @scala.inline
  def ByteHeaderValue(`type`: byte, value: Double): MessageHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageHeaderValue]
  }
  @scala.inline
  def ShortHeaderValue(`type`: short, value: Double): MessageHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageHeaderValue]
  }
}

