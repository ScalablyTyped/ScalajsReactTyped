package typingsJapgolly.oracleOraclejet.ojprogresslistMod.ProgressItem

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.queued
  - typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.loadstarted
  - typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.aborted
  - typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.errored
  - typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.timedout
  - typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.loaded
*/
trait Status extends js.Object

object Status {
  @scala.inline
  def aborted: typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.aborted = this.cast("aborted")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def errored: typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.errored = this.cast("errored")
  @scala.inline
  def loaded: typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.loaded = this.cast("loaded")
  @scala.inline
  def loadstarted: typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.loadstarted = this.cast("loadstarted")
  @scala.inline
  def queued: typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.queued = this.cast("queued")
  @scala.inline
  def timedout: typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.timedout = this.cast("timedout")
}

