package typingsJapgolly.uuid1345.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UUID extends js.Object {
  var variant: String
  var version: String
  def toBuffer(): Buffer
}

object UUID {
  @scala.inline
  def apply(toBuffer: CallbackTo[Buffer], variant: String, version: String): UUID = {
    val __obj = js.Dynamic.literal(variant = variant.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("toBuffer")(toBuffer.toJsFn)
    __obj.asInstanceOf[UUID]
  }
}

