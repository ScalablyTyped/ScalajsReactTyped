package typingsJapgolly.fastCsvParse

import typingsJapgolly.fastCsvParse.buildSrcParserOptionsMod.ParserOptions
import typingsJapgolly.fastCsvParse.buildSrcParserTokenMod.MaybeToken
import typingsJapgolly.fastCsvParse.buildSrcParserTokenMod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcParserScannerMod {
  
  @JSImport("@fast-csv/parse/build/src/parser/Scanner", "Scanner")
  @js.native
  open class Scanner protected () extends StObject {
    def this(args: ScannerArgs) = this()
    
    def advancePastLine(): Scanner | Null = js.native
    
    def advancePastToken(token: Token): Scanner = js.native
    
    def advanceTo(cursor: Double): Scanner = js.native
    
    def advanceToToken(token: Token): Scanner = js.native
    
    var cursor: Double = js.native
    
    def hasMoreCharacters: Boolean = js.native
    
    val hasMoreData: Boolean = js.native
    
    var line: String = js.native
    
    def lineFromCursor: String = js.native
    
    var lineLength: Double = js.native
    
    def nextCharacterToken: MaybeToken = js.native
    
    def nextNonSpaceToken: MaybeToken = js.native
    
    /* private */ val parserOptions: Any = js.native
    
    def truncateToCursor(): Scanner = js.native
  }
  
  trait ScannerArgs extends StObject {
    
    var cursor: js.UndefOr[Double] = js.undefined
    
    var hasMoreData: Boolean
    
    var line: String
    
    var parserOptions: ParserOptions
  }
  object ScannerArgs {
    
    inline def apply(hasMoreData: Boolean, line: String, parserOptions: ParserOptions): ScannerArgs = {
      val __obj = js.Dynamic.literal(hasMoreData = hasMoreData.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], parserOptions = parserOptions.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScannerArgs]
    }
    
    extension [Self <: ScannerArgs](x: Self) {
      
      inline def setCursor(value: Double): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
      
      inline def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
      
      inline def setHasMoreData(value: Boolean): Self = StObject.set(x, "hasMoreData", value.asInstanceOf[js.Any])
      
      inline def setLine(value: String): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setParserOptions(value: ParserOptions): Self = StObject.set(x, "parserOptions", value.asInstanceOf[js.Any])
    }
  }
}
