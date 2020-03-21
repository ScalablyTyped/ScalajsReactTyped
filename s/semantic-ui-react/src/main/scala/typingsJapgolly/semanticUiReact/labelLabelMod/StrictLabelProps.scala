package typingsJapgolly.semanticUiReact.labelLabelMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.semanticUiReact.genericMod.SemanticCOLORS
import typingsJapgolly.semanticUiReact.genericMod.SemanticSIZES
import typingsJapgolly.semanticUiReact.genericMod.SemanticShorthandContent
import typingsJapgolly.semanticUiReact.genericMod.SemanticShorthandItem
import typingsJapgolly.semanticUiReact.iconIconMod.IconProps
import typingsJapgolly.semanticUiReact.labelDetailMod.LabelDetailProps
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.`bottom left`
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.`bottom right`
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.`top left`
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.`top right`
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.above
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.below
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.bottom
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.left
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.right
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictLabelProps extends js.Object {
  /** A label can be active. */
  var active: js.UndefOr[Boolean] = js.undefined
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** A label can attach to a content segment. */
  var attached: js.UndefOr[top | bottom | (`top right`) | (`top left`) | (`bottom left`) | (`bottom right`)] = js.undefined
  /** A label can reduce its complexity. */
  var basic: js.UndefOr[Boolean] = js.undefined
  /** Primary content. */
  var children: js.UndefOr[Node] = js.undefined
  /** A label can be circular. */
  var circular: js.UndefOr[Boolean] = js.undefined
  /** Additional classes. */
  var className: js.UndefOr[String] = js.undefined
  /** Color of the label. */
  var color: js.UndefOr[SemanticCOLORS] = js.undefined
  /** Shorthand for primary content. */
  var content: js.UndefOr[SemanticShorthandContent] = js.undefined
  /** A label can position itself in the corner of an element. */
  var corner: js.UndefOr[Boolean | left | right] = js.undefined
  /** Shorthand for LabelDetail. */
  var detail: js.UndefOr[SemanticShorthandItem[LabelDetailProps]] = js.undefined
  /** Formats the label as a dot. */
  var empty: js.UndefOr[js.Any] = js.undefined
  /** Float above another element in the upper right corner. */
  var floating: js.UndefOr[Boolean] = js.undefined
  /** A horizontal label is formatted to label content along-side it horizontally. */
  var horizontal: js.UndefOr[Boolean] = js.undefined
  /** Add an icon by icon name or pass an <Icon /.> */
  var icon: js.UndefOr[SemanticShorthandItem[IconProps]] = js.undefined
  /** A label can be formatted to emphasize an image or prop can be used as shorthand for Image. */
  var image: js.UndefOr[js.Any] = js.undefined
  /**
    * Called on click.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  var onClick: js.UndefOr[
    js.Function2[/* event */ ReactMouseEventFrom[HTMLElement], /* data */ LabelProps, Unit]
  ] = js.undefined
  /**
    * Adds an "x" icon, called when "x" is clicked.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  var onRemove: js.UndefOr[
    js.Function2[/* event */ ReactMouseEventFrom[HTMLElement], /* data */ LabelProps, Unit]
  ] = js.undefined
  /** A label can point to content next to it. */
  var pointing: js.UndefOr[Boolean | above | below | left | right] = js.undefined
  /** A label can prompt for an error in your forms. */
  var prompt: js.UndefOr[Boolean] = js.undefined
  /** Shorthand for Icon to appear as the last child and trigger onRemove. */
  var removeIcon: js.UndefOr[SemanticShorthandItem[IconProps]] = js.undefined
  /** A label can appear as a ribbon attaching itself to an element. */
  var ribbon: js.UndefOr[Boolean | right] = js.undefined
  /** A label can have different sizes. */
  var size: js.UndefOr[SemanticSIZES] = js.undefined
  /** A label can appear as a tag. */
  var tag: js.UndefOr[Boolean] = js.undefined
}

object StrictLabelProps {
  @scala.inline
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    as: js.Any = null,
    attached: top | bottom | (`top right`) | (`top left`) | (`bottom left`) | (`bottom right`) = null,
    basic: js.UndefOr[Boolean] = js.undefined,
    children: VdomNode = null,
    circular: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    color: SemanticCOLORS = null,
    content: SemanticShorthandContent = null,
    corner: Boolean | left | right = null,
    detail: SemanticShorthandItem[LabelDetailProps] = null,
    empty: js.Any = null,
    floating: js.UndefOr[Boolean] = js.undefined,
    horizontal: js.UndefOr[Boolean] = js.undefined,
    icon: SemanticShorthandItem[IconProps] = null,
    image: js.Any = null,
    onClick: (/* event */ ReactMouseEventFrom[HTMLElement], /* data */ LabelProps) => Callback = null,
    onRemove: (/* event */ ReactMouseEventFrom[HTMLElement], /* data */ LabelProps) => Callback = null,
    pointing: Boolean | above | below | left | right = null,
    prompt: js.UndefOr[Boolean] = js.undefined,
    removeIcon: SemanticShorthandItem[IconProps] = null,
    ribbon: Boolean | right = null,
    size: SemanticSIZES = null,
    tag: js.UndefOr[Boolean] = js.undefined
  ): StrictLabelProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (attached != null) __obj.updateDynamic("attached")(attached.asInstanceOf[js.Any])
    if (!js.isUndefined(basic)) __obj.updateDynamic("basic")(basic.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (!js.isUndefined(circular)) __obj.updateDynamic("circular")(circular.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (corner != null) __obj.updateDynamic("corner")(corner.asInstanceOf[js.Any])
    if (detail != null) __obj.updateDynamic("detail")(detail.asInstanceOf[js.Any])
    if (empty != null) __obj.updateDynamic("empty")(empty.asInstanceOf[js.Any])
    if (!js.isUndefined(floating)) __obj.updateDynamic("floating")(floating.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontal)) __obj.updateDynamic("horizontal")(horizontal.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2((t0: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement], t1: /* data */ typingsJapgolly.semanticUiReact.labelLabelMod.LabelProps) => onClick(t0, t1).runNow()))
    if (onRemove != null) __obj.updateDynamic("onRemove")(js.Any.fromFunction2((t0: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement], t1: /* data */ typingsJapgolly.semanticUiReact.labelLabelMod.LabelProps) => onRemove(t0, t1).runNow()))
    if (pointing != null) __obj.updateDynamic("pointing")(pointing.asInstanceOf[js.Any])
    if (!js.isUndefined(prompt)) __obj.updateDynamic("prompt")(prompt.asInstanceOf[js.Any])
    if (removeIcon != null) __obj.updateDynamic("removeIcon")(removeIcon.asInstanceOf[js.Any])
    if (ribbon != null) __obj.updateDynamic("ribbon")(ribbon.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(tag)) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictLabelProps]
  }
}

