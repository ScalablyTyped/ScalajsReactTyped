package typingsJapgolly.stylableCodeFormatter

import typingsJapgolly.jsBeautify.mod.CSSBeautifyOptions
import typingsJapgolly.stylableCodeFormatter.anon.End
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFormatterMod {
  
  @JSImport("@stylable/code-formatter/dist/formatter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getDocumentFormatting(content: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocumentFormatting")(content.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getDocumentFormatting(content: String, offset: Unit, options: CSSBeautifyOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getDocumentFormatting")(content.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getDocumentFormatting(content: String, offset: End): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getDocumentFormatting")(content.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getDocumentFormatting(content: String, offset: End, options: CSSBeautifyOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getDocumentFormatting")(content.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
}
