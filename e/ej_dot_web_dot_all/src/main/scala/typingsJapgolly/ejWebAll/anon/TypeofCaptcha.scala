package typingsJapgolly.ejWebAll.anon

import typingsJapgolly.ejWebAll.ej.Captcha
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofCaptcha extends StObject {
  
  /* static member */
  var Locale: Any
  
  /* static member */
  var fn: Captcha
}
object TypeofCaptcha {
  
  inline def apply(Locale: Any, fn: Captcha): TypeofCaptcha = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofCaptcha]
  }
  
  extension [Self <: TypeofCaptcha](x: Self) {
    
    inline def setFn(value: Captcha): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
