package typingsJapgolly.handsontable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpersTemplateLiteralTagMod {
  
  @JSImport("handsontable/helpers/templateLiteralTag", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def toSingleLine(strings: js.Array[String], expressions: String*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toSingleLine")(scala.List(strings.asInstanceOf[js.Any]).`++`(expressions.asInstanceOf[Seq[js.Any]])*).asInstanceOf[String]
}
