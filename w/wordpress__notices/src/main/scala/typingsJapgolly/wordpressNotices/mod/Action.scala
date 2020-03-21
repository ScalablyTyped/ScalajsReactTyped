package typingsJapgolly.wordpressNotices.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.wordpressNotices.mod.URLAction
  - typingsJapgolly.wordpressNotices.mod.CallbackAction
*/
trait Action extends js.Object

object Action {
  @scala.inline
  def URLAction(label: String, url: String): Action = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Action]
  }
  @scala.inline
  def CallbackAction(callback: Callback, label: String): Action = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.updateDynamic("callback")(callback.toJsFn)
    __obj.asInstanceOf[Action]
  }
}

