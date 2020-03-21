package typingsJapgolly.semanticUiReact.modalActionsMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.raw.HTMLAnchorElement
import typingsJapgolly.semanticUiReact.buttonButtonMod.ButtonProps
import typingsJapgolly.semanticUiReact.genericMod.SemanticShorthandCollection
import typingsJapgolly.semanticUiReact.genericMod.SemanticShorthandContent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictModalActionsProps extends js.Object {
  /** Array of shorthand buttons. */
  var actions: js.UndefOr[SemanticShorthandCollection[ButtonProps]] = js.undefined
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** Primary content. */
  var children: js.UndefOr[Node] = js.undefined
  /** Additional classes. */
  var className: js.UndefOr[String] = js.undefined
  /** Shorthand for primary content. */
  var content: js.UndefOr[SemanticShorthandContent] = js.undefined
  /**
    * onClick handler for an action. Mutually exclusive with children.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All item props.
    */
  var onActionClick: js.UndefOr[
    js.Function2[/* event */ ReactMouseEventFrom[HTMLAnchorElement], /* data */ ButtonProps, Unit]
  ] = js.undefined
}

object StrictModalActionsProps {
  @scala.inline
  def apply(
    actions: SemanticShorthandCollection[ButtonProps] = null,
    as: js.Any = null,
    children: VdomNode = null,
    className: String = null,
    content: SemanticShorthandContent = null,
    onActionClick: (/* event */ ReactMouseEventFrom[HTMLAnchorElement], /* data */ ButtonProps) => Callback = null
  ): StrictModalActionsProps = {
    val __obj = js.Dynamic.literal()
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (onActionClick != null) __obj.updateDynamic("onActionClick")(js.Any.fromFunction2((t0: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLAnchorElement], t1: /* data */ typingsJapgolly.semanticUiReact.buttonButtonMod.ButtonProps) => onActionClick(t0, t1).runNow()))
    __obj.asInstanceOf[StrictModalActionsProps]
  }
}

