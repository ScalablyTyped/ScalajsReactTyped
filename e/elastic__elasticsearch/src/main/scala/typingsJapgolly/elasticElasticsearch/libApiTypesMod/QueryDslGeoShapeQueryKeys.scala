package typingsJapgolly.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryDslGeoShapeQueryKeys
  extends StObject
     with QueryDslQueryBase {
  
  var ignore_unmapped: js.UndefOr[Boolean] = js.undefined
}
object QueryDslGeoShapeQueryKeys {
  
  inline def apply(): QueryDslGeoShapeQueryKeys = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryDslGeoShapeQueryKeys]
  }
  
  extension [Self <: QueryDslGeoShapeQueryKeys](x: Self) {
    
    inline def setIgnore_unmapped(value: Boolean): Self = StObject.set(x, "ignore_unmapped", value.asInstanceOf[js.Any])
    
    inline def setIgnore_unmappedUndefined: Self = StObject.set(x, "ignore_unmapped", js.undefined)
  }
}
