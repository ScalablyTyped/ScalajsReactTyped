package typingsJapgolly.asana.anon

import typingsJapgolly.asana.asanaStrings.task
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined asana.asana.resources.Typeahead.TypeaheadParams & {  resource_type :'task'} */
trait TypeaheadParamsresourcetyOptpretty extends StObject {
  
  var count: js.UndefOr[Double] = js.undefined
  
  var opt_fields: js.UndefOr[String] = js.undefined
  
  var opt_pretty: js.UndefOr[Boolean] = js.undefined
  
  var query: js.UndefOr[String] = js.undefined
  
  var resource_type: String & task
}
object TypeaheadParamsresourcetyOptpretty {
  
  inline def apply(resource_type: String & task): TypeaheadParamsresourcetyOptpretty = {
    val __obj = js.Dynamic.literal(resource_type = resource_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeaheadParamsresourcetyOptpretty]
  }
  
  extension [Self <: TypeaheadParamsresourcetyOptpretty](x: Self) {
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setOpt_fields(value: String): Self = StObject.set(x, "opt_fields", value.asInstanceOf[js.Any])
    
    inline def setOpt_fieldsUndefined: Self = StObject.set(x, "opt_fields", js.undefined)
    
    inline def setOpt_pretty(value: Boolean): Self = StObject.set(x, "opt_pretty", value.asInstanceOf[js.Any])
    
    inline def setOpt_prettyUndefined: Self = StObject.set(x, "opt_pretty", js.undefined)
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setResource_type(value: String & task): Self = StObject.set(x, "resource_type", value.asInstanceOf[js.Any])
  }
}
