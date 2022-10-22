package typingsJapgolly.xmldsigjs

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Instantiable0
import org.scalajs.dom.Algorithm
import org.scalajs.dom.CryptoKey
import org.scalajs.dom.Node
import typingsJapgolly.std.BufferSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesAlgorithmMod {
  
  /* note: abstract class */ /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.xmldsigjs.buildTypesAlgorithmMod.IAlgorithm because Already inherited
  - typingsJapgolly.xmldsigjs.buildTypesAlgorithmMod.IHashAlgorithm because var conflicts: algorithm, namespaceURI. Inlined Digest, Digest, Digest */ @JSImport("xmldsigjs/build/types/algorithm", "HashAlgorithm")
  @js.native
  open class HashAlgorithm () extends XmlAlgorithm {
    
    def Digest(xml: String): js.Promise[js.typedarray.Uint8Array] = js.native
    def Digest(xml: Node): js.Promise[js.typedarray.Uint8Array] = js.native
    def Digest(xml: BufferSource): js.Promise[js.typedarray.Uint8Array] = js.native
  }
  
  /* note: abstract class */ /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.xmldsigjs.buildTypesAlgorithmMod.IAlgorithm because Already inherited
  - typingsJapgolly.xmldsigjs.buildTypesAlgorithmMod.ISignatureAlgorithm because var conflicts: algorithm, namespaceURI. Inlined Sign, Verify, Verify */ @JSImport("xmldsigjs/build/types/algorithm", "SignatureAlgorithm")
  @js.native
  open class SignatureAlgorithm () extends XmlAlgorithm {
    
    /**
      * Sign the given string using the given key
      */
    def Sign(signedInfo: String, signingKey: CryptoKey, algorithm: Algorithm): js.Promise[js.typedarray.ArrayBuffer] = js.native
    
    /**
      * Verify the given signature of the given string using key
      */
    def Verify(signedInfo: String, key: CryptoKey, signatureValue: js.typedarray.Uint8Array): js.Promise[Boolean] = js.native
    def Verify(signedInfo: String, key: CryptoKey, signatureValue: js.typedarray.Uint8Array, algorithm: Algorithm): js.Promise[Boolean] = js.native
  }
  
  /* note: abstract class */ @JSImport("xmldsigjs/build/types/algorithm", "XmlAlgorithm")
  @js.native
  open class XmlAlgorithm ()
    extends StObject
       with IAlgorithm {
    
    /* CompleteClass */
    var algorithm: Algorithm = js.native
    
    /* CompleteClass */
    override def getAlgorithmName(): String = js.native
    
    /* CompleteClass */
    var namespaceURI: String = js.native
  }
  
  type BASE64 = String
  
  trait IAlgorithm extends StObject {
    
    var algorithm: Algorithm
    
    def getAlgorithmName(): String
    
    var namespaceURI: String
  }
  object IAlgorithm {
    
    inline def apply(algorithm: Algorithm, getAlgorithmName: CallbackTo[String], namespaceURI: String): IAlgorithm = {
      val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], getAlgorithmName = getAlgorithmName.toJsFn, namespaceURI = namespaceURI.asInstanceOf[js.Any])
      __obj.asInstanceOf[IAlgorithm]
    }
    
    extension [Self <: IAlgorithm](x: Self) {
      
      inline def setAlgorithm(value: Algorithm): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      inline def setGetAlgorithmName(value: CallbackTo[String]): Self = StObject.set(x, "getAlgorithmName", value.toJsFn)
      
      inline def setNamespaceURI(value: String): Self = StObject.set(x, "namespaceURI", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IHashAlgorithm
    extends StObject
       with IAlgorithm {
    
    def Digest(xml: String): js.Promise[js.typedarray.Uint8Array] = js.native
    def Digest(xml: Node): js.Promise[js.typedarray.Uint8Array] = js.native
    def Digest(xml: BufferSource): js.Promise[js.typedarray.Uint8Array] = js.native
  }
  
  type IHashAlgorithmConstructable = Instantiable0[IHashAlgorithm]
  
  @js.native
  trait ISignatureAlgorithm
    extends StObject
       with IAlgorithm {
    
    def Sign(signedInfo: String, signingKey: CryptoKey, algorithm: Algorithm): js.Promise[js.typedarray.ArrayBuffer] = js.native
    
    def Verify(signedInfo: String, key: CryptoKey, signatureValue: js.typedarray.Uint8Array): js.Promise[Boolean] = js.native
    def Verify(signedInfo: String, key: CryptoKey, signatureValue: js.typedarray.Uint8Array, algorithm: Algorithm): js.Promise[Boolean] = js.native
  }
  
  type ISignatureAlgorithmConstructable = Instantiable0[ISignatureAlgorithm]
}
