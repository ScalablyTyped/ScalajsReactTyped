package typingsJapgolly.semanticUiReact.searchCategoryMod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.ComponentClassP
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.semanticUiReact.genericMod.SemanticShorthandContent
import typingsJapgolly.semanticUiReact.searchResultMod.SearchResultProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictSearchCategoryProps extends js.Object {
  /** The item currently selected by keyboard shortcut. */
  var active: js.UndefOr[Boolean] = js.undefined
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** Primary content. */
  var children: js.UndefOr[Node] = js.undefined
  /** Additional classes. */
  var className: js.UndefOr[String] = js.undefined
  /** Shorthand for primary content. */
  var content: js.UndefOr[SemanticShorthandContent] = js.undefined
  /**
    * Renders the SearchCategory layout.
    *
    * @param {object} categoryContent - The Renderable SearchCategory contents.
    * @param {object} resultsContent - The Renderable SearchResult contents.
    * @returns {*} - Renderable SearchCategory layout.
    */
  var layoutRenderer: js.UndefOr[
    js.Function2[/* categoryContent */ Element, /* resultsContent */ Element, Element]
  ] = js.undefined
  /** Display name. */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Renders the category contents.
    *
    * @param {object} props - The SearchCategory props object.
    * @returns {*} - Renderable category contents.
    */
  var renderer: js.UndefOr[js.Function1[/* props */ SearchCategoryProps, Element]] = js.undefined
  /** Array of Search.Result props. */
  var results: js.UndefOr[js.Array[ComponentClassP[SearchResultProps with js.Object]]] = js.undefined
}

object StrictSearchCategoryProps {
  @scala.inline
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    as: js.Any = null,
    children: VdomNode = null,
    className: String = null,
    content: SemanticShorthandContent = null,
    layoutRenderer: (/* categoryContent */ Element, /* resultsContent */ Element) => CallbackTo[Element] = null,
    name: String = null,
    renderer: /* props */ SearchCategoryProps => CallbackTo[Element] = null,
    results: js.Array[ComponentClassP[SearchResultProps with js.Object]] = null
  ): StrictSearchCategoryProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (layoutRenderer != null) __obj.updateDynamic("layoutRenderer")(js.Any.fromFunction2((t0: /* categoryContent */ japgolly.scalajs.react.raw.React.Element, t1: /* resultsContent */ japgolly.scalajs.react.raw.React.Element) => layoutRenderer(t0, t1).runNow()))
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (renderer != null) __obj.updateDynamic("renderer")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.semanticUiReact.searchCategoryMod.SearchCategoryProps) => renderer(t0).runNow()))
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictSearchCategoryProps]
  }
}

