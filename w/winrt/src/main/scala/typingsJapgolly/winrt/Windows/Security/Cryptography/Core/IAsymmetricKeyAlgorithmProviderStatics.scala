package typingsJapgolly.winrt.Windows.Security.Cryptography.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAsymmetricKeyAlgorithmProviderStatics extends StObject {
  
  def openAlgorithm(algorithm: String): AsymmetricKeyAlgorithmProvider
}
object IAsymmetricKeyAlgorithmProviderStatics {
  
  inline def apply(openAlgorithm: String => AsymmetricKeyAlgorithmProvider): IAsymmetricKeyAlgorithmProviderStatics = {
    val __obj = js.Dynamic.literal(openAlgorithm = js.Any.fromFunction1(openAlgorithm))
    __obj.asInstanceOf[IAsymmetricKeyAlgorithmProviderStatics]
  }
  
  extension [Self <: IAsymmetricKeyAlgorithmProviderStatics](x: Self) {
    
    inline def setOpenAlgorithm(value: String => AsymmetricKeyAlgorithmProvider): Self = StObject.set(x, "openAlgorithm", js.Any.fromFunction1(value))
  }
}
