package typingsJapgolly.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.userDefined
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.alwaysPrompt
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.promptBeforeSendingPersonalData
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.neverSendData
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.sendAllDataWithoutPrompting
*/
trait DefenderPromptForSampleSubmission extends js.Object

object DefenderPromptForSampleSubmission {
  @scala.inline
  def alwaysPrompt: typingsJapgolly.microsoftGraph.microsoftGraphStrings.alwaysPrompt = this.cast("alwaysPrompt")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def neverSendData: typingsJapgolly.microsoftGraph.microsoftGraphStrings.neverSendData = this.cast("neverSendData")
  @scala.inline
  def promptBeforeSendingPersonalData: typingsJapgolly.microsoftGraph.microsoftGraphStrings.promptBeforeSendingPersonalData = this.cast("promptBeforeSendingPersonalData")
  @scala.inline
  def sendAllDataWithoutPrompting: typingsJapgolly.microsoftGraph.microsoftGraphStrings.sendAllDataWithoutPrompting = this.cast("sendAllDataWithoutPrompting")
  @scala.inline
  def userDefined: typingsJapgolly.microsoftGraph.microsoftGraphStrings.userDefined = this.cast("userDefined")
}

