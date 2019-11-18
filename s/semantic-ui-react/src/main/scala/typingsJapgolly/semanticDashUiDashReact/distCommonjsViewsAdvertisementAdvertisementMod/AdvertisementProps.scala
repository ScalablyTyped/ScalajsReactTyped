package typingsJapgolly.semanticDashUiDashReact.distCommonjsViewsAdvertisementAdvertisementMod

import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandContent
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.`half banner`
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.`half page`
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.`large leaderboard`
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.`large rectangle`
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.`medium rectangle`
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.`mobile banner`
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.`mobile leaderboard`
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.`small button`
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.`small rectangle`
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.`small square`
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.`square button`
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.`top banner`
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.`vertical banner`
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.`vertical rectangle`
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.`wide skyscraper`
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.banner
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.billboard
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.button
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.leaderboard
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.netboard
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.panorama
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.skyscraper
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.square
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

