package typingsJapgolly.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.swcCore.typesMod.TsParserConfig
  - typingsJapgolly.swcCore.typesMod.EsParserConfig
*/
trait ParserConfig extends StObject
object ParserConfig {
  
  inline def EsParserConfig(): typingsJapgolly.swcCore.typesMod.EsParserConfig = {
    val __obj = js.Dynamic.literal(syntax = "ecmascript")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.EsParserConfig]
  }
  
  inline def TsParserConfig(): typingsJapgolly.swcCore.typesMod.TsParserConfig = {
    val __obj = js.Dynamic.literal(syntax = "typescript")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.TsParserConfig]
  }
}
