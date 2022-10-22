package typingsJapgolly.validator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLtrimMod {
  
  @JSImport("validator/lib/ltrim", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Trim characters from the left-side of the input.
    *
    * @param [chars] - characters (defaults to whitespace)
    */
  inline def default(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def default(input: String, chars: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(input.asInstanceOf[js.Any], chars.asInstanceOf[js.Any])).asInstanceOf[String]
}
