package typingsJapgolly.officeUiFabricReact.mod

import typingsJapgolly.officeUiFabricReact.scrollablePaneTypesMod.IScrollablePaneContext
import typingsJapgolly.officeUiFabricReact.stickyTypesMod.IStickyProps
import typingsJapgolly.react.mod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react", "Sticky")
@js.native
class Sticky protected ()
  extends typingsJapgolly.officeUiFabricReact.libStickyMod.Sticky {
  def this(props: IStickyProps) = this()
}

/* static members */
@JSImport("office-ui-fabric-react", "Sticky")
@js.native
object Sticky extends js.Object {
  var contextType: Context[IScrollablePaneContext] = js.native
  var defaultProps: IStickyProps = js.native
}

