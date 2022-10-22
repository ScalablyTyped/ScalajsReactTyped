package typingsJapgolly.awsSdkJsonParser

import typingsJapgolly.awsSdkTypes.distTypesUtilMod.Decoder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BodyParser * / any */ @JSImport("@aws-sdk/json-parser", "JsonParser")
  @js.native
  open class JsonParser protected () extends StObject {
    def this(base64Decoder: Decoder) = this()
    
    /* private */ val base64Decoder: Any = js.native
    
    def parse[OutputType](
      shape: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Member */ Any,
      input: String
    ): OutputType = js.native
    
    /* private */ var unmarshall: Any = js.native
  }
}
