package typingsJapgolly.parcelTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IncludeInline extends StObject {
  
  var includeInline: Boolean
}
object IncludeInline {
  
  inline def apply(includeInline: Boolean): IncludeInline = {
    val __obj = js.Dynamic.literal(includeInline = includeInline.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncludeInline]
  }
  
  extension [Self <: IncludeInline](x: Self) {
    
    inline def setIncludeInline(value: Boolean): Self = StObject.set(x, "includeInline", value.asInstanceOf[js.Any])
  }
}
