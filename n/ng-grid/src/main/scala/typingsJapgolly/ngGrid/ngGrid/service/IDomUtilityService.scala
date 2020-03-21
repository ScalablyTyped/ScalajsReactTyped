package typingsJapgolly.ngGrid.ngGrid.service

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.ngGrid.ngGrid.IColumn
import typingsJapgolly.ngGrid.ngGrid.IDimension
import typingsJapgolly.ngGrid.ngGrid.IGridInstance
import typingsJapgolly.ngGrid.ngGrid.IGridScope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDomUtilityService extends js.Object {
  var LetterW: Double
  var ScrollH: Double
  var ScrollW: Double
  var eventStorage: js.Any
  var immediate: Double
  var numberOfGrids: Double
  def AssignGridContainers(
    $scope: IGridScope,
    rootel: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ js.Any,
    grid: IGridInstance
  ): Unit
  def BuildStyles($scope: IGridScope, grid: IGridInstance, digest: Boolean): Unit
  def RebuildGrid($scope: IGridScope, grid: IGridInstance): Unit
  def UpdateGridLayout($scope: IGridScope, grid: IGridInstance): Unit
  def digest($scope: IGridScope): Unit
  def getRealWidth(obj: IDimension): Double
  def setColLeft(col: IColumn, colLeft: Double, grid: IGridInstance): Unit
  def setStyleText(grid: IGridInstance, css: String): Unit
}

object IDomUtilityService {
  @scala.inline
  def apply(
    AssignGridContainers: (IGridScope, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ js.Any, IGridInstance) => Callback,
    BuildStyles: (IGridScope, IGridInstance, Boolean) => Callback,
    LetterW: Double,
    RebuildGrid: (IGridScope, IGridInstance) => Callback,
    ScrollH: Double,
    ScrollW: Double,
    UpdateGridLayout: (IGridScope, IGridInstance) => Callback,
    digest: IGridScope => Callback,
    eventStorage: js.Any,
    getRealWidth: IDimension => CallbackTo[Double],
    immediate: Double,
    numberOfGrids: Double,
    setColLeft: (IColumn, Double, IGridInstance) => Callback,
    setStyleText: (IGridInstance, String) => Callback
  ): IDomUtilityService = {
    val __obj = js.Dynamic.literal(LetterW = LetterW.asInstanceOf[js.Any], ScrollH = ScrollH.asInstanceOf[js.Any], ScrollW = ScrollW.asInstanceOf[js.Any], eventStorage = eventStorage.asInstanceOf[js.Any], immediate = immediate.asInstanceOf[js.Any], numberOfGrids = numberOfGrids.asInstanceOf[js.Any])
    __obj.updateDynamic("AssignGridContainers")(js.Any.fromFunction3((t0: typingsJapgolly.ngGrid.ngGrid.IGridScope, t1: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ js.Any, t2: typingsJapgolly.ngGrid.ngGrid.IGridInstance) => AssignGridContainers(t0, t1, t2).runNow()))
    __obj.updateDynamic("BuildStyles")(js.Any.fromFunction3((t0: typingsJapgolly.ngGrid.ngGrid.IGridScope, t1: typingsJapgolly.ngGrid.ngGrid.IGridInstance, t2: scala.Boolean) => BuildStyles(t0, t1, t2).runNow()))
    __obj.updateDynamic("RebuildGrid")(js.Any.fromFunction2((t0: typingsJapgolly.ngGrid.ngGrid.IGridScope, t1: typingsJapgolly.ngGrid.ngGrid.IGridInstance) => RebuildGrid(t0, t1).runNow()))
    __obj.updateDynamic("UpdateGridLayout")(js.Any.fromFunction2((t0: typingsJapgolly.ngGrid.ngGrid.IGridScope, t1: typingsJapgolly.ngGrid.ngGrid.IGridInstance) => UpdateGridLayout(t0, t1).runNow()))
    __obj.updateDynamic("digest")(js.Any.fromFunction1((t0: typingsJapgolly.ngGrid.ngGrid.IGridScope) => digest(t0).runNow()))
    __obj.updateDynamic("getRealWidth")(js.Any.fromFunction1((t0: typingsJapgolly.ngGrid.ngGrid.IDimension) => getRealWidth(t0).runNow()))
    __obj.updateDynamic("setColLeft")(js.Any.fromFunction3((t0: typingsJapgolly.ngGrid.ngGrid.IColumn, t1: scala.Double, t2: typingsJapgolly.ngGrid.ngGrid.IGridInstance) => setColLeft(t0, t1, t2).runNow()))
    __obj.updateDynamic("setStyleText")(js.Any.fromFunction2((t0: typingsJapgolly.ngGrid.ngGrid.IGridInstance, t1: java.lang.String) => setStyleText(t0, t1).runNow()))
    __obj.asInstanceOf[IDomUtilityService]
  }
}

