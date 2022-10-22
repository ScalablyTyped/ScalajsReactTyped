package typingsJapgolly.awsSdk.clientsIotthingsgraphMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlowTemplateFilter extends StObject {
  
  /**
    * The name of the search filter field.
    */
  var name: FlowTemplateFilterName
  
  /**
    * An array of string values for the search filter field. Multiple values function as AND criteria in the search.
    */
  var value: FlowTemplateFilterValues
}
object FlowTemplateFilter {
  
  inline def apply(name: FlowTemplateFilterName, value: FlowTemplateFilterValues): FlowTemplateFilter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowTemplateFilter]
  }
  
  extension [Self <: FlowTemplateFilter](x: Self) {
    
    inline def setName(value: FlowTemplateFilterName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setValue(value: FlowTemplateFilterValues): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueVarargs(value: FlowTemplateFilterValue*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
