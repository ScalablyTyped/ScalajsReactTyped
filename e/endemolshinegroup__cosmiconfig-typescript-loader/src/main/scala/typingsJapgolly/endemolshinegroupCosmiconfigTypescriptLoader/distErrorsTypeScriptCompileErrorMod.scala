package typingsJapgolly.endemolshinegroupCosmiconfigTypescriptLoader

import typingsJapgolly.endemolshinegroupCosmiconfigTypescriptLoader.anon.Message
import typingsJapgolly.makeError.mod.BaseError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distErrorsTypeScriptCompileErrorMod {
  
  @JSImport("@endemolshinegroup/cosmiconfig-typescript-loader/dist/Errors/TypeScriptCompileError", JSImport.Default)
  @js.native
  open class default protected () extends TypeScriptCompileError {
    def this(message: String, options: js.Object) = this()
  }
  /* static members */
  object default {
    
    @JSImport("@endemolshinegroup/cosmiconfig-typescript-loader/dist/Errors/TypeScriptCompileError", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromError(error: TypeScriptCompileErrorProps): TypeScriptCompileError = ^.asInstanceOf[js.Dynamic].applyDynamic("fromError")(error.asInstanceOf[js.Any]).asInstanceOf[TypeScriptCompileError]
  }
  
  @js.native
  trait TypeScriptCompileError extends BaseError {
    
    def toObject(): Message = js.native
  }
  
  trait TypeScriptCompileErrorProps extends StObject {
    
    var message: String
  }
  object TypeScriptCompileErrorProps {
    
    inline def apply(message: String): TypeScriptCompileErrorProps = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeScriptCompileErrorProps]
    }
    
    extension [Self <: TypeScriptCompileErrorProps](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
}
