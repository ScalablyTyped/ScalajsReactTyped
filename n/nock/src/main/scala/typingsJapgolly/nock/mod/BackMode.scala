package typingsJapgolly.nock.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.nock.nockStrings.wild
  - typingsJapgolly.nock.nockStrings.dryrun
  - typingsJapgolly.nock.nockStrings.record
  - typingsJapgolly.nock.nockStrings.lockdown
*/
trait BackMode extends js.Object

object BackMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dryrun: typingsJapgolly.nock.nockStrings.dryrun = this.cast("dryrun")
  @scala.inline
  def lockdown: typingsJapgolly.nock.nockStrings.lockdown = this.cast("lockdown")
  @scala.inline
  def record: typingsJapgolly.nock.nockStrings.record = this.cast("record")
  @scala.inline
  def wild: typingsJapgolly.nock.nockStrings.wild = this.cast("wild")
}

