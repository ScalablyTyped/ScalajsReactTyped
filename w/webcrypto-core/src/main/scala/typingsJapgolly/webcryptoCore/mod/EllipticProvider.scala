package typingsJapgolly.webcryptoCore.mod

import org.scalajs.dom.CryptoKeyPair
import org.scalajs.dom.EcKeyGenParams
import org.scalajs.dom.EcKeyImportParams
import org.scalajs.dom.JsonWebKey
import org.scalajs.dom.KeyFormat
import org.scalajs.dom.KeyUsage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("webcrypto-core", "EllipticProvider")
@js.native
open class EllipticProvider () extends ProviderCrypto {
  
  def checkGenerateKeyParams(algorithm: EcKeyGenParams): Unit = js.native
  
  def checkNamedCurve(namedCurve: String): Unit = js.native
  
  var namedCurves: js.Array[String] = js.native
  
  def onExportKey(format: KeyFormat, key: CryptoKey1, args: Any*): js.Promise[JsonWebKey | js.typedarray.ArrayBuffer] = js.native
  
  def onGenerateKey(algorithm: EcKeyGenParams, extractable: Boolean, keyUsages: js.Array[KeyUsage], args: Any*): js.Promise[CryptoKeyPair] = js.native
  
  def onImportKey(
    format: KeyFormat,
    keyData: js.typedarray.ArrayBuffer,
    algorithm: EcKeyImportParams,
    extractable: Boolean,
    keyUsages: js.Array[KeyUsage],
    args: Any*
  ): js.Promise[CryptoKey1] = js.native
  def onImportKey(
    format: KeyFormat,
    keyData: JsonWebKey,
    algorithm: EcKeyImportParams,
    extractable: Boolean,
    keyUsages: js.Array[KeyUsage],
    args: Any*
  ): js.Promise[CryptoKey1] = js.native
}
