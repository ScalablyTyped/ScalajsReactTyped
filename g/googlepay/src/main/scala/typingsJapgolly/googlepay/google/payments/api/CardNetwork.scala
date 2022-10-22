package typingsJapgolly.googlepay.google.payments.api

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Card network enum string.
  *
  * Options:
  *
  * - `AMEX`:
  *   American Express card network.
  *
  * - `DISCOVER`:
  *   Discover card network.
  *
  * - `ELECTRON`:
  *   Visa's Electron card network.
  *
  *   Note that this option can only be set when
  *   [[TransactionInfo.countryCode|`TransactionInfo.countryCode`]] is set
  *   to `"BR"`, and
  *   [[CardParameters.allowedCardNetworks|`CardParameters.allowedCardNetworks`]]
  *   must also contain [[CardNetwork|`VISA`]]
  *
  *   For processing purposes, you should use this as an indication that
  *   the card must be processed through the Electron debit network.
  *
  * - `ELO`:
  *   Elo card network.
  *
  *   Note that this option can only be set when
  *   [[TransactionInfo.countryCode|`TransactionInfo.countryCode`]] is set
  *   to `"BR"`.
  *
  * - `ELO_DEBIT`:
  *   Elo's debit network rail.
  *
  *   Note that this option can only be set when
  *   [[TransactionInfo.countryCode|`TransactionInfo.countryCode`]] is set
  *   to
  *   `"BR"`, and
  *   [[CardParameters.allowedCardNetworks|`CardParameters.allowedCardNetworks`]]
  *   must also contain [[CardNetwork|`ELO`]]
  *
  *   For processing purposes, you should use this as an indication that
  *   the card must be processed through the ELO debit network.
  *
  * - `INTERAC`:
  *   Interac card network.
  *
  * - `JCB`:
  *   JCB card network.
  *
  * - `MAESTRO`:
  *   Maestro card network.
  *
  *   Note that this option can only be set when
  *   [[TransactionInfo.countryCode|`TransactionInfo.countryCode`]] is set
  *   to `"BR"`, and
  *   [[CardParameters.allowedCardNetworks|`CardParameters.allowedCardNetworks`]]
  *   must also contain [[CardNetwork|`MASTERCARD`]]
  *
  *   For processing purposes, you should use this as an indication that
  *   the card must be processed through the Maestro debit network.
  *
  * - `MASTERCARD`:
  *   Mastercard card network.
  *
  * - `VISA`:
  *   Visa card network.
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.googlepay.googlepayStrings.AMEX
  - typingsJapgolly.googlepay.googlepayStrings.DISCOVER
  - typingsJapgolly.googlepay.googlepayStrings.ELECTRON
  - typingsJapgolly.googlepay.googlepayStrings.ELO
  - typingsJapgolly.googlepay.googlepayStrings.ELO_DEBIT
  - typingsJapgolly.googlepay.googlepayStrings.INTERAC
  - typingsJapgolly.googlepay.googlepayStrings.JCB
  - typingsJapgolly.googlepay.googlepayStrings.MAESTRO
  - typingsJapgolly.googlepay.googlepayStrings.MASTERCARD
  - typingsJapgolly.googlepay.googlepayStrings.VISA
*/
trait CardNetwork extends StObject
object CardNetwork {
  
  inline def AMEX: typingsJapgolly.googlepay.googlepayStrings.AMEX = "AMEX".asInstanceOf[typingsJapgolly.googlepay.googlepayStrings.AMEX]
  
  inline def DISCOVER: typingsJapgolly.googlepay.googlepayStrings.DISCOVER = "DISCOVER".asInstanceOf[typingsJapgolly.googlepay.googlepayStrings.DISCOVER]
  
  inline def ELECTRON: typingsJapgolly.googlepay.googlepayStrings.ELECTRON = "ELECTRON".asInstanceOf[typingsJapgolly.googlepay.googlepayStrings.ELECTRON]
  
  inline def ELO: typingsJapgolly.googlepay.googlepayStrings.ELO = "ELO".asInstanceOf[typingsJapgolly.googlepay.googlepayStrings.ELO]
  
  inline def ELO_DEBIT: typingsJapgolly.googlepay.googlepayStrings.ELO_DEBIT = "ELO_DEBIT".asInstanceOf[typingsJapgolly.googlepay.googlepayStrings.ELO_DEBIT]
  
  inline def INTERAC: typingsJapgolly.googlepay.googlepayStrings.INTERAC = "INTERAC".asInstanceOf[typingsJapgolly.googlepay.googlepayStrings.INTERAC]
  
  inline def JCB: typingsJapgolly.googlepay.googlepayStrings.JCB = "JCB".asInstanceOf[typingsJapgolly.googlepay.googlepayStrings.JCB]
  
  inline def MAESTRO: typingsJapgolly.googlepay.googlepayStrings.MAESTRO = "MAESTRO".asInstanceOf[typingsJapgolly.googlepay.googlepayStrings.MAESTRO]
  
  inline def MASTERCARD: typingsJapgolly.googlepay.googlepayStrings.MASTERCARD = "MASTERCARD".asInstanceOf[typingsJapgolly.googlepay.googlepayStrings.MASTERCARD]
  
  inline def VISA: typingsJapgolly.googlepay.googlepayStrings.VISA = "VISA".asInstanceOf[typingsJapgolly.googlepay.googlepayStrings.VISA]
}
