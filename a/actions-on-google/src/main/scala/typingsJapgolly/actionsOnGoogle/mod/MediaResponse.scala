package typingsJapgolly.actionsOnGoogle.mod

import typingsJapgolly.actionsOnGoogle.responseMediaMod.MediaObjectString
import typingsJapgolly.actionsOnGoogle.responseMediaMod.MediaResponseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google", "MediaResponse")
@js.native
class MediaResponse protected ()
  extends typingsJapgolly.actionsOnGoogle.actionssdkMod.MediaResponse {
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

