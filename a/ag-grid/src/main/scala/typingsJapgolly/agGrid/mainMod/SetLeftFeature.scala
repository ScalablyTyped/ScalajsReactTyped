package typingsJapgolly.agGrid.mainMod

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.agGrid.beansMod.Beans
import typingsJapgolly.agGrid.columnGroupChildMod.ColumnGroupChild
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/main", "SetLeftFeature")
@js.native
class SetLeftFeature protected ()
  extends typingsJapgolly.agGrid.setLeftFeatureMod.SetLeftFeature {
  def this(columnOrGroup: ColumnGroupChild, eCell: HTMLElement, beans: Beans) = this()
  def this(
    columnOrGroup: ColumnGroupChild,
    eCell: HTMLElement,
    beans: Beans,
    colsSpanning: js.Array[typingsJapgolly.agGrid.columnMod.Column]
  ) = this()
}

