package typingsJapgolly.fastCsvParse

import typingsJapgolly.fastCsvParse.buildSrcParserOptionsMod.ParserOptions
import typingsJapgolly.fastCsvParse.buildSrcParserScannerMod.Scanner
import typingsJapgolly.fastCsvParse.buildSrcTypesMod.RowArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcParserRowParserMod {
  
  @JSImport("@fast-csv/parse/build/src/parser/RowParser", "RowParser")
  @js.native
  open class RowParser protected () extends StObject {
    def this(parserOptions: ParserOptions) = this()
    
    /* private */ val columnParser: Any = js.native
    
    /* private */ var getStartToken: Any = js.native
    
    def parse(scanner: Scanner): RowArray[Any] | Null = js.native
    
    /* private */ val parserOptions: Any = js.native
    
    /* private */ var shouldSkipColumnParse: Any = js.native
  }
  /* static members */
  object RowParser {
    
    @JSImport("@fast-csv/parse/build/src/parser/RowParser", "RowParser")
    @js.native
    val ^ : js.Any = js.native
    
    inline def isEmptyRow(row: RowArray[Any]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmptyRow")(row.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
}
