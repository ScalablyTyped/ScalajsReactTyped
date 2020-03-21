package typingsJapgolly.dva.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.dva.dvaStrings.takeEvery
  - typingsJapgolly.dva.dvaStrings.takeLatest
  - typingsJapgolly.dva.dvaStrings.watcher
  - typingsJapgolly.dva.dvaStrings.throttle
*/
trait EffectType extends js.Object

object EffectType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def takeEvery: typingsJapgolly.dva.dvaStrings.takeEvery = this.cast("takeEvery")
  @scala.inline
  def takeLatest: typingsJapgolly.dva.dvaStrings.takeLatest = this.cast("takeLatest")
  @scala.inline
  def throttle: typingsJapgolly.dva.dvaStrings.throttle = this.cast("throttle")
  @scala.inline
  def watcher: typingsJapgolly.dva.dvaStrings.watcher = this.cast("watcher")
}

