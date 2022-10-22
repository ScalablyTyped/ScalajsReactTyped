package typingsJapgolly.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.swcWasm.mod.TsParserConfig
  - typingsJapgolly.swcWasm.mod.EsParserConfig
*/
trait ParserConfig extends StObject
object ParserConfig {
  
  inline def EsParserConfig(): typingsJapgolly.swcWasm.mod.EsParserConfig = {
    val __obj = js.Dynamic.literal(syntax = "ecmascript")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.EsParserConfig]
  }
  
  inline def TsParserConfig(): typingsJapgolly.swcWasm.mod.TsParserConfig = {
    val __obj = js.Dynamic.literal(syntax = "typescript")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.TsParserConfig]
  }
}
