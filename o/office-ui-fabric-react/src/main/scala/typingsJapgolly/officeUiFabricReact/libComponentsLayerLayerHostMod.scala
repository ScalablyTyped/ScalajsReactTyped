package typingsJapgolly.officeUiFabricReact

import japgolly.scalajs.react.facade.React.RefHandle
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.officeUiFabricReact.libComponentsLayerLayerHostDottypesMod.ILayerHost
import typingsJapgolly.officeUiFabricReact.libComponentsLayerLayerHostDottypesMod.ILayerHostProps
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsLayerLayerHostMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Layer/LayerHost", "LayerHost")
  @js.native
  open class LayerHost protected ()
    extends Component[ILayerHostProps, js.Object, Any]
       with ILayerHost {
    def this(props: ILayerHostProps) = this()
    
    @JSName("componentDidMount")
    def componentDidMount_MLayerHost(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MLayerHost(): Unit = js.native
    
    /**
      * The hostId for this host, to be propagatd to layers using Customizer.
      */
    /* CompleteClass */
    var hostId: String = js.native
    
    /**
      * Notifies the layer host that layers may have been added or removed within its root element.
      */
    /* CompleteClass */
    override def notifyLayersChanged(): Unit = js.native
    
    /**
      * An element ref to the layer host's content root.
      * This is the element to which layers will be added.
      */
    /* CompleteClass */
    var rootRef: RefHandle[HTMLDivElement | Null] = js.native
    @JSName("rootRef")
    var rootRef_LayerHost: RefHandle[HTMLDivElement] = js.native
    
    @JSName("shouldComponentUpdate")
    def shouldComponentUpdate_MLayerHost(): Boolean = js.native
  }
}
