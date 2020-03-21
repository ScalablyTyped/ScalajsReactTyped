package typingsJapgolly.chrome.chrome.contentSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.chrome.chromeStrings.regular
  - typingsJapgolly.chrome.chromeStrings.incognito_session_only
*/
trait ScopeEnum extends js.Object

object ScopeEnum {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def incognito_session_only: typingsJapgolly.chrome.chromeStrings.incognito_session_only = this.cast("incognito_session_only")
  @scala.inline
  def regular: typingsJapgolly.chrome.chromeStrings.regular = this.cast("regular")
}

