package typingsJapgolly.xmldsigjs

import org.scalajs.dom.Algorithm
import typingsJapgolly.std.AlgorithmIdentifier
import typingsJapgolly.xmldsigjs.buildTypesAlgorithmMod.HashAlgorithm
import typingsJapgolly.xmldsigjs.buildTypesAlgorithmMod.IHashAlgorithm
import typingsJapgolly.xmldsigjs.buildTypesAlgorithmMod.ISignatureAlgorithm
import typingsJapgolly.xmldsigjs.buildTypesAlgorithmMod.SignatureAlgorithm
import typingsJapgolly.xmldsigjs.buildTypesXmlMod.Transform
import typingsJapgolly.xmldsigjs.buildTypesXmlSignatureMethodMod.SignatureMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesCryptoConfigMod {
  
  @JSImport("xmldsigjs/build/types/crypto_config", "CryptoConfig")
  @js.native
  open class CryptoConfig () extends StObject
  /* static members */
  object CryptoConfig {
    
    @JSImport("xmldsigjs/build/types/crypto_config", "CryptoConfig")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates Transform from given name
      * if name is not exist then throws error
      *
      * @static
      * @param {(string |)} [name=null]
      * @returns
      *
      * @memberOf CryptoConfig
      */
    inline def CreateFromName(): Transform = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateFromName")().asInstanceOf[Transform]
    inline def CreateFromName(name: String): Transform = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateFromName")(name.asInstanceOf[js.Any]).asInstanceOf[Transform]
    
    inline def CreateHashAlgorithm(namespace: String): HashAlgorithm = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateHashAlgorithm")(namespace.asInstanceOf[js.Any]).asInstanceOf[HashAlgorithm]
    
    inline def CreateSignatureAlgorithm(method: SignatureMethod): SignatureAlgorithm = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateSignatureAlgorithm")(method.asInstanceOf[js.Any]).asInstanceOf[SignatureAlgorithm]
    
    inline def GetHashAlgorithm(algorithm: AlgorithmIdentifier): IHashAlgorithm = ^.asInstanceOf[js.Dynamic].applyDynamic("GetHashAlgorithm")(algorithm.asInstanceOf[js.Any]).asInstanceOf[IHashAlgorithm]
    
    inline def GetSignatureAlgorithm(algorithm: Algorithm): ISignatureAlgorithm = ^.asInstanceOf[js.Dynamic].applyDynamic("GetSignatureAlgorithm")(algorithm.asInstanceOf[js.Any]).asInstanceOf[ISignatureAlgorithm]
  }
}
