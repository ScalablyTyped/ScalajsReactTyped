package typingsJapgolly.ionic.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.ionic.ionicStrings.ios
  - typingsJapgolly.ionic.ionicStrings.android
  - typingsJapgolly.ionic.ionicStrings.wp8
  - typingsJapgolly.ionic.ionicStrings.windows
  - typingsJapgolly.ionic.ionicStrings.browser
*/
trait KnownPlatform extends js.Object

object KnownPlatform {
  @scala.inline
  def android: typingsJapgolly.ionic.ionicStrings.android = this.cast("android")
  @scala.inline
  def browser: typingsJapgolly.ionic.ionicStrings.browser = this.cast("browser")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def ios: typingsJapgolly.ionic.ionicStrings.ios = this.cast("ios")
  @scala.inline
  def windows: typingsJapgolly.ionic.ionicStrings.windows = this.cast("windows")
  @scala.inline
  def wp8: typingsJapgolly.ionic.ionicStrings.wp8 = this.cast("wp8")
}

