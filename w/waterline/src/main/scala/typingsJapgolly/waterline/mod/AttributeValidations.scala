package typingsJapgolly.waterline.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttributeValidations extends StObject {
  
  var custom: js.UndefOr[AttributeValidation[js.Function]] = js.undefined
  
  var isAfter: js.UndefOr[AttributeValidation[js.Date]] = js.undefined
  
  var isBefore: js.UndefOr[AttributeValidation[js.Date]] = js.undefined
  
  var isBoolean: js.UndefOr[AttributeValidation[Boolean]] = js.undefined
  
  var isCreditCard: js.UndefOr[AttributeValidation[Boolean]] = js.undefined
  
  var isEmail: js.UndefOr[AttributeValidation[Boolean]] = js.undefined
  
  var isHexColor: js.UndefOr[AttributeValidation[Boolean]] = js.undefined
  
  var isIP: js.UndefOr[AttributeValidation[Boolean]] = js.undefined
  
  var isIn: js.UndefOr[AttributeValidation[js.Array[String]]] = js.undefined
  
  var isInteger: js.UndefOr[AttributeValidation[Boolean]] = js.undefined
  
  var isNotEmptyString: js.UndefOr[AttributeValidation[Boolean]] = js.undefined
  
  var isNotIn: js.UndefOr[AttributeValidation[js.Array[String]]] = js.undefined
  
  var isNumber: js.UndefOr[AttributeValidation[Boolean]] = js.undefined
  
  var isString: js.UndefOr[AttributeValidation[Boolean]] = js.undefined
  
  var isURL: js.UndefOr[AttributeValidation[Boolean]] = js.undefined
  
  var isUUID: js.UndefOr[AttributeValidation[Boolean]] = js.undefined
  
  var max: js.UndefOr[AttributeValidation[Double]] = js.undefined
  
  var maxLength: js.UndefOr[AttributeValidation[Double]] = js.undefined
  
  var min: js.UndefOr[AttributeValidation[Double]] = js.undefined
  
  var minLength: js.UndefOr[AttributeValidation[Double]] = js.undefined
  
  var regex: js.UndefOr[AttributeValidation[js.RegExp]] = js.undefined
}
object AttributeValidations {
  
  inline def apply(): AttributeValidations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttributeValidations]
  }
  
  extension [Self <: AttributeValidations](x: Self) {
    
    inline def setCustom(value: AttributeValidation[js.Function]): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    inline def setCustomCallbackTo(value: CallbackTo[js.Function]): Self = StObject.set(x, "custom", value.toJsFn)
    
    inline def setCustomFunction1(value: /* cb */ js.Function1[js.Function, Any] => japgolly.scalajs.react.Callback): Self = StObject.set(x, "custom", js.Any.fromFunction1((t0: /* cb */ js.Function1[js.Function, Any]) => value(t0).runNow()))
    
    inline def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
    
    inline def setIsAfter(value: AttributeValidation[js.Date]): Self = StObject.set(x, "isAfter", value.asInstanceOf[js.Any])
    
    inline def setIsAfterCallbackTo(value: CallbackTo[js.Date]): Self = StObject.set(x, "isAfter", value.toJsFn)
    
    inline def setIsAfterFunction1(value: /* cb */ js.Function1[js.Date, Any] => japgolly.scalajs.react.Callback): Self = StObject.set(x, "isAfter", js.Any.fromFunction1((t0: /* cb */ js.Function1[js.Date, Any]) => value(t0).runNow()))
    
    inline def setIsAfterUndefined: Self = StObject.set(x, "isAfter", js.undefined)
    
    inline def setIsBefore(value: AttributeValidation[js.Date]): Self = StObject.set(x, "isBefore", value.asInstanceOf[js.Any])
    
    inline def setIsBeforeCallbackTo(value: CallbackTo[js.Date]): Self = StObject.set(x, "isBefore", value.toJsFn)
    
    inline def setIsBeforeFunction1(value: /* cb */ js.Function1[js.Date, Any] => japgolly.scalajs.react.Callback): Self = StObject.set(x, "isBefore", js.Any.fromFunction1((t0: /* cb */ js.Function1[js.Date, Any]) => value(t0).runNow()))
    
    inline def setIsBeforeUndefined: Self = StObject.set(x, "isBefore", js.undefined)
    
    inline def setIsBoolean(value: AttributeValidation[Boolean]): Self = StObject.set(x, "isBoolean", value.asInstanceOf[js.Any])
    
    inline def setIsBooleanCallbackTo(value: CallbackTo[Boolean]): Self = StObject.set(x, "isBoolean", value.toJsFn)
    
    inline def setIsBooleanFunction1(value: /* cb */ js.Function1[Boolean, Any] => japgolly.scalajs.react.Callback): Self = StObject.set(x, "isBoolean", js.Any.fromFunction1((t0: /* cb */ js.Function1[Boolean, Any]) => value(t0).runNow()))
    
    inline def setIsBooleanUndefined: Self = StObject.set(x, "isBoolean", js.undefined)
    
    inline def setIsCreditCard(value: AttributeValidation[Boolean]): Self = StObject.set(x, "isCreditCard", value.asInstanceOf[js.Any])
    
    inline def setIsCreditCardCallbackTo(value: CallbackTo[Boolean]): Self = StObject.set(x, "isCreditCard", value.toJsFn)
    
    inline def setIsCreditCardFunction1(value: /* cb */ js.Function1[Boolean, Any] => japgolly.scalajs.react.Callback): Self = StObject.set(x, "isCreditCard", js.Any.fromFunction1((t0: /* cb */ js.Function1[Boolean, Any]) => value(t0).runNow()))
    
    inline def setIsCreditCardUndefined: Self = StObject.set(x, "isCreditCard", js.undefined)
    
    inline def setIsEmail(value: AttributeValidation[Boolean]): Self = StObject.set(x, "isEmail", value.asInstanceOf[js.Any])
    
    inline def setIsEmailCallbackTo(value: CallbackTo[Boolean]): Self = StObject.set(x, "isEmail", value.toJsFn)
    
    inline def setIsEmailFunction1(value: /* cb */ js.Function1[Boolean, Any] => japgolly.scalajs.react.Callback): Self = StObject.set(x, "isEmail", js.Any.fromFunction1((t0: /* cb */ js.Function1[Boolean, Any]) => value(t0).runNow()))
    
    inline def setIsEmailUndefined: Self = StObject.set(x, "isEmail", js.undefined)
    
    inline def setIsHexColor(value: AttributeValidation[Boolean]): Self = StObject.set(x, "isHexColor", value.asInstanceOf[js.Any])
    
    inline def setIsHexColorCallbackTo(value: CallbackTo[Boolean]): Self = StObject.set(x, "isHexColor", value.toJsFn)
    
    inline def setIsHexColorFunction1(value: /* cb */ js.Function1[Boolean, Any] => japgolly.scalajs.react.Callback): Self = StObject.set(x, "isHexColor", js.Any.fromFunction1((t0: /* cb */ js.Function1[Boolean, Any]) => value(t0).runNow()))
    
    inline def setIsHexColorUndefined: Self = StObject.set(x, "isHexColor", js.undefined)
    
    inline def setIsIP(value: AttributeValidation[Boolean]): Self = StObject.set(x, "isIP", value.asInstanceOf[js.Any])
    
    inline def setIsIPCallbackTo(value: CallbackTo[Boolean]): Self = StObject.set(x, "isIP", value.toJsFn)
    
    inline def setIsIPFunction1(value: /* cb */ js.Function1[Boolean, Any] => japgolly.scalajs.react.Callback): Self = StObject.set(x, "isIP", js.Any.fromFunction1((t0: /* cb */ js.Function1[Boolean, Any]) => value(t0).runNow()))
    
    inline def setIsIPUndefined: Self = StObject.set(x, "isIP", js.undefined)
    
    inline def setIsIn(value: AttributeValidation[js.Array[String]]): Self = StObject.set(x, "isIn", value.asInstanceOf[js.Any])
    
    inline def setIsInCallbackTo(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "isIn", value.toJsFn)
    
    inline def setIsInFunction1(value: /* cb */ js.Function1[js.Array[String], Any] => japgolly.scalajs.react.Callback): Self = StObject.set(x, "isIn", js.Any.fromFunction1((t0: /* cb */ js.Function1[js.Array[String], Any]) => value(t0).runNow()))
    
    inline def setIsInUndefined: Self = StObject.set(x, "isIn", js.undefined)
    
    inline def setIsInVarargs(value: String*): Self = StObject.set(x, "isIn", js.Array(value*))
    
    inline def setIsInteger(value: AttributeValidation[Boolean]): Self = StObject.set(x, "isInteger", value.asInstanceOf[js.Any])
    
    inline def setIsIntegerCallbackTo(value: CallbackTo[Boolean]): Self = StObject.set(x, "isInteger", value.toJsFn)
    
    inline def setIsIntegerFunction1(value: /* cb */ js.Function1[Boolean, Any] => japgolly.scalajs.react.Callback): Self = StObject.set(x, "isInteger", js.Any.fromFunction1((t0: /* cb */ js.Function1[Boolean, Any]) => value(t0).runNow()))
    
    inline def setIsIntegerUndefined: Self = StObject.set(x, "isInteger", js.undefined)
    
    inline def setIsNotEmptyString(value: AttributeValidation[Boolean]): Self = StObject.set(x, "isNotEmptyString", value.asInstanceOf[js.Any])
    
    inline def setIsNotEmptyStringCallbackTo(value: CallbackTo[Boolean]): Self = StObject.set(x, "isNotEmptyString", value.toJsFn)
    
    inline def setIsNotEmptyStringFunction1(value: /* cb */ js.Function1[Boolean, Any] => japgolly.scalajs.react.Callback): Self = StObject.set(x, "isNotEmptyString", js.Any.fromFunction1((t0: /* cb */ js.Function1[Boolean, Any]) => value(t0).runNow()))
    
    inline def setIsNotEmptyStringUndefined: Self = StObject.set(x, "isNotEmptyString", js.undefined)
    
    inline def setIsNotIn(value: AttributeValidation[js.Array[String]]): Self = StObject.set(x, "isNotIn", value.asInstanceOf[js.Any])
    
    inline def setIsNotInCallbackTo(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "isNotIn", value.toJsFn)
    
    inline def setIsNotInFunction1(value: /* cb */ js.Function1[js.Array[String], Any] => japgolly.scalajs.react.Callback): Self = StObject.set(x, "isNotIn", js.Any.fromFunction1((t0: /* cb */ js.Function1[js.Array[String], Any]) => value(t0).runNow()))
    
    inline def setIsNotInUndefined: Self = StObject.set(x, "isNotIn", js.undefined)
    
    inline def setIsNotInVarargs(value: String*): Self = StObject.set(x, "isNotIn", js.Array(value*))
    
    inline def setIsNumber(value: AttributeValidation[Boolean]): Self = StObject.set(x, "isNumber", value.asInstanceOf[js.Any])
    
    inline def setIsNumberCallbackTo(value: CallbackTo[Boolean]): Self = StObject.set(x, "isNumber", value.toJsFn)
    
    inline def setIsNumberFunction1(value: /* cb */ js.Function1[Boolean, Any] => japgolly.scalajs.react.Callback): Self = StObject.set(x, "isNumber", js.Any.fromFunction1((t0: /* cb */ js.Function1[Boolean, Any]) => value(t0).runNow()))
    
    inline def setIsNumberUndefined: Self = StObject.set(x, "isNumber", js.undefined)
    
    inline def setIsString(value: AttributeValidation[Boolean]): Self = StObject.set(x, "isString", value.asInstanceOf[js.Any])
    
    inline def setIsStringCallbackTo(value: CallbackTo[Boolean]): Self = StObject.set(x, "isString", value.toJsFn)
    
    inline def setIsStringFunction1(value: /* cb */ js.Function1[Boolean, Any] => japgolly.scalajs.react.Callback): Self = StObject.set(x, "isString", js.Any.fromFunction1((t0: /* cb */ js.Function1[Boolean, Any]) => value(t0).runNow()))
    
    inline def setIsStringUndefined: Self = StObject.set(x, "isString", js.undefined)
    
    inline def setIsURL(value: AttributeValidation[Boolean]): Self = StObject.set(x, "isURL", value.asInstanceOf[js.Any])
    
    inline def setIsURLCallbackTo(value: CallbackTo[Boolean]): Self = StObject.set(x, "isURL", value.toJsFn)
    
    inline def setIsURLFunction1(value: /* cb */ js.Function1[Boolean, Any] => japgolly.scalajs.react.Callback): Self = StObject.set(x, "isURL", js.Any.fromFunction1((t0: /* cb */ js.Function1[Boolean, Any]) => value(t0).runNow()))
    
    inline def setIsURLUndefined: Self = StObject.set(x, "isURL", js.undefined)
    
    inline def setIsUUID(value: AttributeValidation[Boolean]): Self = StObject.set(x, "isUUID", value.asInstanceOf[js.Any])
    
    inline def setIsUUIDCallbackTo(value: CallbackTo[Boolean]): Self = StObject.set(x, "isUUID", value.toJsFn)
    
    inline def setIsUUIDFunction1(value: /* cb */ js.Function1[Boolean, Any] => japgolly.scalajs.react.Callback): Self = StObject.set(x, "isUUID", js.Any.fromFunction1((t0: /* cb */ js.Function1[Boolean, Any]) => value(t0).runNow()))
    
    inline def setIsUUIDUndefined: Self = StObject.set(x, "isUUID", js.undefined)
    
    inline def setMax(value: AttributeValidation[Double]): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxCallbackTo(value: CallbackTo[Double]): Self = StObject.set(x, "max", value.toJsFn)
    
    inline def setMaxFunction1(value: /* cb */ js.Function1[Double, Any] => japgolly.scalajs.react.Callback): Self = StObject.set(x, "max", js.Any.fromFunction1((t0: /* cb */ js.Function1[Double, Any]) => value(t0).runNow()))
    
    inline def setMaxLength(value: AttributeValidation[Double]): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
    
    inline def setMaxLengthCallbackTo(value: CallbackTo[Double]): Self = StObject.set(x, "maxLength", value.toJsFn)
    
    inline def setMaxLengthFunction1(value: /* cb */ js.Function1[Double, Any] => japgolly.scalajs.react.Callback): Self = StObject.set(x, "maxLength", js.Any.fromFunction1((t0: /* cb */ js.Function1[Double, Any]) => value(t0).runNow()))
    
    inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: AttributeValidation[Double]): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinCallbackTo(value: CallbackTo[Double]): Self = StObject.set(x, "min", value.toJsFn)
    
    inline def setMinFunction1(value: /* cb */ js.Function1[Double, Any] => japgolly.scalajs.react.Callback): Self = StObject.set(x, "min", js.Any.fromFunction1((t0: /* cb */ js.Function1[Double, Any]) => value(t0).runNow()))
    
    inline def setMinLength(value: AttributeValidation[Double]): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
    
    inline def setMinLengthCallbackTo(value: CallbackTo[Double]): Self = StObject.set(x, "minLength", value.toJsFn)
    
    inline def setMinLengthFunction1(value: /* cb */ js.Function1[Double, Any] => japgolly.scalajs.react.Callback): Self = StObject.set(x, "minLength", js.Any.fromFunction1((t0: /* cb */ js.Function1[Double, Any]) => value(t0).runNow()))
    
    inline def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setRegex(value: AttributeValidation[js.RegExp]): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
    
    inline def setRegexCallbackTo(value: CallbackTo[js.RegExp]): Self = StObject.set(x, "regex", value.toJsFn)
    
    inline def setRegexFunction1(value: /* cb */ js.Function1[js.RegExp, Any] => japgolly.scalajs.react.Callback): Self = StObject.set(x, "regex", js.Any.fromFunction1((t0: /* cb */ js.Function1[js.RegExp, Any]) => value(t0).runNow()))
    
    inline def setRegexUndefined: Self = StObject.set(x, "regex", js.undefined)
  }
}
