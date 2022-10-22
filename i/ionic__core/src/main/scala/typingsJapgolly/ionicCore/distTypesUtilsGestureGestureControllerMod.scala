package typingsJapgolly.ionicCore

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilsGestureGestureControllerMod {
  
  @JSImport("@ionic/core/dist/types/utils/gesture/gesture-controller", "GESTURE_CONTROLLER")
  @js.native
  val GESTURE_CONTROLLER: GestureController = js.native
  
  trait BlockerConfig extends StObject {
    
    var disable: js.UndefOr[js.Array[String]] = js.undefined
    
    var disableScroll: js.UndefOr[Boolean] = js.undefined
  }
  object BlockerConfig {
    
    inline def apply(): BlockerConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BlockerConfig]
    }
    
    extension [Self <: BlockerConfig](x: Self) {
      
      inline def setDisable(value: js.Array[String]): Self = StObject.set(x, "disable", value.asInstanceOf[js.Any])
      
      inline def setDisableScroll(value: Boolean): Self = StObject.set(x, "disableScroll", value.asInstanceOf[js.Any])
      
      inline def setDisableScrollUndefined: Self = StObject.set(x, "disableScroll", js.undefined)
      
      inline def setDisableUndefined: Self = StObject.set(x, "disable", js.undefined)
      
      inline def setDisableVarargs(value: String*): Self = StObject.set(x, "disable", js.Array(value*))
    }
  }
  
  trait BlockerDelegate extends StObject {
    
    def block(): Unit
    
    /* private */ var ctrl: Any
    
    def destroy(): Unit
    
    /* private */ var disable: Any
    
    /* private */ var disableScroll: Any
    
    /* private */ var id: Any
    
    def unblock(): Unit
  }
  object BlockerDelegate {
    
    inline def apply(
      block: Callback,
      ctrl: Any,
      destroy: Callback,
      disable: Any,
      disableScroll: Any,
      id: Any,
      unblock: Callback
    ): BlockerDelegate = {
      val __obj = js.Dynamic.literal(block = block.toJsFn, ctrl = ctrl.asInstanceOf[js.Any], destroy = destroy.toJsFn, disable = disable.asInstanceOf[js.Any], disableScroll = disableScroll.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], unblock = unblock.toJsFn)
      __obj.asInstanceOf[BlockerDelegate]
    }
    
    extension [Self <: BlockerDelegate](x: Self) {
      
      inline def setBlock(value: Callback): Self = StObject.set(x, "block", value.toJsFn)
      
      inline def setCtrl(value: Any): Self = StObject.set(x, "ctrl", value.asInstanceOf[js.Any])
      
      inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
      
      inline def setDisable(value: Any): Self = StObject.set(x, "disable", value.asInstanceOf[js.Any])
      
      inline def setDisableScroll(value: Any): Self = StObject.set(x, "disableScroll", value.asInstanceOf[js.Any])
      
      inline def setId(value: Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setUnblock(value: Callback): Self = StObject.set(x, "unblock", value.toJsFn)
    }
  }
  
  trait GestureConfig extends StObject {
    
    var disableScroll: js.UndefOr[Boolean] = js.undefined
    
    var name: String
    
    var priority: js.UndefOr[Double] = js.undefined
  }
  object GestureConfig {
    
    inline def apply(name: String): GestureConfig = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GestureConfig]
    }
    
    extension [Self <: GestureConfig](x: Self) {
      
      inline def setDisableScroll(value: Boolean): Self = StObject.set(x, "disableScroll", value.asInstanceOf[js.Any])
      
      inline def setDisableScrollUndefined: Self = StObject.set(x, "disableScroll", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    }
  }
  
  @js.native
  trait GestureController extends StObject {
    
    def canStart(gestureName: String): Boolean = js.native
    
    def capture(gestureName: String, id: Double, priority: Double): Boolean = js.native
    
    /* private */ var capturedId: Any = js.native
    
    /**
      * Creates a blocker that will block any other gesture events from firing. Set in the ion-gesture component.
      */
    def createBlocker(): BlockerDelegate = js.native
    def createBlocker(opts: BlockerConfig): BlockerDelegate = js.native
    
    /**
      * Creates a gesture delegate based on the GestureConfig passed
      */
    def createGesture(config: GestureConfig): GestureDelegate = js.native
    
    def disableGesture(gestureName: String, id: Double): Unit = js.native
    
    def disableScroll(id: Double): Unit = js.native
    
    /* private */ var disabledGestures: Any = js.native
    
    /* private */ var disabledScroll: Any = js.native
    
    def enableGesture(gestureName: String, id: Double): Unit = js.native
    
    def enableScroll(id: Double): Unit = js.native
    
    /* private */ var gestureId: Any = js.native
    
    def isCaptured(): Boolean = js.native
    
    def isDisabled(gestureName: String): Boolean = js.native
    
    def isScrollDisabled(): Boolean = js.native
    
    /* private */ var newID: Any = js.native
    
    def release(id: Double): Unit = js.native
    
    /* private */ var requestedStart: Any = js.native
    
    def start(gestureName: String, id: Double, priority: Double): Boolean = js.native
  }
  
  trait GestureDelegate extends StObject {
    
    def canStart(): Boolean
    
    def capture(): Boolean
    
    /* private */ var ctrl: Any
    
    def destroy(): Unit
    
    /* private */ var disableScroll: Any
    
    /* private */ var id: Any
    
    /* private */ var name: Any
    
    /* private */ var priority: Any
    
    def release(): Unit
    
    def start(): Boolean
  }
  object GestureDelegate {
    
    inline def apply(
      canStart: CallbackTo[Boolean],
      capture: CallbackTo[Boolean],
      ctrl: Any,
      destroy: Callback,
      disableScroll: Any,
      id: Any,
      name: Any,
      priority: Any,
      release: Callback,
      start: CallbackTo[Boolean]
    ): GestureDelegate = {
      val __obj = js.Dynamic.literal(canStart = canStart.toJsFn, capture = capture.toJsFn, ctrl = ctrl.asInstanceOf[js.Any], destroy = destroy.toJsFn, disableScroll = disableScroll.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], release = release.toJsFn, start = start.toJsFn)
      __obj.asInstanceOf[GestureDelegate]
    }
    
    extension [Self <: GestureDelegate](x: Self) {
      
      inline def setCanStart(value: CallbackTo[Boolean]): Self = StObject.set(x, "canStart", value.toJsFn)
      
      inline def setCapture(value: CallbackTo[Boolean]): Self = StObject.set(x, "capture", value.toJsFn)
      
      inline def setCtrl(value: Any): Self = StObject.set(x, "ctrl", value.asInstanceOf[js.Any])
      
      inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
      
      inline def setDisableScroll(value: Any): Self = StObject.set(x, "disableScroll", value.asInstanceOf[js.Any])
      
      inline def setId(value: Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: Any): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPriority(value: Any): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setRelease(value: Callback): Self = StObject.set(x, "release", value.toJsFn)
      
      inline def setStart(value: CallbackTo[Boolean]): Self = StObject.set(x, "start", value.toJsFn)
    }
  }
}
