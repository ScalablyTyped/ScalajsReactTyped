package typingsJapgolly.d3pie.d3pie

import org.scalablytyped.runtime.TopLevel
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("d3pie")
@js.native
class ^ protected () extends ID3PieChart {
  def this(id: String, options: ID3PieOptions) = this()
  def this(id: HTMLElement, options: ID3PieOptions) = this()
  /* CompleteClass */
  override def closeSegment(index: Unit): Unit = js.native
  /* CompleteClass */
  override def destroy(): Unit = js.native
  /* CompleteClass */
  override def getOpenSegment(): js.Any = js.native
  /* CompleteClass */
  override def openSegment(index: Double): Unit = js.native
  /* CompleteClass */
  override def redraw(): Unit = js.native
  /* CompleteClass */
  override def updateProp(propKey: String, value: js.Any): Unit = js.native
}

@JSGlobal("d3pie")
@js.native
object ^ extends TopLevel[ID3PieClass]

