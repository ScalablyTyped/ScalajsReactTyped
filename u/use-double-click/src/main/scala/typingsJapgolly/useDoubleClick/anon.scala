package typingsJapgolly.useDoubleClick

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.React.RefHandle
import org.scalajs.dom.Element
import typingsJapgolly.react.mod.MutableRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Latency[T] extends StObject {
    
    /** The amount of time (in milliseconds) to wait before differentiating a single from a double click. Defaults to 300. */
    var latency: js.UndefOr[Double] = js.undefined
    
    /** A callback function for double click events */
    var onDoubleClick: js.UndefOr[js.Function1[/* e */ ReactMouseEventFrom[Element], Unit]] = js.undefined
    
    /** A callback function for single click events */
    var onSingleClick: js.UndefOr[js.Function1[/* e */ ReactMouseEventFrom[Element], Unit]] = js.undefined
    
    /** Dom node to watch for double clicks */
    var ref: RefHandle[T] | MutableRefObject[T]
  }
  object Latency {
    
    inline def apply[T](ref: RefHandle[T] | MutableRefObject[T]): Latency[T] = {
      val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any])
      __obj.asInstanceOf[Latency[T]]
    }
    
    extension [Self <: Latency[?], T](x: Self & Latency[T]) {
      
      inline def setLatency(value: Double): Self = StObject.set(x, "latency", value.asInstanceOf[js.Any])
      
      inline def setLatencyUndefined: Self = StObject.set(x, "latency", js.undefined)
      
      inline def setOnDoubleClick(value: /* e */ ReactMouseEventFrom[Element] => Callback): Self = StObject.set(x, "onDoubleClick", js.Any.fromFunction1((t0: /* e */ ReactMouseEventFrom[Element]) => value(t0).runNow()))
      
      inline def setOnDoubleClickUndefined: Self = StObject.set(x, "onDoubleClick", js.undefined)
      
      inline def setOnSingleClick(value: /* e */ ReactMouseEventFrom[Element] => Callback): Self = StObject.set(x, "onSingleClick", js.Any.fromFunction1((t0: /* e */ ReactMouseEventFrom[Element]) => value(t0).runNow()))
      
      inline def setOnSingleClickUndefined: Self = StObject.set(x, "onSingleClick", js.undefined)
      
      inline def setRef(value: RefHandle[T] | MutableRefObject[T]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    }
  }
}
