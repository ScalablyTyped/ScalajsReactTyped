package typingsJapgolly.detox.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  size :[number, number],   bitRate :number,   timeLimit :number,   verbose :boolean}> */
trait Partialsizenumbernumberbi extends StObject {
  
  var bitRate: js.UndefOr[Double] = js.undefined
  
  var size: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  
  var timeLimit: js.UndefOr[Double] = js.undefined
  
  var verbose: js.UndefOr[Boolean] = js.undefined
}
object Partialsizenumbernumberbi {
  
  inline def apply(): Partialsizenumbernumberbi = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Partialsizenumbernumberbi]
  }
  
  extension [Self <: Partialsizenumbernumberbi](x: Self) {
    
    inline def setBitRate(value: Double): Self = StObject.set(x, "bitRate", value.asInstanceOf[js.Any])
    
    inline def setBitRateUndefined: Self = StObject.set(x, "bitRate", js.undefined)
    
    inline def setSize(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setTimeLimit(value: Double): Self = StObject.set(x, "timeLimit", value.asInstanceOf[js.Any])
    
    inline def setTimeLimitUndefined: Self = StObject.set(x, "timeLimit", js.undefined)
    
    inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
    
    inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
  }
}
