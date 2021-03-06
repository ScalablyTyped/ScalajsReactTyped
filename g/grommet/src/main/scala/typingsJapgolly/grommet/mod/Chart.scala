package typingsJapgolly.grommet.mod

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.grommet.chartMod.ChartProps
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.ComponentClass
import typingsJapgolly.react.mod.ComponentState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet", "Chart")
@js.native
class Chart protected ()
  extends Component[ChartProps, ComponentState, js.Any] {
  def this(props: ChartProps) = this()
  def this(props: ChartProps, context: js.Any) = this()
}

@JSImport("grommet", "Chart")
@js.native
object Chart extends TopLevel[ComponentClass[ChartProps, ComponentState]]

