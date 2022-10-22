package typingsJapgolly.plotlyJs.mod

import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.plotlyJs.mod.TraceModule
  - typingsJapgolly.plotlyJs.mod.LocaleModule
  - typingsJapgolly.plotlyJs.mod.TransformModule
  - typingsJapgolly.plotlyJs.mod.ComponentModule
  - typingsJapgolly.plotlyJs.mod.ApiMethodModule
*/
trait PlotlyModule extends StObject
object PlotlyModule {
  
  inline def ApiMethodModule(fn: Any, name: String): typingsJapgolly.plotlyJs.mod.ApiMethodModule = {
    val __obj = js.Dynamic.literal(fn = fn.asInstanceOf[js.Any], moduleType = "apiMethod", name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.plotlyJs.mod.ApiMethodModule]
  }
  
  inline def ComponentModule(name: String): typingsJapgolly.plotlyJs.mod.ComponentModule = {
    val __obj = js.Dynamic.literal(moduleType = "component", name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.plotlyJs.mod.ComponentModule]
  }
  
  inline def LocaleModule(dictionary: Record[String, Any], format: Record[String, Any], name: String): typingsJapgolly.plotlyJs.mod.LocaleModule = {
    val __obj = js.Dynamic.literal(dictionary = dictionary.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], moduleType = "locale", name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.plotlyJs.mod.LocaleModule]
  }
  
  inline def TraceModule(categories: js.Array[String], meta: Record[String, Any], name: String): typingsJapgolly.plotlyJs.mod.TraceModule = {
    val __obj = js.Dynamic.literal(categories = categories.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], moduleType = "trace", name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.plotlyJs.mod.TraceModule]
  }
  
  inline def TransformModule(
    attributes: Record[String, Any],
    calcTransform: Any,
    name: String,
    supplyDefaults: Any,
    transform: Any
  ): typingsJapgolly.plotlyJs.mod.TransformModule = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], calcTransform = calcTransform.asInstanceOf[js.Any], moduleType = "transform", name = name.asInstanceOf[js.Any], supplyDefaults = supplyDefaults.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.plotlyJs.mod.TransformModule]
  }
}
