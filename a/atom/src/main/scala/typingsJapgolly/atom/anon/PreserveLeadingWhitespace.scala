package typingsJapgolly.atom.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreserveLeadingWhitespace extends StObject {
  
  var preserveLeadingWhitespace: js.UndefOr[Boolean] = js.undefined
}
object PreserveLeadingWhitespace {
  
  inline def apply(): PreserveLeadingWhitespace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PreserveLeadingWhitespace]
  }
  
  extension [Self <: PreserveLeadingWhitespace](x: Self) {
    
    inline def setPreserveLeadingWhitespace(value: Boolean): Self = StObject.set(x, "preserveLeadingWhitespace", value.asInstanceOf[js.Any])
    
    inline def setPreserveLeadingWhitespaceUndefined: Self = StObject.set(x, "preserveLeadingWhitespace", js.undefined)
  }
}
