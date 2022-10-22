package typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typingsJapgolly.elasticElasticsearch.elasticElasticsearchStrings.BM25
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesSettingsSimilarityBm25 extends StObject {
  
  var b: integer
  
  var discount_overlaps: Boolean
  
  var k1: double
  
  var `type`: BM25
}
object IndicesSettingsSimilarityBm25 {
  
  inline def apply(b: integer, discount_overlaps: Boolean, k1: double): IndicesSettingsSimilarityBm25 = {
    val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], discount_overlaps = discount_overlaps.asInstanceOf[js.Any], k1 = k1.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BM25")
    __obj.asInstanceOf[IndicesSettingsSimilarityBm25]
  }
  
  extension [Self <: IndicesSettingsSimilarityBm25](x: Self) {
    
    inline def setB(value: integer): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
    
    inline def setDiscount_overlaps(value: Boolean): Self = StObject.set(x, "discount_overlaps", value.asInstanceOf[js.Any])
    
    inline def setK1(value: double): Self = StObject.set(x, "k1", value.asInstanceOf[js.Any])
    
    inline def setType(value: BM25): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
