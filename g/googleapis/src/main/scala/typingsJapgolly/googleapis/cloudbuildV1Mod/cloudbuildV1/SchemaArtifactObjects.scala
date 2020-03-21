package typingsJapgolly.googleapis.cloudbuildV1Mod.cloudbuildV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Files in the workspace to upload to Cloud Storage upon successful
  * completion of all build steps.
  */
@js.native
trait SchemaArtifactObjects extends js.Object {
  /**
    * Cloud Storage bucket and optional object path, in the form
    * &quot;gs://bucket/path/to/somewhere/&quot;. (see [Bucket Name
    * Requirements](https://cloud.google.com/storage/docs/bucket-naming#requirements)).
    * Files in the workspace matching any path pattern will be uploaded to
    * Cloud Storage with this location as a prefix.
    */
  var location: js.UndefOr[String] = js.native
  /**
    * Path globs used to match files in the build&#39;s workspace.
    */
  var paths: js.UndefOr[js.Array[String]] = js.native
  /**
    * Output only. Stores timing information for pushing all artifact objects.
    */
  var timing: js.UndefOr[SchemaTimeSpan] = js.native
}

object SchemaArtifactObjects {
  @scala.inline
  def apply(location: String = null, paths: js.Array[String] = null, timing: SchemaTimeSpan = null): SchemaArtifactObjects = {
    val __obj = js.Dynamic.literal()
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (paths != null) __obj.updateDynamic("paths")(paths.asInstanceOf[js.Any])
    if (timing != null) __obj.updateDynamic("timing")(timing.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaArtifactObjects]
  }
}

