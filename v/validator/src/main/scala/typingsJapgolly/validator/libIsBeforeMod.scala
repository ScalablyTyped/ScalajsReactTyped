package typingsJapgolly.validator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIsBeforeMod {
  
  @JSImport("validator/lib/isBefore", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Check if the string is a date that's before the specified date.
    *
    * @param [date] - Date string (defaults to now)
    */
  inline def default(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def default(str: String, date: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(str.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
