package typingsJapgolly.activexLibreoffice.com_.sun.star.presentation

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.rendering.XBitmap
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * {@link TransitionFactory} interface to request optional custom Transition instances for slide show transitions.
  *
  * This interface provides the necessary methods to query and create optional transition effects for a {@link SlideShow}
  * @since OOo 2.4
  */
trait XTransitionFactory
  extends StObject
     with XInterface {
  
  /**
    * Actually create a transition for the given transition id
    * @param transitionType Main type of transition (
    * @param transitionSubType Subtype for the transition (
    * @param view Slide show view to display on
    * @param leavingBitmap Bitmap of the slide that's going to leave the screen
    * @param enteringBitmap Bitmap of the slide that's going to enter the screen
    * @see com.sun.star.animations.TransitionType)
    * @see com.sun.star.animations.TransitionSubType)
    */
  def createTransition(
    transitionType: Double,
    transitionSubType: Double,
    view: XSlideShowView,
    leavingBitmap: XBitmap,
    enteringBitmap: XBitmap
  ): XTransition
  
  /** Checks whether this instance provides an implementation for given transition id. */
  def hasTransition(transitionType: Double, transitionSubType: Double): Boolean
}
object XTransitionFactory {
  
  inline def apply(
    acquire: Callback,
    createTransition: (Double, Double, XSlideShowView, XBitmap, XBitmap) => XTransition,
    hasTransition: (Double, Double) => Boolean,
    queryInterface: `type` => Any,
    release: Callback
  ): XTransitionFactory = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, createTransition = js.Any.fromFunction5(createTransition), hasTransition = js.Any.fromFunction2(hasTransition), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XTransitionFactory]
  }
  
  extension [Self <: XTransitionFactory](x: Self) {
    
    inline def setCreateTransition(value: (Double, Double, XSlideShowView, XBitmap, XBitmap) => XTransition): Self = StObject.set(x, "createTransition", js.Any.fromFunction5(value))
    
    inline def setHasTransition(value: (Double, Double) => Boolean): Self = StObject.set(x, "hasTransition", js.Any.fromFunction2(value))
  }
}
