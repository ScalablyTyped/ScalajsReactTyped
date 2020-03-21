package typingsJapgolly.ethereumjsTx.typesMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransformableToBuffer extends js.Object {
  def toBuffer(): Buffer
}

object TransformableToBuffer {
  @scala.inline
  def apply(toBuffer: CallbackTo[Buffer]): TransformableToBuffer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("toBuffer")(toBuffer.toJsFn)
    __obj.asInstanceOf[TransformableToBuffer]
  }
}

