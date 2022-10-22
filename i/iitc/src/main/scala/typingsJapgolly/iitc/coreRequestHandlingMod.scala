package typingsJapgolly.iitc

import typingsJapgolly.jquery.JQuery.jqXHR
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreRequestHandlingMod {
  
  object global {
    
    @JSGlobal("Requests")
    @js.native
    open class Requests_ () extends StObject {
      
      def abort(): Unit = js.native
      
      def add(ajax: jqXHR[Any]): Unit = js.native
      
      /**
        * add method here to be notified of auto-refreshes
        */
      def addRefreshFunction(fct: js.Function0[Unit]): Unit = js.native
      
      def isLastRequest(ajax: jqXHR[Any]): Boolean = js.native
      
      def remove(ajax: jqXHR[Any]): Unit = js.native
      
      /**
        * sets the timer for the next auto refresh. Ensures only one timeout
        * is queued. May be given 'override' in milliseconds if time should
        * not be guessed automatically. Especially useful if a little delay
        * is required, for example when zooming.
        */
      def startRefreshTimeout(`override`: Double): Unit = js.native
    }
    
    @JSGlobal("activeRequests")
    @js.native
    def activeRequests: js.Array[jqXHR[Any]] = js.native
    inline def activeRequests_=(x: js.Array[jqXHR[Any]]): Unit = js.Dynamic.global.updateDynamic("activeRequests")(x.asInstanceOf[js.Any])
    
    /** failed data requests calls */
    @JSGlobal("failedRequestCount")
    @js.native
    def failedRequestCount: Double = js.native
    inline def failedRequestCount_=(x: Double): Unit = js.Dynamic.global.updateDynamic("failedRequestCount")(x.asInstanceOf[js.Any])
    
    @JSGlobal("requests")
    @js.native
    def requests: Requests_ = js.native
    inline def requests_=(x: Requests_): Unit = js.Dynamic.global.updateDynamic("requests")(x.asInstanceOf[js.Any])
    
    @JSGlobal("statusCachedMapTiles")
    @js.native
    def statusCachedMapTiles: Double = js.native
    inline def statusCachedMapTiles_=(x: Double): Unit = js.Dynamic.global.updateDynamic("statusCachedMapTiles")(x.asInstanceOf[js.Any])
    
    @JSGlobal("statusErrorMapTiles")
    @js.native
    def statusErrorMapTiles: Double = js.native
    inline def statusErrorMapTiles_=(x: Double): Unit = js.Dynamic.global.updateDynamic("statusErrorMapTiles")(x.asInstanceOf[js.Any])
    
    @JSGlobal("statusStaleMapTiles")
    @js.native
    def statusStaleMapTiles: Double = js.native
    inline def statusStaleMapTiles_=(x: Double): Unit = js.Dynamic.global.updateDynamic("statusStaleMapTiles")(x.asInstanceOf[js.Any])
    
    @JSGlobal("statusSuccessMapTiles")
    @js.native
    def statusSuccessMapTiles: Double = js.native
    inline def statusSuccessMapTiles_=(x: Double): Unit = js.Dynamic.global.updateDynamic("statusSuccessMapTiles")(x.asInstanceOf[js.Any])
    
    @JSGlobal("statusTotalMapTiles")
    @js.native
    def statusTotalMapTiles: Double = js.native
    inline def statusTotalMapTiles_=(x: Double): Unit = js.Dynamic.global.updateDynamic("statusTotalMapTiles")(x.asInstanceOf[js.Any])
  }
}
