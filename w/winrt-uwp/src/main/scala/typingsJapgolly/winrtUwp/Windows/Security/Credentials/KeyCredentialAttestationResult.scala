package typingsJapgolly.winrtUwp.Windows.Security.Credentials

import typingsJapgolly.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the results of the KeyCredential.GetAttestationAsync method. */
@JSGlobal("Windows.Security.Credentials.KeyCredentialAttestationResult")
@js.native
abstract class KeyCredentialAttestationResult () extends js.Object {
  /** Gets the attestation information for the KeyCredential. */
  var attestationBuffer: IBuffer = js.native
  /** Gets the chain of certificates used to verify the attestation. */
  var certificateChainBuffer: IBuffer = js.native
  /** Gets the status of the key credential attestation. */
  var status: KeyCredentialAttestationStatus = js.native
}

