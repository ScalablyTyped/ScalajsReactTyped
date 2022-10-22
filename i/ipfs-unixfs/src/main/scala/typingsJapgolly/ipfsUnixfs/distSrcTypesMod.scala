package typingsJapgolly.ipfsUnixfs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTypesMod {
  
  trait Mtime
    extends StObject
       with _MtimeLike {
    
    var nsecs: js.UndefOr[Double] = js.undefined
    
    var secs: Double
  }
  object Mtime {
    
    inline def apply(secs: Double): Mtime = {
      val __obj = js.Dynamic.literal(secs = secs.asInstanceOf[js.Any])
      __obj.asInstanceOf[Mtime]
    }
    
    extension [Self <: Mtime](x: Self) {
      
      inline def setNsecs(value: Double): Self = StObject.set(x, "nsecs", value.asInstanceOf[js.Any])
      
      inline def setNsecsUndefined: Self = StObject.set(x, "nsecs", js.undefined)
      
      inline def setSecs(value: Double): Self = StObject.set(x, "secs", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.ipfsUnixfs.distSrcTypesMod.Mtime
    - typingsJapgolly.ipfsUnixfs.anon.FractionalNanoseconds
    - js.Tuple2[scala.Double, scala.Double]
    - js.Date
  */
  type MtimeLike = _MtimeLike | (js.Tuple2[Double, Double]) | js.Date
  
  trait _MtimeLike extends StObject
  object _MtimeLike {
    
    inline def FractionalNanoseconds(Seconds: Double): typingsJapgolly.ipfsUnixfs.anon.FractionalNanoseconds = {
      val __obj = js.Dynamic.literal(Seconds = Seconds.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.ipfsUnixfs.anon.FractionalNanoseconds]
    }
    
    inline def Mtime(secs: Double): typingsJapgolly.ipfsUnixfs.distSrcTypesMod.Mtime = {
      val __obj = js.Dynamic.literal(secs = secs.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.ipfsUnixfs.distSrcTypesMod.Mtime]
    }
  }
}
