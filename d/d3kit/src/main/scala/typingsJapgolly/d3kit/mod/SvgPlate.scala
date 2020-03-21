package typingsJapgolly.d3kit.mod

import typingsJapgolly.d3Selection.mod.BaseType
import typingsJapgolly.d3Selection.mod.Selection_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3kit", "SvgPlate")
@js.native
class SvgPlate () extends AbstractPlate {
  def this(options: ChartOptions) = this()
  var layers: LayerOrganizer = js.native
  var rootG: Selection_[BaseType, _, BaseType, _] = js.native
}

/* static members */
@JSImport("d3kit", "SvgPlate")
@js.native
object SvgPlate extends js.Object {
  def getDefaultOptions(): ChartOptions = js.native
  def getDefaultOptions(options: ChartOptions): ChartOptions = js.native
}

