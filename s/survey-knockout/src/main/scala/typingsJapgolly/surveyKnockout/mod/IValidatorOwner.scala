package typingsJapgolly.surveyKnockout.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IValidatorOwner extends StObject {
  
  def getDataFilteredProperties(): Any
  
  def getDataFilteredValues(): Any
  
  def getValidatorTitle(): String
  
  def getValidators(): js.Array[SurveyValidator]
  
  var validatedValue: Any
}
object IValidatorOwner {
  
  inline def apply(
    getDataFilteredProperties: CallbackTo[Any],
    getDataFilteredValues: CallbackTo[Any],
    getValidatorTitle: CallbackTo[String],
    getValidators: CallbackTo[js.Array[SurveyValidator]],
    validatedValue: Any
  ): IValidatorOwner = {
    val __obj = js.Dynamic.literal(getDataFilteredProperties = getDataFilteredProperties.toJsFn, getDataFilteredValues = getDataFilteredValues.toJsFn, getValidatorTitle = getValidatorTitle.toJsFn, getValidators = getValidators.toJsFn, validatedValue = validatedValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[IValidatorOwner]
  }
  
  extension [Self <: IValidatorOwner](x: Self) {
    
    inline def setGetDataFilteredProperties(value: CallbackTo[Any]): Self = StObject.set(x, "getDataFilteredProperties", value.toJsFn)
    
    inline def setGetDataFilteredValues(value: CallbackTo[Any]): Self = StObject.set(x, "getDataFilteredValues", value.toJsFn)
    
    inline def setGetValidatorTitle(value: CallbackTo[String]): Self = StObject.set(x, "getValidatorTitle", value.toJsFn)
    
    inline def setGetValidators(value: CallbackTo[js.Array[SurveyValidator]]): Self = StObject.set(x, "getValidators", value.toJsFn)
    
    inline def setValidatedValue(value: Any): Self = StObject.set(x, "validatedValue", value.asInstanceOf[js.Any])
  }
}
