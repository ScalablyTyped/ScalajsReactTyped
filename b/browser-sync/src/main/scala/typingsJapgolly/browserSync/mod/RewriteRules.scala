package typingsJapgolly.browserSync.mod

import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RewriteRules extends StObject {
  
  var fn: js.UndefOr[
    js.Function3[
      /* req */ IncomingMessage, 
      /* res */ ServerResponse[IncomingMessage], 
      /* match */ String, 
      String
    ]
  ] = js.undefined
  
  var `match`: js.RegExp
  
  var replace: js.UndefOr[String] = js.undefined
}
object RewriteRules {
  
  inline def apply(`match`: js.RegExp): RewriteRules = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RewriteRules]
  }
  
  extension [Self <: RewriteRules](x: Self) {
    
    inline def setFn(
      value: (/* req */ IncomingMessage, /* res */ ServerResponse[IncomingMessage], /* match */ String) => String
    ): Self = StObject.set(x, "fn", js.Any.fromFunction3(value))
    
    inline def setFnUndefined: Self = StObject.set(x, "fn", js.undefined)
    
    inline def setMatch(value: js.RegExp): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    inline def setReplace(value: String): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
    
    inline def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
  }
}
