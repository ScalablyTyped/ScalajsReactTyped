package typingsJapgolly.webcryptoCore.mod

import org.scalajs.dom.RsaPssParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("webcrypto-core", "RsaPssProvider")
@js.native
open class RsaPssProvider () extends RsaProvider {
  
  def checkAlgorithmParams(algorithm: RsaPssParams): Unit = js.native
  
  def onSign(
    algorithm: RsaPssParams,
    key: org.scalajs.dom.CryptoKey,
    data: js.typedarray.ArrayBuffer,
    args: Any*
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  
  def onVerify(
    algorithm: RsaPssParams,
    key: org.scalajs.dom.CryptoKey,
    signature: js.typedarray.ArrayBuffer,
    data: js.typedarray.ArrayBuffer,
    args: Any*
  ): js.Promise[Boolean] = js.native
}
