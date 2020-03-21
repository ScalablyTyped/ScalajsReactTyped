package typingsJapgolly.nightwatch.mod

import typingsJapgolly.nightwatch.nightwatchNumbers.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NightwatchTypedCallbackResult[T] extends NightwatchCallbackResult[T] {
  var state: js.Error | String
  var status: `0`
  var value: T
}

object NightwatchTypedCallbackResult {
  @scala.inline
  def apply[T](state: js.Error | String, status: `0`, value: T): NightwatchTypedCallbackResult[T] = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NightwatchTypedCallbackResult[T]]
  }
}

