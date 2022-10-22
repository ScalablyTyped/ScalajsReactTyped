package typingsJapgolly.surveyKnockout.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILocalizableString extends StObject {
  
  def getIsMultiple(): Boolean
  
  def getJson(): Any
  
  def getLocaleText(loc: String): String
  
  def getLocales(): js.Array[Any]
  
  def setLocaleText(loc: String, newValue: String): Any
}
object ILocalizableString {
  
  inline def apply(
    getIsMultiple: CallbackTo[Boolean],
    getJson: CallbackTo[Any],
    getLocaleText: String => String,
    getLocales: CallbackTo[js.Array[Any]],
    setLocaleText: (String, String) => Any
  ): ILocalizableString = {
    val __obj = js.Dynamic.literal(getIsMultiple = getIsMultiple.toJsFn, getJson = getJson.toJsFn, getLocaleText = js.Any.fromFunction1(getLocaleText), getLocales = getLocales.toJsFn, setLocaleText = js.Any.fromFunction2(setLocaleText))
    __obj.asInstanceOf[ILocalizableString]
  }
  
  extension [Self <: ILocalizableString](x: Self) {
    
    inline def setGetIsMultiple(value: CallbackTo[Boolean]): Self = StObject.set(x, "getIsMultiple", value.toJsFn)
    
    inline def setGetJson(value: CallbackTo[Any]): Self = StObject.set(x, "getJson", value.toJsFn)
    
    inline def setGetLocaleText(value: String => String): Self = StObject.set(x, "getLocaleText", js.Any.fromFunction1(value))
    
    inline def setGetLocales(value: CallbackTo[js.Array[Any]]): Self = StObject.set(x, "getLocales", value.toJsFn)
    
    inline def setSetLocaleText(value: (String, String) => Any): Self = StObject.set(x, "setLocaleText", js.Any.fromFunction2(value))
  }
}
