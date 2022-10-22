package typingsJapgolly.winrtUwp.global.Windows.Media.Protection.PlayReady

import typingsJapgolly.winrtUwp.Windows.Foundation.IAsyncAction
import typingsJapgolly.winrtUwp.Windows.Foundation.Uri
import typingsJapgolly.winrtUwp.Windows.Media.Protection.PlayReady.IPlayReadyServiceRequest
import typingsJapgolly.winrtUwp.Windows.WinRTError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Updates the revocation data required by PlayReady. */
@JSGlobal("Windows.Media.Protection.PlayReady.PlayReadyRevocationServiceRequest")
@js.native
/** Initializes a new instance of the PlayReadyRevocationServiceRequest class. */
open class PlayReadyRevocationServiceRequest ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.Media.Protection.PlayReady.PlayReadyRevocationServiceRequest {
  
  /**
    * Begins an asynchronous service request operation.
    * @return The asynchronous service action.
    */
  /* CompleteClass */
  override def beginServiceRequest(): IAsyncAction = js.native
  
  /** Gets or sets the custom data of the request challenge. This property is not supported in this class. */
  /* CompleteClass */
  var challengeCustomData: String = js.native
  
  /**
    * Begins the process of manually enabling. This method is not supported in this class.
    * @return This method always returns 0x80070032 (the request is not supported).
    */
  /* CompleteClass */
  override def generateManualEnablingChallenge(): typingsJapgolly.winrtUwp.Windows.Media.Protection.PlayReady.PlayReadySoapMessage = js.native
  
  /**
    * Returns a new service request interface.
    * @return The new service request interface.
    */
  /* CompleteClass */
  override def nextServiceRequest(): IPlayReadyServiceRequest = js.native
  
  /**
    * Process the raw binary result of a manual enabling challenge. This method is not supported in this class.
    * @param responseBytes The response result to be processed.
    * @return This method always returns 0x80070032 (the request is not supported).
    */
  /* CompleteClass */
  override def processManualEnablingResponse(responseBytes: js.Array[Double]): WinRTError = js.native
  
  /** Gets the vendor content protection system identifier. */
  /* CompleteClass */
  var protectionSystem: String = js.native
  
  /** Gets the custom data that was returned in the response from the service. This property is not supported in this class. */
  /* CompleteClass */
  var responseCustomData: String = js.native
  
  /** Gets the GUID for the type of operation that the PlayReady revocation service request performs. */
  /* CompleteClass */
  var `type`: String = js.native
  
  /** Gets or sets the URI used to perform a service request action. This property is not supported in this class. */
  /* CompleteClass */
  var uri: Uri = js.native
}
