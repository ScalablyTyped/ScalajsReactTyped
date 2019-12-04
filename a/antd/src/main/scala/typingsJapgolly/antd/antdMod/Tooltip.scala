package typingsJapgolly.antd.antdMod

import typingsJapgolly.antd.Anon_ArrowPointAtCenter
import typingsJapgolly.antd.Anon_Visible
import typingsJapgolly.antd.libTooltipMod.TooltipProps
import typingsJapgolly.antd.libTooltipMod.default
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
  var defaultProps: Anon_ArrowPointAtCenter = js.native
  def getDerivedStateFromProps(nextProps: TooltipProps): Anon_Visible | Null = js.native
}

