package typingsJapgolly.officeUiFabricReact

import typingsJapgolly.officeUiFabricReact.scrollablePaneTypesMod.IScrollablePaneContext
import typingsJapgolly.officeUiFabricReact.scrollablePaneTypesMod.IScrollablePaneProps
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/ScrollablePane", JSImport.Namespace)
@js.native
object libScrollablePaneMod extends js.Object {
  @js.native
  class ScrollablePaneBase protected ()
    extends typingsJapgolly.officeUiFabricReact.scrollablePaneMod.ScrollablePaneBase {
    def this(props: IScrollablePaneProps) = this()
  }
  
  val ScrollablePane: FunctionComponent[IScrollablePaneProps] = js.native
  val ScrollablePaneContext: Context[IScrollablePaneContext] = js.native
  @js.native
  object ScrollbarVisibility extends js.Object {
    var always: typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.always = js.native
    var auto: typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.auto = js.native
  }
  
}

