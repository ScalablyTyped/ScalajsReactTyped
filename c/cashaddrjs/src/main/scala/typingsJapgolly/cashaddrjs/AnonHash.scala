package typingsJapgolly.cashaddrjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHash extends js.Object {
  var hash: scala.scalajs.js.typedarray.Uint8Array
  var prefix: String
  var `type`: String
}

object AnonHash {
  @scala.inline
  def apply(hash: scala.scalajs.js.typedarray.Uint8Array, prefix: String, `type`: String): AnonHash = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHash]
  }
}

