package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides access to a collection of scenarios. */
trait XScenariosSupplier
  extends StObject
     with XInterface {
  
  /**
    * returns the collection of scenarios.
    * @see com.sun.star.sheet.Scenarios
    */
  val Scenarios: XScenarios
  
  /**
    * returns the collection of scenarios.
    * @see com.sun.star.sheet.Scenarios
    */
  def getScenarios(): XScenarios
}
object XScenariosSupplier {
  
  inline def apply(
    Scenarios: XScenarios,
    acquire: Callback,
    getScenarios: CallbackTo[XScenarios],
    queryInterface: `type` => Any,
    release: Callback
  ): XScenariosSupplier = {
    val __obj = js.Dynamic.literal(Scenarios = Scenarios.asInstanceOf[js.Any], acquire = acquire.toJsFn, getScenarios = getScenarios.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XScenariosSupplier]
  }
  
  extension [Self <: XScenariosSupplier](x: Self) {
    
    inline def setGetScenarios(value: CallbackTo[XScenarios]): Self = StObject.set(x, "getScenarios", value.toJsFn)
    
    inline def setScenarios(value: XScenarios): Self = StObject.set(x, "Scenarios", value.asInstanceOf[js.Any])
  }
}
