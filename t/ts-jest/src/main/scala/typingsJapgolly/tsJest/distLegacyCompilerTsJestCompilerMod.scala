package typingsJapgolly.tsJest

import typingsJapgolly.tsJest.distLegacyConfigConfigSetMod.ConfigSet
import typingsJapgolly.tsJest.distTypesMod.CompiledOutput
import typingsJapgolly.tsJest.distTypesMod.CompilerInstance
import typingsJapgolly.tsJest.distTypesMod.StringMap
import typingsJapgolly.tsJest.distTypesMod.TsJestCompileOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLegacyCompilerTsJestCompilerMod {
  
  @JSImport("ts-jest/dist/legacy/compiler/ts-jest-compiler", "TsJestCompiler")
  @js.native
  open class TsJestCompiler protected ()
    extends StObject
       with CompilerInstance {
    def this(configSet: ConfigSet, runtimeCacheFS: StringMap) = this()
    
    /* private */ val _compilerInstance: Any = js.native
    
    /* CompleteClass */
    override def getCompiledOutput(fileContent: String, fileName: String, options: TsJestCompileOptions): CompiledOutput = js.native
    
    /* CompleteClass */
    override def getResolvedModules(fileContent: String, fileName: String, runtimeCacheFS: StringMap): js.Array[String] = js.native
  }
}
