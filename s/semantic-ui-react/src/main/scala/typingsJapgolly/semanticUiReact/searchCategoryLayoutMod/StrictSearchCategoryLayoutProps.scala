package typingsJapgolly.semanticUiReact.searchCategoryLayoutMod

import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictSearchCategoryLayoutProps extends js.Object {
  /** The rendered category content */
  var categoryContent: Element
  /** The rendered results content */
  var resultsContent: Element
}

object StrictSearchCategoryLayoutProps {
  @scala.inline
  def apply(categoryContent: VdomElement, resultsContent: VdomElement): StrictSearchCategoryLayoutProps = {
    val __obj = js.Dynamic.literal()
    if (categoryContent != null) __obj.updateDynamic("categoryContent")(categoryContent.rawElement.asInstanceOf[js.Any])
    if (resultsContent != null) __obj.updateDynamic("resultsContent")(resultsContent.rawElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictSearchCategoryLayoutProps]
  }
}

