package typingsJapgolly.wordpressCoreData.schemaMod.Schema

import typingsJapgolly.std.Record
import typingsJapgolly.wordpressCoreData.anon.Dictk
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseTag
  extends StObject
     with BaseResponse {
  
  var count: Double
  
  var description: String
  
  var id: Double
  
  var link: String
  
  var meta: js.Array[Any]
  
  var name: String
  
  var slug: String
  
  var taxonomy: TaxonomyKind
}
object BaseTag {
  
  inline def apply(
    _links: Record[String, js.Array[Dictk]],
    count: Double,
    description: String,
    id: Double,
    link: String,
    meta: js.Array[Any],
    name: String,
    slug: String,
    taxonomy: TaxonomyKind
  ): BaseTag = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], taxonomy = taxonomy.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseTag]
  }
  
  extension [Self <: BaseTag](x: Self) {
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setMeta(value: js.Array[Any]): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setMetaVarargs(value: Any*): Self = StObject.set(x, "meta", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSlug(value: String): Self = StObject.set(x, "slug", value.asInstanceOf[js.Any])
    
    inline def setTaxonomy(value: TaxonomyKind): Self = StObject.set(x, "taxonomy", value.asInstanceOf[js.Any])
  }
}
