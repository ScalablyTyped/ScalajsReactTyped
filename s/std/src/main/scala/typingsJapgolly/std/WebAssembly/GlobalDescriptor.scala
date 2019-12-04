package typingsJapgolly.std.WebAssembly

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalDescriptor extends js.Object {
  var mutable: js.UndefOr[scala.Boolean] = js.undefined
  var value: ValueType
}

object GlobalDescriptor {
  @scala.inline
  def apply(value: ValueType, mutable: js.UndefOr[scala.Boolean] = js.undefined): GlobalDescriptor = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(mutable)) __obj.updateDynamic("mutable")(mutable.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalDescriptor]
  }
}

