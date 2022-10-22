package typingsJapgolly.webpack.anon

import typingsJapgolly.webpack.mod.RuntimeSpec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeGenerationResults extends StObject {
  
  /**
  		 * the code generation results
  		 */
  var codeGenerationResults: typingsJapgolly.webpack.mod.CodeGenerationResults
  
  /**
  		 * the module
  		 */
  var module: typingsJapgolly.webpack.mod.Module
  
  /**
  		 * the public path
  		 */
  var publicPath: String
  
  /**
  		 * runtime
  		 */
  var runtime: js.UndefOr[RuntimeSpec] = js.undefined
}
object CodeGenerationResults {
  
  inline def apply(
    codeGenerationResults: typingsJapgolly.webpack.mod.CodeGenerationResults,
    module: typingsJapgolly.webpack.mod.Module,
    publicPath: String
  ): CodeGenerationResults = {
    val __obj = js.Dynamic.literal(codeGenerationResults = codeGenerationResults.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any], publicPath = publicPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeGenerationResults]
  }
  
  extension [Self <: CodeGenerationResults](x: Self) {
    
    inline def setCodeGenerationResults(value: typingsJapgolly.webpack.mod.CodeGenerationResults): Self = StObject.set(x, "codeGenerationResults", value.asInstanceOf[js.Any])
    
    inline def setModule(value: typingsJapgolly.webpack.mod.Module): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
    
    inline def setPublicPath(value: String): Self = StObject.set(x, "publicPath", value.asInstanceOf[js.Any])
    
    inline def setRuntime(value: RuntimeSpec): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
    
    inline def setRuntimeUndefined: Self = StObject.set(x, "runtime", js.undefined)
  }
}
