package typingsJapgolly.adobeCssTools

import typingsJapgolly.adobeCssTools.anon.Silent
import typingsJapgolly.adobeCssTools.distCjsTypeMod.CssStylesheetAST
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsParseMod {
  
  @JSImport("@adobe/css-tools/dist/cjs/parse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(css: String): CssStylesheetAST = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(css.asInstanceOf[js.Any]).asInstanceOf[CssStylesheetAST]
  inline def default(css: String, options: Silent): CssStylesheetAST = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(css.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CssStylesheetAST]
  
  inline def parse(css: String): CssStylesheetAST = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(css.asInstanceOf[js.Any]).asInstanceOf[CssStylesheetAST]
  inline def parse(css: String, options: Silent): CssStylesheetAST = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(css.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CssStylesheetAST]
}
