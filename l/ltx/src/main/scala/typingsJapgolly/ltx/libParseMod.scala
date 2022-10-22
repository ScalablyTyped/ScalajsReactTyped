package typingsJapgolly.ltx

import typingsJapgolly.ltx.anon.TypeofParserInstantiable
import typingsJapgolly.ltx.srcElementMod.default
import typingsJapgolly.ltx.srcParserMod.ParserOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libParseMod {
  
  inline def apply(data: String): default = ^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any]).asInstanceOf[default]
  inline def apply(data: String, options: TypeofParserInstantiable): default = (^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[default]
  inline def apply(data: String, options: ParserOptions): default = (^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[default]
  
  @JSImport("ltx/lib/parse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
