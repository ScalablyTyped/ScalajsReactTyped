package typingsJapgolly.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GainOptions
  extends StObject
     with AudioNodeOptions {
  
  /* standard dom */
  var gain: js.UndefOr[Double] = js.undefined
}
object GainOptions {
  
  inline def apply(): GainOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GainOptions]
  }
  
  extension [Self <: GainOptions](x: Self) {
    
    inline def setGain(value: Double): Self = StObject.set(x, "gain", value.asInstanceOf[js.Any])
    
    inline def setGainUndefined: Self = StObject.set(x, "gain", js.undefined)
  }
}
