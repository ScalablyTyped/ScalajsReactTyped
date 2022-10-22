package typingsJapgolly.validator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIsPortMod {
  
  @JSImport("validator/lib/isPort", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Check if the string is a valid port number.
    */
  inline def default(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
