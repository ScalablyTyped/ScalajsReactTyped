package typingsJapgolly.fbjs

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDommousemovetrackerMod {
  
  @JSImport("fbjs/lib/DOMMouseMoveTracker", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with DOMMouseMoveTracker {
    // tslint:disable-next-line:ban-types
    def this(onMove: js.Function, onMoveEnd: js.Function, domNode: HTMLElement) = this()
    
    /* CompleteClass */
    override def _didMouseMove(): Unit = js.native
    
    /**
      * Calls onMove passed into constructor and updates internal state.
      */
    /* CompleteClass */
    override def _onMouseMove(/*object*/
    event: js.Object): Unit = js.native
    
    /**
      * Calls onMoveEnd passed into constructor and updates internal state.
      */
    /* CompleteClass */
    override def _onMouseUp(): Unit = js.native
    
    /**
      * This is to set up the listeners for listening to mouse move
      * and mouse up signaling the movement has ended. Please note that these
      * listeners are added at the document.body level. It takes in an event
      * in order to grab inital state.
      */
    /* CompleteClass */
    override def captureMouseMoves(event: js.Object): Unit = js.native
    
    /**
      * Returns whether or not if the mouse movement is being tracked.
      */
    /* CompleteClass */
    override def isDragging(): Boolean = js.native
    
    /**
      * These releases all of the listeners on document.body.
      */
    /* CompleteClass */
    override def releaseMouseMoves(): Unit = js.native
  }
  
  trait DOMMouseMoveTracker extends StObject {
    
    def _didMouseMove(): Unit
    
    /**
      * Calls onMove passed into constructor and updates internal state.
      */
    def _onMouseMove(/*object*/
    event: js.Object): Unit
    
    /**
      * Calls onMoveEnd passed into constructor and updates internal state.
      */
    def _onMouseUp(): Unit
    
    /**
      * This is to set up the listeners for listening to mouse move
      * and mouse up signaling the movement has ended. Please note that these
      * listeners are added at the document.body level. It takes in an event
      * in order to grab inital state.
      */
    def captureMouseMoves(event: js.Object): Unit
    
    /**
      * Returns whether or not if the mouse movement is being tracked.
      */
    def isDragging(): Boolean
    
    /**
      * These releases all of the listeners on document.body.
      */
    def releaseMouseMoves(): Unit
  }
  object DOMMouseMoveTracker {
    
    inline def apply(
      _didMouseMove: Callback,
      _onMouseMove: js.Object => Callback,
      _onMouseUp: Callback,
      captureMouseMoves: js.Object => Callback,
      isDragging: CallbackTo[Boolean],
      releaseMouseMoves: Callback
    ): DOMMouseMoveTracker = {
      val __obj = js.Dynamic.literal(_didMouseMove = _didMouseMove.toJsFn, _onMouseMove = js.Any.fromFunction1((t0: js.Object) => _onMouseMove(t0).runNow()), _onMouseUp = _onMouseUp.toJsFn, captureMouseMoves = js.Any.fromFunction1((t0: js.Object) => captureMouseMoves(t0).runNow()), isDragging = isDragging.toJsFn, releaseMouseMoves = releaseMouseMoves.toJsFn)
      __obj.asInstanceOf[DOMMouseMoveTracker]
    }
    
    extension [Self <: DOMMouseMoveTracker](x: Self) {
      
      inline def setCaptureMouseMoves(value: js.Object => Callback): Self = StObject.set(x, "captureMouseMoves", js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()))
      
      inline def setIsDragging(value: CallbackTo[Boolean]): Self = StObject.set(x, "isDragging", value.toJsFn)
      
      inline def setReleaseMouseMoves(value: Callback): Self = StObject.set(x, "releaseMouseMoves", value.toJsFn)
      
      inline def set_didMouseMove(value: Callback): Self = StObject.set(x, "_didMouseMove", value.toJsFn)
      
      inline def set_onMouseMove(value: js.Object => Callback): Self = StObject.set(x, "_onMouseMove", js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()))
      
      inline def set_onMouseUp(value: Callback): Self = StObject.set(x, "_onMouseUp", value.toJsFn)
    }
  }
}
