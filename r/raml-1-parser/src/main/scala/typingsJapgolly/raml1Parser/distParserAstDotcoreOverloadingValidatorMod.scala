package typingsJapgolly.raml1Parser

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.raml1Parser.distParserArtifactsRaml08parserapiMod.Api
import typingsJapgolly.raml1Parser.distParserArtifactsRaml08parserapiMod.Resource
import typingsJapgolly.raml1Parser.distParserHighLevelASTMod.ValidationAcceptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distParserAstDotcoreOverloadingValidatorMod {
  
  @JSImport("raml-1-parser/dist/parser/ast.core/overloadingValidator", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with OverloadingValidator
  
  @js.native
  trait OverloadingValidator extends StObject {
    
    def acceptResource(resource: Resource): Unit = js.native
    def acceptResource(resource: typingsJapgolly.raml1Parser.distParserArtifactsRaml10parserapiMod.Resource): Unit = js.native
    
    /* protected */ var conflictingUriToResources: StringDictionary[
        js.Array[
          typingsJapgolly.raml1Parser.distParserArtifactsRaml10parserapiMod.Resource | Resource
        ]
      ] = js.native
    
    /* protected */ var uriToResources: StringDictionary[
        js.Array[
          typingsJapgolly.raml1Parser.distParserArtifactsRaml10parserapiMod.Resource | Resource
        ]
      ] = js.native
    
    def validateApi(api: Api, acceptor: ValidationAcceptor): Unit = js.native
    def validateApi(
      api: typingsJapgolly.raml1Parser.distParserArtifactsRaml10parserapiMod.Api,
      acceptor: ValidationAcceptor
    ): Unit = js.native
  }
}
