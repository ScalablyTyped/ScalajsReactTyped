package typingsJapgolly.ol.webglLayerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebGLWorkerGenerateBuffersMessage extends js.Object {
  var customAttributesCount: js.UndefOr[Double] = js.undefined
  var indexBuffer: js.UndefOr[scala.scalajs.js.typedarray.ArrayBuffer] = js.undefined
  var renderInstructions: scala.scalajs.js.typedarray.ArrayBuffer
  var `type`: WebGLWorkerMessageType
  var vertexBuffer: js.UndefOr[scala.scalajs.js.typedarray.ArrayBuffer] = js.undefined
}

object WebGLWorkerGenerateBuffersMessage {
  @scala.inline
  def apply(
    renderInstructions: scala.scalajs.js.typedarray.ArrayBuffer,
    `type`: WebGLWorkerMessageType,
    customAttributesCount: Int | Double = null,
    indexBuffer: scala.scalajs.js.typedarray.ArrayBuffer = null,
    vertexBuffer: scala.scalajs.js.typedarray.ArrayBuffer = null
  ): WebGLWorkerGenerateBuffersMessage = {
    val __obj = js.Dynamic.literal(renderInstructions = renderInstructions.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (customAttributesCount != null) __obj.updateDynamic("customAttributesCount")(customAttributesCount.asInstanceOf[js.Any])
    if (indexBuffer != null) __obj.updateDynamic("indexBuffer")(indexBuffer.asInstanceOf[js.Any])
    if (vertexBuffer != null) __obj.updateDynamic("vertexBuffer")(vertexBuffer.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebGLWorkerGenerateBuffersMessage]
  }
}

