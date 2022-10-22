package typingsJapgolly.webix.webix

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PagingAbility extends StObject {
  
  def getPage(): Double
  
  def getPager(): Any
  
  def setPage(page: Double): Unit
}
object PagingAbility {
  
  inline def apply(getPage: CallbackTo[Double], getPager: CallbackTo[Any], setPage: Double => Callback): PagingAbility = {
    val __obj = js.Dynamic.literal(getPage = getPage.toJsFn, getPager = getPager.toJsFn, setPage = js.Any.fromFunction1((t0: Double) => setPage(t0).runNow()))
    __obj.asInstanceOf[PagingAbility]
  }
  
  extension [Self <: PagingAbility](x: Self) {
    
    inline def setGetPage(value: CallbackTo[Double]): Self = StObject.set(x, "getPage", value.toJsFn)
    
    inline def setGetPager(value: CallbackTo[Any]): Self = StObject.set(x, "getPager", value.toJsFn)
    
    inline def setSetPage(value: Double => Callback): Self = StObject.set(x, "setPage", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
