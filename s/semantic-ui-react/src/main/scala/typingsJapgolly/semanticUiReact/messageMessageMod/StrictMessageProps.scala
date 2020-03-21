package typingsJapgolly.semanticUiReact.messageMessageMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.semanticUiReact.genericMod.SemanticCOLORS
import typingsJapgolly.semanticUiReact.genericMod.SemanticShorthandCollection
import typingsJapgolly.semanticUiReact.genericMod.SemanticShorthandContent
import typingsJapgolly.semanticUiReact.genericMod.SemanticShorthandItem
import typingsJapgolly.semanticUiReact.messageHeaderMod.MessageHeaderProps
import typingsJapgolly.semanticUiReact.messageItemMod.MessageItemProps
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.bottom
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictMessageProps extends js.Object {
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** A message can be formatted to attach itself to other content. */
  var attached: js.UndefOr[Boolean | bottom | top] = js.undefined
  /** Primary content. */
  var children: js.UndefOr[Node] = js.undefined
  /** Additional classes. */
  var className: js.UndefOr[String] = js.undefined
  /** A message can be formatted to be different colors. */
  var color: js.UndefOr[SemanticCOLORS] = js.undefined
  /** A message can only take up the width of its content. */
  var compact: js.UndefOr[Boolean] = js.undefined
  /** Shorthand for primary content. */
  var content: js.UndefOr[SemanticShorthandContent] = js.undefined
  /** A message may be formatted to display a negative message. Same as `negative`. */
  var error: js.UndefOr[Boolean] = js.undefined
  /** A message can float above content that it is related to. */
  var floating: js.UndefOr[Boolean] = js.undefined
  /** Shorthand for MessageHeader. */
  var header: js.UndefOr[SemanticShorthandItem[MessageHeaderProps]] = js.undefined
  /** A message can be hidden. */
  var hidden: js.UndefOr[Boolean] = js.undefined
  /** Add an icon by icon name or pass an <Icon /.> */
  var icon: js.UndefOr[js.Any | Boolean] = js.undefined
  /** A message may be formatted to display information. */
  var info: js.UndefOr[Boolean] = js.undefined
  /** Array shorthand items for the MessageList. Mutually exclusive with children. */
  var list: js.UndefOr[SemanticShorthandCollection[MessageItemProps]] = js.undefined
  /** A message may be formatted to display a negative message. Same as `error`. */
  var negative: js.UndefOr[Boolean] = js.undefined
  /**
    * A message that the user can choose to hide.
    * Called when the user clicks the "x" icon. This also adds the "x" icon.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  var onDismiss: js.UndefOr[
    js.Function2[/* event */ ReactMouseEventFrom[HTMLElement], /* data */ MessageProps, Unit]
  ] = js.undefined
  /** A message may be formatted to display a positive message.  Same as `success`. */
  var positive: js.UndefOr[Boolean] = js.undefined
  /** A message can have different sizes. */
  var size: js.UndefOr[MessageSizeProp] = js.undefined
  /** A message may be formatted to display a positive message.  Same as `positive`. */
  var success: js.UndefOr[Boolean] = js.undefined
  /** A message can be set to visible to force itself to be shown. */
  var visible: js.UndefOr[Boolean] = js.undefined
  /** A message may be formatted to display warning messages. */
  var warning: js.UndefOr[Boolean] = js.undefined
}

object StrictMessageProps {
  @scala.inline
  def apply(
    as: js.Any = null,
    attached: Boolean | bottom | top = null,
    children: VdomNode = null,
    className: String = null,
    color: SemanticCOLORS = null,
    compact: js.UndefOr[Boolean] = js.undefined,
    content: SemanticShorthandContent = null,
    error: js.UndefOr[Boolean] = js.undefined,
    floating: js.UndefOr[Boolean] = js.undefined,
    header: SemanticShorthandItem[MessageHeaderProps] = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    icon: js.Any | Boolean = null,
    info: js.UndefOr[Boolean] = js.undefined,
    list: SemanticShorthandCollection[MessageItemProps] = null,
    negative: js.UndefOr[Boolean] = js.undefined,
    onDismiss: (/* event */ ReactMouseEventFrom[HTMLElement], /* data */ MessageProps) => Callback = null,
    positive: js.UndefOr[Boolean] = js.undefined,
    size: MessageSizeProp = null,
    success: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined,
    warning: js.UndefOr[Boolean] = js.undefined
  ): StrictMessageProps = {
    val __obj = js.Dynamic.literal()
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (attached != null) __obj.updateDynamic("attached")(attached.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (!js.isUndefined(floating)) __obj.updateDynamic("floating")(floating.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(info)) __obj.updateDynamic("info")(info.asInstanceOf[js.Any])
    if (list != null) __obj.updateDynamic("list")(list.asInstanceOf[js.Any])
    if (!js.isUndefined(negative)) __obj.updateDynamic("negative")(negative.asInstanceOf[js.Any])
    if (onDismiss != null) __obj.updateDynamic("onDismiss")(js.Any.fromFunction2((t0: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement], t1: /* data */ typingsJapgolly.semanticUiReact.messageMessageMod.MessageProps) => onDismiss(t0, t1).runNow()))
    if (!js.isUndefined(positive)) __obj.updateDynamic("positive")(positive.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(success)) __obj.updateDynamic("success")(success.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (!js.isUndefined(warning)) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictMessageProps]
  }
}

