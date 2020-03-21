package typingsJapgolly.alexaSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.alexaSdk.alexaSdkStrings.Standard
  - typingsJapgolly.alexaSdk.alexaSdkStrings.Simple
  - typingsJapgolly.alexaSdk.alexaSdkStrings.LinkAccount
  - typingsJapgolly.alexaSdk.alexaSdkStrings.AskForPermissionsConsent
*/
trait CardType extends js.Object

object CardType {
  @scala.inline
  def AskForPermissionsConsent: typingsJapgolly.alexaSdk.alexaSdkStrings.AskForPermissionsConsent = this.cast("AskForPermissionsConsent")
  @scala.inline
  def LinkAccount: typingsJapgolly.alexaSdk.alexaSdkStrings.LinkAccount = this.cast("LinkAccount")
  @scala.inline
  def Simple: typingsJapgolly.alexaSdk.alexaSdkStrings.Simple = this.cast("Simple")
  @scala.inline
  def Standard: typingsJapgolly.alexaSdk.alexaSdkStrings.Standard = this.cast("Standard")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

