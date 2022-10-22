package typingsJapgolly.vsoNodeApi.interfacesWorkInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterGroup extends StObject {
  
  var end: Double
  
  var level: Double
  
  var start: Double
}
object FilterGroup {
  
  inline def apply(end: Double, level: Double, start: Double): FilterGroup = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterGroup]
  }
  
  extension [Self <: FilterGroup](x: Self) {
    
    inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
