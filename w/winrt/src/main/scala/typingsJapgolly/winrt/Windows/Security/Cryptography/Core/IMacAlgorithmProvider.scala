package typingsJapgolly.winrt.Windows.Security.Cryptography.Core

import typingsJapgolly.winrt.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMacAlgorithmProvider extends StObject {
  
  var algorithmName: String
  
  def createKey(keyMaterial: IBuffer): CryptographicKey
  
  var macLength: Double
}
object IMacAlgorithmProvider {
  
  inline def apply(algorithmName: String, createKey: IBuffer => CryptographicKey, macLength: Double): IMacAlgorithmProvider = {
    val __obj = js.Dynamic.literal(algorithmName = algorithmName.asInstanceOf[js.Any], createKey = js.Any.fromFunction1(createKey), macLength = macLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMacAlgorithmProvider]
  }
  
  extension [Self <: IMacAlgorithmProvider](x: Self) {
    
    inline def setAlgorithmName(value: String): Self = StObject.set(x, "algorithmName", value.asInstanceOf[js.Any])
    
    inline def setCreateKey(value: IBuffer => CryptographicKey): Self = StObject.set(x, "createKey", js.Any.fromFunction1(value))
    
    inline def setMacLength(value: Double): Self = StObject.set(x, "macLength", value.asInstanceOf[js.Any])
  }
}
