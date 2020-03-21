package typingsJapgolly.plotlyJs.mod

import typingsJapgolly.plotlyJs.PartialConfig
import typingsJapgolly.plotlyJs.PartialLayout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plotly.js", "react")
@js.native
object react extends js.Object {
  def apply(root: Root, data: js.Array[Data]): js.Promise[PlotlyHTMLElement] = js.native
  def apply(root: Root, data: js.Array[Data], layout: PartialLayout): js.Promise[PlotlyHTMLElement] = js.native
  def apply(root: Root, data: js.Array[Data], layout: PartialLayout, config: PartialConfig): js.Promise[PlotlyHTMLElement] = js.native
}

