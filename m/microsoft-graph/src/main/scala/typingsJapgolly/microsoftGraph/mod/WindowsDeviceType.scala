package typingsJapgolly.microsoftGraph.mod

import typingsJapgolly.microsoftGraph.microsoftGraphStrings.none_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.none_
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.desktop
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.mobile
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.holographic
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.team
*/
trait WindowsDeviceType extends js.Object

object WindowsDeviceType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def desktop: typingsJapgolly.microsoftGraph.microsoftGraphStrings.desktop = this.cast("desktop")
  @scala.inline
  def holographic: typingsJapgolly.microsoftGraph.microsoftGraphStrings.holographic = this.cast("holographic")
  @scala.inline
  def mobile: typingsJapgolly.microsoftGraph.microsoftGraphStrings.mobile = this.cast("mobile")
  @scala.inline
  def none: none_ = this.cast("none")
  @scala.inline
  def team: typingsJapgolly.microsoftGraph.microsoftGraphStrings.team = this.cast("team")
}

