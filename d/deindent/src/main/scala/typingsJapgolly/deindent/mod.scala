package typingsJapgolly.deindent

import typingsJapgolly.std.TemplateStringsArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(input: String): String = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(tagFn: js.Function2[/* template */ TemplateStringsArray, /* repeated */ Any, String]): js.Function2[/* template */ TemplateStringsArray, /* repeated */ Any, String] = ^.asInstanceOf[js.Dynamic].apply(tagFn.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* template */ TemplateStringsArray, /* repeated */ Any, String]]
  inline def apply(template: TemplateStringsArray, substitutions: Any*): String = ^.asInstanceOf[js.Dynamic].apply(scala.List(template.asInstanceOf[js.Any]).`++`(substitutions.asInstanceOf[Seq[js.Any]])*).asInstanceOf[String]
  
  @JSImport("deindent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
