package typingsJapgolly.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.userDefined
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.fullScreen
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.nonFullScreen
*/
trait WindowsStartMenuModeType extends js.Object

object WindowsStartMenuModeType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def fullScreen: typingsJapgolly.microsoftGraph.microsoftGraphStrings.fullScreen = this.cast("fullScreen")
  @scala.inline
  def nonFullScreen: typingsJapgolly.microsoftGraph.microsoftGraphStrings.nonFullScreen = this.cast("nonFullScreen")
  @scala.inline
  def userDefined: typingsJapgolly.microsoftGraph.microsoftGraphStrings.userDefined = this.cast("userDefined")
}

