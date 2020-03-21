package typingsJapgolly.firebaseRemoteConfigTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.firebaseRemoteConfigTypes.firebaseRemoteConfigTypesStrings.static
  - typingsJapgolly.firebaseRemoteConfigTypes.firebaseRemoteConfigTypesStrings.default
  - typingsJapgolly.firebaseRemoteConfigTypes.firebaseRemoteConfigTypesStrings.remote
*/
trait ValueSource extends js.Object

object ValueSource {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def default: typingsJapgolly.firebaseRemoteConfigTypes.firebaseRemoteConfigTypesStrings.default = this.cast("default")
  @scala.inline
  def remote: typingsJapgolly.firebaseRemoteConfigTypes.firebaseRemoteConfigTypesStrings.remote = this.cast("remote")
  @scala.inline
  def static: typingsJapgolly.firebaseRemoteConfigTypes.firebaseRemoteConfigTypesStrings.static = this.cast("static")
}

