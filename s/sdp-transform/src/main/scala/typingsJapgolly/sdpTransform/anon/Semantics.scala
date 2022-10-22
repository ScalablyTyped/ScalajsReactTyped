package typingsJapgolly.sdpTransform.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Semantics extends StObject {
  
  var semantics: String
  
  var ssrcs: String
}
object Semantics {
  
  inline def apply(semantics: String, ssrcs: String): Semantics = {
    val __obj = js.Dynamic.literal(semantics = semantics.asInstanceOf[js.Any], ssrcs = ssrcs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Semantics]
  }
  
  extension [Self <: Semantics](x: Self) {
    
    inline def setSemantics(value: String): Self = StObject.set(x, "semantics", value.asInstanceOf[js.Any])
    
    inline def setSsrcs(value: String): Self = StObject.set(x, "ssrcs", value.asInstanceOf[js.Any])
  }
}
