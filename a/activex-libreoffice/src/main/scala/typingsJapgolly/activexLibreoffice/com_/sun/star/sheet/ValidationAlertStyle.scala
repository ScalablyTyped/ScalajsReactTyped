package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`2`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** used to specify how invalid cell contents are treated. */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`2`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`3`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
*/
trait ValidationAlertStyle extends StObject
object ValidationAlertStyle {
  
  /** information message is shown and the user is asked whether the change will be accepted (defaulted to "Yes"). */
  inline def INFO: `2` = 2.asInstanceOf[`2`]
  
  /** macro is executed. */
  inline def MACRO: `3` = 3.asInstanceOf[`3`]
  
  /** error message is shown and the change is rejected. */
  inline def STOP: `0` = 0.asInstanceOf[`0`]
  
  /** warning message is shown and the user is asked whether the change will be accepted (defaulted to "No"). */
  inline def WARNING: `1` = 1.asInstanceOf[`1`]
}
