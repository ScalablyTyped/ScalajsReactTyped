package typingsJapgolly.reactLeaflet.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.leaflet.mod.Control_.Layers
import typingsJapgolly.leaflet.mod.Layer
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactLeaflet.anon.AddBaseLayer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-leaflet", "LayersControl")
@js.native
open class LayersControl[P /* <: LayersControlProps */, E /* <: Layers */] protected () extends MapControl[P, E] {
  def this(props: P) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: P, context: Any) = this()
  
  def addBaseLayer(layer: Layer, name: String, checked: Boolean): Unit = js.native
  
  def addOverlay(layer: Layer, name: String, checked: Boolean): Unit = js.native
  
  var controlProps: AddBaseLayer = js.native
  
  def removeLayer(layer: Layer): Unit = js.native
  
  def removeLayerControl(layer: Layer): Unit = js.native
}
object LayersControl {
  
  @JSImport("react-leaflet", "LayersControl.BaseLayer")
  @js.native
  open class BaseLayer[P /* <: ControlledLayerProps */] protected () extends ControlledLayer[P] {
    def this(props: ControlledLayerProps) = this()
    
    def addLayer(layer: Layer): Unit = js.native
  }
  
  @JSImport("react-leaflet", "LayersControl.ControlledLayer")
  @js.native
  open class ControlledLayer[P /* <: ControlledLayerProps */] protected ()
    extends Component[P, js.Object, Any] {
    def this(props: P) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: P, context: Any) = this()
    
    var contextValue: LeafletContext = js.native
    
    var layer: js.UndefOr[Layer | Null] = js.native
    
    def removeLayer(layer: Layer): Unit = js.native
  }
  
  @JSImport("react-leaflet", "LayersControl.Overlay")
  @js.native
  open class Overlay[P /* <: ControlledLayerProps */] protected () extends ControlledLayer[P] {
    def this(props: ControlledLayerProps) = this()
    
    def addLayer(layer: Layer): Unit = js.native
  }
  
  trait ControlledLayerProps extends StObject {
    
    var addBaseLayer: js.UndefOr[AddLayerHandler] = js.undefined
    
    var addOverlay: js.UndefOr[AddLayerHandler] = js.undefined
    
    var checked: js.UndefOr[Boolean] = js.undefined
    
    var children: Children
    
    var leaflet: js.UndefOr[LeafletContext] = js.undefined
    
    var name: String
    
    var removeLayer: js.UndefOr[RemoveLayerHandler] = js.undefined
    
    var removeLayerControl: js.UndefOr[RemoveLayerHandler] = js.undefined
  }
  object ControlledLayerProps {
    
    inline def apply(name: String): ControlledLayerProps = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], children = null)
      __obj.asInstanceOf[ControlledLayerProps]
    }
    
    extension [Self <: ControlledLayerProps](x: Self) {
      
      inline def setAddBaseLayer(value: (/* layer */ Layer, /* name */ String, /* checked */ js.UndefOr[Boolean]) => Callback): Self = StObject.set(x, "addBaseLayer", js.Any.fromFunction3((t0: /* layer */ Layer, t1: /* name */ String, t2: /* checked */ js.UndefOr[Boolean]) => (value(t0, t1, t2)).runNow()))
      
      inline def setAddBaseLayerUndefined: Self = StObject.set(x, "addBaseLayer", js.undefined)
      
      inline def setAddOverlay(value: (/* layer */ Layer, /* name */ String, /* checked */ js.UndefOr[Boolean]) => Callback): Self = StObject.set(x, "addOverlay", js.Any.fromFunction3((t0: /* layer */ Layer, t1: /* name */ String, t2: /* checked */ js.UndefOr[Boolean]) => (value(t0, t1, t2)).runNow()))
      
      inline def setAddOverlayUndefined: Self = StObject.set(x, "addOverlay", js.undefined)
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      inline def setChildren(value: Children): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Element | Empty | JsNumber | Node | String)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setLeaflet(value: LeafletContext): Self = StObject.set(x, "leaflet", value.asInstanceOf[js.Any])
      
      inline def setLeafletUndefined: Self = StObject.set(x, "leaflet", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRemoveLayer(value: /* layer */ Layer => Callback): Self = StObject.set(x, "removeLayer", js.Any.fromFunction1((t0: /* layer */ Layer) => value(t0).runNow()))
      
      inline def setRemoveLayerControl(value: /* layer */ Layer => Callback): Self = StObject.set(x, "removeLayerControl", js.Any.fromFunction1((t0: /* layer */ Layer) => value(t0).runNow()))
      
      inline def setRemoveLayerControlUndefined: Self = StObject.set(x, "removeLayerControl", js.undefined)
      
      inline def setRemoveLayerUndefined: Self = StObject.set(x, "removeLayer", js.undefined)
    }
  }
}
