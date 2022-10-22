package typingsJapgolly.semanticUiApi.anon

import typingsJapgolly.semanticUiApi.SemanticUI.Api.ErrorSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-api.SemanticUI.Api.ErrorSettings._Impl, 'exitConditions'> & std.Partial<std.Pick<semantic-ui-api.SemanticUI.Api.ErrorSettings._Impl, keyof semantic-ui-api.SemanticUI.Api.ErrorSettings._Impl>> */
trait PickImplexitConditionsPar
  extends StObject
     with Param {
  
  var JSONParse: js.UndefOr[String] = js.undefined
  
  var beforeSend: js.UndefOr[String] = js.undefined
  
  var error: js.UndefOr[String] = js.undefined
  
  var exitConditions: String & js.UndefOr[String]
  
  var legacyParameters: js.UndefOr[String] = js.undefined
  
  var missingAction: js.UndefOr[String] = js.undefined
  
  var missingSerialize: js.UndefOr[String] = js.undefined
  
  var missingURL: js.UndefOr[String] = js.undefined
  
  var noReturnedValue: js.UndefOr[String] = js.undefined
  
  var parseError: js.UndefOr[String] = js.undefined
  
  var requiredParameter: js.UndefOr[String] = js.undefined
  
  var statusMessage: js.UndefOr[String] = js.undefined
  
  var timeout: js.UndefOr[String] = js.undefined
}
object PickImplexitConditionsPar {
  
  inline def apply(exitConditions: String & js.UndefOr[String]): PickImplexitConditionsPar = {
    val __obj = js.Dynamic.literal(exitConditions = exitConditions.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplexitConditionsPar]
  }
  
  extension [Self <: PickImplexitConditionsPar](x: Self) {
    
    inline def setBeforeSend(value: String): Self = StObject.set(x, "beforeSend", value.asInstanceOf[js.Any])
    
    inline def setBeforeSendUndefined: Self = StObject.set(x, "beforeSend", js.undefined)
    
    inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setExitConditions(value: String & js.UndefOr[String]): Self = StObject.set(x, "exitConditions", value.asInstanceOf[js.Any])
    
    inline def setJSONParse(value: String): Self = StObject.set(x, "JSONParse", value.asInstanceOf[js.Any])
    
    inline def setJSONParseUndefined: Self = StObject.set(x, "JSONParse", js.undefined)
    
    inline def setLegacyParameters(value: String): Self = StObject.set(x, "legacyParameters", value.asInstanceOf[js.Any])
    
    inline def setLegacyParametersUndefined: Self = StObject.set(x, "legacyParameters", js.undefined)
    
    inline def setMissingAction(value: String): Self = StObject.set(x, "missingAction", value.asInstanceOf[js.Any])
    
    inline def setMissingActionUndefined: Self = StObject.set(x, "missingAction", js.undefined)
    
    inline def setMissingSerialize(value: String): Self = StObject.set(x, "missingSerialize", value.asInstanceOf[js.Any])
    
    inline def setMissingSerializeUndefined: Self = StObject.set(x, "missingSerialize", js.undefined)
    
    inline def setMissingURL(value: String): Self = StObject.set(x, "missingURL", value.asInstanceOf[js.Any])
    
    inline def setMissingURLUndefined: Self = StObject.set(x, "missingURL", js.undefined)
    
    inline def setNoReturnedValue(value: String): Self = StObject.set(x, "noReturnedValue", value.asInstanceOf[js.Any])
    
    inline def setNoReturnedValueUndefined: Self = StObject.set(x, "noReturnedValue", js.undefined)
    
    inline def setParseError(value: String): Self = StObject.set(x, "parseError", value.asInstanceOf[js.Any])
    
    inline def setParseErrorUndefined: Self = StObject.set(x, "parseError", js.undefined)
    
    inline def setRequiredParameter(value: String): Self = StObject.set(x, "requiredParameter", value.asInstanceOf[js.Any])
    
    inline def setRequiredParameterUndefined: Self = StObject.set(x, "requiredParameter", js.undefined)
    
    inline def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
    
    inline def setTimeout(value: String): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
