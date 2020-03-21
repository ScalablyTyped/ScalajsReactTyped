package typingsJapgolly.grpcProtoLoader.mod.protobufjsAugmentingMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.protobufjs.descriptorMod.IFileDescriptorSet
import typingsJapgolly.protobufjs.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Root extends js.Object {
  def toDescriptor(protoVersion: String): Message[IFileDescriptorSet] with IFileDescriptorSet
}

object Root {
  @scala.inline
  def apply(toDescriptor: String => CallbackTo[Message[IFileDescriptorSet] with IFileDescriptorSet]): Root = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("toDescriptor")(js.Any.fromFunction1((t0: java.lang.String) => toDescriptor(t0).runNow()))
    __obj.asInstanceOf[Root]
  }
}

