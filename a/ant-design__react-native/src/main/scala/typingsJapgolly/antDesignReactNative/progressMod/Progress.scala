package typingsJapgolly.antDesignReactNative.progressMod

import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactNative.mod.LayoutChangeEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Progress
  extends Component[ProgressProps, js.Any, js.Any] {
  @JSName("componentDidMount")
  def componentDidMount_MProgress(): Unit = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MProgress(nextProps: ProgressProps): Unit = js.native
  def getWidth(): Double = js.native
  def getWidth(percent: Double): Double = js.native
  def normalPercent(): js.Any = js.native
  def normalPercent(percent: Double): js.Any = js.native
  def onLayout(e: LayoutChangeEvent): Unit = js.native
}

