package typingsJapgolly.actionsOnGoogle.conversationMod

import typingsJapgolly.actionsOnGoogle.responseMediaMod.MediaObjectString
import typingsJapgolly.actionsOnGoogle.responseMediaMod.MediaResponseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google/dist/service/actionssdk/conversation", "MediaResponse")
@js.native
class MediaResponse protected ()
  extends typingsJapgolly.actionsOnGoogle.responseMod.MediaResponse {
  /**
    * @param objects MediaObjects
    * @public
    */
  def this(objects: MediaObjectString*) = this()
  /**
    * @param objects MediaObjects
    * @public
    */
  def this(objects: js.Array[MediaObjectString]) = this()
  /**
    * @param options MediaResponse options
    * @public
    */
  def this(options: MediaResponseOptions) = this()
}

