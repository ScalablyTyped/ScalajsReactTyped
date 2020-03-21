package typingsJapgolly.chromeApps.chrome.webViewRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @private
  * @template T First parameter type
  * @template K Second parameter type
  */
trait EditCookieParams[T, K] extends js.Object {
  /**
    * Filter for cookies that will be modified.
    * All empty entries are ignored.
    */
  var filter: T
  /**
    * Attributes that shall be overridden in cookies that machted the filter
    * Attributes that are set to an empty string are removed.
    */
  var modification: K
}

object EditCookieParams {
  @scala.inline
  def apply[T, K](filter: T, modification: K): EditCookieParams[T, K] = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], modification = modification.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EditCookieParams[T, K]]
  }
}

