package typingsJapgolly.winrtUwp.Windows.Devices.AllJoyn

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrtUwp.Windows.Foundation.Deferral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains information about a request for credentials in order to authenticate to a peer. */
trait AllJoynCredentialsRequestedEventArgs extends StObject {
  
  /** The number of times the credential request has been tried. */
  var attemptCount: Double
  
  /** The authentication credentials to be filled in by the app. */
  var credentials: AllJoynCredentials
  
  /**
    * Allows JavaScript Windows Store apps to handle the verification of provided of credentials asynchronously.
    * @return The credential request deferral.
    */
  def getDeferral(): Deferral
  
  /** The unique bus name of the remote app that provided the requested credentials. */
  var peerUniqueName: String
  
  /** A user name value used by mechanisms that accept a user name/password pair. */
  var requestedUserName: String
}
object AllJoynCredentialsRequestedEventArgs {
  
  inline def apply(
    attemptCount: Double,
    credentials: AllJoynCredentials,
    getDeferral: CallbackTo[Deferral],
    peerUniqueName: String,
    requestedUserName: String
  ): AllJoynCredentialsRequestedEventArgs = {
    val __obj = js.Dynamic.literal(attemptCount = attemptCount.asInstanceOf[js.Any], credentials = credentials.asInstanceOf[js.Any], getDeferral = getDeferral.toJsFn, peerUniqueName = peerUniqueName.asInstanceOf[js.Any], requestedUserName = requestedUserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllJoynCredentialsRequestedEventArgs]
  }
  
  extension [Self <: AllJoynCredentialsRequestedEventArgs](x: Self) {
    
    inline def setAttemptCount(value: Double): Self = StObject.set(x, "attemptCount", value.asInstanceOf[js.Any])
    
    inline def setCredentials(value: AllJoynCredentials): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
    
    inline def setGetDeferral(value: CallbackTo[Deferral]): Self = StObject.set(x, "getDeferral", value.toJsFn)
    
    inline def setPeerUniqueName(value: String): Self = StObject.set(x, "peerUniqueName", value.asInstanceOf[js.Any])
    
    inline def setRequestedUserName(value: String): Self = StObject.set(x, "requestedUserName", value.asInstanceOf[js.Any])
  }
}
