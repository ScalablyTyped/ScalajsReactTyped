package typingsJapgolly.googleProtobuf.descriptorPbMod.MethodDescriptorProto

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var clientStreaming: js.UndefOr[Boolean] = js.undefined
  var inputType: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var options: js.UndefOr[typingsJapgolly.googleProtobuf.descriptorPbMod.MethodOptions.AsObject] = js.undefined
  var outputType: js.UndefOr[String] = js.undefined
  var serverStreaming: js.UndefOr[Boolean] = js.undefined
}

object AsObject {
  @scala.inline
  def apply(
    clientStreaming: js.UndefOr[Boolean] = js.undefined,
    inputType: String = null,
    name: String = null,
    options: typingsJapgolly.googleProtobuf.descriptorPbMod.MethodOptions.AsObject = null,
    outputType: String = null,
    serverStreaming: js.UndefOr[Boolean] = js.undefined
  ): AsObject = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clientStreaming)) __obj.updateDynamic("clientStreaming")(clientStreaming.asInstanceOf[js.Any])
    if (inputType != null) __obj.updateDynamic("inputType")(inputType.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (outputType != null) __obj.updateDynamic("outputType")(outputType.asInstanceOf[js.Any])
    if (!js.isUndefined(serverStreaming)) __obj.updateDynamic("serverStreaming")(serverStreaming.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
}

