package typingsJapgolly.antvScale

import typingsJapgolly.antvScale.libScalesOrdinalMod.Ordinal
import typingsJapgolly.antvScale.libTypesMod.BandOptions
import typingsJapgolly.antvScale.libTypesMod.Domain
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libScalesBandMod {
  
  @JSImport("@antv/scale/lib/scales/band", "Band")
  @js.native
  open class Band[O /* <: BandOptions */] () extends Ordinal[O] {
    def this(options: BandOptions) = this()
    
    /* private */ var adjustedRange: Any = js.native
    
    def getBandWidth(): Any = js.native
    def getBandWidth(x: Domain[BandOptions]): Any = js.native
    
    /* protected */ def getPaddingInner(): Double = js.native
    
    /* protected */ def getPaddingOuter(): Double = js.native
    
    def getStep(): Any = js.native
    def getStep(x: Domain[BandOptions]): Any = js.native
    
    /* private */ var valueBandWidth: Any = js.native
    
    /* private */ var valueStep: Any = js.native
  }
}
