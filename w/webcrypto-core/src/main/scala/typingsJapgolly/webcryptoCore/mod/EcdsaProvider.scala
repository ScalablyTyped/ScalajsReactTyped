package typingsJapgolly.webcryptoCore.mod

import org.scalajs.dom.EcdsaParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("webcrypto-core", "EcdsaProvider")
@js.native
open class EcdsaProvider () extends EllipticProvider {
  
  def checkAlgorithmParams(algorithm: EcdsaParams): Unit = js.native
  
  val hashAlgorithms: js.Array[String] = js.native
  
  def onSign(
    algorithm: EcdsaParams,
    key: org.scalajs.dom.CryptoKey,
    data: js.typedarray.ArrayBuffer,
    args: Any*
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  
  def onVerify(
    algorithm: EcdsaParams,
    key: org.scalajs.dom.CryptoKey,
    signature: js.typedarray.ArrayBuffer,
    data: js.typedarray.ArrayBuffer,
    args: Any*
  ): js.Promise[Boolean] = js.native
}
