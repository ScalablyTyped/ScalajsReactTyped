package typingsJapgolly.sucrase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTransformersOptionalCatchBindingTransformerMod {
  
  @JSImport("sucrase/dist/types/transformers/OptionalCatchBindingTransformer", JSImport.Default)
  @js.native
  open class default protected () extends OptionalCatchBindingTransformer {
    def this(
      tokens: typingsJapgolly.sucrase.distTypesTokenProcessorMod.default,
      nameManager: typingsJapgolly.sucrase.distTypesNameManagerMod.default
    ) = this()
  }
  
  @js.native
  trait OptionalCatchBindingTransformer
    extends typingsJapgolly.sucrase.distTypesTransformersTransformerMod.default {
    
    val nameManager: typingsJapgolly.sucrase.distTypesNameManagerMod.default = js.native
    
    val tokens: typingsJapgolly.sucrase.distTypesTokenProcessorMod.default = js.native
  }
}
