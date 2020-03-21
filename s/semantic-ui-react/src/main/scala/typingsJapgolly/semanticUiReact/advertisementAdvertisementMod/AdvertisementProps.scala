package typingsJapgolly.semanticUiReact.advertisementAdvertisementMod

import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
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

trait AdvertisementProps
  extends StrictAdvertisementProps
     with /* key */ StringDictionary[js.Any]

object AdvertisementProps {
  @scala.inline
  def apply(
    unit: (`medium rectangle`) | (`large rectangle`) | (`vertical rectangle`) | (`small rectangle`) | (`mobile banner`) | banner | (`vertical banner`) | (`top banner`) | (`half banner`) | button | (`square button`) | (`small button`) | skyscraper | (`wide skyscraper`) | leaderboard | (`large leaderboard`) | (`mobile leaderboard`) | billboard | panorama | netboard | (`half page`) | square | (`small square`),
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    as: js.Any = null,
    centered: js.UndefOr[Boolean] = js.undefined,
    children: VdomNode = null,
    className: String = null,
    content: SemanticShorthandContent = null,
    test: Boolean | String | Double = null
  ): AdvertisementProps = {
    val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (!js.isUndefined(centered)) __obj.updateDynamic("centered")(centered.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (test != null) __obj.updateDynamic("test")(test.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdvertisementProps]
  }
}

