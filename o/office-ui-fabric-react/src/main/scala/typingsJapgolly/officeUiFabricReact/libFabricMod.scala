package typingsJapgolly.officeUiFabricReact

import typingsJapgolly.officeUiFabricReact.fabricTypesMod.IFabricProps
import typingsJapgolly.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/Fabric", JSImport.Namespace)
@js.native
object libFabricMod extends js.Object {
  @js.native
  class FabricBase protected ()
    extends typingsJapgolly.officeUiFabricReact.fabricMod.FabricBase {
    def this(props: IFabricProps) = this()
  }
  
  val Fabric: FunctionComponent[IFabricProps] = js.native
}

