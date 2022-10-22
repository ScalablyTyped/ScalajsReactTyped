package typingsJapgolly.three

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcMathInterpolantMod {
  
  /* note: abstract class */ @JSImport("three/src/math/Interpolant", "Interpolant")
  @js.native
  open class Interpolant protected () extends StObject {
    def this(parameterPositions: Any, sampleValues: Any, sampleSize: Double) = this()
    def this(parameterPositions: Any, sampleValues: Any, sampleSize: Double, resultBuffer: Any) = this()
    
    def evaluate(time: Double): Any = js.native
    
    var parameterPositions: Any = js.native
    
    var resultBuffer: Any = js.native
    
    var sampleValues: Any = js.native
    
    var valueSize: Double = js.native
  }
}
