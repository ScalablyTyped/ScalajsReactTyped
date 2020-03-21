package typingsJapgolly.wordpressViewport

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofimportedSelectors extends js.Object {
  def isViewportMatch(query: String): Boolean
}

object TypeofimportedSelectors {
  @scala.inline
  def apply(isViewportMatch: String => CallbackTo[Boolean]): TypeofimportedSelectors = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isViewportMatch")(js.Any.fromFunction1((t0: java.lang.String) => isViewportMatch(t0).runNow()))
    __obj.asInstanceOf[TypeofimportedSelectors]
  }
}

