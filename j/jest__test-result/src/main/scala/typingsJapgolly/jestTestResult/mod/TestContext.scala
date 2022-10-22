package typingsJapgolly.jestTestResult.mod

import typingsJapgolly.jestHasteMap.mod.IHasteFS
import typingsJapgolly.jestHasteMap.mod.IModuleMap
import typingsJapgolly.jestHasteMap.mod.SerializableModuleMap
import typingsJapgolly.jestResolve.mod.default
import typingsJapgolly.jestTypes.mod.ProjectConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestContext extends StObject {
  
  var config: ProjectConfig
  
  var hasteFS: IHasteFS
  
  var moduleMap: IModuleMap[SerializableModuleMap]
  
  var resolver: default
}
object TestContext {
  
  inline def apply(
    config: ProjectConfig,
    hasteFS: IHasteFS,
    moduleMap: IModuleMap[SerializableModuleMap],
    resolver: default
  ): TestContext = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], hasteFS = hasteFS.asInstanceOf[js.Any], moduleMap = moduleMap.asInstanceOf[js.Any], resolver = resolver.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestContext]
  }
  
  extension [Self <: TestContext](x: Self) {
    
    inline def setConfig(value: ProjectConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setHasteFS(value: IHasteFS): Self = StObject.set(x, "hasteFS", value.asInstanceOf[js.Any])
    
    inline def setModuleMap(value: IModuleMap[SerializableModuleMap]): Self = StObject.set(x, "moduleMap", value.asInstanceOf[js.Any])
    
    inline def setResolver(value: default): Self = StObject.set(x, "resolver", value.asInstanceOf[js.Any])
  }
}
