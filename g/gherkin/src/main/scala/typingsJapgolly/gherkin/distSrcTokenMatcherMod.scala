package typingsJapgolly.gherkin

import typingsJapgolly.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.ILocation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTokenMatcherMod {
  
  @JSImport("gherkin/dist/src/TokenMatcher", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with TokenMatcher {
    def this(defaultDialectName: String) = this()
  }
  
  @js.native
  trait TokenMatcher extends StObject {
    
    def _match_DocStringSeparator(token: typingsJapgolly.gherkin.distSrcTokenMod.default, separator: String, isOpen: Boolean): Boolean = js.native
    
    /* private */ var activeDocStringSeparator: Any = js.native
    
    def changeDialect(newDialectName: String): Unit = js.native
    def changeDialect(newDialectName: String, location: ILocation): Unit = js.native
    
    /* private */ val defaultDialectName: Any = js.native
    
    /* private */ var dialect: Any = js.native
    
    /* private */ var dialectName: Any = js.native
    
    /* private */ var indentToRemove: Any = js.native
    
    /* private */ var matchTitleLine: Any = js.native
    
    def match_BackgroundLine(token: typingsJapgolly.gherkin.distSrcTokenMod.default): Boolean = js.native
    
    def match_Comment(token: typingsJapgolly.gherkin.distSrcTokenMod.default): Boolean = js.native
    
    def match_DocStringSeparator(token: typingsJapgolly.gherkin.distSrcTokenMod.default): Boolean = js.native
    
    def match_EOF(token: typingsJapgolly.gherkin.distSrcTokenMod.default): Boolean = js.native
    
    def match_Empty(token: typingsJapgolly.gherkin.distSrcTokenMod.default): Boolean = js.native
    
    def match_ExamplesLine(token: typingsJapgolly.gherkin.distSrcTokenMod.default): Boolean = js.native
    
    def match_FeatureLine(token: typingsJapgolly.gherkin.distSrcTokenMod.default): Boolean = js.native
    
    def match_Language(token: typingsJapgolly.gherkin.distSrcTokenMod.default): Boolean = js.native
    
    def match_Other(token: typingsJapgolly.gherkin.distSrcTokenMod.default): Boolean = js.native
    
    def match_RuleLine(token: typingsJapgolly.gherkin.distSrcTokenMod.default): Boolean = js.native
    
    def match_ScenarioLine(token: typingsJapgolly.gherkin.distSrcTokenMod.default): Boolean = js.native
    
    def match_StepLine(token: typingsJapgolly.gherkin.distSrcTokenMod.default): Boolean = js.native
    
    def match_TableRow(token: typingsJapgolly.gherkin.distSrcTokenMod.default): Boolean = js.native
    
    def match_TagLine(token: typingsJapgolly.gherkin.distSrcTokenMod.default): Boolean = js.native
    
    def reset(): Unit = js.native
    
    /* private */ var setTokenMatched: Any = js.native
    
    /* private */ var unescapeDocString: Any = js.native
  }
}
