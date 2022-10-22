package typingsJapgolly.awsSdk.clientsPersonalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultContinuousHyperParameterRange extends StObject {
  
  /**
    * Whether the hyperparameter is tunable.
    */
  var isTunable: js.UndefOr[Tunable] = js.undefined
  
  /**
    * The maximum allowable value for the hyperparameter.
    */
  var maxValue: js.UndefOr[ContinuousMaxValue] = js.undefined
  
  /**
    * The minimum allowable value for the hyperparameter.
    */
  var minValue: js.UndefOr[ContinuousMinValue] = js.undefined
  
  /**
    * The name of the hyperparameter.
    */
  var name: js.UndefOr[ParameterName] = js.undefined
}
object DefaultContinuousHyperParameterRange {
  
  inline def apply(): DefaultContinuousHyperParameterRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultContinuousHyperParameterRange]
  }
  
  extension [Self <: DefaultContinuousHyperParameterRange](x: Self) {
    
    inline def setIsTunable(value: Tunable): Self = StObject.set(x, "isTunable", value.asInstanceOf[js.Any])
    
    inline def setIsTunableUndefined: Self = StObject.set(x, "isTunable", js.undefined)
    
    inline def setMaxValue(value: ContinuousMaxValue): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    inline def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
    
    inline def setMinValue(value: ContinuousMinValue): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    inline def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
    
    inline def setName(value: ParameterName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
