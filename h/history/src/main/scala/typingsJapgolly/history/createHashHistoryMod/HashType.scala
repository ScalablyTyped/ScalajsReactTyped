package typingsJapgolly.history.createHashHistoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.history.historyStrings.hashbang
  - typings.history.historyStrings.noslash
  - typings.history.historyStrings.slash
*/
trait HashType extends js.Object

object HashType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def hashbang: typingsJapgolly.history.historyStrings.hashbang = this.cast("hashbang")
  @scala.inline
  def noslash: typingsJapgolly.history.historyStrings.noslash = this.cast("noslash")
  @scala.inline
  def slash: typingsJapgolly.history.historyStrings.slash = this.cast("slash")
}

