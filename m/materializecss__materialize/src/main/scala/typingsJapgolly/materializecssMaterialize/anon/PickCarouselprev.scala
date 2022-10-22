package typingsJapgolly.materializecssMaterialize.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@materializecss/materialize.M.Carousel, 'prev'> */
trait PickCarouselprev extends StObject {
  
  def prev(): Unit
  def prev(n: Double): Unit
  @JSName("prev")
  var prev_Original: js.Function1[/* n */ js.UndefOr[Double], Unit]
}
object PickCarouselprev {
  
  inline def apply(prev: /* n */ js.UndefOr[Double] => Callback): PickCarouselprev = {
    val __obj = js.Dynamic.literal(prev = js.Any.fromFunction1((t0: /* n */ js.UndefOr[Double]) => prev(t0).runNow()))
    __obj.asInstanceOf[PickCarouselprev]
  }
  
  extension [Self <: PickCarouselprev](x: Self) {
    
    inline def setPrev(value: /* n */ js.UndefOr[Double] => Callback): Self = StObject.set(x, "prev", js.Any.fromFunction1((t0: /* n */ js.UndefOr[Double]) => value(t0).runNow()))
  }
}
