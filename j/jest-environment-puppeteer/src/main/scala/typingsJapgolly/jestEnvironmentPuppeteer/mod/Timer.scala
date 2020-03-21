package typingsJapgolly.jestEnvironmentPuppeteer.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Timer extends js.Object {
  var id: Double
  def ref(): Timer
  def unref(): Timer
}

object Timer {
  @scala.inline
  def apply(id: Double, ref: CallbackTo[Timer], unref: CallbackTo[Timer]): Timer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("ref")(ref.toJsFn)
    __obj.updateDynamic("unref")(unref.toJsFn)
    __obj.asInstanceOf[Timer]
  }
}

