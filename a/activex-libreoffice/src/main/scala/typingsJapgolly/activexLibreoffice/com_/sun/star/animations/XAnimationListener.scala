package typingsJapgolly.activexLibreoffice.com_.sun.star.animations

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * makes it possible to register listeners, which are called whenever an animation event occurs.
  * @since OOo 3.0
  */
trait XAnimationListener
  extends StObject
     with XEventListener {
  
  /**
    * This event is raised when the element local timeline begins to play.
    *
    * It will be raised each time the element begins the active duration (i.e. when it restarts, but not when it repeats).
    *
    * It may be raised both in the course of normal (i.e. scheduled or interactive) timeline play, as well as in the case that the element was begun with an
    * interface method.
    * @param Node The node that begins to play.
    */
  def beginEvent(Node: XAnimationNode): Unit
  
  /**
    * This event is raised at the active end of the element.
    *
    * Note that this event is not raised at the simple end of each repeat.
    *
    * This event may be raised both in the course of normal (i.e. scheduled or interactive) timeline play, as well as in the case that the element was ended
    * with a DOM method.
    * @param Node The node that stops playing.
    */
  def endEvent(Node: XAnimationNode): Unit
  
  /**
    * This event is raised when the element local timeline repeats.
    *
    * It will be raised each time the element repeats, after the first iteration.
    *
    * Associated with the repeat event is an integer that indicates which repeat iteration is beginning.
    * @param Node The node that repeats.
    * @param Repeat The value is a 0-based integer, but the repeat event is not raised for the first iteration and so the observed values will be >= 1.
    */
  def repeat(Node: XAnimationNode, Repeat: Double): Unit
}
object XAnimationListener {
  
  inline def apply(
    acquire: Callback,
    beginEvent: XAnimationNode => Callback,
    disposing: EventObject => Callback,
    endEvent: XAnimationNode => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    repeat: (XAnimationNode, Double) => Callback
  ): XAnimationListener = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, beginEvent = js.Any.fromFunction1((t0: XAnimationNode) => beginEvent(t0).runNow()), disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), endEvent = js.Any.fromFunction1((t0: XAnimationNode) => endEvent(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, repeat = js.Any.fromFunction2((t0: XAnimationNode, t1: Double) => (repeat(t0, t1)).runNow()))
    __obj.asInstanceOf[XAnimationListener]
  }
  
  extension [Self <: XAnimationListener](x: Self) {
    
    inline def setBeginEvent(value: XAnimationNode => Callback): Self = StObject.set(x, "beginEvent", js.Any.fromFunction1((t0: XAnimationNode) => value(t0).runNow()))
    
    inline def setEndEvent(value: XAnimationNode => Callback): Self = StObject.set(x, "endEvent", js.Any.fromFunction1((t0: XAnimationNode) => value(t0).runNow()))
    
    inline def setRepeat(value: (XAnimationNode, Double) => Callback): Self = StObject.set(x, "repeat", js.Any.fromFunction2((t0: XAnimationNode, t1: Double) => (value(t0, t1)).runNow()))
  }
}
