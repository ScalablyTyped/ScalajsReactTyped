package typingsJapgolly.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Source describes the location of the source used for the build.
  */
@js.native
trait SchemaSource extends js.Object {
  /**
    * If provided, some of the source code used for the build may be found in
    * these locations, in the case where the source repository had multiple
    * remotes or submodules. This list will not include the context specified
    * in the context field.
    */
  var additionalContexts: js.UndefOr[js.Array[SchemaSourceContext]] = js.native
  /**
    * If provided, the input binary artifacts for the build came from this
    * location.
    */
  var artifactStorageSourceUri: js.UndefOr[String] = js.native
  /**
    * If provided, the source code used for the build came from this location.
    */
  var context: js.UndefOr[SchemaSourceContext] = js.native
  /**
    * Hash(es) of the build source, which can be used to verify that the
    * original source integrity was maintained in the build.  The keys to this
    * map are file paths used as build source and the values contain the hash
    * values for those files.  If the build source came in a single package
    * such as a gzipped tarfile (.tar.gz), the FileHash will be for the single
    * path to that file.
    */
  var fileHashes: js.UndefOr[StringDictionary[SchemaFileHashes]] = js.native
}

object SchemaSource {
  @scala.inline
  def apply(
    additionalContexts: js.Array[SchemaSourceContext] = null,
    artifactStorageSourceUri: String = null,
    context: SchemaSourceContext = null,
    fileHashes: StringDictionary[SchemaFileHashes] = null
  ): SchemaSource = {
    val __obj = js.Dynamic.literal()
    if (additionalContexts != null) __obj.updateDynamic("additionalContexts")(additionalContexts.asInstanceOf[js.Any])
    if (artifactStorageSourceUri != null) __obj.updateDynamic("artifactStorageSourceUri")(artifactStorageSourceUri.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (fileHashes != null) __obj.updateDynamic("fileHashes")(fileHashes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSource]
  }
}

