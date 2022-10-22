package typingsJapgolly.overlayscrollbars.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.Event
import org.scalajs.dom.MouseEvent
import typingsJapgolly.overlayscrollbars.anon.X
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Compatibility extends StObject {
  
  def bind(func: js.Function1[/* repeated */ Any, Any], thisObj: Any, args: Any*): Any
  
  def cAF(): js.Function1[/* requestID */ Double, Unit]
  
  def inA[T](item: T, array: js.Array[T]): Double
  
  def isA(obj: Any): Boolean
  
  def mBtn(event: MouseEvent): Double
  
  def mO(): Any
  
  def now(): Double
  
  def page(event: MouseEvent): X
  
  def prvD(event: Event): Unit
  
  def rAF(): js.Function1[/* callback */ js.Function1[/* repeated */ Any, Any], Double]
  
  def rO(): Any
  
  def stpP(event: Event): Unit
  
  def `type`(obj: Any): String
  
  def wH(): Double
  
  def wW(): Double
}
object Compatibility {
  
  inline def apply(
    bind: (js.Function1[/* repeated */ Any, Any], Any, /* repeated */ Any) => Any,
    cAF: CallbackTo[js.Function1[/* requestID */ Double, Unit]],
    inA: (Any, js.Array[Any]) => Double,
    isA: Any => Boolean,
    mBtn: MouseEvent => Double,
    mO: CallbackTo[Any],
    now: CallbackTo[Double],
    page: MouseEvent => X,
    prvD: Event => Callback,
    rAF: CallbackTo[js.Function1[/* callback */ js.Function1[/* repeated */ Any, Any], Double]],
    rO: CallbackTo[Any],
    stpP: Event => Callback,
    `type`: Any => String,
    wH: CallbackTo[Double],
    wW: CallbackTo[Double]
  ): Compatibility = {
    val __obj = js.Dynamic.literal(bind = js.Any.fromFunction3(bind), cAF = cAF.toJsFn, inA = js.Any.fromFunction2(inA), isA = js.Any.fromFunction1(isA), mBtn = js.Any.fromFunction1(mBtn), mO = mO.toJsFn, now = now.toJsFn, page = js.Any.fromFunction1(page), prvD = js.Any.fromFunction1((t0: Event) => prvD(t0).runNow()), rAF = rAF.toJsFn, rO = rO.toJsFn, stpP = js.Any.fromFunction1((t0: Event) => stpP(t0).runNow()), wH = wH.toJsFn, wW = wW.toJsFn)
    __obj.updateDynamic("type")(js.Any.fromFunction1(`type`))
    __obj.asInstanceOf[Compatibility]
  }
  
  extension [Self <: Compatibility](x: Self) {
    
    inline def setBind(value: (js.Function1[/* repeated */ Any, Any], Any, /* repeated */ Any) => Any): Self = StObject.set(x, "bind", js.Any.fromFunction3(value))
    
    inline def setCAF(value: CallbackTo[js.Function1[/* requestID */ Double, Unit]]): Self = StObject.set(x, "cAF", value.toJsFn)
    
    inline def setInA(value: (Any, js.Array[Any]) => Double): Self = StObject.set(x, "inA", js.Any.fromFunction2(value))
    
    inline def setIsA(value: Any => Boolean): Self = StObject.set(x, "isA", js.Any.fromFunction1(value))
    
    inline def setMBtn(value: MouseEvent => Double): Self = StObject.set(x, "mBtn", js.Any.fromFunction1(value))
    
    inline def setMO(value: CallbackTo[Any]): Self = StObject.set(x, "mO", value.toJsFn)
    
    inline def setNow(value: CallbackTo[Double]): Self = StObject.set(x, "now", value.toJsFn)
    
    inline def setPage(value: MouseEvent => X): Self = StObject.set(x, "page", js.Any.fromFunction1(value))
    
    inline def setPrvD(value: Event => Callback): Self = StObject.set(x, "prvD", js.Any.fromFunction1((t0: Event) => value(t0).runNow()))
    
    inline def setRAF(value: CallbackTo[js.Function1[/* callback */ js.Function1[/* repeated */ Any, Any], Double]]): Self = StObject.set(x, "rAF", value.toJsFn)
    
    inline def setRO(value: CallbackTo[Any]): Self = StObject.set(x, "rO", value.toJsFn)
    
    inline def setStpP(value: Event => Callback): Self = StObject.set(x, "stpP", js.Any.fromFunction1((t0: Event) => value(t0).runNow()))
    
    inline def setType(value: Any => String): Self = StObject.set(x, "type", js.Any.fromFunction1(value))
    
    inline def setWH(value: CallbackTo[Double]): Self = StObject.set(x, "wH", value.toJsFn)
    
    inline def setWW(value: CallbackTo[Double]): Self = StObject.set(x, "wW", value.toJsFn)
  }
}
