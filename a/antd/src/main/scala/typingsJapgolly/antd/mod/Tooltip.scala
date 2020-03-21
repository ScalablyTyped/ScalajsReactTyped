package typingsJapgolly.antd.mod

import typingsJapgolly.antd.AnonArrowPointAtCenter
import typingsJapgolly.antd.AnonVisible
import typingsJapgolly.antd.tooltipMod.TooltipProps
import typingsJapgolly.antd.tooltipMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd", "Tooltip")
@js.native
class Tooltip protected () extends default {
  def this(props: TooltipProps) = this()
}

/* static members */
@JSImport("antd", "Tooltip")
@js.native
object Tooltip extends js.Object {
  var defaultProps: AnonArrowPointAtCenter = js.native
  def getDerivedStateFromProps(nextProps: TooltipProps): AnonVisible | Null = js.native
}

