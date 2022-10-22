package typingsJapgolly.cucumberGherkin

import typingsJapgolly.cucumberGherkin.distSrcIastbuilderMod.IAstBuilder
import typingsJapgolly.cucumberGherkin.distSrcParserMod.RuleType
import typingsJapgolly.cucumberGherkin.distSrcParserMod.TokenType
import typingsJapgolly.cucumberMessages.distCjsSrcIdGeneratorMod.NewId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcAstBuilderMod {
  
  @JSImport("@cucumber/gherkin/dist/src/AstBuilder", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with AstBuilder {
    def this(newId: NewId) = this()
  }
  
  @js.native
  trait AstBuilder
    extends StObject
       with IAstBuilder[typingsJapgolly.cucumberGherkin.distSrcAstNodeMod.default, TokenType, RuleType]
}
