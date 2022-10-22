package typingsJapgolly.dynmap.mod

import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import typingsJapgolly.dynmap.anon.Handlerdeltanumber
import typingsJapgolly.dynmap.anon.HandlerpanKeysRecordnumbe
import typingsJapgolly.dynmap.anon.ZoomHandlerzoomInButtonHT
import typingsJapgolly.dynmap.mod.global.Array
import typingsJapgolly.leaflet.mod.Handler
import typingsJapgolly.leaflet.mod.Layer
import typingsJapgolly.leaflet.mod.Map_
import typingsJapgolly.leaflet.mod.Point_
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlobalMap extends Map_ {
  
  var _container: HTMLDivElement = js.native
  
  var _controlContainer: HTMLElement = js.native
  
  var _controlCorners: Record[String, js.UndefOr[HTMLElement]] = js.native
  
  var _handlers: Array[Handler] = js.native
  
  var _initialTopLeftPoint: Point_ = js.native
  
  var _layers: Record[String, Layer] = js.native
  
  var _layersMaxZoom: Double = js.native
  
  var _layersMinZoom: Double = js.native
  
  var _loaded: Boolean = js.native
  
  var _mapPane: HTMLElement = js.native
  
  var _panes: Record[String, js.UndefOr[HTMLElement]] = js.native
  
  var _size: Point_ = js.native
  
  var _sizeChanged: Boolean = js.native
  
  var _tileLayersNum: Double = js.native
  
  var _tileLayersToLoad: Double = js.native
  
  var _tilePane: HTMLElement = js.native
  
  var _zoom: Double = js.native
  
  var _zoomAnimated: Boolean = js.native
  
  var _zoomBoundLayers: Record[String, js.UndefOr[Layer]] = js.native
  
  @JSName("keyboard")
  var keyboard_GlobalMap: HandlerpanKeysRecordnumbe = js.native
  
  @JSName("scrollWheelZoom")
  var scrollWheelZoom_GlobalMap: Handlerdeltanumber = js.native
  
  @JSName("zoomControl")
  var zoomControl_GlobalMap: ZoomHandlerzoomInButtonHT = js.native
}
