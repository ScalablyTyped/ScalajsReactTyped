package typingsJapgolly.activexLibreoffice.com_.sun.star.datatransfer.dnd

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for autoscroll support.
  *
  * During Drag and Drop operations it is possible that a user may wish to drop the subject of the operation on a region of a scrollable GUI control that
  * is not currently visible to the user.
  *
  * In such situations it is desirable that the GUI control detect this and institute a scroll operation in order to make obscured region(s) visible to
  * the user. This feature is known as autoscrolling.
  *
  * If a GUI control is both an active DropTarget and is also scrollable, it can receive notifications of autoscrolling gestures by the user from the Drag
  * and Drop system by implementing this interface.
  *
  * An autoscrolling gesture is initiated by the user by keeping the drag cursor motionless with a border region of the Component, referred to as the
  * "autoscrolling region", for a predefined period of time, this will result in repeated scroll requests to the Component until the drag Cursor resumes
  * its motion.
  */
trait XAutoscroll
  extends StObject
     with XInterface {
  
  /**
    * Returns the regions describing the autoscrolling region.
    * @returns The regions describing the autoscrolling region or border relative to the geometry of the implementing component.
    */
  val AutoscrollRegion: Any
  
  /**
    * Notify the component to autoscroll.
    * @param cursorLocationX X location of the cursor in pixel.
    * @param cursorLocationY Y location of the cursor in pixel.
    */
  def autoscroll(cursorLocationX: Double, cursorLocationY: Double): Unit
  
  /**
    * Returns the regions describing the autoscrolling region.
    * @returns The regions describing the autoscrolling region or border relative to the geometry of the implementing component.
    */
  def getAutoscrollRegion(): Any
}
object XAutoscroll {
  
  inline def apply(
    AutoscrollRegion: Any,
    acquire: Callback,
    autoscroll: (Double, Double) => Callback,
    getAutoscrollRegion: CallbackTo[Any],
    queryInterface: `type` => Any,
    release: Callback
  ): XAutoscroll = {
    val __obj = js.Dynamic.literal(AutoscrollRegion = AutoscrollRegion.asInstanceOf[js.Any], acquire = acquire.toJsFn, autoscroll = js.Any.fromFunction2((t0: Double, t1: Double) => (autoscroll(t0, t1)).runNow()), getAutoscrollRegion = getAutoscrollRegion.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XAutoscroll]
  }
  
  extension [Self <: XAutoscroll](x: Self) {
    
    inline def setAutoscroll(value: (Double, Double) => Callback): Self = StObject.set(x, "autoscroll", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setAutoscrollRegion(value: Any): Self = StObject.set(x, "AutoscrollRegion", value.asInstanceOf[js.Any])
    
    inline def setGetAutoscrollRegion(value: CallbackTo[Any]): Self = StObject.set(x, "getAutoscrollRegion", value.toJsFn)
  }
}
