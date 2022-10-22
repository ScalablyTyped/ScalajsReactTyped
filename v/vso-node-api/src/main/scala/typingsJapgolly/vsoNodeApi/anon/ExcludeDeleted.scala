package typingsJapgolly.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExcludeDeleted extends StObject {
  
  var excludeDeleted: scala.Double
  
  var includeDeleted: scala.Double
  
  var onlyDeleted: scala.Double
}
object ExcludeDeleted {
  
  inline def apply(excludeDeleted: scala.Double, includeDeleted: scala.Double, onlyDeleted: scala.Double): ExcludeDeleted = {
    val __obj = js.Dynamic.literal(excludeDeleted = excludeDeleted.asInstanceOf[js.Any], includeDeleted = includeDeleted.asInstanceOf[js.Any], onlyDeleted = onlyDeleted.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExcludeDeleted]
  }
  
  extension [Self <: ExcludeDeleted](x: Self) {
    
    inline def setExcludeDeleted(value: scala.Double): Self = StObject.set(x, "excludeDeleted", value.asInstanceOf[js.Any])
    
    inline def setIncludeDeleted(value: scala.Double): Self = StObject.set(x, "includeDeleted", value.asInstanceOf[js.Any])
    
    inline def setOnlyDeleted(value: scala.Double): Self = StObject.set(x, "onlyDeleted", value.asInstanceOf[js.Any])
  }
}
