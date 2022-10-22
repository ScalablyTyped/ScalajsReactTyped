package typingsJapgolly.sarif.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tool extends StObject {
  
  /**
    * The analysis tool that was run.
    */
  var driver: ToolComponent
  
  /**
    * Tool extensions that contributed to or reconfigured the analysis tool that was run.
    */
  var extensions: js.UndefOr[js.Array[ToolComponent]] = js.undefined
  
  /**
    * Key/value pairs that provide additional information about the tool.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
}
object Tool {
  
  inline def apply(driver: ToolComponent): Tool = {
    val __obj = js.Dynamic.literal(driver = driver.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tool]
  }
  
  extension [Self <: Tool](x: Self) {
    
    inline def setDriver(value: ToolComponent): Self = StObject.set(x, "driver", value.asInstanceOf[js.Any])
    
    inline def setExtensions(value: js.Array[ToolComponent]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    inline def setExtensionsVarargs(value: ToolComponent*): Self = StObject.set(x, "extensions", js.Array(value*))
    
    inline def setProperties(value: PropertyBag): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
  }
}
