package typingsJapgolly.jasmine.jasmine

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NothingMatcher extends js.Object {
  def nothing(): Unit
}

object NothingMatcher {
  @scala.inline
  def apply(nothing: Callback): NothingMatcher = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("nothing")(nothing.toJsFn)
    __obj.asInstanceOf[NothingMatcher]
  }
}

