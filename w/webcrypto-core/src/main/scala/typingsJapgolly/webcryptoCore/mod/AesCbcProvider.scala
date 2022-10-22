package typingsJapgolly.webcryptoCore.mod

import org.scalajs.dom.AesCbcParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("webcrypto-core", "AesCbcProvider")
@js.native
open class AesCbcProvider () extends AesProvider {
  
  def checkAlgorithmParams(algorithm: AesCbcParams): Unit = js.native
  
  def onDecrypt(
    algorithm: AesCbcParams,
    key: org.scalajs.dom.CryptoKey,
    data: js.typedarray.ArrayBuffer,
    args: Any*
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  
  def onEncrypt(
    algorithm: AesCbcParams,
    key: org.scalajs.dom.CryptoKey,
    data: js.typedarray.ArrayBuffer,
    args: Any*
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  
  @JSName("usages")
  var usages_AesCbcProvider: KeyUsages = js.native
}
