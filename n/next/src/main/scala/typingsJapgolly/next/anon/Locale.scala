package typingsJapgolly.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Locale[P /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any */] extends StObject {
  
  var locale: js.UndefOr[String] = js.undefined
  
  var params: P
}
object Locale {
  
  inline def apply[P /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any */](params: P): Locale[P] = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[Locale[P]]
  }
  
  extension [Self <: Locale[?], P /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any */](x: Self & Locale[P]) {
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setParams(value: P): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
  }
}
