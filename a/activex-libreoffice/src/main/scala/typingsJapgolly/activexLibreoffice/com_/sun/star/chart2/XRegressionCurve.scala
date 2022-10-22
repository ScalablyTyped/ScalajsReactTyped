package typingsJapgolly.activexLibreoffice.com_.sun.star.chart2

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XRegressionCurve
  extends StObject
     with XInterface {
  
  val Calculator: XRegressionCurveCalculator
  
  var EquationProperties: XPropertySet
  
  def getCalculator(): XRegressionCurveCalculator
  
  def getEquationProperties(): XPropertySet
  
  def setEquationProperties(xEquationProperties: XPropertySet): Unit
}
object XRegressionCurve {
  
  inline def apply(
    Calculator: XRegressionCurveCalculator,
    EquationProperties: XPropertySet,
    acquire: Callback,
    getCalculator: CallbackTo[XRegressionCurveCalculator],
    getEquationProperties: CallbackTo[XPropertySet],
    queryInterface: `type` => Any,
    release: Callback,
    setEquationProperties: XPropertySet => Callback
  ): XRegressionCurve = {
    val __obj = js.Dynamic.literal(Calculator = Calculator.asInstanceOf[js.Any], EquationProperties = EquationProperties.asInstanceOf[js.Any], acquire = acquire.toJsFn, getCalculator = getCalculator.toJsFn, getEquationProperties = getEquationProperties.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setEquationProperties = js.Any.fromFunction1((t0: XPropertySet) => setEquationProperties(t0).runNow()))
    __obj.asInstanceOf[XRegressionCurve]
  }
  
  extension [Self <: XRegressionCurve](x: Self) {
    
    inline def setCalculator(value: XRegressionCurveCalculator): Self = StObject.set(x, "Calculator", value.asInstanceOf[js.Any])
    
    inline def setEquationProperties(value: XPropertySet): Self = StObject.set(x, "EquationProperties", value.asInstanceOf[js.Any])
    
    inline def setGetCalculator(value: CallbackTo[XRegressionCurveCalculator]): Self = StObject.set(x, "getCalculator", value.toJsFn)
    
    inline def setGetEquationProperties(value: CallbackTo[XPropertySet]): Self = StObject.set(x, "getEquationProperties", value.toJsFn)
    
    inline def setSetEquationProperties(value: XPropertySet => Callback): Self = StObject.set(x, "setEquationProperties", js.Any.fromFunction1((t0: XPropertySet) => value(t0).runNow()))
  }
}
