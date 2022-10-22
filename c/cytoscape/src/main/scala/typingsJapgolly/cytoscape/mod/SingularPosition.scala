package typingsJapgolly.cytoscape.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * http://js.cytoscape.org/#collection/position--dimensions
  */
trait SingularPosition extends StObject {
  
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
  
  inline def apply(
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
    val __obj = js.Dynamic.literal(active = active.toJsFn, height = height.toJsFn, outerHeight = outerHeight.toJsFn, outerWidth = outerWidth.toJsFn, renderedHeight = renderedHeight.toJsFn, renderedOuterHeight = renderedOuterHeight.toJsFn, renderedOuterWidth = renderedOuterWidth.toJsFn, renderedWidth = renderedWidth.toJsFn, width = width.toJsFn)
    __obj.asInstanceOf[SingularPosition]
  }
  
  extension [Self <: SingularPosition](x: Self) {
    
    inline def setActive(value: CallbackTo[Boolean]): Self = StObject.set(x, "active", value.toJsFn)
    
    inline def setHeight(value: CallbackTo[Double]): Self = StObject.set(x, "height", value.toJsFn)
    
    inline def setOuterHeight(value: CallbackTo[Double]): Self = StObject.set(x, "outerHeight", value.toJsFn)
    
    inline def setOuterWidth(value: CallbackTo[Double]): Self = StObject.set(x, "outerWidth", value.toJsFn)
    
    inline def setRenderedHeight(value: CallbackTo[Double]): Self = StObject.set(x, "renderedHeight", value.toJsFn)
    
    inline def setRenderedOuterHeight(value: CallbackTo[Double]): Self = StObject.set(x, "renderedOuterHeight", value.toJsFn)
    
    inline def setRenderedOuterWidth(value: CallbackTo[Double]): Self = StObject.set(x, "renderedOuterWidth", value.toJsFn)
    
    inline def setRenderedWidth(value: CallbackTo[Double]): Self = StObject.set(x, "renderedWidth", value.toJsFn)
    
    inline def setWidth(value: CallbackTo[Double]): Self = StObject.set(x, "width", value.toJsFn)
  }
}
