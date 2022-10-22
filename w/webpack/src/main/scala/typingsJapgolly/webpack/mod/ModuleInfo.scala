package typingsJapgolly.webpack.mod

import typingsJapgolly.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.webpack.mod.ConcatenatedModuleInfo
  - typingsJapgolly.webpack.mod.ExternalModuleInfo
*/
trait ModuleInfo extends StObject
object ModuleInfo {
  
  inline def ConcatenatedModuleInfo(exportMap: Map[String, String], index: Double, module: Module, rawExportMap: Map[String, String]): typingsJapgolly.webpack.mod.ConcatenatedModuleInfo = {
    val __obj = js.Dynamic.literal(exportMap = exportMap.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any], rawExportMap = rawExportMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.webpack.mod.ConcatenatedModuleInfo]
  }
  
  inline def ExternalModuleInfo(index: Double, module: Module): typingsJapgolly.webpack.mod.ExternalModuleInfo = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.webpack.mod.ExternalModuleInfo]
  }
}
