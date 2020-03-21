package typingsJapgolly.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A particular message pertaining to a Dataflow job.
  */
@js.native
trait SchemaJobMessage extends js.Object {
  /**
    * Deprecated.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Importance level of the message.
    */
  var messageImportance: js.UndefOr[String] = js.native
  /**
    * The text of the message.
    */
  var messageText: js.UndefOr[String] = js.native
  /**
    * The timestamp of the message.
    */
  var time: js.UndefOr[String] = js.native
}

object SchemaJobMessage {
  @scala.inline
  def apply(
    id: String = null,
    messageImportance: String = null,
    messageText: String = null,
    time: String = null
  ): SchemaJobMessage = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (messageImportance != null) __obj.updateDynamic("messageImportance")(messageImportance.asInstanceOf[js.Any])
    if (messageText != null) __obj.updateDynamic("messageText")(messageText.asInstanceOf[js.Any])
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaJobMessage]
  }
}

