package typingsJapgolly.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsLongRareTermsBucketKeys
  extends StObject
     with AggregationsMultiBucketBase {
  
  var key: long
  
  var key_as_string: js.UndefOr[String] = js.undefined
}
object AggregationsLongRareTermsBucketKeys {
  
  inline def apply(doc_count: long, key: long): AggregationsLongRareTermsBucketKeys = {
    val __obj = js.Dynamic.literal(doc_count = doc_count.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregationsLongRareTermsBucketKeys]
  }
  
  extension [Self <: AggregationsLongRareTermsBucketKeys](x: Self) {
    
    inline def setKey(value: long): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKey_as_string(value: String): Self = StObject.set(x, "key_as_string", value.asInstanceOf[js.Any])
    
    inline def setKey_as_stringUndefined: Self = StObject.set(x, "key_as_string", js.undefined)
  }
}
