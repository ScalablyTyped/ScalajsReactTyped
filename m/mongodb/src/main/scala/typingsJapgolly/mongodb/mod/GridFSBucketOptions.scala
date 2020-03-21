package typingsJapgolly.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridFSBucketOptions extends js.Object {
  var bucketName: js.UndefOr[String] = js.undefined
  var chunkSizeBytes: js.UndefOr[scala.Double] = js.undefined
  var readPreference: js.UndefOr[ReadPreferenceOrMode] = js.undefined
  var writeConcern: js.UndefOr[WriteConcern] = js.undefined
}

object GridFSBucketOptions {
  @scala.inline
  def apply(
    bucketName: String = null,
    chunkSizeBytes: Int | scala.Double = null,
    readPreference: ReadPreferenceOrMode = null,
    writeConcern: WriteConcern = null
  ): GridFSBucketOptions = {
    val __obj = js.Dynamic.literal()
    if (bucketName != null) __obj.updateDynamic("bucketName")(bucketName.asInstanceOf[js.Any])
    if (chunkSizeBytes != null) __obj.updateDynamic("chunkSizeBytes")(chunkSizeBytes.asInstanceOf[js.Any])
    if (readPreference != null) __obj.updateDynamic("readPreference")(readPreference.asInstanceOf[js.Any])
    if (writeConcern != null) __obj.updateDynamic("writeConcern")(writeConcern.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridFSBucketOptions]
  }
}

