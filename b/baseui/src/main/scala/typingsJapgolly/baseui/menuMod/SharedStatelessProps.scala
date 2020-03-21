package typingsJapgolly.baseui.menuMod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.raw.React.Ref
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.raw.FocusEvent
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.KeyboardEvent
import org.scalajs.dom.raw.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharedStatelessProps extends js.Object {
  var activedescendantId: js.UndefOr[String] = js.undefined
  var focusMenu: js.UndefOr[js.Function1[/* event */ FocusEvent | MouseEvent | KeyboardEvent, _]] = js.undefined
  var getRequiredItemProps: js.UndefOr[js.Function2[/* item */ js.Any, /* index */ Double, RenderItemProps]] = js.undefined
  var highlightedIndex: js.UndefOr[Double] = js.undefined
  var items: ItemsT
  var noResultsMsg: js.UndefOr[Node] = js.undefined
  var onBlur: js.UndefOr[js.Function1[/* event */ ReactFocusEventFrom[HTMLElement], _]] = js.undefined
  var onFocus: js.UndefOr[js.Function1[/* event */ ReactFocusEventFrom[HTMLElement], _]] = js.undefined
  var rootRef: js.UndefOr[Ref] = js.undefined
  var unfocusMenu: js.UndefOr[js.Function0[_]] = js.undefined
}

object SharedStatelessProps {
  @scala.inline
  def apply(
    items: ItemsT,
    activedescendantId: String = null,
    focusMenu: /* event */ FocusEvent | MouseEvent | KeyboardEvent => CallbackTo[js.Any] = null,
    getRequiredItemProps: (/* item */ js.Any, /* index */ Double) => CallbackTo[RenderItemProps] = null,
    highlightedIndex: Int | Double = null,
    noResultsMsg: VdomNode = null,
    onBlur: /* event */ ReactFocusEventFrom[HTMLElement] => CallbackTo[js.Any] = null,
    onFocus: /* event */ ReactFocusEventFrom[HTMLElement] => CallbackTo[js.Any] = null,
    rootRef: Ref = null,
    unfocusMenu: js.UndefOr[CallbackTo[js.Any]] = js.undefined
  ): SharedStatelessProps = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    if (activedescendantId != null) __obj.updateDynamic("activedescendantId")(activedescendantId.asInstanceOf[js.Any])
    if (focusMenu != null) __obj.updateDynamic("focusMenu")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.FocusEvent | org.scalajs.dom.raw.MouseEvent | org.scalajs.dom.raw.KeyboardEvent) => focusMenu(t0).runNow()))
    if (getRequiredItemProps != null) __obj.updateDynamic("getRequiredItemProps")(js.Any.fromFunction2((t0: /* item */ js.Any, t1: /* index */ scala.Double) => getRequiredItemProps(t0, t1).runNow()))
    if (highlightedIndex != null) __obj.updateDynamic("highlightedIndex")(highlightedIndex.asInstanceOf[js.Any])
    if (noResultsMsg != null) __obj.updateDynamic("noResultsMsg")(noResultsMsg.rawNode.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactFocusEventFrom[org.scalajs.dom.raw.HTMLElement]) => onBlur(t0).runNow()))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactFocusEventFrom[org.scalajs.dom.raw.HTMLElement]) => onFocus(t0).runNow()))
    if (rootRef != null) __obj.updateDynamic("rootRef")(rootRef.asInstanceOf[js.Any])
    unfocusMenu.foreach(p => __obj.updateDynamic("unfocusMenu")(p.toJsFn))
    __obj.asInstanceOf[SharedStatelessProps]
  }
}

