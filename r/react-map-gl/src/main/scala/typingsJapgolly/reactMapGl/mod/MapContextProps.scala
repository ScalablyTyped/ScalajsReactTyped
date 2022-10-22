package typingsJapgolly.reactMapGl.mod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLElement
import typingsJapgolly.mapboxGl.mod.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapContextProps extends StObject {
  
  var eventManager: js.UndefOr[EventManager] = js.undefined
  
  var isDragging: Boolean
  
  var map: js.UndefOr[Map] = js.undefined
  
  var mapContainer: HTMLElement | Null
  
  var onViewStateChange: js.UndefOr[ContextViewStateChangeHandler] = js.undefined
  
  var onViewportChange: js.UndefOr[ContextViewportChangeHandler] = js.undefined
  
  var viewport: js.UndefOr[typingsJapgolly.viewportMercatorProject.mod.default] = js.undefined
}
object MapContextProps {
  
  inline def apply(isDragging: Boolean): MapContextProps = {
    val __obj = js.Dynamic.literal(isDragging = isDragging.asInstanceOf[js.Any], mapContainer = null)
    __obj.asInstanceOf[MapContextProps]
  }
  
  extension [Self <: MapContextProps](x: Self) {
    
    inline def setEventManager(value: EventManager): Self = StObject.set(x, "eventManager", value.asInstanceOf[js.Any])
    
    inline def setEventManagerUndefined: Self = StObject.set(x, "eventManager", js.undefined)
    
    inline def setIsDragging(value: Boolean): Self = StObject.set(x, "isDragging", value.asInstanceOf[js.Any])
    
    inline def setMap(value: Map): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setMapContainer(value: HTMLElement): Self = StObject.set(x, "mapContainer", value.asInstanceOf[js.Any])
    
    inline def setMapContainerNull: Self = StObject.set(x, "mapContainer", null)
    
    inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    inline def setOnViewStateChange(value: /* info */ ContextViewStateChangeInfo => Callback): Self = StObject.set(x, "onViewStateChange", js.Any.fromFunction1((t0: /* info */ ContextViewStateChangeInfo) => value(t0).runNow()))
    
    inline def setOnViewStateChangeUndefined: Self = StObject.set(x, "onViewStateChange", js.undefined)
    
    inline def setOnViewportChange(
      value: (/* viewState */ ViewportProps, /* interactionState */ ExtraState, /* oldViewState */ ViewportProps) => Callback
    ): Self = StObject.set(x, "onViewportChange", js.Any.fromFunction3((t0: /* viewState */ ViewportProps, t1: /* interactionState */ ExtraState, t2: /* oldViewState */ ViewportProps) => (value(t0, t1, t2)).runNow()))
    
    inline def setOnViewportChangeUndefined: Self = StObject.set(x, "onViewportChange", js.undefined)
    
    inline def setViewport(value: typingsJapgolly.viewportMercatorProject.mod.default): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
    
    inline def setViewportUndefined: Self = StObject.set(x, "viewport", js.undefined)
  }
}
