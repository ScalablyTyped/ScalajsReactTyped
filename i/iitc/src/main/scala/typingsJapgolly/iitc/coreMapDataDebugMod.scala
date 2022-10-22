package typingsJapgolly.iitc

import typingsJapgolly.leaflet.mod.LatLngBounds_
import typingsJapgolly.leaflet.mod.LayerGroup_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreMapDataDebugMod {
  
  @JSImport("iitc/core/map_data_debug", "RenderDebugTiles")
  @js.native
  open class RenderDebugTiles () extends StObject {
    
    var CLEAR_CHECK_TIME: Double = js.native
    
    // = 0.1;
    var FADE_TIME: Double = js.native
    
    def create(id: String, bounds: LatLngBounds_): Unit = js.native
    
    //  = 1.0;
    /* private */ var debugTileLayer: LayerGroup_[Any] = js.native
    
    def reset(): Unit = js.native
    
    def runClearPass(): Unit = js.native
    
    def setColour(id: String, borercol: String, fillcol: String): Unit = js.native
    
    def setState(id: String, state: DebugTileState): Unit = js.native
    
    /**
      * @param waitTime in msec
      */
    def startTimer(waitTime: Double): Unit = js.native
    
    /* private */ var timer: js.UndefOr[Double] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.iitc.iitcStrings.ok
    - typingsJapgolly.iitc.iitcStrings.error
    - typingsJapgolly.iitc.iitcStrings.`cache-fresh`
    - typingsJapgolly.iitc.iitcStrings.`cache-stale`
    - typingsJapgolly.iitc.iitcStrings.requested
    - typingsJapgolly.iitc.iitcStrings.retrying
    - typingsJapgolly.iitc.iitcStrings.`request-fail`
    - typingsJapgolly.iitc.iitcStrings.`tile-fail`
    - typingsJapgolly.iitc.iitcStrings.`tile-timeout`
    - typingsJapgolly.iitc.iitcStrings.`render-queue`
  */
  trait DebugTileState extends StObject
  object DebugTileState {
    
    inline def `cache-fresh`: typingsJapgolly.iitc.iitcStrings.`cache-fresh` = "cache-fresh".asInstanceOf[typingsJapgolly.iitc.iitcStrings.`cache-fresh`]
    
    inline def `cache-stale`: typingsJapgolly.iitc.iitcStrings.`cache-stale` = "cache-stale".asInstanceOf[typingsJapgolly.iitc.iitcStrings.`cache-stale`]
    
    inline def error: typingsJapgolly.iitc.iitcStrings.error = "error".asInstanceOf[typingsJapgolly.iitc.iitcStrings.error]
    
    inline def ok: typingsJapgolly.iitc.iitcStrings.ok = "ok".asInstanceOf[typingsJapgolly.iitc.iitcStrings.ok]
    
    inline def `render-queue`: typingsJapgolly.iitc.iitcStrings.`render-queue` = "render-queue".asInstanceOf[typingsJapgolly.iitc.iitcStrings.`render-queue`]
    
    inline def `request-fail`: typingsJapgolly.iitc.iitcStrings.`request-fail` = "request-fail".asInstanceOf[typingsJapgolly.iitc.iitcStrings.`request-fail`]
    
    inline def requested: typingsJapgolly.iitc.iitcStrings.requested = "requested".asInstanceOf[typingsJapgolly.iitc.iitcStrings.requested]
    
    inline def retrying: typingsJapgolly.iitc.iitcStrings.retrying = "retrying".asInstanceOf[typingsJapgolly.iitc.iitcStrings.retrying]
    
    inline def `tile-fail`: typingsJapgolly.iitc.iitcStrings.`tile-fail` = "tile-fail".asInstanceOf[typingsJapgolly.iitc.iitcStrings.`tile-fail`]
    
    inline def `tile-timeout`: typingsJapgolly.iitc.iitcStrings.`tile-timeout` = "tile-timeout".asInstanceOf[typingsJapgolly.iitc.iitcStrings.`tile-timeout`]
  }
}
