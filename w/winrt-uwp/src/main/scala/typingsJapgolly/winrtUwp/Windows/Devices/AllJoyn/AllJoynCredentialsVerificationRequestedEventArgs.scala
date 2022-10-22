package typingsJapgolly.winrtUwp.Windows.Devices.AllJoyn

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrtUwp.Windows.Foundation.Deferral
import typingsJapgolly.winrtUwp.Windows.Networking.Sockets.SocketSslErrorSeverity
import typingsJapgolly.winrtUwp.Windows.Security.Cryptography.Certificates.Certificate
import typingsJapgolly.winrtUwp.Windows.Security.Cryptography.Certificates.ChainValidationResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Used to allow the application to indicate whether the credentials provided by a peer are valid. */
trait AllJoynCredentialsVerificationRequestedEventArgs extends StObject {
  
  /** Calling this method indicates that the credentials provided for authentication are valid. */
  def accept(): Unit
  
  /** The mechanism used to authenticate credentials. */
  var authenticationMechanism: AllJoynAuthenticationMechanism
  
  /**
    * Conducts verification of provided of credentials asynchronously.
    * @return The verification deferral.
    */
  def getDeferral(): Deferral
  
  /** The cryptography certificate provided for authentication. */
  var peerCertificate: Certificate
  
  /** The category of an errors encountered authenticating the cryptography certificate. */
  var peerCertificateErrorSeverity: SocketSslErrorSeverity
  
  /** A list of errors that occurred during authentication of the provided cryptography certificate. */
  var peerCertificateErrors: IVectorView[ChainValidationResult]
  
  /** Retrieves the intermediate certificates sent during authentication. */
  var peerIntermediateCertificates: IVectorView[Certificate]
  
  /** The unique bus name of the remote app being authenticated. */
  var peerUniqueName: String
}
object AllJoynCredentialsVerificationRequestedEventArgs {
  
  inline def apply(
    accept: Callback,
    authenticationMechanism: AllJoynAuthenticationMechanism,
    getDeferral: CallbackTo[Deferral],
    peerCertificate: Certificate,
    peerCertificateErrorSeverity: SocketSslErrorSeverity,
    peerCertificateErrors: IVectorView[ChainValidationResult],
    peerIntermediateCertificates: IVectorView[Certificate],
    peerUniqueName: String
  ): AllJoynCredentialsVerificationRequestedEventArgs = {
    val __obj = js.Dynamic.literal(accept = accept.toJsFn, authenticationMechanism = authenticationMechanism.asInstanceOf[js.Any], getDeferral = getDeferral.toJsFn, peerCertificate = peerCertificate.asInstanceOf[js.Any], peerCertificateErrorSeverity = peerCertificateErrorSeverity.asInstanceOf[js.Any], peerCertificateErrors = peerCertificateErrors.asInstanceOf[js.Any], peerIntermediateCertificates = peerIntermediateCertificates.asInstanceOf[js.Any], peerUniqueName = peerUniqueName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllJoynCredentialsVerificationRequestedEventArgs]
  }
  
  extension [Self <: AllJoynCredentialsVerificationRequestedEventArgs](x: Self) {
    
    inline def setAccept(value: Callback): Self = StObject.set(x, "accept", value.toJsFn)
    
    inline def setAuthenticationMechanism(value: AllJoynAuthenticationMechanism): Self = StObject.set(x, "authenticationMechanism", value.asInstanceOf[js.Any])
    
    inline def setGetDeferral(value: CallbackTo[Deferral]): Self = StObject.set(x, "getDeferral", value.toJsFn)
    
    inline def setPeerCertificate(value: Certificate): Self = StObject.set(x, "peerCertificate", value.asInstanceOf[js.Any])
    
    inline def setPeerCertificateErrorSeverity(value: SocketSslErrorSeverity): Self = StObject.set(x, "peerCertificateErrorSeverity", value.asInstanceOf[js.Any])
    
    inline def setPeerCertificateErrors(value: IVectorView[ChainValidationResult]): Self = StObject.set(x, "peerCertificateErrors", value.asInstanceOf[js.Any])
    
    inline def setPeerIntermediateCertificates(value: IVectorView[Certificate]): Self = StObject.set(x, "peerIntermediateCertificates", value.asInstanceOf[js.Any])
    
    inline def setPeerUniqueName(value: String): Self = StObject.set(x, "peerUniqueName", value.asInstanceOf[js.Any])
  }
}
