package typingsJapgolly.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridFSBucketReadStreamOptions extends StObject {
  
  /** 0-based offset in bytes to stop streaming before */
  var end: js.UndefOr[scala.Double] = js.undefined
  
  var skip: js.UndefOr[scala.Double] = js.undefined
  
  var sort: js.UndefOr[Sort] = js.undefined
  
  /** 0-based offset in bytes to start streaming from */
  var start: js.UndefOr[scala.Double] = js.undefined
}
object GridFSBucketReadStreamOptions {
  
  inline def apply(): GridFSBucketReadStreamOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridFSBucketReadStreamOptions]
  }
  
  extension [Self <: GridFSBucketReadStreamOptions](x: Self) {
    
    inline def setEnd(value: scala.Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setSkip(value: scala.Double): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
    
    inline def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
    
    inline def setSort(value: Sort): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    inline def setSortVarargs(value: (String | (js.Tuple2[String, SortDirection]))*): Self = StObject.set(x, "sort", js.Array(value*))
    
    inline def setStart(value: scala.Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
