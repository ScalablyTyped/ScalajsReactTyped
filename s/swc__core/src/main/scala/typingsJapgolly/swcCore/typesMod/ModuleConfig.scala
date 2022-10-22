package typingsJapgolly.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.swcCore.typesMod.Es6Config
  - typingsJapgolly.swcCore.typesMod.CommonJsConfig
  - typingsJapgolly.swcCore.typesMod.UmdConfig
  - typingsJapgolly.swcCore.typesMod.AmdConfig
  - typingsJapgolly.swcCore.typesMod.NodeNextConfig
*/
trait ModuleConfig extends StObject
object ModuleConfig {
  
  inline def AmdConfig(): typingsJapgolly.swcCore.typesMod.AmdConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("amd")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.AmdConfig]
  }
  
  inline def CommonJsConfig(): typingsJapgolly.swcCore.typesMod.CommonJsConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("commonjs")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.CommonJsConfig]
  }
  
  inline def Es6Config(): typingsJapgolly.swcCore.typesMod.Es6Config = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("es6")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.Es6Config]
  }
  
  inline def NodeNextConfig(): typingsJapgolly.swcCore.typesMod.NodeNextConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("nodenext")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.NodeNextConfig]
  }
  
  inline def UmdConfig(): typingsJapgolly.swcCore.typesMod.UmdConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("umd")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.UmdConfig]
  }
}
