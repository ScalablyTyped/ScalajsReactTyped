package typingsJapgolly.grpcProtoLoader.mod.protobufjsAugmentingMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.protobufjs.descriptorMod.IDescriptorProto
import typingsJapgolly.protobufjs.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Type extends js.Object {
  def toDescriptor(protoVersion: String): Message[IDescriptorProto] with IDescriptorProto
}

object Type {
  @scala.inline
  def apply(toDescriptor: String => CallbackTo[Message[IDescriptorProto] with IDescriptorProto]): Type = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("toDescriptor")(js.Any.fromFunction1((t0: java.lang.String) => toDescriptor(t0).runNow()))
    __obj.asInstanceOf[Type]
  }
}

