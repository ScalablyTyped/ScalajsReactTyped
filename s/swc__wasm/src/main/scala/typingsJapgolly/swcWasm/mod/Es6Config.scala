package typingsJapgolly.swcWasm.mod

import typingsJapgolly.swcWasm.swcWasmStrings.es6
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Es6Config
  extends StObject
     with BaseModuleConfig
     with ModuleConfig {
  
  var `type`: es6
}
object Es6Config {
  
  inline def apply(): Es6Config = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("es6")
    __obj.asInstanceOf[Es6Config]
  }
  
  extension [Self <: Es6Config](x: Self) {
    
    inline def setType(value: es6): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
