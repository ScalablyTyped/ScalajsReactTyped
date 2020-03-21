package typingsJapgolly.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "BatchRetrieveCatalogObjectsResponse")
@js.native
class BatchRetrieveCatalogObjectsResponse () extends js.Object {
  /**
    * The set of [Error](#type-error)s encountered.
    */
  var errors: js.UndefOr[js.Array[js.Error]] = js.native
  /**
    * A list of [CatalogObject](#type-catalogobject)s returned.
    */
  var objects: js.UndefOr[js.Array[CatalogObject]] = js.native
  /**
    * A list of [CatalogObject](#type-catalogobject)s referenced by the object in the `objects` field.
    */
  var related_objects: js.UndefOr[js.Array[CatalogObject]] = js.native
}

