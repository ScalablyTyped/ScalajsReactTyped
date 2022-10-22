package typingsJapgolly.i18nAbide

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Error extends StObject {
    
    def error(msg: String): Unit
    
    def warn(msg: String): Unit
  }
  object Error {
    
    inline def apply(error: String => Callback, warn: String => Callback): Error = {
      val __obj = js.Dynamic.literal(error = js.Any.fromFunction1((t0: String) => error(t0).runNow()), warn = js.Any.fromFunction1((t0: String) => warn(t0).runNow()))
      __obj.asInstanceOf[Error]
    }
    
    extension [Self <: Error](x: Self) {
      
      inline def setError(value: String => Callback): Self = StObject.set(x, "error", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setWarn(value: String => Callback): Self = StObject.set(x, "warn", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    }
  }
  
  trait Lang extends StObject {
    
    var lang: String
    
    var quality: Double
  }
  object Lang {
    
    inline def apply(lang: String, quality: Double): Lang = {
      val __obj = js.Dynamic.literal(lang = lang.asInstanceOf[js.Any], quality = quality.asInstanceOf[js.Any])
      __obj.asInstanceOf[Lang]
    }
    
    extension [Self <: Lang](x: Self) {
      
      inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
    }
  }
}
