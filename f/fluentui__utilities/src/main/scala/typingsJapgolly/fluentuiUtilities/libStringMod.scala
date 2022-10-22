package typingsJapgolly.fluentuiUtilities

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStringMod {
  
  @JSImport("@fluentui/utilities/lib/string", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def format(s: String, values: Any*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(scala.List(s.asInstanceOf[js.Any]).`++`(values.asInstanceOf[Seq[js.Any]])*).asInstanceOf[String]
}
