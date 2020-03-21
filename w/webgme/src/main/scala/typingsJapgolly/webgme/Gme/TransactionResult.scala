package typingsJapgolly.webgme.Gme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransactionResult extends js.Object {
  var hash: String
  /**
    * may be: 'SYNCED' or 'FORKED'
    */
  var status: String
}

object TransactionResult {
  @scala.inline
  def apply(hash: String, status: String): TransactionResult = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TransactionResult]
  }
}

