package typingsJapgolly.nano.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaybeRevisionedDocument extends StObject {
  
  var _rev: js.UndefOr[String] = js.undefined
}
object MaybeRevisionedDocument {
  
  inline def apply(): MaybeRevisionedDocument = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaybeRevisionedDocument]
  }
  
  extension [Self <: MaybeRevisionedDocument](x: Self) {
    
    inline def set_rev(value: String): Self = StObject.set(x, "_rev", value.asInstanceOf[js.Any])
    
    inline def set_revUndefined: Self = StObject.set(x, "_rev", js.undefined)
  }
}
