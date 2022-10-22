package typingsJapgolly.reactReconciler.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactReconciler.anon.EndTime
import typingsJapgolly.reactReconciler.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransitionTracingCallbacks extends StObject {
  
  var onMarkerComplete: js.UndefOr[
    js.Function4[
      /* transitionName */ String, 
      /* marker */ String, 
      /* startTime */ Double, 
      /* endTime */ Double, 
      Unit
    ]
  ] = js.undefined
  
  var onMarkerIncomplete: js.UndefOr[
    js.Function4[
      /* transitionName */ String, 
      /* marker */ String, 
      /* startTime */ Double, 
      /* deletions */ js.Array[EndTime], 
      Unit
    ]
  ] = js.undefined
  
  var onMarkerProgress: js.UndefOr[
    js.Function5[
      /* transitionName */ String, 
      /* marker */ String, 
      /* startTime */ Double, 
      /* currentTime */ Double, 
      /* pending */ js.Array[Name], 
      Unit
    ]
  ] = js.undefined
  
  var onTransitionComplete: js.UndefOr[
    js.Function3[/* transitionName */ String, /* startTime */ Double, /* endTime */ Double, Unit]
  ] = js.undefined
  
  var onTransitionIncomplete: js.UndefOr[
    js.Function3[
      /* transitionName */ String, 
      /* startTime */ Double, 
      /* deletions */ js.Array[EndTime], 
      Unit
    ]
  ] = js.undefined
  
  var onTransitionProgress: js.UndefOr[
    js.Function4[
      /* transitionName */ String, 
      /* startTime */ Double, 
      /* currentTime */ Double, 
      /* pending */ js.Array[Name], 
      Unit
    ]
  ] = js.undefined
  
  var onTransitionStart: js.UndefOr[js.Function2[/* transitionName */ String, /* startTime */ Double, Unit]] = js.undefined
}
object TransitionTracingCallbacks {
  
  inline def apply(): TransitionTracingCallbacks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitionTracingCallbacks]
  }
  
  extension [Self <: TransitionTracingCallbacks](x: Self) {
    
    inline def setOnMarkerComplete(
      value: (/* transitionName */ String, /* marker */ String, /* startTime */ Double, /* endTime */ Double) => Callback
    ): Self = StObject.set(x, "onMarkerComplete", js.Any.fromFunction4((t0: /* transitionName */ String, t1: /* marker */ String, t2: /* startTime */ Double, t3: /* endTime */ Double) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setOnMarkerCompleteUndefined: Self = StObject.set(x, "onMarkerComplete", js.undefined)
    
    inline def setOnMarkerIncomplete(
      value: (/* transitionName */ String, /* marker */ String, /* startTime */ Double, /* deletions */ js.Array[EndTime]) => Callback
    ): Self = StObject.set(x, "onMarkerIncomplete", js.Any.fromFunction4((t0: /* transitionName */ String, t1: /* marker */ String, t2: /* startTime */ Double, t3: /* deletions */ js.Array[EndTime]) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setOnMarkerIncompleteUndefined: Self = StObject.set(x, "onMarkerIncomplete", js.undefined)
    
    inline def setOnMarkerProgress(
      value: (/* transitionName */ String, /* marker */ String, /* startTime */ Double, /* currentTime */ Double, /* pending */ js.Array[Name]) => Callback
    ): Self = StObject.set(x, "onMarkerProgress", js.Any.fromFunction5((t0: /* transitionName */ String, t1: /* marker */ String, t2: /* startTime */ Double, t3: /* currentTime */ Double, t4: /* pending */ js.Array[Name]) => (value(t0, t1, t2, t3, t4)).runNow()))
    
    inline def setOnMarkerProgressUndefined: Self = StObject.set(x, "onMarkerProgress", js.undefined)
    
    inline def setOnTransitionComplete(value: (/* transitionName */ String, /* startTime */ Double, /* endTime */ Double) => Callback): Self = StObject.set(x, "onTransitionComplete", js.Any.fromFunction3((t0: /* transitionName */ String, t1: /* startTime */ Double, t2: /* endTime */ Double) => (value(t0, t1, t2)).runNow()))
    
    inline def setOnTransitionCompleteUndefined: Self = StObject.set(x, "onTransitionComplete", js.undefined)
    
    inline def setOnTransitionIncomplete(
      value: (/* transitionName */ String, /* startTime */ Double, /* deletions */ js.Array[EndTime]) => Callback
    ): Self = StObject.set(x, "onTransitionIncomplete", js.Any.fromFunction3((t0: /* transitionName */ String, t1: /* startTime */ Double, t2: /* deletions */ js.Array[EndTime]) => (value(t0, t1, t2)).runNow()))
    
    inline def setOnTransitionIncompleteUndefined: Self = StObject.set(x, "onTransitionIncomplete", js.undefined)
    
    inline def setOnTransitionProgress(
      value: (/* transitionName */ String, /* startTime */ Double, /* currentTime */ Double, /* pending */ js.Array[Name]) => Callback
    ): Self = StObject.set(x, "onTransitionProgress", js.Any.fromFunction4((t0: /* transitionName */ String, t1: /* startTime */ Double, t2: /* currentTime */ Double, t3: /* pending */ js.Array[Name]) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setOnTransitionProgressUndefined: Self = StObject.set(x, "onTransitionProgress", js.undefined)
    
    inline def setOnTransitionStart(value: (/* transitionName */ String, /* startTime */ Double) => Callback): Self = StObject.set(x, "onTransitionStart", js.Any.fromFunction2((t0: /* transitionName */ String, t1: /* startTime */ Double) => (value(t0, t1)).runNow()))
    
    inline def setOnTransitionStartUndefined: Self = StObject.set(x, "onTransitionStart", js.undefined)
  }
}
