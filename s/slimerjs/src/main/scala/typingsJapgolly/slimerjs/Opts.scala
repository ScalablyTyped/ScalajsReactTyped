package typingsJapgolly.slimerjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Opts extends StObject {
  
  var charset: String
  
  var mode: String
  
  var nobuffer: Boolean
}
object Opts {
  
  inline def apply(charset: String, mode: String, nobuffer: Boolean): Opts = {
    val __obj = js.Dynamic.literal(charset = charset.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], nobuffer = nobuffer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Opts]
  }
  
  extension [Self <: Opts](x: Self) {
    
    inline def setCharset(value: String): Self = StObject.set(x, "charset", value.asInstanceOf[js.Any])
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setNobuffer(value: Boolean): Self = StObject.set(x, "nobuffer", value.asInstanceOf[js.Any])
  }
}
