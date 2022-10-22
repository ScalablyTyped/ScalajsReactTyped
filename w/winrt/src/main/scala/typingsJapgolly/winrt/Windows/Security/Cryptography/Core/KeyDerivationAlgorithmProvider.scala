package typingsJapgolly.winrt.Windows.Security.Cryptography.Core

import typingsJapgolly.winrt.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyDerivationAlgorithmProvider
  extends StObject
     with IKeyDerivationAlgorithmProvider
object KeyDerivationAlgorithmProvider {
  
  inline def apply(algorithmName: String, createKey: IBuffer => CryptographicKey): KeyDerivationAlgorithmProvider = {
    val __obj = js.Dynamic.literal(algorithmName = algorithmName.asInstanceOf[js.Any], createKey = js.Any.fromFunction1(createKey))
    __obj.asInstanceOf[KeyDerivationAlgorithmProvider]
  }
}
