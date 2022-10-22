package typingsJapgolly.tsJest.distTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompilerInstance extends StObject {
  
  def getCompiledOutput(fileContent: String, fileName: String, options: TsJestCompileOptions): CompiledOutput
  
  def getResolvedModules(fileContent: String, fileName: String, runtimeCacheFS: StringMap): js.Array[String]
}
object CompilerInstance {
  
  inline def apply(
    getCompiledOutput: (String, String, TsJestCompileOptions) => CompiledOutput,
    getResolvedModules: (String, String, StringMap) => js.Array[String]
  ): CompilerInstance = {
    val __obj = js.Dynamic.literal(getCompiledOutput = js.Any.fromFunction3(getCompiledOutput), getResolvedModules = js.Any.fromFunction3(getResolvedModules))
    __obj.asInstanceOf[CompilerInstance]
  }
  
  extension [Self <: CompilerInstance](x: Self) {
    
    inline def setGetCompiledOutput(value: (String, String, TsJestCompileOptions) => CompiledOutput): Self = StObject.set(x, "getCompiledOutput", js.Any.fromFunction3(value))
    
    inline def setGetResolvedModules(value: (String, String, StringMap) => js.Array[String]): Self = StObject.set(x, "getResolvedModules", js.Any.fromFunction3(value))
  }
}
