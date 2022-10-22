package typingsJapgolly.antvGLite

import org.scalajs.dom.EventTarget
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.PointerEvent
import org.scalajs.dom.TouchEvent
import org.scalajs.dom.Window
import typingsJapgolly.antvGLite.distDisplayObjectsDisplayObjectMod.DisplayObject
import typingsJapgolly.antvGLite.distDomFederatedEventMod.FederatedEvent
import typingsJapgolly.antvGLite.distServicesMod.EventService
import typingsJapgolly.antvGLite.distShapesPointMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDomFederatedMouseEventMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.std.Event because var conflicts: AT_TARGET, BUBBLING_PHASE, CAPTURING_PHASE, NONE, bubbles, cancelBubble, currentTarget, defaultPrevented, eventPhase, isTrusted, returnValue, srcElement, target, timeStamp, `type`. Inlined 
  - typingsJapgolly.std.UIEvent because var conflicts: AT_TARGET, BUBBLING_PHASE, CAPTURING_PHASE, NONE, bubbles, cancelBubble, currentTarget, defaultPrevented, detail, eventPhase, isTrusted, returnValue, srcElement, target, timeStamp, `type`, view, which. Inlined 
  - typingsJapgolly.std.MouseEvent because var conflicts: AT_TARGET, BUBBLING_PHASE, CAPTURING_PHASE, NONE, bubbles, cancelBubble, currentTarget, defaultPrevented, detail, eventPhase, isTrusted, pageX, pageY, returnValue, srcElement, target, timeStamp, `type`, view, which, x, y. Inlined metaKey, shiftKey, screenY, altKey, offsetX, clientY, screenX, ctrlKey, movementY, movementX, buttons, button, offsetY, clientX, relatedTarget, getModifierState, initMouseEvent, initMouseEvent */ @JSImport("@antv/g-lite/dist/dom/FederatedMouseEvent", "FederatedMouseEvent")
  @js.native
  /**
    * The event boundary which manages this event. Propagation can only occur
    *  within the boundary's jurisdiction.
    */
  open class FederatedMouseEvent () extends FederatedEvent[MouseEvent | PointerEvent | TouchEvent, Any] {
    def this(manager: EventService) = this()
    
    /** Whether the "alt" key was pressed when this mouse event occurred. */
    var altKey: Boolean = js.native
    
    /** The specific button that was pressed in this mouse event. */
    var button: Double = js.native
    
    /** The button depressed when this event occurred. */
    var buttons: Double = js.native
    
    /**
      * The coordinates of the mouse event relative to the canvas.
      */
    var client: Point = js.native
    
    def clientX: Double = js.native
    /* standard dom */
    @JSName("clientX")
    val clientX_FFederatedMouseEvent: Double = js.native
    
    def clientY: Double = js.native
    /* standard dom */
    @JSName("clientY")
    val clientY_FFederatedMouseEvent: Double = js.native
    
    /** Whether the "control" key was pressed when this mouse event occurred. */
    var ctrlKey: Boolean = js.native
    
    /* standard dom */
    def getModifierState(key: String): Boolean = js.native
    
    /**
      * The pointer coordinates in world space.
      */
    var global: Point = js.native
    
    def globalX: Double = js.native
    
    def globalY: Double = js.native
    
    def initMouseEvent(): Unit = js.native
    /** @deprecated */
    /* standard dom */
    def initMouseEvent(
      typeArg: String,
      canBubbleArg: Boolean,
      cancelableArg: Boolean,
      viewArg: Window,
      detailArg: Double,
      screenXArg: Double,
      screenYArg: Double,
      clientXArg: Double,
      clientYArg: Double,
      ctrlKeyArg: Boolean,
      altKeyArg: Boolean,
      shiftKeyArg: Boolean,
      metaKeyArg: Boolean,
      buttonArg: Double
    ): Unit = js.native
    def initMouseEvent(
      typeArg: String,
      canBubbleArg: Boolean,
      cancelableArg: Boolean,
      viewArg: Window,
      detailArg: Double,
      screenXArg: Double,
      screenYArg: Double,
      clientXArg: Double,
      clientYArg: Double,
      ctrlKeyArg: Boolean,
      altKeyArg: Boolean,
      shiftKeyArg: Boolean,
      metaKeyArg: Boolean,
      buttonArg: Double,
      relatedTargetArg: EventTarget
    ): Unit = js.native
    
    /** Whether the "meta" key was pressed when this mouse event occurred. */
    var metaKey: Boolean = js.native
    
    /**
      * The movement in this pointer relative to the last `mousemove` event.
      */
    var movement: Point = js.native
    
    def movementX: Double = js.native
    /* standard dom */
    @JSName("movementX")
    val movementX_FFederatedMouseEvent: Double = js.native
    
    def movementY: Double = js.native
    /* standard dom */
    @JSName("movementY")
    val movementY_FFederatedMouseEvent: Double = js.native
    
    /**
      * The offset of the pointer coordinates w.r.t. target DisplayObject in world space. This is
      * not supported at the moment.
      */
    var offset: Point = js.native
    
    def offsetX: Double = js.native
    /* standard dom */
    @JSName("offsetX")
    val offsetX_FFederatedMouseEvent: Double = js.native
    
    def offsetY: Double = js.native
    /* standard dom */
    @JSName("offsetY")
    val offsetY_FFederatedMouseEvent: Double = js.native
    
    /** This is currently not implemented in the Federated Events API. */
    var relatedTarget: (DisplayObject[Any, Any]) | EventTarget | Null = js.native
    
    /**
      * The pointer coordinates in sceen space.
      */
    var screen: Point = js.native
    
    def screenX: Double = js.native
    /* standard dom */
    @JSName("screenX")
    val screenX_FFederatedMouseEvent: Double = js.native
    
    def screenY: Double = js.native
    /* standard dom */
    @JSName("screenY")
    val screenY_FFederatedMouseEvent: Double = js.native
    
    /** Whether the "shift" key was pressed when this mouse event occurred. */
    var shiftKey: Boolean = js.native
  }
}
