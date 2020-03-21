package typingsJapgolly.winrtUwp.Windows.Security.Credentials

import typingsJapgolly.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the result of a key credential operation. */
@JSGlobal("Windows.Security.Credentials.KeyCredentialOperationResult")
@js.native
abstract class KeyCredentialOperationResult () extends js.Object {
  /** Gets the result of the key credential operation. */
  var result: IBuffer = js.native
  /** Gets the status of the key credential. */
  var status: KeyCredentialStatus = js.native
}

