package typingsJapgolly.firebaseRemoteConfigTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.firebaseRemoteConfigTypes.firebaseRemoteConfigTypesStrings.debug
  - typingsJapgolly.firebaseRemoteConfigTypes.firebaseRemoteConfigTypesStrings.error
  - typingsJapgolly.firebaseRemoteConfigTypes.firebaseRemoteConfigTypesStrings.silent
*/
trait LogLevel extends js.Object

object LogLevel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def debug: typingsJapgolly.firebaseRemoteConfigTypes.firebaseRemoteConfigTypesStrings.debug = this.cast("debug")
  @scala.inline
  def error: typingsJapgolly.firebaseRemoteConfigTypes.firebaseRemoteConfigTypesStrings.error = this.cast("error")
  @scala.inline
  def silent: typingsJapgolly.firebaseRemoteConfigTypes.firebaseRemoteConfigTypesStrings.silent = this.cast("silent")
}

