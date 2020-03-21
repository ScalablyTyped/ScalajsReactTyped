package typingsJapgolly.officeUiFabricReact

import typingsJapgolly.officeUiFabricReact.layerTypesMod.ILayerProps
import typingsJapgolly.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/Layer", JSImport.Namespace)
@js.native
object libLayerMod extends js.Object {
  @js.native
  class LayerBase protected ()
    extends typingsJapgolly.officeUiFabricReact.layerMod.LayerBase {
    def this(props: ILayerProps) = this()
  }
  
  @js.native
  class LayerHost ()
    extends typingsJapgolly.officeUiFabricReact.layerHostMod.LayerHost
  
  val Layer: FunctionComponent[ILayerProps] = js.native
  /* static members */
  @js.native
  object LayerBase extends js.Object {
    var defaultProps: ILayerProps = js.native
  }
  
}

