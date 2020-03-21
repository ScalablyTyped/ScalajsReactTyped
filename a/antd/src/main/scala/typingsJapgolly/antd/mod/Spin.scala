package typingsJapgolly.antd.mod

import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.antd.AnonSpinning
import typingsJapgolly.antd.spinMod.SpinProps
import typingsJapgolly.antd.spinMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd", "Spin")
@js.native
class Spin protected () extends default {
  def this(props: SpinProps) = this()
}

/* static members */
@JSImport("antd", "Spin")
@js.native
object Spin extends js.Object {
  var defaultProps: AnonSpinning = js.native
  def setDefaultIndicator(indicator: Node): Unit = js.native
}

