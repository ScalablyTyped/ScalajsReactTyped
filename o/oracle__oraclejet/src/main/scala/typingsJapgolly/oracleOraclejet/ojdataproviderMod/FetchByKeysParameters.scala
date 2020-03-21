package typingsJapgolly.oracleOraclejet.ojdataproviderMod

import typingsJapgolly.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FetchByKeysParameters[K] extends js.Object {
  var attributes: js.UndefOr[js.Array[String | FetchAttribute]] = js.undefined
  var keys: Set[K]
}

object FetchByKeysParameters {
  @scala.inline
  def apply[K](keys: Set[K], attributes: js.Array[String | FetchAttribute] = null): FetchByKeysParameters[K] = {
    val __obj = js.Dynamic.literal(keys = keys.asInstanceOf[js.Any])
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchByKeysParameters[K]]
  }
}

