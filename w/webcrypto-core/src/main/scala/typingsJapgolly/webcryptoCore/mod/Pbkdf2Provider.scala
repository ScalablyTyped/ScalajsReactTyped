package typingsJapgolly.webcryptoCore.mod

import org.scalajs.dom.Pbkdf2Params
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("webcrypto-core", "Pbkdf2Provider")
@js.native
open class Pbkdf2Provider () extends ProviderCrypto {
  
  def checkAlgorithmParams(algorithm: Pbkdf2Params): Unit = js.native
  
  var hashAlgorithms: js.Array[String] = js.native
  
  def onDeriveBits(algorithm: Pbkdf2Params, baseKey: CryptoKey1, length: Double, args: Any*): js.Promise[js.typedarray.ArrayBuffer] = js.native
  
  @JSName("usages")
  var usages_Pbkdf2Provider: KeyUsages = js.native
}
