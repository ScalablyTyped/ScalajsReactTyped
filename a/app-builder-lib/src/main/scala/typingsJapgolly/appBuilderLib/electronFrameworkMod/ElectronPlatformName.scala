package typingsJapgolly.appBuilderLib.electronFrameworkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.appBuilderLib.appBuilderLibStrings.darwin
  - typingsJapgolly.appBuilderLib.appBuilderLibStrings.linux
  - typingsJapgolly.appBuilderLib.appBuilderLibStrings.win32
  - typingsJapgolly.appBuilderLib.appBuilderLibStrings.mas
*/
trait ElectronPlatformName extends js.Object

object ElectronPlatformName {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def darwin: typingsJapgolly.appBuilderLib.appBuilderLibStrings.darwin = this.cast("darwin")
  @scala.inline
  def linux: typingsJapgolly.appBuilderLib.appBuilderLibStrings.linux = this.cast("linux")
  @scala.inline
  def mas: typingsJapgolly.appBuilderLib.appBuilderLibStrings.mas = this.cast("mas")
  @scala.inline
  def win32: typingsJapgolly.appBuilderLib.appBuilderLibStrings.win32 = this.cast("win32")
}

