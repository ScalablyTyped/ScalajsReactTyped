package typingsJapgolly.reactMapGl.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationControlProps
  extends StObject
     with BaseControlProps {
  
  var className: js.UndefOr[String] = js.undefined
  
  var compassLabel: js.UndefOr[String] = js.undefined
  
  var onViewStateChange: js.UndefOr[ViewStateChangeHandler] = js.undefined
  
  var onViewportChange: js.UndefOr[ViewportChangeHandler] = js.undefined
  
  var showCompass: js.UndefOr[Boolean] = js.undefined
  
  var showZoom: js.UndefOr[Boolean] = js.undefined
  
  var zoomInLabel: js.UndefOr[String] = js.undefined
  
  var zoomOutLabel: js.UndefOr[String] = js.undefined
}
object NavigationControlProps {
  
  inline def apply(): NavigationControlProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationControlProps]
  }
  
  extension [Self <: NavigationControlProps](x: Self) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setCompassLabel(value: String): Self = StObject.set(x, "compassLabel", value.asInstanceOf[js.Any])
    
    inline def setCompassLabelUndefined: Self = StObject.set(x, "compassLabel", js.undefined)
    
    inline def setOnViewStateChange(value: /* info */ ViewStateChangeInfo => Callback): Self = StObject.set(x, "onViewStateChange", js.Any.fromFunction1((t0: /* info */ ViewStateChangeInfo) => value(t0).runNow()))
    
    inline def setOnViewStateChangeUndefined: Self = StObject.set(x, "onViewStateChange", js.undefined)
    
    inline def setOnViewportChange(value: /* viewState */ ViewportProps => Callback): Self = StObject.set(x, "onViewportChange", js.Any.fromFunction1((t0: /* viewState */ ViewportProps) => value(t0).runNow()))
    
    inline def setOnViewportChangeUndefined: Self = StObject.set(x, "onViewportChange", js.undefined)
    
    inline def setShowCompass(value: Boolean): Self = StObject.set(x, "showCompass", value.asInstanceOf[js.Any])
    
    inline def setShowCompassUndefined: Self = StObject.set(x, "showCompass", js.undefined)
    
    inline def setShowZoom(value: Boolean): Self = StObject.set(x, "showZoom", value.asInstanceOf[js.Any])
    
    inline def setShowZoomUndefined: Self = StObject.set(x, "showZoom", js.undefined)
    
    inline def setZoomInLabel(value: String): Self = StObject.set(x, "zoomInLabel", value.asInstanceOf[js.Any])
    
    inline def setZoomInLabelUndefined: Self = StObject.set(x, "zoomInLabel", js.undefined)
    
    inline def setZoomOutLabel(value: String): Self = StObject.set(x, "zoomOutLabel", value.asInstanceOf[js.Any])
    
    inline def setZoomOutLabelUndefined: Self = StObject.set(x, "zoomOutLabel", js.undefined)
  }
}
