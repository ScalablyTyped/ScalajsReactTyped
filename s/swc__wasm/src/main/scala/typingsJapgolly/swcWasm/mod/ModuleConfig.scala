package typingsJapgolly.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.swcWasm.mod.Es6Config
  - typingsJapgolly.swcWasm.mod.CommonJsConfig
  - typingsJapgolly.swcWasm.mod.UmdConfig
  - typingsJapgolly.swcWasm.mod.AmdConfig
  - typingsJapgolly.swcWasm.mod.NodeNextConfig
*/
trait ModuleConfig extends StObject
object ModuleConfig {
  
  inline def AmdConfig(): typingsJapgolly.swcWasm.mod.AmdConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("amd")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.AmdConfig]
  }
  
  inline def CommonJsConfig(): typingsJapgolly.swcWasm.mod.CommonJsConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("commonjs")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.CommonJsConfig]
  }
  
  inline def Es6Config(): typingsJapgolly.swcWasm.mod.Es6Config = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("es6")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.Es6Config]
  }
  
  inline def NodeNextConfig(): typingsJapgolly.swcWasm.mod.NodeNextConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("nodenext")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.NodeNextConfig]
  }
  
  inline def UmdConfig(): typingsJapgolly.swcWasm.mod.UmdConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("umd")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.UmdConfig]
  }
}
