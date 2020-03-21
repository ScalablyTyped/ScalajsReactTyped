package typingsJapgolly.breeze.mod

import typingsJapgolly.breeze.breeze.MetadataStoreOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("breeze", "MetadataStore")
@js.native
class MetadataStore ()
  extends typingsJapgolly.breeze.breeze.MetadataStore {
  def this(config: MetadataStoreOptions) = this()
}

/* static members */
@JSImport("breeze", "MetadataStore")
@js.native
object MetadataStore extends js.Object {
  def importMetadata(exportedString: String): typingsJapgolly.breeze.breeze.MetadataStore = js.native
  def normalizeTypeName(typeName: String): String = js.native
}

