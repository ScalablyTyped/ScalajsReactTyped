package typingsJapgolly.xmldsigjs.mod

import org.scalajs.dom.Algorithm
import typingsJapgolly.std.AlgorithmIdentifier
import typingsJapgolly.xmldsigjs.buildTypesAlgorithmMod.HashAlgorithm
import typingsJapgolly.xmldsigjs.buildTypesAlgorithmMod.IHashAlgorithm
import typingsJapgolly.xmldsigjs.buildTypesAlgorithmMod.ISignatureAlgorithm
import typingsJapgolly.xmldsigjs.buildTypesAlgorithmMod.SignatureAlgorithm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xmldsigjs", "CryptoConfig")
@js.native
open class CryptoConfig ()
  extends typingsJapgolly.xmldsigjs.buildTypesCryptoConfigMod.CryptoConfig
/* static members */
object CryptoConfig {
  
  @JSImport("xmldsigjs", "CryptoConfig")
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
  inline def CreateFromName(): typingsJapgolly.xmldsigjs.buildTypesXmlMod.Transform = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateFromName")().asInstanceOf[typingsJapgolly.xmldsigjs.buildTypesXmlMod.Transform]
  inline def CreateFromName(name: String): typingsJapgolly.xmldsigjs.buildTypesXmlMod.Transform = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateFromName")(name.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.xmldsigjs.buildTypesXmlMod.Transform]
  
  inline def CreateHashAlgorithm(namespace: String): HashAlgorithm = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateHashAlgorithm")(namespace.asInstanceOf[js.Any]).asInstanceOf[HashAlgorithm]
  
  inline def CreateSignatureAlgorithm(method: typingsJapgolly.xmldsigjs.buildTypesXmlSignatureMethodMod.SignatureMethod): SignatureAlgorithm = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateSignatureAlgorithm")(method.asInstanceOf[js.Any]).asInstanceOf[SignatureAlgorithm]
  
  inline def GetHashAlgorithm(algorithm: AlgorithmIdentifier): IHashAlgorithm = ^.asInstanceOf[js.Dynamic].applyDynamic("GetHashAlgorithm")(algorithm.asInstanceOf[js.Any]).asInstanceOf[IHashAlgorithm]
  
  inline def GetSignatureAlgorithm(algorithm: Algorithm): ISignatureAlgorithm = ^.asInstanceOf[js.Dynamic].applyDynamic("GetSignatureAlgorithm")(algorithm.asInstanceOf[js.Any]).asInstanceOf[ISignatureAlgorithm]
}
