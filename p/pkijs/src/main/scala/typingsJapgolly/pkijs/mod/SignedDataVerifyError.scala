package typingsJapgolly.pkijs.mod

import typingsJapgolly.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.pkijs.mod.SignedDataVerifyResult because var conflicts: message. Inlined date, code, timestampSerial, signatureVerified, signerCertificate, signerCertificateVerified, certificatePath */ @JSImport("pkijs", "SignedDataVerifyError")
@js.native
open class SignedDataVerifyError protected ()
  extends StObject
     with Error {
  def this(hasMessageCodeDateSignatureVerifiedSignerCertificateSignerCertificateVerifiedTimestampSerialCertificatePath: SignedDataVerifyErrorParams) = this()
  
  var certificatePath: js.Array[Certificate] = js.native
  
  var code: js.UndefOr[Double] = js.native
  
  var date: js.UndefOr[js.Date] = js.native
  
  /* standard es5 */
  /* CompleteClass */
  var message: String = js.native
  
  /* standard es5 */
  /* CompleteClass */
  var name: String = js.native
  
  var signatureVerified: js.UndefOr[Boolean | Null] = js.native
  
  var signerCertificate: js.UndefOr[Certificate | Null] = js.native
  
  var signerCertificateVerified: js.UndefOr[Boolean | Null] = js.native
  
  var timestampSerial: js.UndefOr[js.typedarray.ArrayBuffer | Null] = js.native
}
