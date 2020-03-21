package typingsJapgolly.node.NodeJS

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefCounted extends js.Object {
  def ref(): this.type
  def unref(): this.type
}

object RefCounted {
  @scala.inline
  def apply(ref: CallbackTo[RefCounted], unref: CallbackTo[RefCounted]): RefCounted = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ref")(ref.toJsFn)
    __obj.updateDynamic("unref")(unref.toJsFn)
    __obj.asInstanceOf[RefCounted]
  }
}

