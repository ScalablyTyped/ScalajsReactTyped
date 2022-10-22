package typingsJapgolly.ltx

import typingsJapgolly.ltx.anon.TypeofParserInstantiable
import typingsJapgolly.ltx.srcParserMod.ParserOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcParseMod {
  
  @JSImport("ltx/src/parse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(data: String): typingsJapgolly.ltx.srcElementMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(data.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.ltx.srcElementMod.default]
  inline def default(data: String, options: TypeofParserInstantiable): typingsJapgolly.ltx.srcElementMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ltx.srcElementMod.default]
  inline def default(data: String, options: ParserOptions): typingsJapgolly.ltx.srcElementMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ltx.srcElementMod.default]
}
