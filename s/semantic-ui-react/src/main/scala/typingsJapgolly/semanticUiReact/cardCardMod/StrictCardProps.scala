package typingsJapgolly.semanticUiReact.cardCardMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.raw.HTMLAnchorElement
import typingsJapgolly.semanticUiReact.cardDescriptionMod.CardDescriptionProps
import typingsJapgolly.semanticUiReact.cardHeaderMod.CardHeaderProps
import typingsJapgolly.semanticUiReact.cardMetaMod.CardMetaProps
import typingsJapgolly.semanticUiReact.genericMod.SemanticCOLORS
import typingsJapgolly.semanticUiReact.genericMod.SemanticShorthandContent
import typingsJapgolly.semanticUiReact.genericMod.SemanticShorthandItem
import typingsJapgolly.semanticUiReact.imageImageMod.ImageProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictCardProps extends js.Object {
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** A Card can center itself inside its container. */
  var centered: js.UndefOr[Boolean] = js.undefined
  /** Primary content. */
  var children: js.UndefOr[Node] = js.undefined
  /** Additional classes. */
  var className: js.UndefOr[String] = js.undefined
  /** A Card can be formatted to display different colors. */
  var color: js.UndefOr[SemanticCOLORS] = js.undefined
  /** Shorthand for primary content. */
  var content: js.UndefOr[SemanticShorthandContent] = js.undefined
  /** Shorthand for CardDescription. */
  var description: js.UndefOr[SemanticShorthandItem[CardDescriptionProps]] = js.undefined
  /** Shorthand for primary content of CardContent. */
  var extra: js.UndefOr[SemanticShorthandContent] = js.undefined
  /** A Card can be formatted to take up the width of its container. */
  var fluid: js.UndefOr[Boolean] = js.undefined
  /** Shorthand for CardHeader. */
  var header: js.UndefOr[SemanticShorthandItem[CardHeaderProps]] = js.undefined
  /** Render as an `a` tag instead of a `div` and adds the href attribute. */
  var href: js.UndefOr[String] = js.undefined
  /** A card can contain an Image component. */
  var image: js.UndefOr[SemanticShorthandItem[ImageProps]] = js.undefined
  /** A card can be formatted to link to other content. */
  var link: js.UndefOr[Boolean] = js.undefined
  /** Shorthand for CardMeta. */
  var meta: js.UndefOr[SemanticShorthandItem[CardMetaProps]] = js.undefined
  /**
    * Called on click. When passed, the component renders as an `a`
    * tag by default instead of a `div`.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  var onClick: js.UndefOr[
    js.Function2[/* event */ ReactMouseEventFrom[HTMLAnchorElement], /* data */ CardProps, Unit]
  ] = js.undefined
  /** A Card can be formatted to raise above the page. */
  var raised: js.UndefOr[Boolean] = js.undefined
}

object StrictCardProps {
  @scala.inline
  def apply(
    as: js.Any = null,
    centered: js.UndefOr[Boolean] = js.undefined,
    children: VdomNode = null,
    className: String = null,
    color: SemanticCOLORS = null,
    content: SemanticShorthandContent = null,
    description: SemanticShorthandItem[CardDescriptionProps] = null,
    extra: SemanticShorthandContent = null,
    fluid: js.UndefOr[Boolean] = js.undefined,
    header: SemanticShorthandItem[CardHeaderProps] = null,
    href: String = null,
    image: SemanticShorthandItem[ImageProps] = null,
    link: js.UndefOr[Boolean] = js.undefined,
    meta: SemanticShorthandItem[CardMetaProps] = null,
    onClick: (/* event */ ReactMouseEventFrom[HTMLAnchorElement], /* data */ CardProps) => Callback = null,
    raised: js.UndefOr[Boolean] = js.undefined
  ): StrictCardProps = {
    val __obj = js.Dynamic.literal()
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (!js.isUndefined(centered)) __obj.updateDynamic("centered")(centered.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (!js.isUndefined(fluid)) __obj.updateDynamic("fluid")(fluid.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (!js.isUndefined(link)) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2((t0: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLAnchorElement], t1: /* data */ typingsJapgolly.semanticUiReact.cardCardMod.CardProps) => onClick(t0, t1).runNow()))
    if (!js.isUndefined(raised)) __obj.updateDynamic("raised")(raised.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictCardProps]
  }
}

