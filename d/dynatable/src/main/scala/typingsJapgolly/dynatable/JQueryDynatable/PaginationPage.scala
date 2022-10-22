package typingsJapgolly.dynatable.JQueryDynatable

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaginationPage extends StObject {
  
  /** Parse the current window.location in order to determine the target page */
  def init(): Unit
  
  /**
    * Check if the paginate feature is enabled in `settings.features`
    *
    * @return A boolean
    */
  def initOnLoad(): Boolean
  
  /**
    * Set the page in the dataset
    *
    * @param page The new page number
    */
  def set(page: Double): Unit
}
object PaginationPage {
  
  inline def apply(init: Callback, initOnLoad: CallbackTo[Boolean], set: Double => Callback): PaginationPage = {
    val __obj = js.Dynamic.literal(init = init.toJsFn, initOnLoad = initOnLoad.toJsFn, set = js.Any.fromFunction1((t0: Double) => set(t0).runNow()))
    __obj.asInstanceOf[PaginationPage]
  }
  
  extension [Self <: PaginationPage](x: Self) {
    
    inline def setInit(value: Callback): Self = StObject.set(x, "init", value.toJsFn)
    
    inline def setInitOnLoad(value: CallbackTo[Boolean]): Self = StObject.set(x, "initOnLoad", value.toJsFn)
    
    inline def setSet(value: Double => Callback): Self = StObject.set(x, "set", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
