package typingsJapgolly.chartJs.mod

import typingsJapgolly.chartJs.typesBasicMod.AnyObject
import typingsJapgolly.chartJs.typesElementMod.Element
import typingsJapgolly.chartJs.typesGeometricMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Interaction {
  
  @JSImport("chart.js", "Interaction")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Helper function to select candidate elements for interaction
    */
  inline def evaluateInteractionItems(
    chart: Chart[ChartType, DefaultDataPoint[ChartType], Any],
    axis: InteractionAxis,
    position: Point,
    handler: js.Function3[
      /* element */ (Element[AnyObject, AnyObject]) & VisualElement, 
      /* datasetIndex */ Double, 
      /* index */ Double, 
      Unit
    ]
  ): js.Array[InteractionItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("evaluateInteractionItems")(chart.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], position.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Array[InteractionItem]]
  inline def evaluateInteractionItems(
    chart: Chart[ChartType, DefaultDataPoint[ChartType], Any],
    axis: InteractionAxis,
    position: Point,
    handler: js.Function3[
      /* element */ (Element[AnyObject, AnyObject]) & VisualElement, 
      /* datasetIndex */ Double, 
      /* index */ Double, 
      Unit
    ],
    intersect: Boolean
  ): js.Array[InteractionItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("evaluateInteractionItems")(chart.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], position.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], intersect.asInstanceOf[js.Any])).asInstanceOf[js.Array[InteractionItem]]
  
  @JSImport("chart.js", "Interaction.modes")
  @js.native
  def modes: InteractionModeMap = js.native
  inline def modes_=(x: InteractionModeMap): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("modes")(x.asInstanceOf[js.Any])
}
