package typingsJapgolly.cytoscape.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#collection/position--dimensions
  */
trait SingularPosition extends js.Object {
  /**
    * Gets whether the element is active (e.g. on user tap, grab, etc).
    * http://js.cytoscape.org/#ele.active
    */
  def active(): Boolean
  /**
    * Get the height of the element.
    */
  def height(): Double
  /**
    * Get the outer height of the element (includes height, padding, & border).
    */
  def outerHeight(): Double
  /**
    * Get the outer width of the element (includes width, padding, & border).
    */
  def outerWidth(): Double
  /**
    * Get the height of the element in rendered dimensions.
    */
  def renderedHeight(): Double
  /**
    * Get the outer height of the element (includes height, padding, & border) in rendered dimensions.
    */
  def renderedOuterHeight(): Double
  /**
    * Get the outer width of the element (includes width, padding, & border) in rendered dimensions.
    */
  def renderedOuterWidth(): Double
  /**
    * Get the width of the element in rendered dimensions.
    */
  def renderedWidth(): Double
  /**
    * Get the width of the element.
    */
  def width(): Double
}

object SingularPosition {
  @scala.inline
  def apply(
    active: CallbackTo[Boolean],
    height: CallbackTo[Double],
    outerHeight: CallbackTo[Double],
    outerWidth: CallbackTo[Double],
    renderedHeight: CallbackTo[Double],
    renderedOuterHeight: CallbackTo[Double],
    renderedOuterWidth: CallbackTo[Double],
    renderedWidth: CallbackTo[Double],
    width: CallbackTo[Double]
  ): SingularPosition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("active")(active.toJsFn)
    __obj.updateDynamic("height")(height.toJsFn)
    __obj.updateDynamic("outerHeight")(outerHeight.toJsFn)
    __obj.updateDynamic("outerWidth")(outerWidth.toJsFn)
    __obj.updateDynamic("renderedHeight")(renderedHeight.toJsFn)
    __obj.updateDynamic("renderedOuterHeight")(renderedOuterHeight.toJsFn)
    __obj.updateDynamic("renderedOuterWidth")(renderedOuterWidth.toJsFn)
    __obj.updateDynamic("renderedWidth")(renderedWidth.toJsFn)
    __obj.updateDynamic("width")(width.toJsFn)
    __obj.asInstanceOf[SingularPosition]
  }
}

