package typingsJapgolly.officeUiFabricReact

import typingsJapgolly.officeUiFabricReact.libComponentsLayerLayerDottypesMod.ILayerProps
import typingsJapgolly.officeUiFabricReact.libComponentsLayerLayerDottypesMod.ILayerStyleProps
import typingsJapgolly.officeUiFabricReact.libComponentsLayerLayerDottypesMod.ILayerStyles
import typingsJapgolly.officeUiFabricReact.libComponentsLayerLayerHostDottypesMod.ILayerHost
import typingsJapgolly.officeUiFabricReact.libComponentsLayerLayerHostDottypesMod.ILayerHostProps
import typingsJapgolly.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsLayerMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Layer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/Layer", "Layer")
  @js.native
  val Layer: FunctionComponent[ILayerProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/Layer", "LayerBase")
  @js.native
  open class LayerBase protected ()
    extends typingsJapgolly.officeUiFabricReact.libComponentsLayerLayerDotbaseMod.LayerBase {
    def this(props: ILayerProps) = this()
  }
  /* static members */
  object LayerBase {
    
    @JSImport("office-ui-fabric-react/lib/components/Layer", "LayerBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/Layer", "LayerBase.defaultProps")
    @js.native
    def defaultProps: ILayerProps = js.native
    inline def defaultProps_=(x: ILayerProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("office-ui-fabric-react/lib/components/Layer", "LayerHost")
  @js.native
  open class LayerHost protected ()
    extends typingsJapgolly.officeUiFabricReact.libComponentsLayerLayerHostMod.LayerHost {
    def this(props: ILayerHostProps) = this()
  }
  
  inline def getLayerCount(hostId: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getLayerCount")(hostId.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getLayerHost(hostId: String): js.UndefOr[ILayerHost] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLayerHost")(hostId.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[ILayerHost]]
  
  inline def getLayerHostSelector(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLayerHostSelector")().asInstanceOf[js.UndefOr[String]]
  
  inline def getLayerStyles(props: ILayerStyleProps): ILayerStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getLayerStyles")(props.asInstanceOf[js.Any]).asInstanceOf[ILayerStyles]
  
  inline def notifyHostChanged(id: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("notifyHostChanged")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def registerLayer(hostId: String, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerLayer")(hostId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def registerLayerHost(hostId: String, layerHost: ILayerHost): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerLayerHost")(hostId.asInstanceOf[js.Any], layerHost.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setLayerHostSelector(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLayerHostSelector")().asInstanceOf[Unit]
  inline def setLayerHostSelector(selector: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLayerHostSelector")(selector.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def unregisterLayer(hostId: String, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unregisterLayer")(hostId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def unregisterLayerHost(hostId: String, layerHost: ILayerHost): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unregisterLayerHost")(hostId.asInstanceOf[js.Any], layerHost.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
