package typingsJapgolly.nodeForge.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.nodeForge.anon.AuthenticatedAttributes
import typingsJapgolly.nodeForge.anon.Detached
import typingsJapgolly.nodeForge.anon.RawCapture
import typingsJapgolly.nodeForge.anon.Value
import typingsJapgolly.nodeForge.mod.asn1.Asn1
import typingsJapgolly.nodeForge.mod.pki.Certificate
import typingsJapgolly.nodeForge.mod.pki.PEM
import typingsJapgolly.nodeForge.mod.util.ByteBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pkcs7 {
  
  @JSImport("node-forge", "pkcs7")
  @js.native
  val ^ : js.Any = js.native
  
  inline def createEnvelopedData(): PkcsEnvelopedData = ^.asInstanceOf[js.Dynamic].applyDynamic("createEnvelopedData")().asInstanceOf[PkcsEnvelopedData]
  
  inline def createSignedData(): PkcsSignedData = ^.asInstanceOf[js.Dynamic].applyDynamic("createSignedData")().asInstanceOf[PkcsSignedData]
  
  /**
    * Converts a PKCS#7 message from an ASN.1 object.
    *
    * @param asn the ASN.1 representation of a ContentInfo.
    *
    * @return the PKCS#7 message.
    */
  inline def messageFromAsn1(asn: Asn1): Captured[PkcsEnvelopedData | PkcsSignedData] = ^.asInstanceOf[js.Dynamic].applyDynamic("messageFromAsn1")(asn.asInstanceOf[js.Any]).asInstanceOf[Captured[PkcsEnvelopedData | PkcsSignedData]]
  
  /**
    * Converts a PKCS#7 message from PEM format.
    *
    * @param pem the PEM-formatted PKCS#7 message.
    *
    * @return the PKCS#7 message.
    */
  inline def messageFromPem(pem: PEM): Captured[PkcsEnvelopedData | PkcsSignedData] = ^.asInstanceOf[js.Dynamic].applyDynamic("messageFromPem")(pem.asInstanceOf[js.Any]).asInstanceOf[Captured[PkcsEnvelopedData | PkcsSignedData]]
  
  /**
    * Converts a PKCS#7 message to PEM format.
    *
    * @param msg The PKCS#7 message object
    * @param maxline The maximum characters per line, defaults to 64.
    *
    * @return The PEM-formatted PKCS#7 message.
    */
  inline def messageToPem(msg: PkcsSignedData): String = ^.asInstanceOf[js.Dynamic].applyDynamic("messageToPem")(msg.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def messageToPem(msg: PkcsSignedData, maxline: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("messageToPem")(msg.asInstanceOf[js.Any], maxline.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /** When a PKCS#7 object has been created by reading from a message, the raw captured object is joined */
  type Captured[T] = T & RawCapture
  
  trait PkcsEnvelopedData extends StObject {
    
    def addRecipient(certificate: Certificate): Unit
    
    var content: js.UndefOr[String | ByteBuffer] = js.undefined
    
    def encrypt(): Unit
    
    def toAsn1(): Asn1
  }
  object PkcsEnvelopedData {
    
    inline def apply(addRecipient: Certificate => Callback, encrypt: Callback, toAsn1: CallbackTo[Asn1]): PkcsEnvelopedData = {
      val __obj = js.Dynamic.literal(addRecipient = js.Any.fromFunction1((t0: Certificate) => addRecipient(t0).runNow()), encrypt = encrypt.toJsFn, toAsn1 = toAsn1.toJsFn)
      __obj.asInstanceOf[PkcsEnvelopedData]
    }
    
    extension [Self <: PkcsEnvelopedData](x: Self) {
      
      inline def setAddRecipient(value: Certificate => Callback): Self = StObject.set(x, "addRecipient", js.Any.fromFunction1((t0: Certificate) => value(t0).runNow()))
      
      inline def setContent(value: String | ByteBuffer): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setEncrypt(value: Callback): Self = StObject.set(x, "encrypt", value.toJsFn)
      
      inline def setToAsn1(value: CallbackTo[Asn1]): Self = StObject.set(x, "toAsn1", value.toJsFn)
    }
  }
  
  @js.native
  trait PkcsSignedData extends StObject {
    
    def addCertificate(certificate: String): Unit = js.native
    def addCertificate(certificate: Certificate): Unit = js.native
    
    def addSigner(options: AuthenticatedAttributes): Unit = js.native
    
    var certificates: js.Array[Certificate] = js.native
    
    var content: js.UndefOr[String | ByteBuffer] = js.native
    
    var contentInfo: js.UndefOr[Value] = js.native
    
    def sign(): Unit = js.native
    def sign(options: Detached): Unit = js.native
    
    def toAsn1(): Asn1 = js.native
  }
}
