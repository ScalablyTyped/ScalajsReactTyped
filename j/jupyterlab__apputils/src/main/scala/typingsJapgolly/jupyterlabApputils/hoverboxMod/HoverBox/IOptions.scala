package typingsJapgolly.jupyterlabApputils.hoverboxMod.HoverBox

import org.scalajs.dom.raw.CSSStyleDeclaration
import org.scalajs.dom.raw.ClientRect
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.jupyterlabApputils.AnonHorizontal
import typingsJapgolly.jupyterlabApputils.jupyterlabApputilsStrings.above
import typingsJapgolly.jupyterlabApputils.jupyterlabApputilsStrings.below
import typingsJapgolly.jupyterlabApputils.jupyterlabApputilsStrings.forceAbove
import typingsJapgolly.jupyterlabApputils.jupyterlabApputilsStrings.forceBelow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for setting the geometry of a hovering node and its anchor node.
  */
trait IOptions extends js.Object {
  /**
    * The referent anchor rectangle to which the hover box is bound.
    *
    * #### Notes
    * In an editor context, this value will typically be the cursor's
    * coordinate position, which can be retrieved via calling the
    * `getCoordinateForPosition` method.
    */
  var anchor: ClientRect
  /**
    * The node that hosts the anchor.
    *
    * #### Notes
    * The visibility of the anchor rectangle within this host node is the
    * heuristic that determines whether the hover box ought to be visible.
    */
  var host: HTMLElement
  /**
    * The maximum height of a hover box.
    *
    * #### Notes
    * This value is only used if a CSS max-height attribute is not set for the
    * hover box. It is a fallback value.
    */
  var maxHeight: Double
  /**
    * The minimum height of a hover box.
    */
  var minHeight: Double
  /**
    * The hover box node.
    */
  var node: HTMLElement
  /**
    * Optional pixel offset values added to where the hover box should render.
    *
    * #### Notes
    * This option is useful for passing in values that may pertain to CSS
    * borders or padding in cases where the text inside the hover box may need
    * to align with the text of the referent editor.
    *
    * Because the hover box calculation may render a box either above or below
    * the cursor, the `vertical` offset accepts `above` and `below` values for
    * the different render modes.
    */
  var offset: js.UndefOr[AnonHorizontal] = js.undefined
  /**
    * If space is available both above and below the anchor, denote which
    * location is privileged. Use forceBelow and forceAbove to mandate where
    * hover box should render relative to anchor.
    *
    * #### Notes
    * The default value is `'below'`.
    */
  var privilege: js.UndefOr[above | below | forceAbove | forceBelow] = js.undefined
  /**
    * If the style of the node has already been computed, it can be passed into
    * the hover box for geometry calculation.
    */
  var style: js.UndefOr[CSSStyleDeclaration] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    anchor: ClientRect,
    host: HTMLElement,
    maxHeight: Double,
    minHeight: Double,
    node: HTMLElement,
    offset: AnonHorizontal = null,
    privilege: above | below | forceAbove | forceBelow = null,
    style: CSSStyleDeclaration = null
  ): IOptions = {
    val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], maxHeight = maxHeight.asInstanceOf[js.Any], minHeight = minHeight.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (privilege != null) __obj.updateDynamic("privilege")(privilege.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

