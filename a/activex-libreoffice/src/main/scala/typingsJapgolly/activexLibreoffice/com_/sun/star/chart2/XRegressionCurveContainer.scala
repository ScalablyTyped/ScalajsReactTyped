package typingsJapgolly.activexLibreoffice.com_.sun.star.chart2

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XRegressionCurveContainer
  extends StObject
     with XInterface {
  
  /** retrieve all regression curves */
  var RegressionCurves: SafeArray[XRegressionCurve]
  
  /**
    * add an regression curve to the container
    * @throws IllegalArgumentException If the given regression curve is already contained in the container.
    */
  def addRegressionCurve(aRegressionCurve: XRegressionCurve): Unit
  
  /** retrieve all regression curves */
  def getRegressionCurves(): SafeArray[XRegressionCurve]
  
  /** removes one regression curve from the container. */
  def removeRegressionCurve(aRegressionCurve: XRegressionCurve): Unit
  
  /** set all regression curves */
  def setRegressionCurves(aRegressionCurves: SeqEquiv[XRegressionCurve]): Unit
}
object XRegressionCurveContainer {
  
  inline def apply(
    RegressionCurves: SafeArray[XRegressionCurve],
    acquire: Callback,
    addRegressionCurve: XRegressionCurve => Callback,
    getRegressionCurves: CallbackTo[SafeArray[XRegressionCurve]],
    queryInterface: `type` => Any,
    release: Callback,
    removeRegressionCurve: XRegressionCurve => Callback,
    setRegressionCurves: SeqEquiv[XRegressionCurve] => Callback
  ): XRegressionCurveContainer = {
    val __obj = js.Dynamic.literal(RegressionCurves = RegressionCurves.asInstanceOf[js.Any], acquire = acquire.toJsFn, addRegressionCurve = js.Any.fromFunction1((t0: XRegressionCurve) => addRegressionCurve(t0).runNow()), getRegressionCurves = getRegressionCurves.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeRegressionCurve = js.Any.fromFunction1((t0: XRegressionCurve) => removeRegressionCurve(t0).runNow()), setRegressionCurves = js.Any.fromFunction1((t0: SeqEquiv[XRegressionCurve]) => setRegressionCurves(t0).runNow()))
    __obj.asInstanceOf[XRegressionCurveContainer]
  }
  
  extension [Self <: XRegressionCurveContainer](x: Self) {
    
    inline def setAddRegressionCurve(value: XRegressionCurve => Callback): Self = StObject.set(x, "addRegressionCurve", js.Any.fromFunction1((t0: XRegressionCurve) => value(t0).runNow()))
    
    inline def setGetRegressionCurves(value: CallbackTo[SafeArray[XRegressionCurve]]): Self = StObject.set(x, "getRegressionCurves", value.toJsFn)
    
    inline def setRegressionCurves(value: SafeArray[XRegressionCurve]): Self = StObject.set(x, "RegressionCurves", value.asInstanceOf[js.Any])
    
    inline def setRemoveRegressionCurve(value: XRegressionCurve => Callback): Self = StObject.set(x, "removeRegressionCurve", js.Any.fromFunction1((t0: XRegressionCurve) => value(t0).runNow()))
    
    inline def setSetRegressionCurves(value: SeqEquiv[XRegressionCurve] => Callback): Self = StObject.set(x, "setRegressionCurves", js.Any.fromFunction1((t0: SeqEquiv[XRegressionCurve]) => value(t0).runNow()))
  }
}
