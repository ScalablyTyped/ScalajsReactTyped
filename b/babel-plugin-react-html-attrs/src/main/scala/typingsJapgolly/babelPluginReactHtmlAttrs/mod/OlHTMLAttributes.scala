package typingsJapgolly.babelPluginReactHtmlAttrs.mod

import typingsJapgolly.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.A
import typingsJapgolly.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.I
import typingsJapgolly.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.`1`
import typingsJapgolly.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.a_
import typingsJapgolly.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.i_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OlHTMLAttributes[T]
  extends StObject
     with HTMLAttributes[T] {
  
  var reversed: js.UndefOr[Boolean | String] = js.undefined
  
  var start: js.UndefOr[Double | String] = js.undefined
  
  var `type`: js.UndefOr[`1` | a_ | A | i_ | I] = js.undefined
}
object OlHTMLAttributes {
  
  inline def apply[T](): OlHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OlHTMLAttributes[T]]
  }
  
  extension [Self <: OlHTMLAttributes[?], T](x: Self & OlHTMLAttributes[T]) {
    
    inline def setReversed(value: Boolean | String): Self = StObject.set(x, "reversed", value.asInstanceOf[js.Any])
    
    inline def setReversedUndefined: Self = StObject.set(x, "reversed", js.undefined)
    
    inline def setStart(value: Double | String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setType(value: `1` | a_ | A | i_ | I): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
