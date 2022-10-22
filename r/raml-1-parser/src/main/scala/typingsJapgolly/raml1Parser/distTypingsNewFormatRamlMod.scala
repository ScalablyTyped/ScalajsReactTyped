package typingsJapgolly.raml1Parser

import typingsJapgolly.raml1Parser.distTypingsNewFormatSpec0Dot8ApiMod.Api08
import typingsJapgolly.raml1Parser.distTypingsNewFormatSpec1Dot0ApiMod.Api10
import typingsJapgolly.raml1Parser.distTypingsNewFormatSpec1Dot0ApiMod.Extension
import typingsJapgolly.raml1Parser.distTypingsNewFormatSpec1Dot0ApiMod.Overlay
import typingsJapgolly.raml1Parser.distTypingsNewFormatSpec1Dot0DatamodelMod.ExampleFragment
import typingsJapgolly.raml1Parser.distTypingsNewFormatSpec1Dot0DatamodelMod.TypeDeclarationFragment
import typingsJapgolly.raml1Parser.distTypingsNewFormatSpec1Dot0MethodsMod.TraitFragment
import typingsJapgolly.raml1Parser.distTypingsNewFormatSpec1Dot0ResourcesMod.ResourceTypeFragment
import typingsJapgolly.raml1Parser.distTypingsNewFormatSpec1Dot0SecurityMod.SecuritySchemeFragment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypingsNewFormatRamlMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.raml1Parser.distTypingsNewFormatSpec1Dot0CommonMod.RAML10ParseResult
    - typingsJapgolly.raml1Parser.distTypingsNewFormatSpec0Dot8ApiMod.RAML08ParseResult
  */
  trait RAMLParseResult extends StObject
  object RAMLParseResult {
    
    inline def RAML08ParseResult(specification: Api08, `type`: String): typingsJapgolly.raml1Parser.distTypingsNewFormatSpec0Dot8ApiMod.RAML08ParseResult = {
      val __obj = js.Dynamic.literal(ramlVersion = "RAML08", specification = specification.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.raml1Parser.distTypingsNewFormatSpec0Dot8ApiMod.RAML08ParseResult]
    }
    
    inline def RAML10ParseResult(
      specification: Api10 | Overlay | Extension | ResourceTypeFragment | TraitFragment | SecuritySchemeFragment | TypeDeclarationFragment | ExampleFragment,
      `type`: String
    ): typingsJapgolly.raml1Parser.distTypingsNewFormatSpec1Dot0CommonMod.RAML10ParseResult = {
      val __obj = js.Dynamic.literal(ramlVersion = "RAML10", specification = specification.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.raml1Parser.distTypingsNewFormatSpec1Dot0CommonMod.RAML10ParseResult]
    }
  }
}
