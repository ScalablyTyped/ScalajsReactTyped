package typingsJapgolly.squareConnect.mod

import typingsJapgolly.squareConnect.squareConnectStrings.AUTHORIZED
import typingsJapgolly.squareConnect.squareConnectStrings.CAPTURED
import typingsJapgolly.squareConnect.squareConnectStrings.CONTACTLESS
import typingsJapgolly.squareConnect.squareConnectStrings.EMV
import typingsJapgolly.squareConnect.squareConnectStrings.FAILED
import typingsJapgolly.squareConnect.squareConnectStrings.KEYED
import typingsJapgolly.squareConnect.squareConnectStrings.ON_FILE
import typingsJapgolly.squareConnect.squareConnectStrings.SWIPED
import typingsJapgolly.squareConnect.squareConnectStrings.VOIDED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "TenderCardDetails")
@js.native
class TenderCardDetails () extends js.Object {
  /**
    * The credit card's non-confidential details.
    */
  var card: js.UndefOr[Card] = js.native
  /**
    * The method used to enter the card's details for the transaction.
    * See [TenderCardDetailsEntryMethod](#type-tendercarddetailsentrymethod) for possible values.
    */
  var entry_method: js.UndefOr[SWIPED | KEYED | EMV | ON_FILE | CONTACTLESS] = js.native
  /**
    * The credit card payment's current state (such as `AUTHORIZED` or `CAPTURED`).
    * See [TenderCardDetailsStatus](#type-tendercarddetailsstatus) for possible values.
    */
  var status: js.UndefOr[AUTHORIZED | CAPTURED | VOIDED | FAILED] = js.native
}

