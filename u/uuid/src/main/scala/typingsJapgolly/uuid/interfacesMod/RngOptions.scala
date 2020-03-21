package typingsJapgolly.uuid.interfacesMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RngOptions extends V4Options {
  var rng: js.UndefOr[js.Function0[InputBuffer]] = js.undefined
}

object RngOptions {
  @scala.inline
  def apply(rng: js.UndefOr[CallbackTo[InputBuffer]] = js.undefined): RngOptions = {
    val __obj = js.Dynamic.literal()
    rng.foreach(p => __obj.updateDynamic("rng")(p.toJsFn))
    __obj.asInstanceOf[RngOptions]
  }
}

