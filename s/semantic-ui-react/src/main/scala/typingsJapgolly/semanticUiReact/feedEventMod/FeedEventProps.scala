package typingsJapgolly.semanticUiReact.feedEventMod

import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.semanticUiReact.feedContentMod.FeedContentProps
import typingsJapgolly.semanticUiReact.feedDateMod.FeedDateProps
import typingsJapgolly.semanticUiReact.feedExtraMod.FeedExtraProps
import typingsJapgolly.semanticUiReact.feedLabelMod.FeedLabelProps
import typingsJapgolly.semanticUiReact.feedMetaMod.FeedMetaProps
import typingsJapgolly.semanticUiReact.feedSummaryMod.FeedSummaryProps
import typingsJapgolly.semanticUiReact.genericMod.SemanticShorthandItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeedEventProps
  extends StrictFeedEventProps
     with /* key */ StringDictionary[js.Any]

object FeedEventProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
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
  ): FeedEventProps = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
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
    __obj.asInstanceOf[FeedEventProps]
  }
}

