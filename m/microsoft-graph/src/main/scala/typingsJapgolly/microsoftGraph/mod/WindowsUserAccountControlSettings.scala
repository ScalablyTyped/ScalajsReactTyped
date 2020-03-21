package typingsJapgolly.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.userDefined
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.alwaysNotify
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.notifyOnAppChanges
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.notifyOnAppChangesWithoutDimming
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.neverNotify
*/
trait WindowsUserAccountControlSettings extends js.Object

object WindowsUserAccountControlSettings {
  @scala.inline
  def alwaysNotify: typingsJapgolly.microsoftGraph.microsoftGraphStrings.alwaysNotify = this.cast("alwaysNotify")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def neverNotify: typingsJapgolly.microsoftGraph.microsoftGraphStrings.neverNotify = this.cast("neverNotify")
  @scala.inline
  def notifyOnAppChanges: typingsJapgolly.microsoftGraph.microsoftGraphStrings.notifyOnAppChanges = this.cast("notifyOnAppChanges")
  @scala.inline
  def notifyOnAppChangesWithoutDimming: typingsJapgolly.microsoftGraph.microsoftGraphStrings.notifyOnAppChangesWithoutDimming = this.cast("notifyOnAppChangesWithoutDimming")
  @scala.inline
  def userDefined: typingsJapgolly.microsoftGraph.microsoftGraphStrings.userDefined = this.cast("userDefined")
}

