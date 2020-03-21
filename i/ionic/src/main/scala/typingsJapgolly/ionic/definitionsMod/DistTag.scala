package typingsJapgolly.ionic.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.ionic.ionicStrings.testing
  - typingsJapgolly.ionic.ionicStrings.canary
  - typingsJapgolly.ionic.ionicStrings.latest
*/
trait DistTag extends js.Object

object DistTag {
  @scala.inline
  def canary: typingsJapgolly.ionic.ionicStrings.canary = this.cast("canary")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def latest: typingsJapgolly.ionic.ionicStrings.latest = this.cast("latest")
  @scala.inline
  def testing: typingsJapgolly.ionic.ionicStrings.testing = this.cast("testing")
}

