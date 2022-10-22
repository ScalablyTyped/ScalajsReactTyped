package typingsJapgolly.colord

import typingsJapgolly.colord.typesMod.Format
import typingsJapgolly.colord.typesMod.Input
import typingsJapgolly.colord.typesMod.ParseResult
import typingsJapgolly.colord.typesMod.Parsers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parseMod {
  
  @JSImport("colord/parse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getFormat(input: Input): js.UndefOr[Format] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFormat")(input.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Format]]
  
  inline def parse(input: Input): ParseResult | (js.Tuple2[Null, Unit]) = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any]).asInstanceOf[ParseResult | (js.Tuple2[Null, Unit])]
  
  @JSImport("colord/parse", "parsers")
  @js.native
  val parsers: Parsers = js.native
}
