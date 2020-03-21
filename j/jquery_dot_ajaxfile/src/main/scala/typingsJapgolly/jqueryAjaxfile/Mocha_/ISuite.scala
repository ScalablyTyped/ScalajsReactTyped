package typingsJapgolly.jqueryAjaxfile.Mocha_

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Partial interface for Mocha's `Suite` class. */
trait ISuite extends js.Object {
  var parent: ISuite
  var title: String
  def fullTitle(): String
}

object ISuite {
  @scala.inline
  def apply(fullTitle: CallbackTo[String], parent: ISuite, title: String): ISuite = {
    val __obj = js.Dynamic.literal(parent = parent.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("fullTitle")(fullTitle.toJsFn)
    __obj.asInstanceOf[ISuite]
  }
}

