package typingsJapgolly.deline

import typingsJapgolly.std.TemplateStringsArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(strings: String, values: Any*): String = ^.asInstanceOf[js.Dynamic].apply(scala.List(strings.asInstanceOf[js.Any]).`++`(values.asInstanceOf[Seq[js.Any]])*).asInstanceOf[String]
  inline def apply(strings: TemplateStringsArray, values: Any*): String = ^.asInstanceOf[js.Dynamic].apply(scala.List(strings.asInstanceOf[js.Any]).`++`(values.asInstanceOf[Seq[js.Any]])*).asInstanceOf[String]
  
  @JSImport("deline", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
