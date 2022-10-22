package typingsJapgolly.smartFoxServer.SFS2X

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Logger extends StObject {
  
  /**
    * Sets the current logging level.
    * @param {number} level The minimum logging level.
    */
  def setLevel(level: Double): Unit
}
object Logger {
  
  inline def apply(setLevel: Double => Callback): Logger = {
    val __obj = js.Dynamic.literal(setLevel = js.Any.fromFunction1((t0: Double) => setLevel(t0).runNow()))
    __obj.asInstanceOf[Logger]
  }
  
  extension [Self <: Logger](x: Self) {
    
    inline def setSetLevel(value: Double => Callback): Self = StObject.set(x, "setLevel", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
