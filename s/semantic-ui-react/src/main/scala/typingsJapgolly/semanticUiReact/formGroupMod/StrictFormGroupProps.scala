package typingsJapgolly.semanticUiReact.formGroupMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.semanticUiReact.genericMod.SemanticWIDTHS
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.equal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictFormGroupProps extends js.Object {
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** Primary content. */
  var children: js.UndefOr[Node] = js.undefined
  /** Additional classes. */
  var className: js.UndefOr[String] = js.undefined
  /** Fields can show related choices. */
  var grouped: js.UndefOr[Boolean] = js.undefined
  /** Multiple fields may be inline in a row. */
  var `inline`: js.UndefOr[Boolean] = js.undefined
  /** A form group can prevent itself from stacking on mobile. */
  var unstackable: js.UndefOr[Boolean] = js.undefined
  /** Fields Groups can specify their width in grid columns or automatically divide fields to be equal width. */
  var widths: js.UndefOr[SemanticWIDTHS | equal] = js.undefined
}

object StrictFormGroupProps {
  @scala.inline
  def apply(
    as: js.Any = null,
    children: VdomNode = null,
    className: String = null,
    grouped: js.UndefOr[Boolean] = js.undefined,
    `inline`: js.UndefOr[Boolean] = js.undefined,
    unstackable: js.UndefOr[Boolean] = js.undefined,
    widths: SemanticWIDTHS | equal = null
  ): StrictFormGroupProps = {
    val __obj = js.Dynamic.literal()
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(grouped)) __obj.updateDynamic("grouped")(grouped.asInstanceOf[js.Any])
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    if (!js.isUndefined(unstackable)) __obj.updateDynamic("unstackable")(unstackable.asInstanceOf[js.Any])
    if (widths != null) __obj.updateDynamic("widths")(widths.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictFormGroupProps]
  }
}

