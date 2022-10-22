package typingsJapgolly.reactNativeWindows.rntypesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PanResponderCallbacks extends StObject {
  
  var onMoveShouldSetPanResponder: js.UndefOr[
    js.Function2[
      ReactEventFrom[NodeHandle & Element], 
      /* gestureState */ PanResponderGestureState, 
      Boolean
    ]
  ] = js.undefined
  
  var onMoveShouldSetPanResponderCapture: js.UndefOr[
    js.Function2[
      ReactEventFrom[NodeHandle & Element], 
      /* gestureState */ PanResponderGestureState, 
      Boolean
    ]
  ] = js.undefined
  
  var onPanResponderEnd: js.UndefOr[
    js.Function2[
      ReactEventFrom[NodeHandle & Element], 
      /* gestureState */ PanResponderGestureState, 
      Unit
    ]
  ] = js.undefined
  
  var onPanResponderGrant: js.UndefOr[
    js.Function2[
      ReactEventFrom[NodeHandle & Element], 
      /* gestureState */ PanResponderGestureState, 
      Unit
    ]
  ] = js.undefined
  
  var onPanResponderMove: js.UndefOr[
    js.Function2[
      ReactEventFrom[NodeHandle & Element], 
      /* gestureState */ PanResponderGestureState, 
      Unit
    ]
  ] = js.undefined
  
  var onPanResponderReject: js.UndefOr[
    js.Function2[
      ReactEventFrom[NodeHandle & Element], 
      /* gestureState */ PanResponderGestureState, 
      Unit
    ]
  ] = js.undefined
  
  var onPanResponderRelease: js.UndefOr[
    js.Function2[
      ReactEventFrom[NodeHandle & Element], 
      /* gestureState */ PanResponderGestureState, 
      Unit
    ]
  ] = js.undefined
  
  var onPanResponderStart: js.UndefOr[
    js.Function2[
      ReactEventFrom[NodeHandle & Element], 
      /* gestureState */ PanResponderGestureState, 
      Unit
    ]
  ] = js.undefined
  
  var onPanResponderTerminate: js.UndefOr[
    js.Function2[
      ReactEventFrom[NodeHandle & Element], 
      /* gestureState */ PanResponderGestureState, 
      Unit
    ]
  ] = js.undefined
  
  var onPanResponderTerminationRequest: js.UndefOr[
    js.Function2[
      ReactEventFrom[NodeHandle & Element], 
      /* gestureState */ PanResponderGestureState, 
      Boolean
    ]
  ] = js.undefined
  
  var onShouldBlockNativeResponder: js.UndefOr[
    js.Function2[
      ReactEventFrom[NodeHandle & Element], 
      /* gestureState */ PanResponderGestureState, 
      Boolean
    ]
  ] = js.undefined
  
  var onStartShouldSetPanResponder: js.UndefOr[
    js.Function2[
      ReactEventFrom[NodeHandle & Element], 
      /* gestureState */ PanResponderGestureState, 
      Boolean
    ]
  ] = js.undefined
  
  var onStartShouldSetPanResponderCapture: js.UndefOr[
    js.Function2[
      ReactEventFrom[NodeHandle & Element], 
      /* gestureState */ PanResponderGestureState, 
      Boolean
    ]
  ] = js.undefined
}
object PanResponderCallbacks {
  
  inline def apply(): PanResponderCallbacks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PanResponderCallbacks]
  }
  
  extension [Self <: PanResponderCallbacks](x: Self) {
    
    inline def setOnMoveShouldSetPanResponder(
      value: (ReactEventFrom[NodeHandle & Element], /* gestureState */ PanResponderGestureState) => Boolean
    ): Self = StObject.set(x, "onMoveShouldSetPanResponder", js.Any.fromFunction2(value))
    
    inline def setOnMoveShouldSetPanResponderCapture(
      value: (ReactEventFrom[NodeHandle & Element], /* gestureState */ PanResponderGestureState) => Boolean
    ): Self = StObject.set(x, "onMoveShouldSetPanResponderCapture", js.Any.fromFunction2(value))
    
    inline def setOnMoveShouldSetPanResponderCaptureUndefined: Self = StObject.set(x, "onMoveShouldSetPanResponderCapture", js.undefined)
    
    inline def setOnMoveShouldSetPanResponderUndefined: Self = StObject.set(x, "onMoveShouldSetPanResponder", js.undefined)
    
    inline def setOnPanResponderEnd(
      value: (ReactEventFrom[NodeHandle & Element], /* gestureState */ PanResponderGestureState) => Callback
    ): Self = StObject.set(x, "onPanResponderEnd", js.Any.fromFunction2((t0: ReactEventFrom[NodeHandle & Element], t1: /* gestureState */ PanResponderGestureState) => (value(t0, t1)).runNow()))
    
    inline def setOnPanResponderEndUndefined: Self = StObject.set(x, "onPanResponderEnd", js.undefined)
    
    inline def setOnPanResponderGrant(
      value: (ReactEventFrom[NodeHandle & Element], /* gestureState */ PanResponderGestureState) => Callback
    ): Self = StObject.set(x, "onPanResponderGrant", js.Any.fromFunction2((t0: ReactEventFrom[NodeHandle & Element], t1: /* gestureState */ PanResponderGestureState) => (value(t0, t1)).runNow()))
    
    inline def setOnPanResponderGrantUndefined: Self = StObject.set(x, "onPanResponderGrant", js.undefined)
    
    inline def setOnPanResponderMove(
      value: (ReactEventFrom[NodeHandle & Element], /* gestureState */ PanResponderGestureState) => Callback
    ): Self = StObject.set(x, "onPanResponderMove", js.Any.fromFunction2((t0: ReactEventFrom[NodeHandle & Element], t1: /* gestureState */ PanResponderGestureState) => (value(t0, t1)).runNow()))
    
    inline def setOnPanResponderMoveUndefined: Self = StObject.set(x, "onPanResponderMove", js.undefined)
    
    inline def setOnPanResponderReject(
      value: (ReactEventFrom[NodeHandle & Element], /* gestureState */ PanResponderGestureState) => Callback
    ): Self = StObject.set(x, "onPanResponderReject", js.Any.fromFunction2((t0: ReactEventFrom[NodeHandle & Element], t1: /* gestureState */ PanResponderGestureState) => (value(t0, t1)).runNow()))
    
    inline def setOnPanResponderRejectUndefined: Self = StObject.set(x, "onPanResponderReject", js.undefined)
    
    inline def setOnPanResponderRelease(
      value: (ReactEventFrom[NodeHandle & Element], /* gestureState */ PanResponderGestureState) => Callback
    ): Self = StObject.set(x, "onPanResponderRelease", js.Any.fromFunction2((t0: ReactEventFrom[NodeHandle & Element], t1: /* gestureState */ PanResponderGestureState) => (value(t0, t1)).runNow()))
    
    inline def setOnPanResponderReleaseUndefined: Self = StObject.set(x, "onPanResponderRelease", js.undefined)
    
    inline def setOnPanResponderStart(
      value: (ReactEventFrom[NodeHandle & Element], /* gestureState */ PanResponderGestureState) => Callback
    ): Self = StObject.set(x, "onPanResponderStart", js.Any.fromFunction2((t0: ReactEventFrom[NodeHandle & Element], t1: /* gestureState */ PanResponderGestureState) => (value(t0, t1)).runNow()))
    
    inline def setOnPanResponderStartUndefined: Self = StObject.set(x, "onPanResponderStart", js.undefined)
    
    inline def setOnPanResponderTerminate(
      value: (ReactEventFrom[NodeHandle & Element], /* gestureState */ PanResponderGestureState) => Callback
    ): Self = StObject.set(x, "onPanResponderTerminate", js.Any.fromFunction2((t0: ReactEventFrom[NodeHandle & Element], t1: /* gestureState */ PanResponderGestureState) => (value(t0, t1)).runNow()))
    
    inline def setOnPanResponderTerminateUndefined: Self = StObject.set(x, "onPanResponderTerminate", js.undefined)
    
    inline def setOnPanResponderTerminationRequest(
      value: (ReactEventFrom[NodeHandle & Element], /* gestureState */ PanResponderGestureState) => Boolean
    ): Self = StObject.set(x, "onPanResponderTerminationRequest", js.Any.fromFunction2(value))
    
    inline def setOnPanResponderTerminationRequestUndefined: Self = StObject.set(x, "onPanResponderTerminationRequest", js.undefined)
    
    inline def setOnShouldBlockNativeResponder(
      value: (ReactEventFrom[NodeHandle & Element], /* gestureState */ PanResponderGestureState) => Boolean
    ): Self = StObject.set(x, "onShouldBlockNativeResponder", js.Any.fromFunction2(value))
    
    inline def setOnShouldBlockNativeResponderUndefined: Self = StObject.set(x, "onShouldBlockNativeResponder", js.undefined)
    
    inline def setOnStartShouldSetPanResponder(
      value: (ReactEventFrom[NodeHandle & Element], /* gestureState */ PanResponderGestureState) => Boolean
    ): Self = StObject.set(x, "onStartShouldSetPanResponder", js.Any.fromFunction2(value))
    
    inline def setOnStartShouldSetPanResponderCapture(
      value: (ReactEventFrom[NodeHandle & Element], /* gestureState */ PanResponderGestureState) => Boolean
    ): Self = StObject.set(x, "onStartShouldSetPanResponderCapture", js.Any.fromFunction2(value))
    
    inline def setOnStartShouldSetPanResponderCaptureUndefined: Self = StObject.set(x, "onStartShouldSetPanResponderCapture", js.undefined)
    
    inline def setOnStartShouldSetPanResponderUndefined: Self = StObject.set(x, "onStartShouldSetPanResponder", js.undefined)
  }
}
