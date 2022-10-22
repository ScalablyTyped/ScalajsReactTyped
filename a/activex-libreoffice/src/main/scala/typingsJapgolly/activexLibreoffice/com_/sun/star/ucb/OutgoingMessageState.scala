package typingsJapgolly.activexLibreoffice.com_.sun.star.ucb

import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`2`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`3`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`4`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`5`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`6`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`7`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** These are the possible values for {@link RecipientInfo.State} . */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`2`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`7`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`5`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`4`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`3`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`6`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
*/
trait OutgoingMessageState extends StObject
object OutgoingMessageState {
  
  /** Message has been sent upstream to all recipients. */
  inline def COMPLETELY_LOCALLY_SENT: `2` = 2.asInstanceOf[`2`]
  
  /** Recipient confirmed reading. */
  inline def CONFIRMED: `7` = 7.asInstanceOf[`7`]
  
  /** Global fatal error (e.g. last member in SMTP chain could not deliver the message). */
  inline def EXTERNAL_ERROR: `5` = 5.asInstanceOf[`5`]
  
  /** Local fatal error (e.g. first SMTP server upstream did not accept the message). */
  inline def NONRECOVERABLE_LOCAL_ERROR: `4` = 4.asInstanceOf[`4`]
  
  /** Message has been sent upstream to some recipients. */
  inline def PARTIALLY_LOCALLY_SENT: `1` = 1.asInstanceOf[`1`]
  
  /** Local, non-fatal error (e.g. network temporarily not available). */
  inline def RECOVERABLE_LOCAL_ERROR: `3` = 3.asInstanceOf[`3`]
  
  /** Message was sent; we are waiting for confirmation. */
  inline def WAITING_CONFIRMATION: `6` = 6.asInstanceOf[`6`]
  
  /** Message has just been placed into the out tray. */
  inline def WRITTEN: `0` = 0.asInstanceOf[`0`]
}
