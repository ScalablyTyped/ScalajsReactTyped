package typingsJapgolly.wordpressApiFetch.mod.Schema

import typingsJapgolly.std.Record
import typingsJapgolly.wordpressApiFetch.AnonDictk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseTag
  extends BaseResponse
     with Tag[js.Any] {
  var count: Double
  var description: String
  var id: Double
  var link: String
  var meta: js.Array[_]
  var name: String
  var slug: String
  var taxonomy: TaxonomyKind
}

object BaseTag {
  @scala.inline
  def apply(
    _links: Record[String, js.Array[AnonDictk]],
    count: Double,
    description: String,
    id: Double,
    link: String,
    meta: js.Array[_],
    name: String,
    slug: String,
    taxonomy: TaxonomyKind,
    _embedded: Record[String, js.Array[_]] = null
  ): BaseTag = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], taxonomy = taxonomy.asInstanceOf[js.Any])
    if (_embedded != null) __obj.updateDynamic("_embedded")(_embedded.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseTag]
  }
}

