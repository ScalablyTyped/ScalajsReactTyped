package typingsJapgolly.hapi.anon

import typingsJapgolly.hapi.hapiBooleans.`false`
import typingsJapgolly.hapi.hapiStrings.Lax
import typingsJapgolly.hapi.hapiStrings.Strict
import typingsJapgolly.hapi.hapiStrings.base64
import typingsJapgolly.hapi.hapiStrings.base64json
import typingsJapgolly.hapi.hapiStrings.form
import typingsJapgolly.hapi.hapiStrings.iron
import typingsJapgolly.hapi.hapiStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Encoding extends StObject {
  
  var encoding: js.UndefOr[none | base64 | base64json | form | iron] = js.undefined
  
  var ignoreErrors: js.UndefOr[Boolean] = js.undefined
  
  var isHttpOnly: js.UndefOr[Boolean] = js.undefined
  
  var isSameSite: js.UndefOr[`false` | Strict | Lax] = js.undefined
  
  var isSecure: js.UndefOr[Boolean] = js.undefined
  
  var strictHeader: js.UndefOr[Boolean] = js.undefined
}
object Encoding {
  
  inline def apply(): Encoding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Encoding]
  }
  
  extension [Self <: Encoding](x: Self) {
    
    inline def setEncoding(value: none | base64 | base64json | form | iron): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    inline def setIgnoreErrors(value: Boolean): Self = StObject.set(x, "ignoreErrors", value.asInstanceOf[js.Any])
    
    inline def setIgnoreErrorsUndefined: Self = StObject.set(x, "ignoreErrors", js.undefined)
    
    inline def setIsHttpOnly(value: Boolean): Self = StObject.set(x, "isHttpOnly", value.asInstanceOf[js.Any])
    
    inline def setIsHttpOnlyUndefined: Self = StObject.set(x, "isHttpOnly", js.undefined)
    
    inline def setIsSameSite(value: `false` | Strict | Lax): Self = StObject.set(x, "isSameSite", value.asInstanceOf[js.Any])
    
    inline def setIsSameSiteUndefined: Self = StObject.set(x, "isSameSite", js.undefined)
    
    inline def setIsSecure(value: Boolean): Self = StObject.set(x, "isSecure", value.asInstanceOf[js.Any])
    
    inline def setIsSecureUndefined: Self = StObject.set(x, "isSecure", js.undefined)
    
    inline def setStrictHeader(value: Boolean): Self = StObject.set(x, "strictHeader", value.asInstanceOf[js.Any])
    
    inline def setStrictHeaderUndefined: Self = StObject.set(x, "strictHeader", js.undefined)
  }
}
