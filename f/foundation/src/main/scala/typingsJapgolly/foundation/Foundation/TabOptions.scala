package typingsJapgolly.foundation.Foundation

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://foundation.zurb.com/docs/components/tabs.html
trait TabOptions extends js.Object {
  var active_class: js.UndefOr[String] = js.undefined
  var callback: js.UndefOr[js.Function0[_]] = js.undefined
  var deep_linking: js.UndefOr[Boolean] = js.undefined
  var is_hover: js.UndefOr[Boolean] = js.undefined
  var scroll_to_content: js.UndefOr[Boolean] = js.undefined
}

object TabOptions {
  @scala.inline
  def apply(
    active_class: String = null,
    callback: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    deep_linking: js.UndefOr[Boolean] = js.undefined,
    is_hover: js.UndefOr[Boolean] = js.undefined,
    scroll_to_content: js.UndefOr[Boolean] = js.undefined
  ): TabOptions = {
    val __obj = js.Dynamic.literal()
    if (active_class != null) __obj.updateDynamic("active_class")(active_class.asInstanceOf[js.Any])
    callback.foreach(p => __obj.updateDynamic("callback")(p.toJsFn))
    if (!js.isUndefined(deep_linking)) __obj.updateDynamic("deep_linking")(deep_linking.asInstanceOf[js.Any])
    if (!js.isUndefined(is_hover)) __obj.updateDynamic("is_hover")(is_hover.asInstanceOf[js.Any])
    if (!js.isUndefined(scroll_to_content)) __obj.updateDynamic("scroll_to_content")(scroll_to_content.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabOptions]
  }
}

