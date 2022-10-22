package typingsJapgolly.angularDevkitBuildAngular.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectRoot extends StObject {
  
  var config: typingsJapgolly.webpack.mod.Configuration
  
  var projectRoot: String
  
  var projectSourceRoot: js.UndefOr[String] = js.undefined
}
object ProjectRoot {
  
  inline def apply(config: typingsJapgolly.webpack.mod.Configuration, projectRoot: String): ProjectRoot = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], projectRoot = projectRoot.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectRoot]
  }
  
  extension [Self <: ProjectRoot](x: Self) {
    
    inline def setConfig(value: typingsJapgolly.webpack.mod.Configuration): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setProjectRoot(value: String): Self = StObject.set(x, "projectRoot", value.asInstanceOf[js.Any])
    
    inline def setProjectSourceRoot(value: String): Self = StObject.set(x, "projectSourceRoot", value.asInstanceOf[js.Any])
    
    inline def setProjectSourceRootUndefined: Self = StObject.set(x, "projectSourceRoot", js.undefined)
  }
}
