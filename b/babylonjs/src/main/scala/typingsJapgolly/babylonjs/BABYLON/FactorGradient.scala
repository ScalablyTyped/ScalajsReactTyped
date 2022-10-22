package typingsJapgolly.babylonjs.BABYLON

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FactorGradient
  extends StObject
     with IValueGradient {
  
  /**
    * Gets or sets first associated factor
    */
  var factor1: Double
  
  /**
    * Gets or sets second associated factor
    */
  var factor2: js.UndefOr[Double] = js.undefined
  
  /**
    * Will get a number picked randomly between factor1 and factor2.
    * If factor2 is undefined then factor1 will be used
    * @returns the picked number
    */
  def getFactor(): Double
}
object FactorGradient {
  
  inline def apply(factor1: Double, getFactor: CallbackTo[Double], gradient: Double): FactorGradient = {
    val __obj = js.Dynamic.literal(factor1 = factor1.asInstanceOf[js.Any], getFactor = getFactor.toJsFn, gradient = gradient.asInstanceOf[js.Any])
    __obj.asInstanceOf[FactorGradient]
  }
  
  extension [Self <: FactorGradient](x: Self) {
    
    inline def setFactor1(value: Double): Self = StObject.set(x, "factor1", value.asInstanceOf[js.Any])
    
    inline def setFactor2(value: Double): Self = StObject.set(x, "factor2", value.asInstanceOf[js.Any])
    
    inline def setFactor2Undefined: Self = StObject.set(x, "factor2", js.undefined)
    
    inline def setGetFactor(value: CallbackTo[Double]): Self = StObject.set(x, "getFactor", value.toJsFn)
  }
}
