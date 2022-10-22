package typingsJapgolly.activexLibreoffice.com_.sun.star.chart2

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XScaling
  extends StObject
     with XInterface {
  
  /**
    * Get an interface object that conforms to a scaling rule that is the reverse of the original scaling rule.
    * @returns internface object that represents the reversed scaling rule.
    */
  val InverseScaling: XScaling
  
  /**
    * Given a numeric value, return the scaled value that conforms to a predefined scaling rule. For instance, for linear scaling, given a x value, the
    * method may return a y value as defined by y = Ax + B for predefined values of A and B.
    * @param value input value from which to calculate the scaled value.
    * @returns scaled value based on a predefined scaling rule.
    */
  def doScaling(value: Double): Double
  
  /**
    * Get an interface object that conforms to a scaling rule that is the reverse of the original scaling rule.
    * @returns internface object that represents the reversed scaling rule.
    */
  def getInverseScaling(): XScaling
}
object XScaling {
  
  inline def apply(
    InverseScaling: XScaling,
    acquire: Callback,
    doScaling: Double => Double,
    getInverseScaling: CallbackTo[XScaling],
    queryInterface: `type` => Any,
    release: Callback
  ): XScaling = {
    val __obj = js.Dynamic.literal(InverseScaling = InverseScaling.asInstanceOf[js.Any], acquire = acquire.toJsFn, doScaling = js.Any.fromFunction1(doScaling), getInverseScaling = getInverseScaling.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XScaling]
  }
  
  extension [Self <: XScaling](x: Self) {
    
    inline def setDoScaling(value: Double => Double): Self = StObject.set(x, "doScaling", js.Any.fromFunction1(value))
    
    inline def setGetInverseScaling(value: CallbackTo[XScaling]): Self = StObject.set(x, "getInverseScaling", value.toJsFn)
    
    inline def setInverseScaling(value: XScaling): Self = StObject.set(x, "InverseScaling", value.asInstanceOf[js.Any])
  }
}
