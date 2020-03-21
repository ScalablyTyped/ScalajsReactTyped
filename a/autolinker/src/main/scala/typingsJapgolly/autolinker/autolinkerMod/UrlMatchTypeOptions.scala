package typingsJapgolly.autolinker.autolinkerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.autolinker.autolinkerStrings.scheme
  - typingsJapgolly.autolinker.autolinkerStrings.www
  - typingsJapgolly.autolinker.autolinkerStrings.tld
*/
trait UrlMatchTypeOptions extends js.Object

object UrlMatchTypeOptions {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def scheme: typingsJapgolly.autolinker.autolinkerStrings.scheme = this.cast("scheme")
  @scala.inline
  def tld: typingsJapgolly.autolinker.autolinkerStrings.tld = this.cast("tld")
  @scala.inline
  def www: typingsJapgolly.autolinker.autolinkerStrings.www = this.cast("www")
}

