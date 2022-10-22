package typingsJapgolly.webcryptoCore.mod

import org.scalajs.dom.RsaOaepParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("webcrypto-core", "RsaOaepProvider")
@js.native
open class RsaOaepProvider () extends RsaProvider {
  
  def checkAlgorithmParams(algorithm: RsaOaepParams): Unit = js.native
  
  def onDecrypt(
    algorithm: RsaOaepParams,
    key: org.scalajs.dom.CryptoKey,
    data: js.typedarray.ArrayBuffer,
    args: Any*
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  
  def onEncrypt(
    algorithm: RsaOaepParams,
    key: org.scalajs.dom.CryptoKey,
    data: js.typedarray.ArrayBuffer,
    args: Any*
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
}
