package typingsJapgolly.rcSlider

import japgolly.scalajs.react.facade.React.RefHandle
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.rcSlider.libHooksUseOffsetMod.OffsetValues
import typingsJapgolly.rcSlider.libInterfaceMod.Direction
import typingsJapgolly.rcSlider.libInterfaceMod.OnStartMove
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHooksUseDragMod {
  
  @JSImport("rc-slider/lib/hooks/useDrag", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    containerRef: RefHandle[HTMLDivElement],
    direction: Direction,
    rawValues: js.Array[Double],
    min: Double,
    max: Double,
    formatValue: js.Function1[/* value */ Double, Double],
    triggerChange: js.Function1[/* values */ js.Array[Double], Unit],
    finishChange: js.Function0[Unit],
    offsetValues: OffsetValues
  ): js.Tuple4[Double, Double, js.Array[Double], OnStartMove] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(containerRef.asInstanceOf[js.Any], direction.asInstanceOf[js.Any], rawValues.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], formatValue.asInstanceOf[js.Any], triggerChange.asInstanceOf[js.Any], finishChange.asInstanceOf[js.Any], offsetValues.asInstanceOf[js.Any])).asInstanceOf[js.Tuple4[Double, Double, js.Array[Double], OnStartMove]]
}
