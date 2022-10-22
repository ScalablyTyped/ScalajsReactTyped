package typingsJapgolly.angularSpinner

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISpinnerService extends StObject {
  
  /**
    * Start selected spinner
    *
    * @param spinner key
    */
  def spin(key: String): Unit
  
  /**
    * Stop selected spinner
    *
    * @param spinner key
    */
  def stop(key: String): Unit
}
object ISpinnerService {
  
  inline def apply(spin: String => Callback, stop: String => Callback): ISpinnerService = {
    val __obj = js.Dynamic.literal(spin = js.Any.fromFunction1((t0: String) => spin(t0).runNow()), stop = js.Any.fromFunction1((t0: String) => stop(t0).runNow()))
    __obj.asInstanceOf[ISpinnerService]
  }
  
  extension [Self <: ISpinnerService](x: Self) {
    
    inline def setSpin(value: String => Callback): Self = StObject.set(x, "spin", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setStop(value: String => Callback): Self = StObject.set(x, "stop", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
