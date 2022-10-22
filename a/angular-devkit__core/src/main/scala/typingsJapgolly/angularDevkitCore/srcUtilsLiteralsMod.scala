package typingsJapgolly.angularDevkitCore

import typingsJapgolly.std.TemplateStringsArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcUtilsLiteralsMod {
  
  @JSImport("@angular-devkit/core/src/utils/literals", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def indentBy(indentations: Double): TemplateTag[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("indentBy")(indentations.asInstanceOf[js.Any]).asInstanceOf[TemplateTag[String]]
  
  inline def oneLine(strings: TemplateStringsArray, values: Any*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("oneLine")(scala.List(strings.asInstanceOf[js.Any]).`++`(values.asInstanceOf[Seq[js.Any]])*).asInstanceOf[String]
  
  inline def stripIndent(strings: TemplateStringsArray, values: Any*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stripIndent")(scala.List(strings.asInstanceOf[js.Any]).`++`(values.asInstanceOf[Seq[js.Any]])*).asInstanceOf[String]
  
  inline def stripIndents(strings: TemplateStringsArray, values: Any*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stripIndents")(scala.List(strings.asInstanceOf[js.Any]).`++`(values.asInstanceOf[Seq[js.Any]])*).asInstanceOf[String]
  
  inline def trimNewlines(strings: TemplateStringsArray, values: Any*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("trimNewlines")(scala.List(strings.asInstanceOf[js.Any]).`++`(values.asInstanceOf[Seq[js.Any]])*).asInstanceOf[String]
  
  type TemplateTag[R] = js.Function2[/* template */ TemplateStringsArray, /* repeated */ Any, R]
}
