package typingsJapgolly.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A set of properties that uniquely identify a given Docker image.
  */
@js.native
trait SchemaFingerprint extends js.Object {
  /**
    * The layer-id of the final layer in the Docker image&#39;s v1
    * representation. This field can be used as a filter in list requests.
    */
  var v1Name: js.UndefOr[String] = js.native
  /**
    * The ordered list of v2 blobs that represent a given image.
    */
  var v2Blob: js.UndefOr[js.Array[String]] = js.native
  /**
    * Output only. The name of the image&#39;s v2 blobs computed via: [bottom]
    * := v2_blobbottom := sha256(v2_blob[N] + &quot; &quot; + v2_name[N+1])
    * Only the name of the final blob is kept. This field can be used as a
    * filter in list requests.
    */
  var v2Name: js.UndefOr[String] = js.native
}

object SchemaFingerprint {
  @scala.inline
  def apply(v1Name: String = null, v2Blob: js.Array[String] = null, v2Name: String = null): SchemaFingerprint = {
    val __obj = js.Dynamic.literal()
    if (v1Name != null) __obj.updateDynamic("v1Name")(v1Name.asInstanceOf[js.Any])
    if (v2Blob != null) __obj.updateDynamic("v2Blob")(v2Blob.asInstanceOf[js.Any])
    if (v2Name != null) __obj.updateDynamic("v2Name")(v2Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFingerprint]
  }
}

