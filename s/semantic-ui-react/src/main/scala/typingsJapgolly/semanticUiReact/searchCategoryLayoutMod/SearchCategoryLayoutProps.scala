package typingsJapgolly.semanticUiReact.searchCategoryLayoutMod

import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchCategoryLayoutProps
  extends StrictSearchCategoryLayoutProps
     with /* key */ StringDictionary[js.Any]

object SearchCategoryLayoutProps {
  @scala.inline
  def apply(
    categoryContent: VdomElement,
    resultsContent: VdomElement,
    StringDictionary: /* key */ StringDictionary[js.Any] = null
  ): SearchCategoryLayoutProps = {
    val __obj = js.Dynamic.literal()
    if (categoryContent != null) __obj.updateDynamic("categoryContent")(categoryContent.rawElement.asInstanceOf[js.Any])
    if (resultsContent != null) __obj.updateDynamic("resultsContent")(resultsContent.rawElement.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[SearchCategoryLayoutProps]
  }
}

