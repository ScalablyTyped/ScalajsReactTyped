package typingsJapgolly.activexPowerpoint.PowerPoint

import typingsJapgolly.activexOffice.Office.MsoEditingType
import typingsJapgolly.activexOffice.Office.MsoSegmentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.FreeformBuilder")
@js.native
class FreeformBuilder protected () extends js.Object {
  val Application: js.Any = js.native
  val Creator: Double = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.FreeformBuilder_typekey")
  var PowerPointDotFreeformBuilder_typekey: FreeformBuilder = js.native
  /**
    * @param number [X2=0]
    * @param number [Y2=0]
    * @param number [X3=0]
    * @param number [Y3=0]
    */
  def AddNodes(SegmentType: MsoSegmentType, EditingType: MsoEditingType, X1: Double, Y1: Double): Unit = js.native
  def AddNodes(SegmentType: MsoSegmentType, EditingType: MsoEditingType, X1: Double, Y1: Double, X2: Double): Unit = js.native
  def AddNodes(
    SegmentType: MsoSegmentType,
    EditingType: MsoEditingType,
    X1: Double,
    Y1: Double,
    X2: Double,
    Y2: Double
  ): Unit = js.native
  def AddNodes(
    SegmentType: MsoSegmentType,
    EditingType: MsoEditingType,
    X1: Double,
    Y1: Double,
    X2: Double,
    Y2: Double,
    X3: Double
  ): Unit = js.native
  def AddNodes(
    SegmentType: MsoSegmentType,
    EditingType: MsoEditingType,
    X1: Double,
    Y1: Double,
    X2: Double,
    Y2: Double,
    X3: Double,
    Y3: Double
  ): Unit = js.native
  def ConvertToShape(): Shape = js.native
}

