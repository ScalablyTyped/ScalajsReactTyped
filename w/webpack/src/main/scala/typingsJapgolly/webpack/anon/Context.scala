package typingsJapgolly.webpack.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Context extends StObject {
  
  /**
  			 * context string path
  			 */
  var context: String
  
  /**
  			 * additional context info for the root module
  			 */
  var contextInfo: js.UndefOr[PartialModuleFactoryCreat] = js.undefined
  
  /**
  			 * dependency used to create Module chain
  			 */
  var dependency: typingsJapgolly.webpack.mod.Dependency
}
object Context {
  
  inline def apply(context: String, dependency: typingsJapgolly.webpack.mod.Dependency): Context = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], dependency = dependency.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
  
  extension [Self <: Context](x: Self) {
    
    inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextInfo(value: PartialModuleFactoryCreat): Self = StObject.set(x, "contextInfo", value.asInstanceOf[js.Any])
    
    inline def setContextInfoUndefined: Self = StObject.set(x, "contextInfo", js.undefined)
    
    inline def setDependency(value: typingsJapgolly.webpack.mod.Dependency): Self = StObject.set(x, "dependency", value.asInstanceOf[js.Any])
  }
}
