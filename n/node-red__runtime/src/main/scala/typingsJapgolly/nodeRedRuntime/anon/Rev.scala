package typingsJapgolly.nodeRedRuntime.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Rev extends StObject {
  
  var rev: String
}
object Rev {
  
  inline def apply(rev: String): Rev = {
    val __obj = js.Dynamic.literal(rev = rev.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rev]
  }
  
  extension [Self <: Rev](x: Self) {
    
    inline def setRev(value: String): Self = StObject.set(x, "rev", value.asInstanceOf[js.Any])
  }
}
