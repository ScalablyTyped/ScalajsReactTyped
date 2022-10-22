package typingsJapgolly.validator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIsISBNMod {
  
  @JSImport("validator/lib/isISBN", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Check if the string is an ISBN (version 10 or 13).
    *
    * @param [version] - ISBN Version
    */
  inline def default(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def default(str: String, version: typingsJapgolly.validator.mod.validator.ISBNVersion): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(str.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  type ISBNVersion = typingsJapgolly.validator.mod.validator.ISBNVersion
}
