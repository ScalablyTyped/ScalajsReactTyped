package typingsJapgolly.detox.mod.global.Detox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebMatcher extends StObject {
  
  var __web__ : Any
}
object WebMatcher {
  
  inline def apply(__web__ : Any): WebMatcher = {
    val __obj = js.Dynamic.literal(__web__ = __web__.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebMatcher]
  }
  
  extension [Self <: WebMatcher](x: Self) {
    
    inline def set__web__(value: Any): Self = StObject.set(x, "__web__", value.asInstanceOf[js.Any])
  }
}
