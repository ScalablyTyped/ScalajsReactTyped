package typingsJapgolly.tsJest.distTypesMod

import typingsJapgolly.tsJest.distLegacyConfigConfigSetMod.ConfigSet
import typingsJapgolly.typescript.mod.Program
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TsCompilerInstance
  extends StObject
     with CompilerInstance {
  
  var configSet: ConfigSet
  
  var program: js.UndefOr[Program] = js.undefined
}
object TsCompilerInstance {
  
  inline def apply(
    configSet: ConfigSet,
    getCompiledOutput: (String, String, TsJestCompileOptions) => CompiledOutput,
    getResolvedModules: (String, String, StringMap) => js.Array[String]
  ): TsCompilerInstance = {
    val __obj = js.Dynamic.literal(configSet = configSet.asInstanceOf[js.Any], getCompiledOutput = js.Any.fromFunction3(getCompiledOutput), getResolvedModules = js.Any.fromFunction3(getResolvedModules))
    __obj.asInstanceOf[TsCompilerInstance]
  }
  
  extension [Self <: TsCompilerInstance](x: Self) {
    
    inline def setConfigSet(value: ConfigSet): Self = StObject.set(x, "configSet", value.asInstanceOf[js.Any])
    
    inline def setProgram(value: Program): Self = StObject.set(x, "program", value.asInstanceOf[js.Any])
    
    inline def setProgramUndefined: Self = StObject.set(x, "program", js.undefined)
  }
}
