package typingsJapgolly.mobx

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Initializer extends js.Object {
  var initializer: js.UndefOr[js.Function0[_]] = js.undefined
}

object Anon_Initializer {
  @scala.inline
  def apply(initializer: js.UndefOr[CallbackTo[_]] = js.undefined): Anon_Initializer = {
    val __obj = js.Dynamic.literal()
    initializer.foreach(p => __obj.updateDynamic("initializer")(p.toJsFn))
    __obj.asInstanceOf[Anon_Initializer]
  }
}

