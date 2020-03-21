package typingsJapgolly.officeUiFabricReact

import typingsJapgolly.officeUiFabricReact.overlayTypesMod.IOverlayProps
import typingsJapgolly.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/Overlay", JSImport.Namespace)
@js.native
object libOverlayMod extends js.Object {
  @js.native
  class OverlayBase protected ()
    extends typingsJapgolly.officeUiFabricReact.overlayMod.OverlayBase {
    def this(props: IOverlayProps) = this()
  }
  
  val Overlay: FunctionComponent[IOverlayProps] = js.native
}

