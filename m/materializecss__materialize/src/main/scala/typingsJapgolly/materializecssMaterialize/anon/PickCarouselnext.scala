package typingsJapgolly.materializecssMaterialize.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@materializecss/materialize.M.Carousel, 'next'> */
trait PickCarouselnext extends StObject {
  
  def next(): Unit
  def next(n: Double): Unit
  @JSName("next")
  var next_Original: js.Function1[/* n */ js.UndefOr[Double], Unit]
}
object PickCarouselnext {
  
  inline def apply(next: /* n */ js.UndefOr[Double] => Callback): PickCarouselnext = {
    val __obj = js.Dynamic.literal(next = js.Any.fromFunction1((t0: /* n */ js.UndefOr[Double]) => next(t0).runNow()))
    __obj.asInstanceOf[PickCarouselnext]
  }
  
  extension [Self <: PickCarouselnext](x: Self) {
    
    inline def setNext(value: /* n */ js.UndefOr[Double] => Callback): Self = StObject.set(x, "next", js.Any.fromFunction1((t0: /* n */ js.UndefOr[Double]) => value(t0).runNow()))
  }
}
