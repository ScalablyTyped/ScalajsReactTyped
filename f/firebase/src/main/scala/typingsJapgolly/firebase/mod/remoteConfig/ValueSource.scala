package typingsJapgolly.firebase.mod.remoteConfig

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.firebase.firebaseStrings.static
  - typingsJapgolly.firebase.firebaseStrings.default
  - typingsJapgolly.firebase.firebaseStrings.remote
*/
trait ValueSource extends js.Object

object ValueSource {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def default: typingsJapgolly.firebase.firebaseStrings.default = this.cast("default")
  @scala.inline
  def remote: typingsJapgolly.firebase.firebaseStrings.remote = this.cast("remote")
  @scala.inline
  def static: typingsJapgolly.firebase.firebaseStrings.static = this.cast("static")
}

