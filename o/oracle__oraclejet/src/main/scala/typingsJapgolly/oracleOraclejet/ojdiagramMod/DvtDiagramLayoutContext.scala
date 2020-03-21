package typingsJapgolly.oracleOraclejet.ojdiagramMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.oracleOraclejet.AnonH
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DvtDiagramLayoutContext extends js.Object {
  def getCommonContainer(nodeId1: js.Any, nodeId2: js.Any): js.Any
  def getComponentSize(): AnonH
  def getCurrentViewport(): AnonH
  def getEventData(): js.Object
  def getLinkById(id: js.Any): DvtDiagramLayoutContextLink
  def getLinkByIndex(index: Double): DvtDiagramLayoutContextLink
  def getLinkCount(): Double
  def getNodeById(id: js.Any): DvtDiagramLayoutContextNode
  def getNodeByIndex(index: Double): DvtDiagramLayoutContextNode
  def getNodeCount(): Double
  def getViewport(): AnonH
  def isLocaleR2L(): Boolean
  def setViewport(viewport: AnonH): Unit
}

object DvtDiagramLayoutContext {
  @scala.inline
  def apply(
    getCommonContainer: (js.Any, js.Any) => CallbackTo[js.Any],
    getComponentSize: CallbackTo[AnonH],
    getCurrentViewport: CallbackTo[AnonH],
    getEventData: CallbackTo[js.Object],
    getLinkById: js.Any => CallbackTo[DvtDiagramLayoutContextLink],
    getLinkByIndex: Double => CallbackTo[DvtDiagramLayoutContextLink],
    getLinkCount: CallbackTo[Double],
    getNodeById: js.Any => CallbackTo[DvtDiagramLayoutContextNode],
    getNodeByIndex: Double => CallbackTo[DvtDiagramLayoutContextNode],
    getNodeCount: CallbackTo[Double],
    getViewport: CallbackTo[AnonH],
    isLocaleR2L: CallbackTo[Boolean],
    setViewport: AnonH => Callback
  ): DvtDiagramLayoutContext = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getCommonContainer")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => getCommonContainer(t0, t1).runNow()))
    __obj.updateDynamic("getComponentSize")(getComponentSize.toJsFn)
    __obj.updateDynamic("getCurrentViewport")(getCurrentViewport.toJsFn)
    __obj.updateDynamic("getEventData")(getEventData.toJsFn)
    __obj.updateDynamic("getLinkById")(js.Any.fromFunction1((t0: js.Any) => getLinkById(t0).runNow()))
    __obj.updateDynamic("getLinkByIndex")(js.Any.fromFunction1((t0: scala.Double) => getLinkByIndex(t0).runNow()))
    __obj.updateDynamic("getLinkCount")(getLinkCount.toJsFn)
    __obj.updateDynamic("getNodeById")(js.Any.fromFunction1((t0: js.Any) => getNodeById(t0).runNow()))
    __obj.updateDynamic("getNodeByIndex")(js.Any.fromFunction1((t0: scala.Double) => getNodeByIndex(t0).runNow()))
    __obj.updateDynamic("getNodeCount")(getNodeCount.toJsFn)
    __obj.updateDynamic("getViewport")(getViewport.toJsFn)
    __obj.updateDynamic("isLocaleR2L")(isLocaleR2L.toJsFn)
    __obj.updateDynamic("setViewport")(js.Any.fromFunction1((t0: typingsJapgolly.oracleOraclejet.AnonH) => setViewport(t0).runNow()))
    __obj.asInstanceOf[DvtDiagramLayoutContext]
  }
}

