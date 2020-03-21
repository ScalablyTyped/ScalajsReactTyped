package typingsJapgolly.winrtUwp.Windows.ApplicationModel.VoiceCommands

import typingsJapgolly.winrtUwp.Windows.ApplicationModel.AppService.AppServiceTriggerDetails
import typingsJapgolly.winrtUwp.Windows.Foundation.EventHandler
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsJapgolly.winrtUwp.Windows.Foundation.TypedEventHandler
import typingsJapgolly.winrtUwp.Windows.Globalization.Language
import typingsJapgolly.winrtUwp.Windows.WinRTEvent
import typingsJapgolly.winrtUwp.winrtUwpStrings.voicecommandcompleted
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The background app service connection to Cortana. */
@JSGlobal("Windows.ApplicationModel.VoiceCommands.VoiceCommandServiceConnection")
@js.native
abstract class VoiceCommandServiceConnection () extends js.Object {
  /** Gets the locale for the voice command. */
  var language: Language = js.native
  /** Event raised when the voice command is completed and the background app service is about to be terminated. */
  @JSName("onvoicecommandcompleted")
  var onvoicecommandcompleted_Original: TypedEventHandler[VoiceCommandServiceConnection, VoiceCommandCompletedEventArgs] = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_voicecommandcompleted(
    `type`: voicecommandcompleted,
    listener: TypedEventHandler[VoiceCommandServiceConnection, VoiceCommandCompletedEventArgs]
  ): Unit = js.native
  /**
    * Retrieves the voice command that the user submitted to Cortana by voice or text.
    * @return The VoiceCommand .
    */
  def getVoiceCommandAsync(): IPromiseWithIAsyncOperation[VoiceCommand] = js.native
  /** Event raised when the voice command is completed and the background app service is about to be terminated. */
  def onvoicecommandcompleted(ev: VoiceCommandCompletedEventArgs with WinRTEvent[VoiceCommandServiceConnection]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_voicecommandcompleted(
    `type`: voicecommandcompleted,
    listener: TypedEventHandler[VoiceCommandServiceConnection, VoiceCommandCompletedEventArgs]
  ): Unit = js.native
  /**
    * Sends a response to Cortana indicating the voice command has failed.
    * @param response The response from a background app service for progress, confirmation, disambiguation, completion, or failure screens displayed on the Cortana canvas.
    * @return An asynchronous handler called when the operation is complete.
    */
  def reportFailureAsync(response: VoiceCommandResponse): IPromiseWithIAsyncAction = js.native
  /**
    * Sends a response to Cortana indicating voice command is being processed.
    * @param response The response from a background app service for progress, confirmation, disambiguation, completion, or failure screens displayed on the Cortana canvas.
    * @return An asynchronous handler called when the operation is complete.
    */
  def reportProgressAsync(response: VoiceCommandResponse): IPromiseWithIAsyncAction = js.native
  /**
    * Sends a response to Cortana indicating the voice command has succeeded.
    * @param response The response from a background app service for progress, confirmation, disambiguation, completion, or failure screens displayed on the Cortana canvas.
    * @return An asynchronous handler called when the operation is complete.
    */
  def reportSuccessAsync(response: VoiceCommandResponse): IPromiseWithIAsyncAction = js.native
  /**
    * Sends a response to Cortana indicating the command should be handled by the app in the foreground.
    * @param response The response from a background app service for progress, confirmation, disambiguation, completion, or failure screens displayed on the Cortana canvas.
    * @return An asynchronous handler called when the operation is complete.
    */
  def requestAppLaunchAsync(response: VoiceCommandResponse): IPromiseWithIAsyncAction = js.native
  /**
    * Sends a response to Cortana indicating the voice command requires confirmation.
    * @param response The response from a background app service for progress, confirmation, disambiguation, completion, or failure screens displayed on the Cortana canvas.
    * @return The VoiceCommandConfirmationResult object with the user's response.
    */
  def requestConfirmationAsync(response: VoiceCommandResponse): IPromiseWithIAsyncOperation[VoiceCommandConfirmationResult] = js.native
  /**
    * Sends a response to Cortana indicating the voice command returned more than one result and requires the user to select one.
    * @param response The response from a background app service for progress, confirmation, disambiguation, completion, or failure screens displayed on the Cortana canvas.
    * @return The VoiceCommandDisambiguationResult object with the user's response.
    */
  def requestDisambiguationAsync(response: VoiceCommandResponse): IPromiseWithIAsyncOperation[VoiceCommandDisambiguationResult] = js.native
}

/* static members */
@JSGlobal("Windows.ApplicationModel.VoiceCommands.VoiceCommandServiceConnection")
@js.native
object VoiceCommandServiceConnection extends js.Object {
  /**
    * Retrieves a VoiceCommandServiceConnection object from the AppServiceTriggerDetails that contains info associated with the background task for the app service.
    * @param triggerDetails Contains info associated with the background task for the app service.
    * @return The background app service connection to Cortana.
    */
  def fromAppServiceTriggerDetails(triggerDetails: AppServiceTriggerDetails): VoiceCommandServiceConnection = js.native
}

