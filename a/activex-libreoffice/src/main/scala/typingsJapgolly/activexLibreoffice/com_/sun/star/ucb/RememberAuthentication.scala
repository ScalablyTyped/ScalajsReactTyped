package typingsJapgolly.activexLibreoffice.com_.sun.star.ucb

import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A specification of how long to remember some authentication data. */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`2`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
*/
trait RememberAuthentication extends StObject
object RememberAuthentication {
  
  /** Do not remember the authentication data (use it once and immediately forget about it). */
  inline def NO: `0` = 0.asInstanceOf[`0`]
  
  /** Remember the authentication data "forever". */
  inline def PERSISTENT: `2` = 2.asInstanceOf[`2`]
  
  /** Remember the authentication data, but only until the end of the current session. */
  inline def SESSION: `1` = 1.asInstanceOf[`1`]
}
