package typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsMultiTermsBucketKeys
  extends StObject
     with AggregationsMultiBucketBase {
  
  var doc_count_error_upper_bound: js.UndefOr[long] = js.undefined
  
  var key: js.Array[long | double | String]
  
  var key_as_string: js.UndefOr[String] = js.undefined
}
object AggregationsMultiTermsBucketKeys {
  
  inline def apply(doc_count: long, key: js.Array[long | double | String]): AggregationsMultiTermsBucketKeys = {
    val __obj = js.Dynamic.literal(doc_count = doc_count.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregationsMultiTermsBucketKeys]
  }
  
  extension [Self <: AggregationsMultiTermsBucketKeys](x: Self) {
    
    inline def setDoc_count_error_upper_bound(value: long): Self = StObject.set(x, "doc_count_error_upper_bound", value.asInstanceOf[js.Any])
    
    inline def setDoc_count_error_upper_boundUndefined: Self = StObject.set(x, "doc_count_error_upper_bound", js.undefined)
    
    inline def setKey(value: js.Array[long | double | String]): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyVarargs(value: (long | double | String)*): Self = StObject.set(x, "key", js.Array(value*))
    
    inline def setKey_as_string(value: String): Self = StObject.set(x, "key_as_string", value.asInstanceOf[js.Any])
    
    inline def setKey_as_stringUndefined: Self = StObject.set(x, "key_as_string", js.undefined)
  }
}
