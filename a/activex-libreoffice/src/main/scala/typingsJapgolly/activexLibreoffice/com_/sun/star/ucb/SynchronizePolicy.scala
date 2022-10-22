package typingsJapgolly.activexLibreoffice.com_.sun.star.ucb

import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * These are the possible values for the property "SynchronizePolicy".
  * @see XCommandProcessor
  * @see Content
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`2`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
*/
trait SynchronizePolicy extends StObject
object SynchronizePolicy {
  
  /** Client is master. */
  inline def CLIENT_IS_MASTER: `1` = 1.asInstanceOf[`1`]
  
  /** None is master. */
  inline def NONE_IS_MASTER: `2` = 2.asInstanceOf[`2`]
  
  /** Server is master. */
  inline def SERVER_IS_MASTER: `0` = 0.asInstanceOf[`0`]
}
