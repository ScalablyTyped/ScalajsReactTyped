package typingsJapgolly.qlik.mod

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.jquery.JQuery_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtensionContext extends js.Object {
  @JSName("$element")
  var $element: JQuery_[HTMLElement] = js.native
  @JSName("$scope")
  var $scope: js.Any = js.native
  var _inAnalysisState: Boolean = js.native
  var _inEditState: Boolean = js.native
  var _interactionState: Double = js.native
  var _on: Boolean = js.native
  var backendApi: BackendApi = js.native
  // TODO: options: ExtensionOptions;
  @JSName("paint")
  var paint_Original: Paint = js.native
  var selectionsEnabled: Boolean = js.native
  // TODO: options: ExtensionOptions;
  def paint(
    $element: js.UndefOr[JQuery_[HTMLElement]],
    layout: js.UndefOr[Layout],
    qDimensionInfo: js.UndefOr[NxDimensionInfo],
    qMeasureInfo: js.UndefOr[NxDimensionInfo],
    qMatrix: js.UndefOr[js.Array[NxCellRows]],
    dimensions: js.UndefOr[js.Array[NxCell]],
    measures: js.UndefOr[js.Array[NxCell]],
    qSize: js.UndefOr[Size],
    qId: js.UndefOr[String],
    qSelectionInfo: js.UndefOr[Selectionobject]
  ): Unit = js.native
  def selectValues(dimNo: Double, values: js.Array[Double], toggleMode: Boolean): Unit = js.native
  def toggleLasso(): Unit = js.native
}

