package typingsJapgolly.reactOnsenui

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.raw.Element
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-onsenui.react-onsenui.HTMLAttributes<'id' | 'className' | 'style'> & {  modifier ? :string,   tappable ? :boolean,   tapBackgroundColor ? :string,   lockOnDrag ? :boolean,   expandable ? :boolean,   expanded ? :boolean,   onClick ? :react.react.MouseEventHandler<any>} */
trait HTMLAttributesidclassNameExpandable extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var expandable: js.UndefOr[Boolean] = js.undefined
  var expanded: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var lockOnDrag: js.UndefOr[Boolean] = js.undefined
  var modifier: js.UndefOr[String] = js.undefined
  var onClick: js.UndefOr[MouseEventHandler[_]] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var tapBackgroundColor: js.UndefOr[String] = js.undefined
  var tappable: js.UndefOr[Boolean] = js.undefined
}

object HTMLAttributesidclassNameExpandable {
  @scala.inline
  def apply(
    className: String = null,
    expandable: js.UndefOr[Boolean] = js.undefined,
    expanded: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    lockOnDrag: js.UndefOr[Boolean] = js.undefined,
    modifier: String = null,
    onClick: ReactMouseEventFrom[Element] => Callback = null,
    style: CSSProperties = null,
    tapBackgroundColor: String = null,
    tappable: js.UndefOr[Boolean] = js.undefined
  ): HTMLAttributesidclassNameExpandable = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(expandable)) __obj.updateDynamic("expandable")(expandable.asInstanceOf[js.Any])
    if (!js.isUndefined(expanded)) __obj.updateDynamic("expanded")(expanded.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(lockOnDrag)) __obj.updateDynamic("lockOnDrag")(lockOnDrag.asInstanceOf[js.Any])
    if (modifier != null) __obj.updateDynamic("modifier")(modifier.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.Element]) => onClick(t0).runNow()))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tapBackgroundColor != null) __obj.updateDynamic("tapBackgroundColor")(tapBackgroundColor.asInstanceOf[js.Any])
    if (!js.isUndefined(tappable)) __obj.updateDynamic("tappable")(tappable.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLAttributesidclassNameExpandable]
  }
}

