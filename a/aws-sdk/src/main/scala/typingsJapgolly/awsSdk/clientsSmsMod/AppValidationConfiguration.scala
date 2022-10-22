package typingsJapgolly.awsSdk.clientsSmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppValidationConfiguration extends StObject {
  
  /**
    * The validation strategy.
    */
  var appValidationStrategy: js.UndefOr[AppValidationStrategy] = js.undefined
  
  /**
    * The name of the configuration.
    */
  var name: js.UndefOr[NonEmptyStringWithMaxLen255] = js.undefined
  
  /**
    * The validation parameters.
    */
  var ssmValidationParameters: js.UndefOr[SSMValidationParameters] = js.undefined
  
  /**
    * The ID of the validation.
    */
  var validationId: js.UndefOr[ValidationId] = js.undefined
}
object AppValidationConfiguration {
  
  inline def apply(): AppValidationConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppValidationConfiguration]
  }
  
  extension [Self <: AppValidationConfiguration](x: Self) {
    
    inline def setAppValidationStrategy(value: AppValidationStrategy): Self = StObject.set(x, "appValidationStrategy", value.asInstanceOf[js.Any])
    
    inline def setAppValidationStrategyUndefined: Self = StObject.set(x, "appValidationStrategy", js.undefined)
    
    inline def setName(value: NonEmptyStringWithMaxLen255): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSsmValidationParameters(value: SSMValidationParameters): Self = StObject.set(x, "ssmValidationParameters", value.asInstanceOf[js.Any])
    
    inline def setSsmValidationParametersUndefined: Self = StObject.set(x, "ssmValidationParameters", js.undefined)
    
    inline def setValidationId(value: ValidationId): Self = StObject.set(x, "validationId", value.asInstanceOf[js.Any])
    
    inline def setValidationIdUndefined: Self = StObject.set(x, "validationId", js.undefined)
  }
}
