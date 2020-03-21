package typingsJapgolly.officeUiFabricReact

import typingsJapgolly.officeUiFabricReact.scrollablePaneTypesMod.IScrollablePaneContext
import typingsJapgolly.officeUiFabricReact.stickyTypesMod.IStickyProps
import typingsJapgolly.react.mod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/Sticky", JSImport.Namespace)
@js.native
object stickyMod extends js.Object {
  @js.native
  class Sticky protected ()
    extends typingsJapgolly.officeUiFabricReact.stickyStickyMod.Sticky {
    def this(props: IStickyProps) = this()
  }
  
  /* static members */
  @js.native
  object Sticky extends js.Object {
    var contextType: Context[IScrollablePaneContext] = js.native
    var defaultProps: IStickyProps = js.native
  }
  
  @js.native
  object StickyPositionType extends js.Object {
    /* 0 */ val Both: typingsJapgolly.officeUiFabricReact.stickyTypesMod.StickyPositionType.Both with Double = js.native
    /* 2 */ val Footer: typingsJapgolly.officeUiFabricReact.stickyTypesMod.StickyPositionType.Footer with Double = js.native
    /* 1 */ val Header: typingsJapgolly.officeUiFabricReact.stickyTypesMod.StickyPositionType.Header with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.officeUiFabricReact.stickyTypesMod.StickyPositionType with Double
      ] = js.native
  }
  
}

