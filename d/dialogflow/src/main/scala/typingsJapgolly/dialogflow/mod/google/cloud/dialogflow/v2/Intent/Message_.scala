package typingsJapgolly.dialogflow.mod.google.cloud.dialogflow.v2.Intent

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.dialogflow.dialogflowStrings.basicCard
import typingsJapgolly.dialogflow.dialogflowStrings.card
import typingsJapgolly.dialogflow.dialogflowStrings.carouselSelect
import typingsJapgolly.dialogflow.dialogflowStrings.image
import typingsJapgolly.dialogflow.dialogflowStrings.linkOutSuggestion
import typingsJapgolly.dialogflow.dialogflowStrings.listSelect
import typingsJapgolly.dialogflow.dialogflowStrings.payload
import typingsJapgolly.dialogflow.dialogflowStrings.quickReplies
import typingsJapgolly.dialogflow.dialogflowStrings.simpleResponses
import typingsJapgolly.dialogflow.dialogflowStrings.suggestions
import typingsJapgolly.dialogflow.dialogflowStrings.text
import typingsJapgolly.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.Platform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a Message. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message")
@js.native
/**
  * Constructs a new Message.
  * @param [properties] Properties to set
  */
class Message_ () extends IMessage {
  def this(properties: IMessage) = this()
  /** Message message. */
  var message: js.UndefOr[
    text | image | quickReplies | card | payload | simpleResponses | basicCard | suggestions | linkOutSuggestion | listSelect | carouselSelect
  ] = js.native
  /** Message platform. */
  @JSName("platform")
  var platform_Message_ : Platform = js.native
  /**
    * Converts this Message to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

