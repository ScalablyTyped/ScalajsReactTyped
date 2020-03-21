package typingsJapgolly.highchartsReactOfficial.highchartsReactMod

import japgolly.scalajs.react.raw.React.RefHandle
import org.scalajs.dom.raw.HTMLDivElement
import typingsJapgolly.highcharts.mod.Chart_
import typingsJapgolly.highchartsReactOfficial.highchartsReactMod.HighchartsReact.Props
import typingsJapgolly.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Highcharts component for React
  */
@js.native
trait HighchartsReact_
  extends Component[Props, js.Object, js.Any] {
  /* *
    *
    *  Properties
    *
    * */
  /**
    * Chart reference
    */
  val chart: Chart_ = js.native
  /**
    * React reference
    */
  val container: RefHandle[HTMLDivElement] = js.native
  /* *
    *
    *  Functions
    *
    * */
  /**
    * Creates the chart.
    */
  def _createChart(props: Props): Unit = js.native
  /**
    * Creates the chart.
    */
  @JSName("componentDidMount")
  def componentDidMount_MHighchartsReact_(): Unit = js.native
  /**
    * Updates (or recreates with immutable on) the chart. Can be turned off in the optional React props.
    */
  @JSName("componentDidUpdate")
  def componentDidUpdate_MHighchartsReact_(): Unit = js.native
  /**
    * Destroys the chart right before the component gets destroyed.
    */
  @JSName("componentWillUnmount")
  def componentWillUnmount_MHighchartsReact_(): Unit = js.native
}

