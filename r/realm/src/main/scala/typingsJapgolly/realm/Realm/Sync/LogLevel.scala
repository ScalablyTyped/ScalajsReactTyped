package typingsJapgolly.realm.Realm.Sync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.realm.realmStrings.all
  - typingsJapgolly.realm.realmStrings.trace
  - typingsJapgolly.realm.realmStrings.debug
  - typingsJapgolly.realm.realmStrings.detail
  - typingsJapgolly.realm.realmStrings.info
  - typingsJapgolly.realm.realmStrings.warn
  - typingsJapgolly.realm.realmStrings.error
  - typingsJapgolly.realm.realmStrings.fatal
  - typingsJapgolly.realm.realmStrings.off
*/
trait LogLevel extends js.Object

object LogLevel {
  @scala.inline
  def all: typingsJapgolly.realm.realmStrings.all = this.cast("all")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def debug: typingsJapgolly.realm.realmStrings.debug = this.cast("debug")
  @scala.inline
  def detail: typingsJapgolly.realm.realmStrings.detail = this.cast("detail")
  @scala.inline
  def error: typingsJapgolly.realm.realmStrings.error = this.cast("error")
  @scala.inline
  def fatal: typingsJapgolly.realm.realmStrings.fatal = this.cast("fatal")
  @scala.inline
  def info: typingsJapgolly.realm.realmStrings.info = this.cast("info")
  @scala.inline
  def off: typingsJapgolly.realm.realmStrings.off = this.cast("off")
  @scala.inline
  def trace: typingsJapgolly.realm.realmStrings.trace = this.cast("trace")
  @scala.inline
  def warn: typingsJapgolly.realm.realmStrings.warn = this.cast("warn")
}

