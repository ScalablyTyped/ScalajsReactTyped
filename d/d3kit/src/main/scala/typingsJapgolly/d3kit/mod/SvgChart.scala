package typingsJapgolly.d3kit.mod

import org.scalajs.dom.raw.Element
import typingsJapgolly.d3Selection.mod.BaseType
import typingsJapgolly.d3Selection.mod.Selection_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3kit", "SvgChart")
@js.native
class SvgChart protected () extends AbstractChart {
  def this(selector: String) = this()
  def this(selector: Element) = this()
  def this(selector: String, options: ChartOptions) = this()
  def this(selector: Element, options: ChartOptions) = this()
  var layers: LayerOrganizer = js.native
  var plate: SvgPlate = js.native
  var rootG: Selection_[BaseType, _, BaseType, _] = js.native
  var svg: Selection_[BaseType, _, BaseType, _] = js.native
}

