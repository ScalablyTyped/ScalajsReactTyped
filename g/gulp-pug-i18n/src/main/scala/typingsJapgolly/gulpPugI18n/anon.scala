package typingsJapgolly.gulpPugI18n

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Default extends StObject {
    
    var default: js.UndefOr[String] = js.undefined
    
    var filename: js.UndefOr[String] = js.undefined
    
    var locales: String | js.Array[String]
    
    var namespace: js.UndefOr[String | Null] = js.undefined
  }
  object Default {
    
    inline def apply(locales: String | js.Array[String]): Default = {
      val __obj = js.Dynamic.literal(locales = locales.asInstanceOf[js.Any])
      __obj.asInstanceOf[Default]
    }
    
    extension [Self <: Default](x: Self) {
      
      inline def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      inline def setLocales(value: String | js.Array[String]): Self = StObject.set(x, "locales", value.asInstanceOf[js.Any])
      
      inline def setLocalesVarargs(value: String*): Self = StObject.set(x, "locales", js.Array(value*))
      
      inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      inline def setNamespaceNull: Self = StObject.set(x, "namespace", null)
      
      inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
    }
  }
}
