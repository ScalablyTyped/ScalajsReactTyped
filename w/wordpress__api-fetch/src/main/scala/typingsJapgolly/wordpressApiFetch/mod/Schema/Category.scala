package typingsJapgolly.wordpressApiFetch.mod.Schema

import typingsJapgolly.std.Record
import typingsJapgolly.wordpressApiFetch.AnonDictk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// prettier-ignore
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.wordpressApiFetch.mod.Schema.BaseCategory
  - typingsJapgolly.wordpressApiFetch.PickBaseCategoryCategoryCount
  - typingsJapgolly.wordpressApiFetch.PickBaseCategoryCategory
*/
trait Category[T /* <: Context */] extends js.Object

object Category {
  @scala.inline
  def BaseCategory[T /* <: Context */](
    _links: Record[String, js.Array[AnonDictk]],
    count: Double,
    description: String,
    id: Double,
    link: String,
    meta: js.Array[_],
    name: String,
    parent: Double,
    slug: String,
    taxonomy: TaxonomyKind,
    _embedded: Record[String, js.Array[_]] = null
  ): Category[T] = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], taxonomy = taxonomy.asInstanceOf[js.Any])
    if (_embedded != null) __obj.updateDynamic("_embedded")(_embedded.asInstanceOf[js.Any])
    __obj.asInstanceOf[Category[T]]
  }
  @scala.inline
  def PickBaseCategoryCategoryCount[T /* <: Context */](
    _links: Record[String, js.Array[AnonDictk]],
    count: Double,
    description: String,
    id: Double,
    link: String,
    meta: js.Array[_],
    name: String,
    parent: Double,
    slug: String,
    taxonomy: TaxonomyKind,
    _embedded: Record[String, js.Array[_]] = null
  ): Category[T] = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], taxonomy = taxonomy.asInstanceOf[js.Any])
    if (_embedded != null) __obj.updateDynamic("_embedded")(_embedded.asInstanceOf[js.Any])
    __obj.asInstanceOf[Category[T]]
  }
  @scala.inline
  def PickBaseCategoryCategory[T /* <: Context */](
    _links: Record[String, js.Array[AnonDictk]],
    id: Double,
    link: String,
    name: String,
    slug: String,
    taxonomy: TaxonomyKind,
    _embedded: Record[String, js.Array[_]] = null
  ): Category[T] = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], taxonomy = taxonomy.asInstanceOf[js.Any])
    if (_embedded != null) __obj.updateDynamic("_embedded")(_embedded.asInstanceOf[js.Any])
    __obj.asInstanceOf[Category[T]]
  }
}

