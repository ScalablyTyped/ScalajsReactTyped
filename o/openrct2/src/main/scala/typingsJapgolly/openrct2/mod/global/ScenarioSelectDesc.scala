package typingsJapgolly.openrct2.mod.global

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Parameters for the scenario select window.
  */
trait ScenarioSelectDesc extends StObject {
  
  /**
    * The function to call when the user has selected a scenario.
    */
  def callback(scenario: ScenarioFile): Unit
}
object ScenarioSelectDesc {
  
  inline def apply(callback: ScenarioFile => Callback): ScenarioSelectDesc = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1((t0: ScenarioFile) => callback(t0).runNow()))
    __obj.asInstanceOf[ScenarioSelectDesc]
  }
  
  extension [Self <: ScenarioSelectDesc](x: Self) {
    
    inline def setCallback(value: ScenarioFile => Callback): Self = StObject.set(x, "callback", js.Any.fromFunction1((t0: ScenarioFile) => value(t0).runNow()))
  }
}
