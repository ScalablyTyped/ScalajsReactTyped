package typingsJapgolly.useResizeObserver

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.RefHandle
import org.scalajs.dom.Element
import typingsJapgolly.useResizeObserver.mod.ObservedSize
import typingsJapgolly.useResizeObserver.mod.ResizeHandler
import typingsJapgolly.useResizeObserver.mod.ResizeObserverBoxOptions
import typingsJapgolly.useResizeObserver.mod.RoundingFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Box[T /* <: Element */] extends StObject {
    
    var box: js.UndefOr[ResizeObserverBoxOptions] = js.undefined
    
    var onResize: js.UndefOr[ResizeHandler] = js.undefined
    
    var ref: js.UndefOr[RefHandle[T] | T | Null] = js.undefined
    
    var round: js.UndefOr[RoundingFunction] = js.undefined
  }
  object Box {
    
    inline def apply[T /* <: Element */](): Box[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Box[T]]
    }
    
    extension [Self <: Box[?], T /* <: Element */](x: Self & Box[T]) {
      
      inline def setBox(value: ResizeObserverBoxOptions): Self = StObject.set(x, "box", value.asInstanceOf[js.Any])
      
      inline def setBoxUndefined: Self = StObject.set(x, "box", js.undefined)
      
      inline def setOnResize(value: /* size */ ObservedSize => Callback): Self = StObject.set(x, "onResize", js.Any.fromFunction1((t0: /* size */ ObservedSize) => value(t0).runNow()))
      
      inline def setOnResizeUndefined: Self = StObject.set(x, "onResize", js.undefined)
      
      inline def setRef(value: RefHandle[T] | T): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      inline def setRound(value: /* n */ Double => Double): Self = StObject.set(x, "round", js.Any.fromFunction1(value))
      
      inline def setRoundUndefined: Self = StObject.set(x, "round", js.undefined)
    }
  }
}
