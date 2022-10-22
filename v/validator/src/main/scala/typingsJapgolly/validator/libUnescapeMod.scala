package typingsJapgolly.validator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUnescapeMod {
  
  @JSImport("validator/lib/unescape", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Replaces HTML encoded entities with `<`, `>`, `&`, `'`, `"` and `/`.
    */
  inline def default(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(input.asInstanceOf[js.Any]).asInstanceOf[String]
}
