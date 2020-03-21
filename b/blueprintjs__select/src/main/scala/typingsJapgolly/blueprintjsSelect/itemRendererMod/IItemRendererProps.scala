package typingsJapgolly.blueprintjsSelect.itemRendererMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.react.mod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IItemRendererProps extends js.Object {
  /** Click event handler to select this item. */
  var handleClick: MouseEventHandler[HTMLElement]
  var index: js.UndefOr[Double] = js.undefined
  /** Modifiers that describe how to render this item, such as `active` or `disabled`. */
  var modifiers: IItemModifiers
  /** The current query string used to filter the items. */
  var query: String
}

object IItemRendererProps {
  @scala.inline
  def apply(
    handleClick: ReactMouseEventFrom[HTMLElement] => Callback,
    modifiers: IItemModifiers,
    query: String,
    index: Int | Double = null
  ): IItemRendererProps = {
    val __obj = js.Dynamic.literal(modifiers = modifiers.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.updateDynamic("handleClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement]) => handleClick(t0).runNow()))
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    __obj.asInstanceOf[IItemRendererProps]
  }
}

