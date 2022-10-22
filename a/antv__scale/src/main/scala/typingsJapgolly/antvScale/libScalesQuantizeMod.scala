package typingsJapgolly.antvScale

import typingsJapgolly.antvScale.libScalesThresholdMod.Threshold
import typingsJapgolly.antvScale.libTypesMod.QuantizeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libScalesQuantizeMod {
  
  @JSImport("@antv/scale/lib/scales/quantize", "Quantize")
  @js.native
  open class Quantize () extends Threshold[QuantizeOptions] {
    def this(options: QuantizeOptions) = this()
    
    def getThresholds(): js.Array[Double] = js.native
    
    /* protected */ def getTickMethodOptions(): js.Array[Double] = js.native
    
    def getTicks(): js.Array[Double] = js.native
    
    /* protected */ def nice(): Unit = js.native
  }
}
