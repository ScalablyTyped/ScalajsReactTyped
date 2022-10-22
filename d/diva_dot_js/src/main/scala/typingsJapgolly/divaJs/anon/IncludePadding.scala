package typingsJapgolly.divaJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IncludePadding extends StObject {
  
  var includePadding: Boolean
}
object IncludePadding {
  
  inline def apply(includePadding: Boolean): IncludePadding = {
    val __obj = js.Dynamic.literal(includePadding = includePadding.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncludePadding]
  }
  
  extension [Self <: IncludePadding](x: Self) {
    
    inline def setIncludePadding(value: Boolean): Self = StObject.set(x, "includePadding", value.asInstanceOf[js.Any])
  }
}
