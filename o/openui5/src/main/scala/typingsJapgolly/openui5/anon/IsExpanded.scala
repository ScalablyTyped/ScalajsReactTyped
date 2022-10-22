package typingsJapgolly.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsExpanded extends StObject {
  
  /**
    * Whether the title was expanded (true) or collapsed (false).
    */
  var isExpanded: js.UndefOr[Boolean] = js.undefined
}
object IsExpanded {
  
  inline def apply(): IsExpanded = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsExpanded]
  }
  
  extension [Self <: IsExpanded](x: Self) {
    
    inline def setIsExpanded(value: Boolean): Self = StObject.set(x, "isExpanded", value.asInstanceOf[js.Any])
    
    inline def setIsExpandedUndefined: Self = StObject.set(x, "isExpanded", js.undefined)
  }
}
