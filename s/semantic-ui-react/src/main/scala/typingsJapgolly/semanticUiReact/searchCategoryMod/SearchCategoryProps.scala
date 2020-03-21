package typingsJapgolly.semanticUiReact.searchCategoryMod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.ComponentClassP
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.semanticUiReact.genericMod.SemanticShorthandContent
import typingsJapgolly.semanticUiReact.searchResultMod.SearchResultProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchCategoryProps
  extends StrictSearchCategoryProps
     with /* key */ StringDictionary[js.Any]

object SearchCategoryProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    active: js.UndefOr[Boolean] = js.undefined,
    as: js.Any = null,
    children: VdomNode = null,
    className: String = null,
    content: SemanticShorthandContent = null,
    layoutRenderer: (/* categoryContent */ Element, /* resultsContent */ Element) => CallbackTo[Element] = null,
    name: String = null,
    renderer: /* props */ SearchCategoryProps => CallbackTo[Element] = null,
    results: js.Array[ComponentClassP[SearchResultProps with js.Object]] = null
  ): SearchCategoryProps = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (layoutRenderer != null) __obj.updateDynamic("layoutRenderer")(js.Any.fromFunction2((t0: /* categoryContent */ japgolly.scalajs.react.raw.React.Element, t1: /* resultsContent */ japgolly.scalajs.react.raw.React.Element) => layoutRenderer(t0, t1).runNow()))
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (renderer != null) __obj.updateDynamic("renderer")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.semanticUiReact.searchCategoryMod.SearchCategoryProps) => renderer(t0).runNow()))
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchCategoryProps]
  }
}

