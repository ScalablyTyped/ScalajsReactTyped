package typingsJapgolly.grommet.announceContextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.grommet.grommetStrings.off
  - typingsJapgolly.grommet.grommetStrings.polite
  - typingsJapgolly.grommet.grommetStrings.assertive
*/
trait AnnounceMode extends js.Object

object AnnounceMode {
  @scala.inline
  def assertive: typingsJapgolly.grommet.grommetStrings.assertive = this.cast("assertive")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def off: typingsJapgolly.grommet.grommetStrings.off = this.cast("off")
  @scala.inline
  def polite: typingsJapgolly.grommet.grommetStrings.polite = this.cast("polite")
}

