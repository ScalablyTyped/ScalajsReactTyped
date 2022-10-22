package typingsJapgolly.plotlyJs.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.plotlyJs.plotlyJsStrings.trace
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TraceModule
  extends StObject
     with /* key */ StringDictionary[Any]
     with PlotlyModule {
  
  var categories: js.Array[String]
  
  var meta: Record[String, Any]
  
  var moduleType: trace
  
  var name: String
}
object TraceModule {
  
  inline def apply(categories: js.Array[String], meta: Record[String, Any], name: String): TraceModule = {
    val __obj = js.Dynamic.literal(categories = categories.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], moduleType = "trace", name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TraceModule]
  }
  
  extension [Self <: TraceModule](x: Self) {
    
    inline def setCategories(value: js.Array[String]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    inline def setCategoriesVarargs(value: String*): Self = StObject.set(x, "categories", js.Array(value*))
    
    inline def setMeta(value: Record[String, Any]): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setModuleType(value: trace): Self = StObject.set(x, "moduleType", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
