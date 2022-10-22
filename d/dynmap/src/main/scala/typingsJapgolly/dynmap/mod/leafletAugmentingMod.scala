package typingsJapgolly.dynmap.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.dynmap.dynmapBooleans.`false`
import typingsJapgolly.dynmap.dynmapBooleans.`true`
import typingsJapgolly.dynmap.dynmapStrings._empty
import typingsJapgolly.leaflet.mod.DivIconOptions
import typingsJapgolly.leaflet.mod.DivIcon_
import typingsJapgolly.leaflet.mod.LatLngExpression
import typingsJapgolly.leaflet.mod.MarkerOptions
import typingsJapgolly.leaflet.mod.Marker_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object leafletAugmentingMod {
  
  @JSImport("leaflet", "CustomIcon")
  @js.native
  open class CustomIcon () extends DivIcon_ {
    def this(options: CustomIconOptions) = this()
    
    def initialize(options: DivIconOptions): js.Object = js.native
    
    @JSName("options")
    var options_CustomIcon: CustomIconOptions = js.native
  }
  
  @JSImport("leaflet", "CustomMarker")
  @js.native
  open class CustomMarker protected () extends Marker_[CustomMarkerOptions] {
    def this(latlng: LatLngExpression) = this()
    def this(latlng: LatLngExpression, options: CustomMarkerOptions) = this()
    
    @JSName("options")
    var options_CustomMarker: CustomMarkerOptions = js.native
  }
  
  trait CustomIconOptions
    extends StObject
       with DivIconOptions {
    
    @JSName("className")
    var className_CustomIconOptions: _empty
    
    def elementCreator(): HTMLDivElement
    
    def shadowCreator(): Unit
  }
  object CustomIconOptions {
    
    inline def apply(elementCreator: CallbackTo[HTMLDivElement], shadowCreator: Callback): CustomIconOptions = {
      val __obj = js.Dynamic.literal(className = "", elementCreator = elementCreator.toJsFn, shadowCreator = shadowCreator.toJsFn)
      __obj.asInstanceOf[CustomIconOptions]
    }
    
    extension [Self <: CustomIconOptions](x: Self) {
      
      inline def setClassName(value: _empty): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setElementCreator(value: CallbackTo[HTMLDivElement]): Self = StObject.set(x, "elementCreator", value.toJsFn)
      
      inline def setShadowCreator(value: Callback): Self = StObject.set(x, "shadowCreator", value.toJsFn)
    }
  }
  
  trait CustomMarkerOptions
    extends StObject
       with MarkerOptions {
    
    var clickable: `true`
    
    @JSName("draggable")
    var draggable_CustomMarkerOptions: `false`
    
    var elementCreator: Unit
    
    @JSName("icon")
    var icon_CustomMarkerOptions: CustomIcon
    
    var shadowCreator: Unit
  }
  object CustomMarkerOptions {
    
    inline def apply(elementCreator: Unit, icon: CustomIcon, shadowCreator: Unit): CustomMarkerOptions = {
      val __obj = js.Dynamic.literal(clickable = true, draggable = false, elementCreator = elementCreator.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], shadowCreator = shadowCreator.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomMarkerOptions]
    }
    
    extension [Self <: CustomMarkerOptions](x: Self) {
      
      inline def setClickable(value: `true`): Self = StObject.set(x, "clickable", value.asInstanceOf[js.Any])
      
      inline def setDraggable(value: `false`): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      inline def setElementCreator(value: Unit): Self = StObject.set(x, "elementCreator", value.asInstanceOf[js.Any])
      
      inline def setIcon(value: CustomIcon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setShadowCreator(value: Unit): Self = StObject.set(x, "shadowCreator", value.asInstanceOf[js.Any])
    }
  }
}
