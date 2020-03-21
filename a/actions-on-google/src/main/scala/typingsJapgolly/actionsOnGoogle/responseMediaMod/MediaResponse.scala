package typingsJapgolly.actionsOnGoogle.responseMediaMod

import typingsJapgolly.actionsOnGoogle.richMod._RichResponseItem
import typingsJapgolly.actionsOnGoogle.v2Mod.GoogleActionsV2MediaResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google/dist/service/actionssdk/conversation/response/media", "MediaResponse")
@js.native
class MediaResponse protected ()
  extends _RichResponseItem
     with GoogleActionsV2MediaResponse {
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

