package typingsJapgolly.awsSdk.clientsForecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeaturizationMethod extends StObject {
  
  /**
    * The name of the method. The "filling" method is the only supported method.
    */
  var FeaturizationMethodName: typingsJapgolly.awsSdk.clientsForecastserviceMod.FeaturizationMethodName
  
  /**
    * The method parameters (key-value pairs), which are a map of override parameters. Specify these parameters to override the default values. Related Time Series attributes do not accept aggregation parameters. The following list shows the parameters and their valid values for the "filling" featurization method for a Target Time Series dataset. Bold signifies the default value.    aggregation: sum, avg, first, min, max     frontfill: none     middlefill: zero, nan (not a number), value, median, mean, min, max     backfill: zero, nan, value, median, mean, min, max    The following list shows the parameters and their valid values for a Related Time Series featurization method (there are no defaults):    middlefill: zero, value, median, mean, min, max     backfill: zero, value, median, mean, min, max     futurefill: zero, value, median, mean, min, max    To set a filling method to a specific value, set the fill parameter to value and define the value in a corresponding _value parameter. For example, to set backfilling to a value of 2, include the following: "backfill": "value" and "backfill_value":"2". 
    */
  var FeaturizationMethodParameters: js.UndefOr[typingsJapgolly.awsSdk.clientsForecastserviceMod.FeaturizationMethodParameters] = js.undefined
}
object FeaturizationMethod {
  
  inline def apply(FeaturizationMethodName: FeaturizationMethodName): FeaturizationMethod = {
    val __obj = js.Dynamic.literal(FeaturizationMethodName = FeaturizationMethodName.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeaturizationMethod]
  }
  
  extension [Self <: FeaturizationMethod](x: Self) {
    
    inline def setFeaturizationMethodName(value: FeaturizationMethodName): Self = StObject.set(x, "FeaturizationMethodName", value.asInstanceOf[js.Any])
    
    inline def setFeaturizationMethodParameters(value: FeaturizationMethodParameters): Self = StObject.set(x, "FeaturizationMethodParameters", value.asInstanceOf[js.Any])
    
    inline def setFeaturizationMethodParametersUndefined: Self = StObject.set(x, "FeaturizationMethodParameters", js.undefined)
  }
}
