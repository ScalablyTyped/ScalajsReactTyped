package typingsJapgolly.nano.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RevisionedDocument extends StObject {
  
  var _rev: String
}
object RevisionedDocument {
  
  inline def apply(_rev: String): RevisionedDocument = {
    val __obj = js.Dynamic.literal(_rev = _rev.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevisionedDocument]
  }
  
  extension [Self <: RevisionedDocument](x: Self) {
    
    inline def set_rev(value: String): Self = StObject.set(x, "_rev", value.asInstanceOf[js.Any])
  }
}
