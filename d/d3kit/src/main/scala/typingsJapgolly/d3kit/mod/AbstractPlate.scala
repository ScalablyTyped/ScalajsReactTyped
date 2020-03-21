package typingsJapgolly.d3kit.mod

import org.scalajs.dom.raw.Element
import typingsJapgolly.d3Selection.mod.BaseType
import typingsJapgolly.d3Selection.mod.Selection_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3kit", "AbstractPlate")
@js.native
class AbstractPlate protected () extends Base {
  def this(selector: String) = this()
  def this(selector: Element) = this()
  def this(selector: String, options: ChartOptions) = this()
  def this(selector: Element, options: ChartOptions) = this()
  def getNode(): Element = js.native
  def getSelection(): Selection_[BaseType, _, BaseType, _] = js.native
}

/* static members */
@JSImport("d3kit", "AbstractPlate")
@js.native
object AbstractPlate extends js.Object {
  def getDefaultOptions(): ChartOptions = js.native
  def getDefaultOptions(options: ChartOptions): ChartOptions = js.native
}

