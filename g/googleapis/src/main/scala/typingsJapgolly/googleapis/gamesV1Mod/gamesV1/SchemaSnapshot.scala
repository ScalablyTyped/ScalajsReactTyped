package typingsJapgolly.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for an snapshot object.
  */
@js.native
trait SchemaSnapshot extends js.Object {
  /**
    * The cover image of this snapshot. May be absent if there is no image.
    */
  var coverImage: js.UndefOr[SchemaSnapshotImage] = js.native
  /**
    * The description of this snapshot.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The ID of the file underlying this snapshot in the Drive API. Only
    * present if the snapshot is a view on a Drive file and the file is owned
    * by the caller.
    */
  var driveId: js.UndefOr[String] = js.native
  /**
    * The duration associated with this snapshot, in millis.
    */
  var durationMillis: js.UndefOr[String] = js.native
  /**
    * The ID of the snapshot.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#snapshot.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The timestamp (in millis since Unix epoch) of the last modification to
    * this snapshot.
    */
  var lastModifiedMillis: js.UndefOr[String] = js.native
  /**
    * The progress value (64-bit integer set by developer) associated with this
    * snapshot.
    */
  var progressValue: js.UndefOr[String] = js.native
  /**
    * The title of this snapshot.
    */
  var title: js.UndefOr[String] = js.native
  /**
    * The type of this snapshot. Possible values are:   - &quot;SAVE_GAME&quot;
    * - A snapshot representing a save game.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * The unique name provided when the snapshot was created.
    */
  var uniqueName: js.UndefOr[String] = js.native
}

object SchemaSnapshot {
  @scala.inline
  def apply(
    coverImage: SchemaSnapshotImage = null,
    description: String = null,
    driveId: String = null,
    durationMillis: String = null,
    id: String = null,
    kind: String = null,
    lastModifiedMillis: String = null,
    progressValue: String = null,
    title: String = null,
    `type`: String = null,
    uniqueName: String = null
  ): SchemaSnapshot = {
    val __obj = js.Dynamic.literal()
    if (coverImage != null) __obj.updateDynamic("coverImage")(coverImage.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (driveId != null) __obj.updateDynamic("driveId")(driveId.asInstanceOf[js.Any])
    if (durationMillis != null) __obj.updateDynamic("durationMillis")(durationMillis.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (lastModifiedMillis != null) __obj.updateDynamic("lastModifiedMillis")(lastModifiedMillis.asInstanceOf[js.Any])
    if (progressValue != null) __obj.updateDynamic("progressValue")(progressValue.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (uniqueName != null) __obj.updateDynamic("uniqueName")(uniqueName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSnapshot]
  }
}

