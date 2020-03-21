package typingsJapgolly.googleapis.v1alpha1Mod.cloudbuildV1alpha1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provenance of the source. Ways to find the original source, or verify that
  * some source was used for this build.
  */
@js.native
trait SchemaSourceProvenance extends js.Object {
  /**
    * Output only. Hash(es) of the build source, which can be used to verify
    * that the original source integrity was maintained in the build. Note that
    * `FileHashes` will only be populated if `BuildOptions` has requested a
    * `SourceProvenanceHash`.  The keys to this map are file paths used as
    * build source and the values contain the hash values for those files.  If
    * the build source came in a single package such as a gzipped tarfile
    * (`.tar.gz`), the `FileHash` will be for the single path to that file.
    */
  var fileHashes: js.UndefOr[StringDictionary[SchemaFileHashes]] = js.native
  /**
    * A copy of the build&#39;s `source.repo_source`, if exists, with any
    * revisions resolved.
    */
  var resolvedRepoSource: js.UndefOr[SchemaRepoSource] = js.native
  /**
    * A copy of the build&#39;s `source.storage_source`, if exists, with any
    * generations resolved.
    */
  var resolvedStorageSource: js.UndefOr[SchemaStorageSource] = js.native
}

object SchemaSourceProvenance {
  @scala.inline
  def apply(
    fileHashes: StringDictionary[SchemaFileHashes] = null,
    resolvedRepoSource: SchemaRepoSource = null,
    resolvedStorageSource: SchemaStorageSource = null
  ): SchemaSourceProvenance = {
    val __obj = js.Dynamic.literal()
    if (fileHashes != null) __obj.updateDynamic("fileHashes")(fileHashes.asInstanceOf[js.Any])
    if (resolvedRepoSource != null) __obj.updateDynamic("resolvedRepoSource")(resolvedRepoSource.asInstanceOf[js.Any])
    if (resolvedStorageSource != null) __obj.updateDynamic("resolvedStorageSource")(resolvedStorageSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSourceProvenance]
  }
}

