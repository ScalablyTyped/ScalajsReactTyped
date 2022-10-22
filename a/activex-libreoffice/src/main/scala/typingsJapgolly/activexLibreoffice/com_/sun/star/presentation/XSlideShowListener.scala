package typingsJapgolly.activexLibreoffice.com_.sun.star.presentation

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.animations.XAnimationListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.animations.XAnimationNode
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Listener interface to receive global slide show events.
  * @see XShapeEventListener
  * @since OOo 3.0
  */
trait XSlideShowListener
  extends StObject
     with XAnimationListener {
  
  /**
    * Notifies that a hyperlink has been clicked.
    * @param hyperLink hyperlink URL
    */
  def hyperLinkClicked(hyperLink: String): Unit
  
  /** Notify that the slide show is paused */
  def paused(): Unit
  
  /** Notify that the slide show is resumed from a paused state */
  def resumed(): Unit
  
  /** Notify that the last animation from the main sequence of the current slide has ended. */
  def slideAnimationsEnded(): Unit
  
  /**
    * Notify that the current slide has ended, e.g. the user has clicked on the slide. Calling displaySlide() twice will not issue this event.
    * @param reverse For the default order (forward) this flag is `FALSE` . When the main sequence was traversed in reverse order then this flag is `TRUE` .
    */
  def slideEnded(reverse: Boolean): Unit
  
  /** Notify that the slide transition of the current slide ended. */
  def slideTransitionEnded(): Unit
  
  /** Notify that a new slide starts to become visible. */
  def slideTransitionStarted(): Unit
}
object XSlideShowListener {
  
  inline def apply(
    acquire: Callback,
    beginEvent: XAnimationNode => Callback,
    disposing: EventObject => Callback,
    endEvent: XAnimationNode => Callback,
    hyperLinkClicked: String => Callback,
    paused: Callback,
    queryInterface: `type` => Any,
    release: Callback,
    repeat: (XAnimationNode, Double) => Callback,
    resumed: Callback,
    slideAnimationsEnded: Callback,
    slideEnded: Boolean => Callback,
    slideTransitionEnded: Callback,
    slideTransitionStarted: Callback
  ): XSlideShowListener = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, beginEvent = js.Any.fromFunction1((t0: XAnimationNode) => beginEvent(t0).runNow()), disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), endEvent = js.Any.fromFunction1((t0: XAnimationNode) => endEvent(t0).runNow()), hyperLinkClicked = js.Any.fromFunction1((t0: String) => hyperLinkClicked(t0).runNow()), paused = paused.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, repeat = js.Any.fromFunction2((t0: XAnimationNode, t1: Double) => (repeat(t0, t1)).runNow()), resumed = resumed.toJsFn, slideAnimationsEnded = slideAnimationsEnded.toJsFn, slideEnded = js.Any.fromFunction1((t0: Boolean) => slideEnded(t0).runNow()), slideTransitionEnded = slideTransitionEnded.toJsFn, slideTransitionStarted = slideTransitionStarted.toJsFn)
    __obj.asInstanceOf[XSlideShowListener]
  }
  
  extension [Self <: XSlideShowListener](x: Self) {
    
    inline def setHyperLinkClicked(value: String => Callback): Self = StObject.set(x, "hyperLinkClicked", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setPaused(value: Callback): Self = StObject.set(x, "paused", value.toJsFn)
    
    inline def setResumed(value: Callback): Self = StObject.set(x, "resumed", value.toJsFn)
    
    inline def setSlideAnimationsEnded(value: Callback): Self = StObject.set(x, "slideAnimationsEnded", value.toJsFn)
    
    inline def setSlideEnded(value: Boolean => Callback): Self = StObject.set(x, "slideEnded", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSlideTransitionEnded(value: Callback): Self = StObject.set(x, "slideTransitionEnded", value.toJsFn)
    
    inline def setSlideTransitionStarted(value: Callback): Self = StObject.set(x, "slideTransitionStarted", value.toJsFn)
  }
}
