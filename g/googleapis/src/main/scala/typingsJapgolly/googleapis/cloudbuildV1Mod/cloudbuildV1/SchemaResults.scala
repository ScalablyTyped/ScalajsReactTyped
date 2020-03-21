package typingsJapgolly.googleapis.cloudbuildV1Mod.cloudbuildV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Artifacts created by the build pipeline.
  */
@js.native
trait SchemaResults extends js.Object {
  /**
    * Path to the artifact manifest. Only populated when artifacts are
    * uploaded.
    */
  var artifactManifest: js.UndefOr[String] = js.native
  /**
    * Time to push all non-container artifacts.
    */
  var artifactTiming: js.UndefOr[SchemaTimeSpan] = js.native
  /**
    * List of build step digests, in the order corresponding to build step
    * indices.
    */
  var buildStepImages: js.UndefOr[js.Array[String]] = js.native
  /**
    * List of build step outputs, produced by builder images, in the order
    * corresponding to build step indices.  [Cloud
    * Builders](https://cloud.google.com/cloud-build/docs/cloud-builders) can
    * produce this output by writing to `$BUILDER_OUTPUT/output`. Only the
    * first 4KB of data is stored.
    */
  var buildStepOutputs: js.UndefOr[js.Array[String]] = js.native
  /**
    * Container images that were built as a part of the build.
    */
  var images: js.UndefOr[js.Array[SchemaBuiltImage]] = js.native
  /**
    * Number of artifacts uploaded. Only populated when artifacts are uploaded.
    */
  var numArtifacts: js.UndefOr[String] = js.native
}

object SchemaResults {
  @scala.inline
  def apply(
    artifactManifest: String = null,
    artifactTiming: SchemaTimeSpan = null,
    buildStepImages: js.Array[String] = null,
    buildStepOutputs: js.Array[String] = null,
    images: js.Array[SchemaBuiltImage] = null,
    numArtifacts: String = null
  ): SchemaResults = {
    val __obj = js.Dynamic.literal()
    if (artifactManifest != null) __obj.updateDynamic("artifactManifest")(artifactManifest.asInstanceOf[js.Any])
    if (artifactTiming != null) __obj.updateDynamic("artifactTiming")(artifactTiming.asInstanceOf[js.Any])
    if (buildStepImages != null) __obj.updateDynamic("buildStepImages")(buildStepImages.asInstanceOf[js.Any])
    if (buildStepOutputs != null) __obj.updateDynamic("buildStepOutputs")(buildStepOutputs.asInstanceOf[js.Any])
    if (images != null) __obj.updateDynamic("images")(images.asInstanceOf[js.Any])
    if (numArtifacts != null) __obj.updateDynamic("numArtifacts")(numArtifacts.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaResults]
  }
}

