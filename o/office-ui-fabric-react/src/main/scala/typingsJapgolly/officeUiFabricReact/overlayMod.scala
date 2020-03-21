package typingsJapgolly.officeUiFabricReact

import typingsJapgolly.officeUiFabricReact.overlayTypesMod.IOverlayProps
import typingsJapgolly.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/Overlay", JSImport.Namespace)
@js.native
object overlayMod extends js.Object {
  @js.native
  class OverlayBase protected ()
    extends typingsJapgolly.officeUiFabricReact.overlayBaseMod.OverlayBase {
    def this(props: IOverlayProps) = this()
  }
  
  val Overlay: FunctionComponent[IOverlayProps] = js.native
}

