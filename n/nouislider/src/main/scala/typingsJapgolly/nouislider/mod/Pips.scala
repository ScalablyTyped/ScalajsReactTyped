package typingsJapgolly.nouislider.mod

import typingsJapgolly.nouislider.mod.PipsMode.Count
import typingsJapgolly.nouislider.mod.PipsMode.Positions
import typingsJapgolly.nouislider.mod.PipsMode.Steps
import typingsJapgolly.nouislider.mod.PipsMode.Values
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.nouislider.mod.PositionsPips
  - typingsJapgolly.nouislider.mod.ValuesPips
  - typingsJapgolly.nouislider.mod.CountPips
  - typingsJapgolly.nouislider.mod.StepsPips
  - typingsJapgolly.nouislider.mod.RangePips
*/
trait Pips extends StObject
object Pips {
  
  inline def CountPips(mode: Count, values: Double): typingsJapgolly.nouislider.mod.CountPips = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.nouislider.mod.CountPips]
  }
  
  inline def PositionsPips(mode: Positions, values: js.Array[Double]): typingsJapgolly.nouislider.mod.PositionsPips = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.nouislider.mod.PositionsPips]
  }
  
  inline def RangePips(mode: typingsJapgolly.nouislider.mod.PipsMode.Range): typingsJapgolly.nouislider.mod.RangePips = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.nouislider.mod.RangePips]
  }
  
  inline def StepsPips(mode: Steps): typingsJapgolly.nouislider.mod.StepsPips = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.nouislider.mod.StepsPips]
  }
  
  inline def ValuesPips(mode: Values, values: js.Array[Double]): typingsJapgolly.nouislider.mod.ValuesPips = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.nouislider.mod.ValuesPips]
  }
}
