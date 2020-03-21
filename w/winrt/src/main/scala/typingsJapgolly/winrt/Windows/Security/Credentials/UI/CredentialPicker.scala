package typingsJapgolly.winrt.Windows.Security.Credentials.UI

import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Security.Credentials.UI.CredentialPicker")
@js.native
class CredentialPicker () extends js.Object

/* static members */
@JSGlobal("Windows.Security.Credentials.UI.CredentialPicker")
@js.native
object CredentialPicker extends js.Object {
  def pickAsync(options: CredentialPickerOptions): IAsyncOperation[CredentialPickerResults] = js.native
  def pickAsync(targetName: String, message: String): IAsyncOperation[CredentialPickerResults] = js.native
  def pickAsync(targetName: String, message: String, caption: String): IAsyncOperation[CredentialPickerResults] = js.native
}

