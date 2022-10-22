package typingsJapgolly.reactLeaflet

import japgolly.scalajs.react.Callback
import typingsJapgolly.leaflet.mod.Layer
import typingsJapgolly.leaflet.mod.Path
import typingsJapgolly.leaflet.mod.Popup_
import typingsJapgolly.leaflet.mod.Tooltip_
import typingsJapgolly.reactLeaflet.mod.AddLayerHandler
import typingsJapgolly.reactLeaflet.mod.RemoveLayerHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AddBaseLayer extends StObject {
    
    var addBaseLayer: AddLayerHandler
    
    var addOverlay: AddLayerHandler
    
    var removeLayer: RemoveLayerHandler
    
    var removeLayerControl: RemoveLayerHandler
  }
  object AddBaseLayer {
    
    inline def apply(
      addBaseLayer: (/* layer */ Layer, /* name */ String, /* checked */ js.UndefOr[Boolean]) => Callback,
      addOverlay: (/* layer */ Layer, /* name */ String, /* checked */ js.UndefOr[Boolean]) => Callback,
      removeLayer: /* layer */ Layer => Callback,
      removeLayerControl: /* layer */ Layer => Callback
    ): AddBaseLayer = {
      val __obj = js.Dynamic.literal(addBaseLayer = js.Any.fromFunction3((t0: /* layer */ Layer, t1: /* name */ String, t2: /* checked */ js.UndefOr[Boolean]) => (addBaseLayer(t0, t1, t2)).runNow()), addOverlay = js.Any.fromFunction3((t0: /* layer */ Layer, t1: /* name */ String, t2: /* checked */ js.UndefOr[Boolean]) => (addOverlay(t0, t1, t2)).runNow()), removeLayer = js.Any.fromFunction1((t0: /* layer */ Layer) => removeLayer(t0).runNow()), removeLayerControl = js.Any.fromFunction1((t0: /* layer */ Layer) => removeLayerControl(t0).runNow()))
      __obj.asInstanceOf[AddBaseLayer]
    }
    
    extension [Self <: AddBaseLayer](x: Self) {
      
      inline def setAddBaseLayer(value: (/* layer */ Layer, /* name */ String, /* checked */ js.UndefOr[Boolean]) => Callback): Self = StObject.set(x, "addBaseLayer", js.Any.fromFunction3((t0: /* layer */ Layer, t1: /* name */ String, t2: /* checked */ js.UndefOr[Boolean]) => (value(t0, t1, t2)).runNow()))
      
      inline def setAddOverlay(value: (/* layer */ Layer, /* name */ String, /* checked */ js.UndefOr[Boolean]) => Callback): Self = StObject.set(x, "addOverlay", js.Any.fromFunction3((t0: /* layer */ Layer, t1: /* name */ String, t2: /* checked */ js.UndefOr[Boolean]) => (value(t0, t1, t2)).runNow()))
      
      inline def setRemoveLayer(value: /* layer */ Layer => Callback): Self = StObject.set(x, "removeLayer", js.Any.fromFunction1((t0: /* layer */ Layer) => value(t0).runNow()))
      
      inline def setRemoveLayerControl(value: /* layer */ Layer => Callback): Self = StObject.set(x, "removeLayerControl", js.Any.fromFunction1((t0: /* layer */ Layer) => value(t0).runNow()))
    }
  }
  
  trait ClassName extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[String] = js.undefined
  }
  object ClassName {
    
    inline def apply(): ClassName = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClassName]
    }
    
    extension [Self <: ClassName](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait Popup[E /* <: Popup_ */] extends StObject {
    
    var popup: E
  }
  object Popup {
    
    inline def apply[E /* <: Popup_ */](popup: E): Popup[E] = {
      val __obj = js.Dynamic.literal(popup = popup.asInstanceOf[js.Any])
      __obj.asInstanceOf[Popup[E]]
    }
    
    extension [Self <: Popup[?], E /* <: Popup_ */](x: Self & Popup[E]) {
      
      inline def setPopup(value: E): Self = StObject.set(x, "popup", value.asInstanceOf[js.Any])
    }
  }
  
  trait PopupContainer[E /* <: Path */] extends StObject {
    
    var popupContainer: E
  }
  object PopupContainer {
    
    inline def apply[E /* <: Path */](popupContainer: E): PopupContainer[E] = {
      val __obj = js.Dynamic.literal(popupContainer = popupContainer.asInstanceOf[js.Any])
      __obj.asInstanceOf[PopupContainer[E]]
    }
    
    extension [Self <: PopupContainer[?], E /* <: Path */](x: Self & PopupContainer[E]) {
      
      inline def setPopupContainer(value: E): Self = StObject.set(x, "popupContainer", value.asInstanceOf[js.Any])
    }
  }
  
  trait Tooltip[E /* <: Tooltip_ */] extends StObject {
    
    var tooltip: E
  }
  object Tooltip {
    
    inline def apply[E /* <: Tooltip_ */](tooltip: E): Tooltip[E] = {
      val __obj = js.Dynamic.literal(tooltip = tooltip.asInstanceOf[js.Any])
      __obj.asInstanceOf[Tooltip[E]]
    }
    
    extension [Self <: Tooltip[?], E /* <: Tooltip_ */](x: Self & Tooltip[E]) {
      
      inline def setTooltip(value: E): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    }
  }
}
