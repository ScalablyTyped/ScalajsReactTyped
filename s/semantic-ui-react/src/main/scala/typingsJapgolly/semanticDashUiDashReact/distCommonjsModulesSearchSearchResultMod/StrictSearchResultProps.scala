package typingsJapgolly.semanticDashUiDashReact.distCommonjsModulesSearchSearchResultMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.raw.React.Element
import org.scalajs.dom.raw.HTMLDivElement
import typingsJapgolly.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandContent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictSearchResultProps extends js.Object {
  /** The item currently selected by keyboard shortcut. */
  var active: js.UndefOr[Boolean] = js.undefined
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** Additional classes. */
  var className: js.UndefOr[String] = js.undefined
  /** Shorthand for primary content. */
  var content: js.UndefOr[SemanticShorthandContent] = js.undefined
  /** Additional text with less emphasis. */
  var description: js.UndefOr[String] = js.undefined
  /** A unique identifier. */
  var id: js.UndefOr[Double | String] = js.undefined
  /** Add an image to the item. */
  var image: js.UndefOr[String] = js.undefined
  /**
    * Called on click.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  var onClick: js.UndefOr[
    js.Function2[/* event */ ReactMouseEventFrom[HTMLDivElement], /* data */ SearchResultProps, Unit]
  ] = js.undefined
  /** Customized text for price. */
  var price: js.UndefOr[String] = js.undefined
  /**
    * Renders the result contents.
    *
    * @param {object} props - The SearchResult props object.
    * @returns {*} - Renderable result contents.
    */
  var renderer: js.UndefOr[js.Function1[/* props */ SearchResultProps, js.Array[Element]]] = js.undefined
  /** Display title. */
  var title: String
}

object StrictSearchResultProps {
  @scala.inline
  def apply(
    title: String,
    active: js.UndefOr[Boolean] = js.undefined,
    as: js.Any = null,
    className: String = null,
    content: SemanticShorthandContent = null,
    description: String = null,
    id: Double | String = null,
    image: String = null,
    onClick: (/* event */ ReactMouseEventFrom[HTMLDivElement], /* data */ SearchResultProps) => Callback = null,
    price: String = null,
    renderer: /* props */ SearchResultProps => CallbackTo[js.Array[Element]] = null
  ): StrictSearchResultProps = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2((t0: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLDivElement], t1: /* data */ typingsJapgolly.semanticDashUiDashReact.distCommonjsModulesSearchSearchResultMod.SearchResultProps) => onClick(t0, t1).runNow()))
    if (price != null) __obj.updateDynamic("price")(price.asInstanceOf[js.Any])
    if (renderer != null) __obj.updateDynamic("renderer")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.semanticDashUiDashReact.distCommonjsModulesSearchSearchResultMod.SearchResultProps) => renderer(t0).runNow()))
    __obj.asInstanceOf[StrictSearchResultProps]
  }
}

