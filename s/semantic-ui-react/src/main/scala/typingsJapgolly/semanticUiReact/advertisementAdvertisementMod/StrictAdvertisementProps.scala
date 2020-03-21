package typingsJapgolly.semanticUiReact.advertisementAdvertisementMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.semanticUiReact.genericMod.SemanticShorthandContent
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.`half banner`
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.`half page`
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.`large leaderboard`
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.`large rectangle`
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.`medium rectangle`
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.`mobile banner`
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.`mobile leaderboard`
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.`small button`
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.`small rectangle`
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.`small square`
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.`square button`
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.`top banner`
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.`vertical banner`
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.`vertical rectangle`
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.`wide skyscraper`
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.banner
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.billboard
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.button
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.leaderboard
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.netboard
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.panorama
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.skyscraper
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.square
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictAdvertisementProps extends js.Object {
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** Center the advertisement. */
  var centered: js.UndefOr[Boolean] = js.undefined
  /** Primary content. */
  var children: js.UndefOr[Node] = js.undefined
  /** Additional classes. */
  var className: js.UndefOr[String] = js.undefined
  /** Shorthand for primary content. */
  var content: js.UndefOr[SemanticShorthandContent] = js.undefined
  /** Text to be displayed on the advertisement. */
  var test: js.UndefOr[Boolean | String | Double] = js.undefined
  /** Varies the size of the advertisement. */
  var unit: (`medium rectangle`) | (`large rectangle`) | (`vertical rectangle`) | (`small rectangle`) | (`mobile banner`) | banner | (`vertical banner`) | (`top banner`) | (`half banner`) | button | (`square button`) | (`small button`) | skyscraper | (`wide skyscraper`) | leaderboard | (`large leaderboard`) | (`mobile leaderboard`) | billboard | panorama | netboard | (`half page`) | square | (`small square`)
}

object StrictAdvertisementProps {
  @scala.inline
  def apply(
    unit: (`medium rectangle`) | (`large rectangle`) | (`vertical rectangle`) | (`small rectangle`) | (`mobile banner`) | banner | (`vertical banner`) | (`top banner`) | (`half banner`) | button | (`square button`) | (`small button`) | skyscraper | (`wide skyscraper`) | leaderboard | (`large leaderboard`) | (`mobile leaderboard`) | billboard | panorama | netboard | (`half page`) | square | (`small square`),
    as: js.Any = null,
    centered: js.UndefOr[Boolean] = js.undefined,
    children: VdomNode = null,
    className: String = null,
    content: SemanticShorthandContent = null,
    test: Boolean | String | Double = null
  ): StrictAdvertisementProps = {
    val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (!js.isUndefined(centered)) __obj.updateDynamic("centered")(centered.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (test != null) __obj.updateDynamic("test")(test.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictAdvertisementProps]
  }
}

