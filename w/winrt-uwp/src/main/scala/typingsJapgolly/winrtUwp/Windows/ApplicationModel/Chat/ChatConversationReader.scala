package typingsJapgolly.winrtUwp.Windows.ApplicationModel.Chat

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides functionality for reading batches of conversations from the ChatMessageStore . */
@JSGlobal("Windows.ApplicationModel.Chat.ChatConversationReader")
@js.native
abstract class ChatConversationReader () extends js.Object {
  /**
    * Asynchronously reads batches of conversations from the ChatMessageStore .
    * @return The list of conversations.
    */
  def readBatchAsync(): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  /**
    * Asynchronously reads batches of conversations from the ChatMessageStore .
    * @param count Specifies the size of the batch to read.
    * @return The list of conversations.
    */
  def readBatchAsync(count: Double): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
}

