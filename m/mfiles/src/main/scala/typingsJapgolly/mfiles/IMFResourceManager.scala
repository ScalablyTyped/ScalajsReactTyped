package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMFResourceManager extends StObject {
  
  def GetLocaleSpecificDateFormat(): String
  
  def GetUICultures(): IStrings
  
  def LoadResourceString(LanguageID: Double, ResourceID: Double): String
}
object IMFResourceManager {
  
  inline def apply(
    GetLocaleSpecificDateFormat: CallbackTo[String],
    GetUICultures: CallbackTo[IStrings],
    LoadResourceString: (Double, Double) => String
  ): IMFResourceManager = {
    val __obj = js.Dynamic.literal(GetLocaleSpecificDateFormat = GetLocaleSpecificDateFormat.toJsFn, GetUICultures = GetUICultures.toJsFn, LoadResourceString = js.Any.fromFunction2(LoadResourceString))
    __obj.asInstanceOf[IMFResourceManager]
  }
  
  extension [Self <: IMFResourceManager](x: Self) {
    
    inline def setGetLocaleSpecificDateFormat(value: CallbackTo[String]): Self = StObject.set(x, "GetLocaleSpecificDateFormat", value.toJsFn)
    
    inline def setGetUICultures(value: CallbackTo[IStrings]): Self = StObject.set(x, "GetUICultures", value.toJsFn)
    
    inline def setLoadResourceString(value: (Double, Double) => String): Self = StObject.set(x, "LoadResourceString", js.Any.fromFunction2(value))
  }
}
