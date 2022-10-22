package typingsJapgolly.materializeCss.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<materialize-css.M.Carousel, 'set'> */
trait PickCarouselset extends StObject {
  
  def set(): Unit
  def set(n: Double): Unit
  @JSName("set")
  var set_Original: js.Function1[/* n */ js.UndefOr[Double], Unit]
}
object PickCarouselset {
  
  inline def apply(set: /* n */ js.UndefOr[Double] => Callback): PickCarouselset = {
    val __obj = js.Dynamic.literal(set = js.Any.fromFunction1((t0: /* n */ js.UndefOr[Double]) => set(t0).runNow()))
    __obj.asInstanceOf[PickCarouselset]
  }
  
  extension [Self <: PickCarouselset](x: Self) {
    
    inline def setSet(value: /* n */ js.UndefOr[Double] => Callback): Self = StObject.set(x, "set", js.Any.fromFunction1((t0: /* n */ js.UndefOr[Double]) => value(t0).runNow()))
  }
}
