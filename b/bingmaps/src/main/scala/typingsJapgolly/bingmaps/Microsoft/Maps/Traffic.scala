package typingsJapgolly.bingmaps.Microsoft.Maps

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Adds a traffic incident and flow data to the map.
  * @requires The Microsoft.Maps.Traffic module.
  */
object Traffic {
  
  trait ITrafficOptions extends StObject {
    
    /** Displays the traffic flow layer. */
    var flowVisible: js.UndefOr[Boolean] = js.undefined
    
    /** Displays all traffic incidents. */
    var incidentsVisible: js.UndefOr[Boolean] = js.undefined
    
    /** Displays the traffic legend. */
    var legendVisible: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Sets the opacity of the traffic flow tile layer. Must be a number between 0 and 1. The default is 1 unless the map
      * mode is set to lite, in which case the default is set to 0.7.
      */
    var opacity: js.UndefOr[Double] = js.undefined
  }
  object ITrafficOptions {
    
    inline def apply(): ITrafficOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITrafficOptions]
    }
    
    extension [Self <: ITrafficOptions](x: Self) {
      
      inline def setFlowVisible(value: Boolean): Self = StObject.set(x, "flowVisible", value.asInstanceOf[js.Any])
      
      inline def setFlowVisibleUndefined: Self = StObject.set(x, "flowVisible", js.undefined)
      
      inline def setIncidentsVisible(value: Boolean): Self = StObject.set(x, "incidentsVisible", value.asInstanceOf[js.Any])
      
      inline def setIncidentsVisibleUndefined: Self = StObject.set(x, "incidentsVisible", js.undefined)
      
      inline def setLegendVisible(value: Boolean): Self = StObject.set(x, "legendVisible", value.asInstanceOf[js.Any])
      
      inline def setLegendVisibleUndefined: Self = StObject.set(x, "legendVisible", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    }
  }
  
  trait TrafficManager extends StObject {
    
    /** Hides all traffic data. */
    def hide(): Unit
    
    /** Hides the traffic flow layer. */
    def hideFlow(): Unit
    
    /** Hides all traffic incidents. */
    def hideIncidents(): Unit
    
    /** Hides the traffic legend. */
    def hideLegend(): Unit
    
    /**
      * Sets the options for the traffic manager.
      * @param options The options for the traffic manager.
      */
    def setOptions(options: ITrafficOptions): Unit
    
    /** Displays all traffic data. */
    def show(): Unit
    
    /** Displays the traffic flow layer. */
    def showFlow(): Unit
    
    /** Displays all traffic incidents. */
    def showIncidents(): Unit
    
    /** Displays the traffic legend. */
    def showLegend(): Unit
  }
  object TrafficManager {
    
    inline def apply(
      hide: Callback,
      hideFlow: Callback,
      hideIncidents: Callback,
      hideLegend: Callback,
      setOptions: ITrafficOptions => Callback,
      show: Callback,
      showFlow: Callback,
      showIncidents: Callback,
      showLegend: Callback
    ): TrafficManager = {
      val __obj = js.Dynamic.literal(hide = hide.toJsFn, hideFlow = hideFlow.toJsFn, hideIncidents = hideIncidents.toJsFn, hideLegend = hideLegend.toJsFn, setOptions = js.Any.fromFunction1((t0: ITrafficOptions) => setOptions(t0).runNow()), show = show.toJsFn, showFlow = showFlow.toJsFn, showIncidents = showIncidents.toJsFn, showLegend = showLegend.toJsFn)
      __obj.asInstanceOf[TrafficManager]
    }
    
    extension [Self <: TrafficManager](x: Self) {
      
      inline def setHide(value: Callback): Self = StObject.set(x, "hide", value.toJsFn)
      
      inline def setHideFlow(value: Callback): Self = StObject.set(x, "hideFlow", value.toJsFn)
      
      inline def setHideIncidents(value: Callback): Self = StObject.set(x, "hideIncidents", value.toJsFn)
      
      inline def setHideLegend(value: Callback): Self = StObject.set(x, "hideLegend", value.toJsFn)
      
      inline def setSetOptions(value: ITrafficOptions => Callback): Self = StObject.set(x, "setOptions", js.Any.fromFunction1((t0: ITrafficOptions) => value(t0).runNow()))
      
      inline def setShow(value: Callback): Self = StObject.set(x, "show", value.toJsFn)
      
      inline def setShowFlow(value: Callback): Self = StObject.set(x, "showFlow", value.toJsFn)
      
      inline def setShowIncidents(value: Callback): Self = StObject.set(x, "showIncidents", value.toJsFn)
      
      inline def setShowLegend(value: Callback): Self = StObject.set(x, "showLegend", value.toJsFn)
    }
  }
}
