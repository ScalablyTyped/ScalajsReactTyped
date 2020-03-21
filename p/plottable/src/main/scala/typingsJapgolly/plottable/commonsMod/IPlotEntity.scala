package typingsJapgolly.plottable.commonsMod

import typingsJapgolly.plottable.datasetMod.Dataset
import typingsJapgolly.plottable.interfacesMod.IEntity
import typingsJapgolly.plottable.interfacesMod.IEntityBounds
import typingsJapgolly.plottable.interfacesMod.Point
import typingsJapgolly.plottable.interfacesMod.SimpleSelection
import typingsJapgolly.plottable.plotMod.Plot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPlotEntity extends IEntity[Plot] {
  var dataset: Dataset
  var datasetIndex: Double
  var index: Double
}

object IPlotEntity {
  @scala.inline
  def apply(
    bounds: IEntityBounds,
    component: Plot,
    dataset: Dataset,
    datasetIndex: Double,
    datum: js.Any,
    index: Double,
    position: Point,
    selection: SimpleSelection[_]
  ): IPlotEntity = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], dataset = dataset.asInstanceOf[js.Any], datasetIndex = datasetIndex.asInstanceOf[js.Any], datum = datum.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IPlotEntity]
  }
}

