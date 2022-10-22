package typingsJapgolly.awsSdkClientS3Node

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesProgressMod {
  
  trait Progress extends StObject {
    
    /**
      * <p>Current number of uncompressed object bytes processed.</p>
      */
    var BytesProcessed: js.UndefOr[Double] = js.undefined
    
    /**
      * <p>Current number of bytes of records payload data returned.</p>
      */
    var BytesReturned: js.UndefOr[Double] = js.undefined
    
    /**
      * <p>Current number of object bytes scanned.</p>
      */
    var BytesScanned: js.UndefOr[Double] = js.undefined
  }
  object Progress {
    
    inline def apply(): Progress = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Progress]
    }
    
    extension [Self <: Progress](x: Self) {
      
      inline def setBytesProcessed(value: Double): Self = StObject.set(x, "BytesProcessed", value.asInstanceOf[js.Any])
      
      inline def setBytesProcessedUndefined: Self = StObject.set(x, "BytesProcessed", js.undefined)
      
      inline def setBytesReturned(value: Double): Self = StObject.set(x, "BytesReturned", value.asInstanceOf[js.Any])
      
      inline def setBytesReturnedUndefined: Self = StObject.set(x, "BytesReturned", js.undefined)
      
      inline def setBytesScanned(value: Double): Self = StObject.set(x, "BytesScanned", value.asInstanceOf[js.Any])
      
      inline def setBytesScannedUndefined: Self = StObject.set(x, "BytesScanned", js.undefined)
    }
  }
  
  type UnmarshalledProgress = Progress
}
