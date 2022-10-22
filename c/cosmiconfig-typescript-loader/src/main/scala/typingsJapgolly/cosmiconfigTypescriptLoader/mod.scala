package typingsJapgolly.cosmiconfigTypescriptLoader

import typingsJapgolly.cosmiconfig.mod.Loader
import typingsJapgolly.tsNode.mod.RegisterOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cosmiconfig-typescript-loader", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("cosmiconfig-typescript-loader", "TypeScriptCompileError")
  @js.native
  open class TypeScriptCompileError protected ()
    extends typingsJapgolly.cosmiconfigTypescriptLoader.distTypesTypescriptCompileErrorMod.TypeScriptCompileError {
    def this(message: String) = this()
  }
  /* static members */
  object TypeScriptCompileError {
    
    @JSImport("cosmiconfig-typescript-loader", "TypeScriptCompileError")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromError(error: js.Error): typingsJapgolly.cosmiconfigTypescriptLoader.distTypesTypescriptCompileErrorMod.TypeScriptCompileError = ^.asInstanceOf[js.Dynamic].applyDynamic("fromError")(error.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.cosmiconfigTypescriptLoader.distTypesTypescriptCompileErrorMod.TypeScriptCompileError]
  }
  
  inline def TypeScriptLoader(): Loader = ^.asInstanceOf[js.Dynamic].applyDynamic("TypeScriptLoader")().asInstanceOf[Loader]
  inline def TypeScriptLoader(options: RegisterOptions): Loader = ^.asInstanceOf[js.Dynamic].applyDynamic("TypeScriptLoader")(options.asInstanceOf[js.Any]).asInstanceOf[Loader]
}
