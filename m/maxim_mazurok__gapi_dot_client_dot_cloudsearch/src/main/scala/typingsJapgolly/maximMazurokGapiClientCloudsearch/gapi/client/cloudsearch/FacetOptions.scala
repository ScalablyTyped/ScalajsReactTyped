package typingsJapgolly.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FacetOptions extends StObject {
  
  /** Maximum number of facet buckets that should be returned for this facet. Defaults to 10. Maximum value is 100. */
  var numFacetBuckets: js.UndefOr[Double] = js.undefined
  
  /** If object_type is set, only those objects of that type will be used to compute facets. If empty, then all objects will be used to compute facets. */
  var objectType: js.UndefOr[String] = js.undefined
  
  /** The name of the operator chosen for faceting. @see cloudsearch.SchemaPropertyOptions */
  var operatorName: js.UndefOr[String] = js.undefined
  
  /** Source name to facet on. Format: datasources/{source_id} If empty, all data sources will be used. */
  var sourceName: js.UndefOr[String] = js.undefined
}
object FacetOptions {
  
  inline def apply(): FacetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FacetOptions]
  }
  
  extension [Self <: FacetOptions](x: Self) {
    
    inline def setNumFacetBuckets(value: Double): Self = StObject.set(x, "numFacetBuckets", value.asInstanceOf[js.Any])
    
    inline def setNumFacetBucketsUndefined: Self = StObject.set(x, "numFacetBuckets", js.undefined)
    
    inline def setObjectType(value: String): Self = StObject.set(x, "objectType", value.asInstanceOf[js.Any])
    
    inline def setObjectTypeUndefined: Self = StObject.set(x, "objectType", js.undefined)
    
    inline def setOperatorName(value: String): Self = StObject.set(x, "operatorName", value.asInstanceOf[js.Any])
    
    inline def setOperatorNameUndefined: Self = StObject.set(x, "operatorName", js.undefined)
    
    inline def setSourceName(value: String): Self = StObject.set(x, "sourceName", value.asInstanceOf[js.Any])
    
    inline def setSourceNameUndefined: Self = StObject.set(x, "sourceName", js.undefined)
  }
}
