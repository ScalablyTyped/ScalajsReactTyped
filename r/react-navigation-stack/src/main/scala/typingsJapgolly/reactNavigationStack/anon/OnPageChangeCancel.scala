package typingsJapgolly.reactNavigationStack.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnPageChangeCancel extends StObject {
  
  def onPageChangeCancel(): Unit
  
  def onPageChangeConfirm(force: Boolean): Unit
  
  def onPageChangeStart(): Unit
}
object OnPageChangeCancel {
  
  inline def apply(
    onPageChangeCancel: Callback,
    onPageChangeConfirm: Boolean => Callback,
    onPageChangeStart: Callback
  ): OnPageChangeCancel = {
    val __obj = js.Dynamic.literal(onPageChangeCancel = onPageChangeCancel.toJsFn, onPageChangeConfirm = js.Any.fromFunction1((t0: Boolean) => onPageChangeConfirm(t0).runNow()), onPageChangeStart = onPageChangeStart.toJsFn)
    __obj.asInstanceOf[OnPageChangeCancel]
  }
  
  extension [Self <: OnPageChangeCancel](x: Self) {
    
    inline def setOnPageChangeCancel(value: Callback): Self = StObject.set(x, "onPageChangeCancel", value.toJsFn)
    
    inline def setOnPageChangeConfirm(value: Boolean => Callback): Self = StObject.set(x, "onPageChangeConfirm", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setOnPageChangeStart(value: Callback): Self = StObject.set(x, "onPageChangeStart", value.toJsFn)
  }
}
