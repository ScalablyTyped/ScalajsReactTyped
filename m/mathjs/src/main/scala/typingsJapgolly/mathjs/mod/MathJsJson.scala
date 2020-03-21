package typingsJapgolly.mathjs.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MathJsJson extends js.Object {
  /**
    * Returns reviver function that can be used as reviver in JSON.parse function.
    */
  def reviver(): js.Function2[/* key */ js.Any, /* value */ js.Any, _]
}

object MathJsJson {
  @scala.inline
  def apply(reviver: CallbackTo[js.Function2[/* key */ js.Any, /* value */ js.Any, js.Any]]): MathJsJson = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("reviver")(reviver.toJsFn)
    __obj.asInstanceOf[MathJsJson]
  }
}

