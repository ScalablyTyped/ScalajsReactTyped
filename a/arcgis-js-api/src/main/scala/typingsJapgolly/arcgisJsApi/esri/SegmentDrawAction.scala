package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.IHandle
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`cursor-update`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`draw-complete`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`vertex-add`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.click
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.freehand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SegmentDrawAction
  extends StObject
     with DrawAction {
  
  /**
    * Completes drawing the polygon geometry and fires the [draw-complete](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-SegmentDrawAction.html#event-draw-complete) event.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-SegmentDrawAction.html#complete)
    */
  def complete(): scala.Unit = js.native
  
  /**
    * The drawing mode.
    *
    * @default freehand
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-SegmentDrawAction.html#mode)
    */
  var mode: freehand | click = js.native
  
  @JSName("on")
  def on_cursorupdate(name: `cursor-update`, eventHandler: SegmentDrawActionCursorUpdateEventHandler): IHandle = js.native
  @JSName("on")
  def on_drawcomplete(name: `draw-complete`, eventHandler: SegmentDrawActionDrawCompleteEventHandler): IHandle = js.native
  @JSName("on")
  def on_vertexadd(name: `vertex-add`, eventHandler: SegmentDrawActionVertexAddEventHandler): IHandle = js.native
}
