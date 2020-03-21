package typingsJapgolly.ejWebAll.ej.datavisualization.HeatMap

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LegendOrientation extends js.Object

@JSGlobal("ej.datavisualization.HeatMap.LegendOrientation")
@js.native
object LegendOrientation extends js.Object {
  //Scales the graphic content non-uniformly to the width and height of the diagram area
  @js.native
  sealed trait Horizontal extends LegendOrientation
  
  //Used to align the image at the top left of diagram area
  @js.native
  sealed trait Vertical extends LegendOrientation
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LegendOrientation with Double] = js.native
  /* 0 */ @js.native
  object Horizontal
    extends TopLevel[
          typingsJapgolly.ejWebAll.ej.datavisualization.HeatMap.LegendOrientation.Horizontal with Double
        ]
  
  /* 1 */ @js.native
  object Vertical
    extends TopLevel[
          typingsJapgolly.ejWebAll.ej.datavisualization.HeatMap.LegendOrientation.Vertical with Double
        ]
  
}

