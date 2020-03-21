package typingsJapgolly.oracleOraclejet.ojdataproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FetchByOffsetResults[K, D] extends js.Object {
  var done: Boolean
  var fetchParameters: FetchByOffsetParameters[D]
  var results: js.Array[Item[K, D]]
}

object FetchByOffsetResults {
  @scala.inline
  def apply[K, D](done: Boolean, fetchParameters: FetchByOffsetParameters[D], results: js.Array[Item[K, D]]): FetchByOffsetResults[K, D] = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], fetchParameters = fetchParameters.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FetchByOffsetResults[K, D]]
  }
}

