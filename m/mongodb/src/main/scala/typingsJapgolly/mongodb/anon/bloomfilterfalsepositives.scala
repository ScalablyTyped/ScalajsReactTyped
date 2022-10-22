package typingsJapgolly.mongodb.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  bloom filter false positives :number,   bloom filter hits :number,   bloom filter misses :number,   bloom filter pages evicted from cache :number,   bloom filter pages read into cache :number,   bloom filters in the LSM tree :number,   chunks in the LSM tree :number,   highest merge generation in the LSM tree :number,   queries that could have benefited from a Bloom filter that did not exist :number,   sleep for LSM checkpoint throttle :number,   sleep for LSM merge throttle :number,   total size of bloom filters :number} & bson.bson.Document */
trait bloomfilterfalsepositives
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var `bloom filter false positives`: Double
  
  var `bloom filter hits`: Double
  
  var `bloom filter misses`: Double
  
  var `bloom filter pages evicted from cache`: Double
  
  var `bloom filter pages read into cache`: Double
  
  var `bloom filters in the LSM tree`: Double
  
  var `chunks in the LSM tree`: Double
  
  var `highest merge generation in the LSM tree`: Double
  
  var `queries that could have benefited from a Bloom filter that did not exist`: Double
  
  var `sleep for LSM checkpoint throttle`: Double
  
  var `sleep for LSM merge throttle`: Double
  
  var `total size of bloom filters`: Double
}
object bloomfilterfalsepositives {
  
  inline def apply(
    `bloom filter false positives`: Double,
    `bloom filter hits`: Double,
    `bloom filter misses`: Double,
    `bloom filter pages evicted from cache`: Double,
    `bloom filter pages read into cache`: Double,
    `bloom filters in the LSM tree`: Double,
    `chunks in the LSM tree`: Double,
    `highest merge generation in the LSM tree`: Double,
    `queries that could have benefited from a Bloom filter that did not exist`: Double,
    `sleep for LSM checkpoint throttle`: Double,
    `sleep for LSM merge throttle`: Double,
    `total size of bloom filters`: Double
  ): bloomfilterfalsepositives = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bloom filter false positives")((`bloom filter false positives`).asInstanceOf[js.Any])
    __obj.updateDynamic("bloom filter hits")((`bloom filter hits`).asInstanceOf[js.Any])
    __obj.updateDynamic("bloom filter misses")((`bloom filter misses`).asInstanceOf[js.Any])
    __obj.updateDynamic("bloom filter pages evicted from cache")((`bloom filter pages evicted from cache`).asInstanceOf[js.Any])
    __obj.updateDynamic("bloom filter pages read into cache")((`bloom filter pages read into cache`).asInstanceOf[js.Any])
    __obj.updateDynamic("bloom filters in the LSM tree")((`bloom filters in the LSM tree`).asInstanceOf[js.Any])
    __obj.updateDynamic("chunks in the LSM tree")((`chunks in the LSM tree`).asInstanceOf[js.Any])
    __obj.updateDynamic("highest merge generation in the LSM tree")((`highest merge generation in the LSM tree`).asInstanceOf[js.Any])
    __obj.updateDynamic("queries that could have benefited from a Bloom filter that did not exist")((`queries that could have benefited from a Bloom filter that did not exist`).asInstanceOf[js.Any])
    __obj.updateDynamic("sleep for LSM checkpoint throttle")((`sleep for LSM checkpoint throttle`).asInstanceOf[js.Any])
    __obj.updateDynamic("sleep for LSM merge throttle")((`sleep for LSM merge throttle`).asInstanceOf[js.Any])
    __obj.updateDynamic("total size of bloom filters")((`total size of bloom filters`).asInstanceOf[js.Any])
    __obj.asInstanceOf[bloomfilterfalsepositives]
  }
  
  extension [Self <: bloomfilterfalsepositives](x: Self) {
    
    inline def `setBloom filter false positives`(value: Double): Self = StObject.set(x, "bloom filter false positives", value.asInstanceOf[js.Any])
    
    inline def `setBloom filter hits`(value: Double): Self = StObject.set(x, "bloom filter hits", value.asInstanceOf[js.Any])
    
    inline def `setBloom filter misses`(value: Double): Self = StObject.set(x, "bloom filter misses", value.asInstanceOf[js.Any])
    
    inline def `setBloom filter pages evicted from cache`(value: Double): Self = StObject.set(x, "bloom filter pages evicted from cache", value.asInstanceOf[js.Any])
    
    inline def `setBloom filter pages read into cache`(value: Double): Self = StObject.set(x, "bloom filter pages read into cache", value.asInstanceOf[js.Any])
    
    inline def `setBloom filters in the LSM tree`(value: Double): Self = StObject.set(x, "bloom filters in the LSM tree", value.asInstanceOf[js.Any])
    
    inline def `setChunks in the LSM tree`(value: Double): Self = StObject.set(x, "chunks in the LSM tree", value.asInstanceOf[js.Any])
    
    inline def `setHighest merge generation in the LSM tree`(value: Double): Self = StObject.set(x, "highest merge generation in the LSM tree", value.asInstanceOf[js.Any])
    
    inline def `setQueries that could have benefited from a Bloom filter that did not exist`(value: Double): Self = StObject.set(x, "queries that could have benefited from a Bloom filter that did not exist", value.asInstanceOf[js.Any])
    
    inline def `setSleep for LSM checkpoint throttle`(value: Double): Self = StObject.set(x, "sleep for LSM checkpoint throttle", value.asInstanceOf[js.Any])
    
    inline def `setSleep for LSM merge throttle`(value: Double): Self = StObject.set(x, "sleep for LSM merge throttle", value.asInstanceOf[js.Any])
    
    inline def `setTotal size of bloom filters`(value: Double): Self = StObject.set(x, "total size of bloom filters", value.asInstanceOf[js.Any])
  }
}
