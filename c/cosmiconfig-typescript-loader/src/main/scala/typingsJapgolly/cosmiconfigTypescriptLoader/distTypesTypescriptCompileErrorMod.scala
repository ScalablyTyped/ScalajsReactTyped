package typingsJapgolly.cosmiconfigTypescriptLoader

import typingsJapgolly.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTypescriptCompileErrorMod {
  
  @JSImport("cosmiconfig-typescript-loader/dist/types/typescript-compile-error", "TypeScriptCompileError")
  @js.native
  open class TypeScriptCompileError protected ()
    extends StObject
       with Error {
    def this(message: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  /* static members */
  object TypeScriptCompileError {
    
    @JSImport("cosmiconfig-typescript-loader/dist/types/typescript-compile-error", "TypeScriptCompileError")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromError(error: js.Error): TypeScriptCompileError = ^.asInstanceOf[js.Dynamic].applyDynamic("fromError")(error.asInstanceOf[js.Any]).asInstanceOf[TypeScriptCompileError]
  }
}
