package typingsJapgolly.yadda.platformMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Platform extends js.Object {
  def get_container(): js.Any
  def is_browser(): Boolean
  def is_karma(): Boolean
   // Window | NodeJS.Global | Phantom
  def is_node(): Boolean
  def is_phantom(): Boolean
}

object Platform {
  @scala.inline
  def apply(
    get_container: CallbackTo[js.Any],
    is_browser: CallbackTo[Boolean],
    is_karma: CallbackTo[Boolean],
    is_node: CallbackTo[Boolean],
    is_phantom: CallbackTo[Boolean]
  ): Platform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get_container")(get_container.toJsFn)
    __obj.updateDynamic("is_browser")(is_browser.toJsFn)
    __obj.updateDynamic("is_karma")(is_karma.toJsFn)
    __obj.updateDynamic("is_node")(is_node.toJsFn)
    __obj.updateDynamic("is_phantom")(is_phantom.toJsFn)
    __obj.asInstanceOf[Platform]
  }
}

