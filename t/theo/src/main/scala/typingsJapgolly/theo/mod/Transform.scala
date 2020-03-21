package typingsJapgolly.theo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.theo.theoStrings.raw
  - typingsJapgolly.theo.theoStrings.ios
  - typingsJapgolly.theo.theoStrings.android
  - typingsJapgolly.theo.theoStrings.web
*/
trait Transform extends js.Object

object Transform {
  @scala.inline
  def android: typingsJapgolly.theo.theoStrings.android = this.cast("android")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def ios: typingsJapgolly.theo.theoStrings.ios = this.cast("ios")
  @scala.inline
  def raw: typingsJapgolly.theo.theoStrings.raw = this.cast("raw")
  @scala.inline
  def web: typingsJapgolly.theo.theoStrings.web = this.cast("web")
}

