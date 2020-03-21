package typingsJapgolly.grpcProtoLoader.mod.protobufjsAugmentingMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.protobufjs.descriptorMod.IEnumDescriptorProto
import typingsJapgolly.protobufjs.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Enum extends js.Object {
  def toDescriptor(protoVersion: String): Message[IEnumDescriptorProto] with IEnumDescriptorProto
}

object Enum {
  @scala.inline
  def apply(toDescriptor: String => CallbackTo[Message[IEnumDescriptorProto] with IEnumDescriptorProto]): Enum = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("toDescriptor")(js.Any.fromFunction1((t0: java.lang.String) => toDescriptor(t0).runNow()))
    __obj.asInstanceOf[Enum]
  }
}

