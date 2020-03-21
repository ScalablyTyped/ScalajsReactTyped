package typingsJapgolly.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.userDefined
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.settingsOnly
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.settingsAndExperimentations
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.notAllowed
*/
trait PrereleaseFeatures extends js.Object

object PrereleaseFeatures {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def notAllowed: typingsJapgolly.microsoftGraph.microsoftGraphStrings.notAllowed = this.cast("notAllowed")
  @scala.inline
  def settingsAndExperimentations: typingsJapgolly.microsoftGraph.microsoftGraphStrings.settingsAndExperimentations = this.cast("settingsAndExperimentations")
  @scala.inline
  def settingsOnly: typingsJapgolly.microsoftGraph.microsoftGraphStrings.settingsOnly = this.cast("settingsOnly")
  @scala.inline
  def userDefined: typingsJapgolly.microsoftGraph.microsoftGraphStrings.userDefined = this.cast("userDefined")
}

