package typingsJapgolly.googleapis.safebrowsingV4Mod.safebrowsingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The expected state of a client&#39;s local database.
  */
@js.native
trait SchemaChecksum extends js.Object {
  /**
    * The SHA256 hash of the client state; that is, of the sorted list of all
    * hashes present in the database.
    */
  var sha256: js.UndefOr[String] = js.native
}

object SchemaChecksum {
  @scala.inline
  def apply(sha256: String = null): SchemaChecksum = {
    val __obj = js.Dynamic.literal()
    if (sha256 != null) __obj.updateDynamic("sha256")(sha256.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaChecksum]
  }
}

