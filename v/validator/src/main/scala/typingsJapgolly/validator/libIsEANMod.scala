package typingsJapgolly.validator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIsEANMod {
  
  @JSImport("validator/lib/isEAN", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Check if the string is an EAN (European Article Number).
    */
  inline def default(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
