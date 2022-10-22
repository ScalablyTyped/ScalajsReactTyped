package typingsJapgolly.activexLibreoffice.com_.sun.star.chart2.data

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** allows access to a one-dimensional sequence of double precision floating-point numbers. */
trait XNumericalDataSequence
  extends StObject
     with XInterface {
  
  /** retrieves data as `double` values. */
  val NumericalData: SafeArray[Double]
  
  /** retrieves data as `double` values. */
  def getNumericalData(): SafeArray[Double]
}
object XNumericalDataSequence {
  
  inline def apply(
    NumericalData: SafeArray[Double],
    acquire: Callback,
    getNumericalData: CallbackTo[SafeArray[Double]],
    queryInterface: `type` => Any,
    release: Callback
  ): XNumericalDataSequence = {
    val __obj = js.Dynamic.literal(NumericalData = NumericalData.asInstanceOf[js.Any], acquire = acquire.toJsFn, getNumericalData = getNumericalData.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XNumericalDataSequence]
  }
  
  extension [Self <: XNumericalDataSequence](x: Self) {
    
    inline def setGetNumericalData(value: CallbackTo[SafeArray[Double]]): Self = StObject.set(x, "getNumericalData", value.toJsFn)
    
    inline def setNumericalData(value: SafeArray[Double]): Self = StObject.set(x, "NumericalData", value.asInstanceOf[js.Any])
  }
}
