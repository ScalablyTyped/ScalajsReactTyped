package typingsJapgolly.zrender

import org.scalablytyped.runtime.Instantiable6
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("zrender")
@js.native
object zrender extends js.Object {
  /**
    * x, y, x2, y2 are all percent from 0 to 1
    */
  @js.native
  trait LinearGradient
    extends Instantiable6[
          js.UndefOr[/* x */ X], 
          js.UndefOr[/* y */ Y], 
          js.UndefOr[/* x2 */ X2], 
          js.UndefOr[/* y2 */ Y2], 
          js.UndefOr[/* colorStops */ ColorStops], 
          js.UndefOr[/* globalCoord */ GlobalCoords], 
          AnonAddColorStop
        ]
  
  type ColorStops = js.Array[AnonColor]
  type GlobalCoords = Boolean
  type X = Double
  type X2 = Double
  type Y = Double
  type Y2 = Double
}

