package typingsJapgolly.ejWebAll.anon

import typingsJapgolly.ejWebAll.ej.datavisualization.Overview
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofOverview extends StObject {
  
  /* static member */
  var Locale: Any
  
  /* static member */
  var fn: Overview
}
object TypeofOverview {
  
  inline def apply(Locale: Any, fn: Overview): TypeofOverview = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofOverview]
  }
  
  extension [Self <: TypeofOverview](x: Self) {
    
    inline def setFn(value: Overview): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
