package typingsJapgolly.reactOnclickoutside.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.raw.Element
import typingsJapgolly.react.mod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigObject extends js.Object {
  var excludeScrollbar: js.UndefOr[Boolean] = js.undefined
  var handleClickOutside: js.UndefOr[MouseEventHandler[_]] = js.undefined
}

object ConfigObject {
  @scala.inline
  def apply(
    excludeScrollbar: js.UndefOr[Boolean] = js.undefined,
    handleClickOutside: ReactMouseEventFrom[Element] => Callback = null
  ): ConfigObject = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(excludeScrollbar)) __obj.updateDynamic("excludeScrollbar")(excludeScrollbar.asInstanceOf[js.Any])
    if (handleClickOutside != null) __obj.updateDynamic("handleClickOutside")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.Element]) => handleClickOutside(t0).runNow()))
    __obj.asInstanceOf[ConfigObject]
  }
}

