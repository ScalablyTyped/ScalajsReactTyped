package typingsJapgolly.winrtUwp.Windows.Media.Protection.PlayReady

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Sends registration, proximity detection, and license fetch messages between PlayReady-ND receivers and transmitters. */
trait INDMessenger extends js.Object {
  /**
    * Sends the specified data in an asynchronous license fetch request message.
    * @param sessionIDBytes The session identifier. The session identifier must be 16 bytes.
    * @param challengeDataBytes The data for the challenge message.
    * @return The result of the license fetch request.
    */
  def sendLicenseFetchRequestAsync(sessionIDBytes: js.Array[Double], challengeDataBytes: js.Array[Double]): IPromiseWithIAsyncOperation[INDSendResult]
  /**
    * Sends the specified data in an asynchronous proximity detection response message.
    * @param pdType The type of proximity detection operation. This value can be UDP, TCP, or Transport-Agnostic.
    * @param transmitterChannelBytes The transmitter channel data.
    * @param sessionIDBytes The session identifier. The session identifier must be 16 bytes.
    * @param responseDataBytes The data for the response message.
    * @return The result of the proximity detection response operation.
    */
  def sendProximityDetectionResponseAsync(
    pdType: NDProximityDetectionType,
    transmitterChannelBytes: js.Array[Double],
    sessionIDBytes: js.Array[Double],
    responseDataBytes: js.Array[Double]
  ): IPromiseWithIAsyncOperation[INDSendResult]
  /**
    * Sends the specified data in an asynchronous proximity detection start message.
    * @param pdType The type of proximity detection operation. This value can be UDP, TCP, or Transport-Agnostic.
    * @param transmitterChannelBytes The transmitter channel data.
    * @param sessionIDBytes The session identifier. The session identifier must be 16 bytes.
    * @param challengeDataBytes The data for the challenge message.
    * @return The result of the proximity detection start operation.
    */
  def sendProximityDetectionStartAsync(
    pdType: NDProximityDetectionType,
    transmitterChannelBytes: js.Array[Double],
    sessionIDBytes: js.Array[Double],
    challengeDataBytes: js.Array[Double]
  ): IPromiseWithIAsyncOperation[INDSendResult]
  /**
    * Sends the specified data in an asynchronous registration request message.
    * @param sessionIDBytes The session identifier. The session identifier must be 16 bytes.
    * @param challengeDataBytes The data for the challenge message.
    * @return The result of the license fetch request.
    */
  def sendRegistrationRequestAsync(sessionIDBytes: js.Array[Double], challengeDataBytes: js.Array[Double]): IPromiseWithIAsyncOperation[INDSendResult]
}

object INDMessenger {
  @scala.inline
  def apply(
    sendLicenseFetchRequestAsync: (js.Array[Double], js.Array[Double]) => CallbackTo[IPromiseWithIAsyncOperation[INDSendResult]],
    sendProximityDetectionResponseAsync: (NDProximityDetectionType, js.Array[Double], js.Array[Double], js.Array[Double]) => CallbackTo[IPromiseWithIAsyncOperation[INDSendResult]],
    sendProximityDetectionStartAsync: (NDProximityDetectionType, js.Array[Double], js.Array[Double], js.Array[Double]) => CallbackTo[IPromiseWithIAsyncOperation[INDSendResult]],
    sendRegistrationRequestAsync: (js.Array[Double], js.Array[Double]) => CallbackTo[IPromiseWithIAsyncOperation[INDSendResult]]
  ): INDMessenger = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("sendLicenseFetchRequestAsync")(js.Any.fromFunction2((t0: js.Array[scala.Double], t1: js.Array[scala.Double]) => sendLicenseFetchRequestAsync(t0, t1).runNow()))
    __obj.updateDynamic("sendProximityDetectionResponseAsync")(js.Any.fromFunction4((t0: typingsJapgolly.winrtUwp.Windows.Media.Protection.PlayReady.NDProximityDetectionType, t1: js.Array[scala.Double], t2: js.Array[scala.Double], t3: js.Array[scala.Double]) => sendProximityDetectionResponseAsync(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("sendProximityDetectionStartAsync")(js.Any.fromFunction4((t0: typingsJapgolly.winrtUwp.Windows.Media.Protection.PlayReady.NDProximityDetectionType, t1: js.Array[scala.Double], t2: js.Array[scala.Double], t3: js.Array[scala.Double]) => sendProximityDetectionStartAsync(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("sendRegistrationRequestAsync")(js.Any.fromFunction2((t0: js.Array[scala.Double], t1: js.Array[scala.Double]) => sendRegistrationRequestAsync(t0, t1).runNow()))
    __obj.asInstanceOf[INDMessenger]
  }
}

