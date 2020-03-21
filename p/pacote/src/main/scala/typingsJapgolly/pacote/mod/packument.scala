package typingsJapgolly.pacote.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pacote", "packument")
@js.native
object packument extends js.Object {
  /**
    * Fetches the packument for a package. Packument objects are general metadata
    * about a project corresponding to registry metadata, and include version and
    * `dist-tag` information about a package's available versions, rather than a
    * specific version. It may include additional metadata not usually available
    * through the individual package metadata objects.
    *
    * Note that depending on the spec type, some additional fields might be
    * present. For example, packages from `registry.npmjs.org` have additional
    * metadata appended by the registry.
    */
  def apply(spec: String): js.Promise[Packument_] = js.native
  def apply(spec: String, opts: Options): js.Promise[Packument_] = js.native
}

