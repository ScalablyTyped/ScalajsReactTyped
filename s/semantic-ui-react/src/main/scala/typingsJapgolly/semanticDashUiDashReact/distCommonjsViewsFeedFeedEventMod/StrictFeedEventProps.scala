package typingsJapgolly.semanticDashUiDashReact.distCommonjsViewsFeedFeedEventMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandItem
import typingsJapgolly.semanticDashUiDashReact.distCommonjsViewsFeedFeedContentMod.FeedContentProps
import typingsJapgolly.semanticDashUiDashReact.distCommonjsViewsFeedFeedDateMod.FeedDateProps
import typingsJapgolly.semanticDashUiDashReact.distCommonjsViewsFeedFeedExtraMod.FeedExtraProps
import typingsJapgolly.semanticDashUiDashReact.distCommonjsViewsFeedFeedLabelMod.FeedLabelProps
import typingsJapgolly.semanticDashUiDashReact.distCommonjsViewsFeedFeedMetaMod.FeedMetaProps
import typingsJapgolly.semanticDashUiDashReact.distCommonjsViewsFeedFeedSummaryMod.FeedSummaryProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictFeedEventProps extends js.Object {
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** Primary content. */
  var children: js.UndefOr[Node] = js.undefined
  /** Additional classes. */
  var className: js.UndefOr[String] = js.undefined
  /** Shorthand for FeedContent. */
  var content: js.UndefOr[SemanticShorthandItem[FeedContentProps]] = js.undefined
  /** Shorthand for FeedDate. */
  var date: js.UndefOr[SemanticShorthandItem[FeedDateProps]] = js.undefined
  /** Shorthand for FeedExtra with images. */
  var extraImages: js.UndefOr[SemanticShorthandItem[FeedExtraProps]] = js.undefined
  /** Shorthand for FeedExtra with content. */
  var extraText: js.UndefOr[SemanticShorthandItem[FeedExtraProps]] = js.undefined
  /** An event can contain icon label. */
  var icon: js.UndefOr[SemanticShorthandItem[FeedLabelProps]] = js.undefined
  /** An event can contain image label. */
  var image: js.UndefOr[SemanticShorthandItem[FeedLabelProps]] = js.undefined
  /** Shorthand for FeedMeta. */
  var meta: js.UndefOr[SemanticShorthandItem[FeedMetaProps]] = js.undefined
  /** Shorthand for FeedSummary. */
  var summary: js.UndefOr[SemanticShorthandItem[FeedSummaryProps]] = js.undefined
}

object StrictFeedEventProps {
  @scala.inline
  def apply(
    as: js.Any = null,
    children: VdomNode = null,
    className: String = null,
    content: SemanticShorthandItem[FeedContentProps] = null,
    date: SemanticShorthandItem[FeedDateProps] = null,
    extraImages: SemanticShorthandItem[FeedExtraProps] = null,
    extraText: SemanticShorthandItem[FeedExtraProps] = null,
    icon: SemanticShorthandItem[FeedLabelProps] = null,
    image: SemanticShorthandItem[FeedLabelProps] = null,
    meta: SemanticShorthandItem[FeedMetaProps] = null,
    summary: SemanticShorthandItem[FeedSummaryProps] = null
  ): StrictFeedEventProps = {
    val __obj = js.Dynamic.literal()
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (extraImages != null) __obj.updateDynamic("extraImages")(extraImages.asInstanceOf[js.Any])
    if (extraText != null) __obj.updateDynamic("extraText")(extraText.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (summary != null) __obj.updateDynamic("summary")(summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictFeedEventProps]
  }
}

