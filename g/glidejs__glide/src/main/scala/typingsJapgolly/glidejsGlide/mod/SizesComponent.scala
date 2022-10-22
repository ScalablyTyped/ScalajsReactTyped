package typingsJapgolly.glidejsGlide.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SizesComponent
  extends StObject
     with Component {
  
  /**
    * Holds a number of slides.
    */
  val length: Double
  
  /**
    * Clears all applied dimensions from instance elements.
    */
  def remove(): Unit
  
  /**
    * Applies dimensions to the slide elements.
    */
  def setupSlides(): Unit
  
  /**
    * Applies dimensions to the slides wrapper element.
    */
  def setupWrapper(): Unit
  
  /**
    * Holds a dimension of the single slide reduced by settings.
    */
  val slideWidth: Double
  
  /**
    * Holds a dimension of the instance viewport.
    */
  val width: Double
  
  /**
    * Holds a dimension of the slides wrapper.
    */
  val wrapperWidth: Double
}
object SizesComponent {
  
  inline def apply(
    length: Double,
    remove: Callback,
    setupSlides: Callback,
    setupWrapper: Callback,
    slideWidth: Double,
    width: Double,
    wrapperWidth: Double
  ): SizesComponent = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], remove = remove.toJsFn, setupSlides = setupSlides.toJsFn, setupWrapper = setupWrapper.toJsFn, slideWidth = slideWidth.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], wrapperWidth = wrapperWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[SizesComponent]
  }
  
  extension [Self <: SizesComponent](x: Self) {
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setRemove(value: Callback): Self = StObject.set(x, "remove", value.toJsFn)
    
    inline def setSetupSlides(value: Callback): Self = StObject.set(x, "setupSlides", value.toJsFn)
    
    inline def setSetupWrapper(value: Callback): Self = StObject.set(x, "setupWrapper", value.toJsFn)
    
    inline def setSlideWidth(value: Double): Self = StObject.set(x, "slideWidth", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWrapperWidth(value: Double): Self = StObject.set(x, "wrapperWidth", value.asInstanceOf[js.Any])
  }
}
