package typingsJapgolly.plottable

import typingsJapgolly.plottable.commonsMod.IPlotEntity
import typingsJapgolly.plottable.groupMod.Group
import typingsJapgolly.plottable.interfacesMod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/components/plotGroup", JSImport.Namespace)
@js.native
object plotGroupMod extends js.Object {
  @js.native
  class PlotGroup () extends Group {
    def entityNearest(point: Point): IPlotEntity = js.native
  }
  
}

