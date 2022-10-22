package typingsJapgolly.imageQ

import typingsJapgolly.imageQ.distTypesSrcDistanceDistanceCalculatorMod.AbstractDistanceCalculator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSrcDistanceManhattanMod {
  
  /* note: abstract class */ @JSImport("image-q/dist/types/src/distance/manhattan", "AbstractManhattan")
  @js.native
  open class AbstractManhattan () extends AbstractDistanceCalculator {
    
    /* protected */ var _kA: Double = js.native
    
    /* protected */ var _kB: Double = js.native
    
    /* protected */ var _kG: Double = js.native
    
    /* protected */ var _kR: Double = js.native
  }
  
  @JSImport("image-q/dist/types/src/distance/manhattan", "Manhattan")
  @js.native
  open class Manhattan () extends AbstractManhattan
  
  @JSImport("image-q/dist/types/src/distance/manhattan", "ManhattanBT709")
  @js.native
  open class ManhattanBT709 () extends AbstractManhattan
  
  @JSImport("image-q/dist/types/src/distance/manhattan", "ManhattanNommyde")
  @js.native
  open class ManhattanNommyde () extends AbstractManhattan
}
