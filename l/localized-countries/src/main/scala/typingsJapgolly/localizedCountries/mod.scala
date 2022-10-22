package typingsJapgolly.localizedCountries

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.localizedCountries.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(locale: String): LocalizedCountries = ^.asInstanceOf[js.Dynamic].apply(locale.asInstanceOf[js.Any]).asInstanceOf[LocalizedCountries]
  inline def apply(locale: js.Object): LocalizedCountries = ^.asInstanceOf[js.Dynamic].apply(locale.asInstanceOf[js.Any]).asInstanceOf[LocalizedCountries]
  
  @JSImport("localized-countries", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("localized-countries", "languages")
  @js.native
  val languages: js.Array[String] = js.native
  
  trait LocalizedCountries extends StObject {
    
    def array(): js.Array[Code]
    
    def get(code: String): String
    
    def `object`(): StringDictionary[String]
  }
  object LocalizedCountries {
    
    inline def apply(
      array: CallbackTo[js.Array[Code]],
      get: String => String,
      `object`: CallbackTo[StringDictionary[String]]
    ): LocalizedCountries = {
      val __obj = js.Dynamic.literal(array = array.toJsFn, get = js.Any.fromFunction1(get))
      __obj.updateDynamic("object")(`object`.toJsFn)
      __obj.asInstanceOf[LocalizedCountries]
    }
    
    extension [Self <: LocalizedCountries](x: Self) {
      
      inline def setArray(value: CallbackTo[js.Array[Code]]): Self = StObject.set(x, "array", value.toJsFn)
      
      inline def setGet(value: String => String): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setObject(value: CallbackTo[StringDictionary[String]]): Self = StObject.set(x, "object", value.toJsFn)
    }
  }
}
