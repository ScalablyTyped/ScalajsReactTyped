package typingsJapgolly.bingmaps.Microsoft.Maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IConfigurableMapModule extends StObject {
  
  /** Name of the module to load. Supported values: "Microsoft.Maps.GeoXml", "Microsoft.Maps.GeoJson". */
  var moduleName: String
  
  /** A set of steps to execute after a module is loaded. */
  var moduleOptions: PostModuleAction | js.Array[PostModuleAction]
}
object IConfigurableMapModule {
  
  inline def apply(moduleName: String, moduleOptions: PostModuleAction | js.Array[PostModuleAction]): IConfigurableMapModule = {
    val __obj = js.Dynamic.literal(moduleName = moduleName.asInstanceOf[js.Any], moduleOptions = moduleOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConfigurableMapModule]
  }
  
  extension [Self <: IConfigurableMapModule](x: Self) {
    
    inline def setModuleName(value: String): Self = StObject.set(x, "moduleName", value.asInstanceOf[js.Any])
    
    inline def setModuleOptions(value: PostModuleAction | js.Array[PostModuleAction]): Self = StObject.set(x, "moduleOptions", value.asInstanceOf[js.Any])
    
    inline def setModuleOptionsVarargs(value: PostModuleAction*): Self = StObject.set(x, "moduleOptions", js.Array(value*))
  }
}
