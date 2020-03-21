package typingsJapgolly.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.MediaContent.IResponseMediaObject
import typingsJapgolly.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.MediaContent.ResponseMediaType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a MediaContent. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.MediaContent")
@js.native
/**
  * Constructs a new MediaContent.
  * @param [properties] Properties to set
  */
class MediaContent_ () extends IMediaContent {
  def this(properties: IMediaContent) = this()
  /** MediaContent mediaObjects. */
  @JSName("mediaObjects")
  var mediaObjects_MediaContent_ : js.Array[IResponseMediaObject] = js.native
  /** MediaContent mediaType. */
  @JSName("mediaType")
  var mediaType_MediaContent_ : ResponseMediaType = js.native
  /**
    * Converts this MediaContent to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

