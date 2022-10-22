package typingsJapgolly.winrtUwp.Windows.Web.Http

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrtUwp.Windows.Networking.Sockets.SocketSslErrorSeverity
import typingsJapgolly.winrtUwp.Windows.Security.Cryptography.Certificates.Certificate
import typingsJapgolly.winrtUwp.Windows.Security.Cryptography.Certificates.ChainValidationResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information about the underlying transport used by the HTTP connection. */
trait HttpTransportInformation extends StObject {
  
  /** Gets the certificate from the server with the SSL information. */
  var serverCertificate: Certificate
  
  /** Gets the category of an error on an SSL connection. */
  var serverCertificateErrorSeverity: SocketSslErrorSeverity
  
  /** Gets the list of errors that occurred making an SSL connection. */
  var serverCertificateErrors: IVectorView[ChainValidationResult]
  
  /** Gets the intermediate certificates sent by the server during SSL negotiation on this HttpTransportInformation object. */
  var serverIntermediateCertificates: IVectorView[Certificate]
}
object HttpTransportInformation {
  
  inline def apply(
    serverCertificate: Certificate,
    serverCertificateErrorSeverity: SocketSslErrorSeverity,
    serverCertificateErrors: IVectorView[ChainValidationResult],
    serverIntermediateCertificates: IVectorView[Certificate]
  ): HttpTransportInformation = {
    val __obj = js.Dynamic.literal(serverCertificate = serverCertificate.asInstanceOf[js.Any], serverCertificateErrorSeverity = serverCertificateErrorSeverity.asInstanceOf[js.Any], serverCertificateErrors = serverCertificateErrors.asInstanceOf[js.Any], serverIntermediateCertificates = serverIntermediateCertificates.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpTransportInformation]
  }
  
  extension [Self <: HttpTransportInformation](x: Self) {
    
    inline def setServerCertificate(value: Certificate): Self = StObject.set(x, "serverCertificate", value.asInstanceOf[js.Any])
    
    inline def setServerCertificateErrorSeverity(value: SocketSslErrorSeverity): Self = StObject.set(x, "serverCertificateErrorSeverity", value.asInstanceOf[js.Any])
    
    inline def setServerCertificateErrors(value: IVectorView[ChainValidationResult]): Self = StObject.set(x, "serverCertificateErrors", value.asInstanceOf[js.Any])
    
    inline def setServerIntermediateCertificates(value: IVectorView[Certificate]): Self = StObject.set(x, "serverIntermediateCertificates", value.asInstanceOf[js.Any])
  }
}
