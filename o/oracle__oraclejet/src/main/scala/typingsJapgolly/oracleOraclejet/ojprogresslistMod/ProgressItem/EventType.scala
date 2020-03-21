package typingsJapgolly.oracleOraclejet.ojprogresslistMod.ProgressItem

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.loadstart
  - typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.progress
  - typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.abort
  - typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.error
  - typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.load
  - typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.timeout
  - typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.loadend
*/
trait EventType extends js.Object

object EventType {
  @scala.inline
  def abort: typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.abort = this.cast("abort")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.error = this.cast("error")
  @scala.inline
  def load: typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.load = this.cast("load")
  @scala.inline
  def loadend: typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.loadend = this.cast("loadend")
  @scala.inline
  def loadstart: typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.loadstart = this.cast("loadstart")
  @scala.inline
  def progress: typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.progress = this.cast("progress")
  @scala.inline
  def timeout: typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.timeout = this.cast("timeout")
}

