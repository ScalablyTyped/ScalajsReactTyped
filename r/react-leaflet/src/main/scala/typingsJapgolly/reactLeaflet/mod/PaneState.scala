package typingsJapgolly.reactLeaflet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaneState extends js.Object {
  var context: js.UndefOr[LeafletContext | Null] = js.undefined
  var name: js.UndefOr[String | Null] = js.undefined
}

object PaneState {
  @scala.inline
  def apply(context: LeafletContext = null, name: String = null): PaneState = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaneState]
  }
}

