package typingsJapgolly.cucumberGherkin

import typingsJapgolly.cucumberGherkin.distSrcItokenMod.IGherkinLine
import typingsJapgolly.cucumberGherkin.distSrcItokenMod.IToken
import typingsJapgolly.cucumberGherkin.distSrcItokenMod.Item
import typingsJapgolly.cucumberGherkin.distSrcItokenmatcherMod.ITokenMatcher
import typingsJapgolly.cucumberGherkin.distSrcParserMod.TokenType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGherkinClassicTokenMatcherMod {
  
  @JSImport("@cucumber/gherkin/dist/src/GherkinClassicTokenMatcher", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with GherkinClassicTokenMatcher {
    def this(defaultDialectName: String) = this()
  }
  
  @js.native
  trait GherkinClassicTokenMatcher
    extends StObject
       with ITokenMatcher[TokenType] {
    
    def _match_DocStringSeparator(token: IToken[TokenType], separator: String, isOpen: Boolean): Boolean = js.native
    
    /* private */ var activeDocStringSeparator: Any = js.native
    
    /* private */ val defaultDialectName: Any = js.native
    
    /* private */ var dialect: Any = js.native
    
    /* private */ var dialectName: Any = js.native
    
    def getTags(line: IGherkinLine): js.Array[Item] = js.native
    
    /* private */ var indentToRemove: Any = js.native
    
    def initializeKeywordTypes(): Unit = js.native
    
    /* private */ var keywordTypesMap: Any = js.native
    
    /* private */ var matchTitleLine: Any = js.native
    
    /* private */ var setTokenMatched: Any = js.native
    
    /* private */ var unescapeDocString: Any = js.native
  }
}
