package typingsJapgolly.gapiClientDatastore.gapi.client.datastore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadOptions extends js.Object {
  /**
    * The non-transactional read consistency to use.
    * Cannot be set to `STRONG` for global queries.
    */
  var readConsistency: js.UndefOr[String] = js.undefined
  /**
    * The identifier of the transaction in which to read. A
    * transaction identifier is returned by a call to
    * Datastore.BeginTransaction.
    */
  var transaction: js.UndefOr[String] = js.undefined
}

object ReadOptions {
  @scala.inline
  def apply(readConsistency: String = null, transaction: String = null): ReadOptions = {
    val __obj = js.Dynamic.literal()
    if (readConsistency != null) __obj.updateDynamic("readConsistency")(readConsistency.asInstanceOf[js.Any])
    if (transaction != null) __obj.updateDynamic("transaction")(transaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadOptions]
  }
}

