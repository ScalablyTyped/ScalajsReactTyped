package typingsJapgolly.awsSdk.clientsAppmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualGatewayListenerTlsFileCertificate extends StObject {
  
  /**
    * The certificate chain for the certificate.
    */
  var certificateChain: FilePath
  
  /**
    * The private key for a certificate stored on the file system of the mesh endpoint that the proxy is running on.
    */
  var privateKey: FilePath
}
object VirtualGatewayListenerTlsFileCertificate {
  
  inline def apply(certificateChain: FilePath, privateKey: FilePath): VirtualGatewayListenerTlsFileCertificate = {
    val __obj = js.Dynamic.literal(certificateChain = certificateChain.asInstanceOf[js.Any], privateKey = privateKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualGatewayListenerTlsFileCertificate]
  }
  
  extension [Self <: VirtualGatewayListenerTlsFileCertificate](x: Self) {
    
    inline def setCertificateChain(value: FilePath): Self = StObject.set(x, "certificateChain", value.asInstanceOf[js.Any])
    
    inline def setPrivateKey(value: FilePath): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
  }
}
