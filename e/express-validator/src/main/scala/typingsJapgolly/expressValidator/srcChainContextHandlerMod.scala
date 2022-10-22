package typingsJapgolly.expressValidator

import typingsJapgolly.expressValidator.expressValidatorBooleans.`true`
import typingsJapgolly.expressValidator.srcBaseMod.CustomValidator
import typingsJapgolly.expressValidator.srcChainValidationChainMod.ValidationChain
import typingsJapgolly.expressValidator.srcContextMod.Optional
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcChainContextHandlerMod {
  
  @js.native
  trait ContextHandler[Chain] extends StObject {
    
    def bail(): Chain = js.native
    
    def `if`(condition: CustomValidator): Chain = js.native
    def `if`(condition: ValidationChain): Chain = js.native
    
    def optional(): Chain = js.native
    def optional(options: Partial[Optional]): Chain = js.native
    @JSName("optional")
    def optional_true(options: `true`): Chain = js.native
  }
}
