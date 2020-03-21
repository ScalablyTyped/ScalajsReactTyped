package typingsJapgolly.devextreme.mod.DevExpress.viz

import typingsJapgolly.devextreme.mod.DevExpress.data.DataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxFunnel extends BaseWidget {
  /** Cancels the selection of all funnel items. */
  def clearSelection(): Unit = js.native
  /** Provides access to all funnel items. */
  def getAllItems(): js.Array[dxFunnelItem] = js.native
  /** Gets the DataSource instance. */
  def getDataSource(): DataSource = js.native
  /** Hides all widget tooltips. */
  def hideTooltip(): Unit = js.native
}

