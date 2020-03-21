package typingsJapgolly.reactMapGl.mod

import typingsJapgolly.reactMapGl.PartialMapState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-map-gl", "MapController")
@js.native
class MapController () extends BaseMapController {
  /* CompleteClass */
  override var events: js.Array[String] = js.native
  def getMapState(overrides: PartialMapState): MapState = js.native
  /* CompleteClass */
  override def handleEvent(event: MapControlEvent): Unit = js.native
  def setOptions(options: MapControllerOptions): Unit = js.native
  def setState(newState: MapState): Unit = js.native
  def updateViewport(newMapState: MapState, extraProps: js.Any, extraState: ExtraState): Unit = js.native
}

