package typingsJapgolly.raml1Parser

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.raml1Parser.distParserArtifactsRaml08parserMod.ApiImpl
import typingsJapgolly.raml1Parser.distParserArtifactsRaml08parserapiMod.Resource
import typingsJapgolly.raml1Parser.distParserHighLevelASTMod.ValidationAcceptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distParserAstDotcoreOverloadingValidator08Mod {
  
  @JSImport("raml-1-parser/dist/parser/ast.core/overloadingValidator08", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with OverloadingValidator {
    
    /* CompleteClass */
    override def acceptResource(x: Resource): Unit = js.native
    
    /* protected */ /* CompleteClass */
    var conflicting: StringDictionary[js.Array[Resource]] = js.native
    
    /* protected */ /* CompleteClass */
    var holder: StringDictionary[js.Array[Resource]] = js.native
    
    /* CompleteClass */
    override def validateApi(q: ApiImpl, v: ValidationAcceptor): Unit = js.native
  }
  
  trait OverloadingValidator extends StObject {
    
    def acceptResource(x: Resource): Unit
    
    /* protected */ var conflicting: StringDictionary[js.Array[Resource]]
    
    /* protected */ var holder: StringDictionary[js.Array[Resource]]
    
    def validateApi(q: ApiImpl, v: ValidationAcceptor): Unit
  }
  object OverloadingValidator {
    
    inline def apply(
      acceptResource: Resource => Callback,
      conflicting: StringDictionary[js.Array[Resource]],
      holder: StringDictionary[js.Array[Resource]],
      validateApi: (ApiImpl, ValidationAcceptor) => Callback
    ): OverloadingValidator = {
      val __obj = js.Dynamic.literal(acceptResource = js.Any.fromFunction1((t0: Resource) => acceptResource(t0).runNow()), conflicting = conflicting.asInstanceOf[js.Any], holder = holder.asInstanceOf[js.Any], validateApi = js.Any.fromFunction2((t0: ApiImpl, t1: ValidationAcceptor) => (validateApi(t0, t1)).runNow()))
      __obj.asInstanceOf[OverloadingValidator]
    }
    
    extension [Self <: OverloadingValidator](x: Self) {
      
      inline def setAcceptResource(value: Resource => Callback): Self = StObject.set(x, "acceptResource", js.Any.fromFunction1((t0: Resource) => value(t0).runNow()))
      
      inline def setConflicting(value: StringDictionary[js.Array[Resource]]): Self = StObject.set(x, "conflicting", value.asInstanceOf[js.Any])
      
      inline def setHolder(value: StringDictionary[js.Array[Resource]]): Self = StObject.set(x, "holder", value.asInstanceOf[js.Any])
      
      inline def setValidateApi(value: (ApiImpl, ValidationAcceptor) => Callback): Self = StObject.set(x, "validateApi", js.Any.fromFunction2((t0: ApiImpl, t1: ValidationAcceptor) => (value(t0, t1)).runNow()))
    }
  }
}
