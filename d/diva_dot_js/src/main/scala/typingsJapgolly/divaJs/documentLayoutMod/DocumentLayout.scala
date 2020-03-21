package typingsJapgolly.divaJs.documentLayoutMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.divaJs.AnonX
import typingsJapgolly.divaJs.interfacesMod.Dimensions
import typingsJapgolly.divaJs.interfacesMod.Offset
import typingsJapgolly.divaJs.interfacesMod.PageGroup
import typingsJapgolly.divaJs.interfacesMod.PageInfo
import typingsJapgolly.divaJs.interfacesMod.Region
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentLayout extends js.Object {
  var dimensions: Dimensions
  var pageGroups: js.Array[PageGroup]
  def getPageDimensions(pageIndex: Double): Dimensions
  def getPageInfo(pageIndex: Double): PageInfo | Null
  def getPageOffset(pageIndex: Double, options: js.Object): Offset
  def getPageRegion(pageIndex: Double, options: js.Object): Offset
  def getPageToViewportCenterOffset(pageIndex: Double, viewport: Region): AnonX
}

object DocumentLayout {
  @scala.inline
  def apply(
    dimensions: Dimensions,
    getPageDimensions: Double => CallbackTo[Dimensions],
    getPageInfo: Double => CallbackTo[PageInfo | Null],
    getPageOffset: (Double, js.Object) => CallbackTo[Offset],
    getPageRegion: (Double, js.Object) => CallbackTo[Offset],
    getPageToViewportCenterOffset: (Double, Region) => CallbackTo[AnonX],
    pageGroups: js.Array[PageGroup]
  ): DocumentLayout = {
    val __obj = js.Dynamic.literal(dimensions = dimensions.asInstanceOf[js.Any], pageGroups = pageGroups.asInstanceOf[js.Any])
    __obj.updateDynamic("getPageDimensions")(js.Any.fromFunction1((t0: scala.Double) => getPageDimensions(t0).runNow()))
    __obj.updateDynamic("getPageInfo")(js.Any.fromFunction1((t0: scala.Double) => getPageInfo(t0).runNow()))
    __obj.updateDynamic("getPageOffset")(js.Any.fromFunction2((t0: scala.Double, t1: js.Object) => getPageOffset(t0, t1).runNow()))
    __obj.updateDynamic("getPageRegion")(js.Any.fromFunction2((t0: scala.Double, t1: js.Object) => getPageRegion(t0, t1).runNow()))
    __obj.updateDynamic("getPageToViewportCenterOffset")(js.Any.fromFunction2((t0: scala.Double, t1: typingsJapgolly.divaJs.interfacesMod.Region) => getPageToViewportCenterOffset(t0, t1).runNow()))
    __obj.asInstanceOf[DocumentLayout]
  }
}

