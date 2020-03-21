package typingsJapgolly.foundationSites.FoundationSites

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://foundation.zurb.com/sites/docs/interchange.html#javascript-reference
trait Interchange extends js.Object {
  def destroy(): Unit
  def replace(path: String): Unit
}

object Interchange {
  @scala.inline
  def apply(destroy: Callback, replace: String => Callback): Interchange = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("replace")(js.Any.fromFunction1((t0: java.lang.String) => replace(t0).runNow()))
    __obj.asInstanceOf[Interchange]
  }
}

