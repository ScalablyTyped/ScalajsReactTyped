package typingsJapgolly.officeUiFabricReact

import typingsJapgolly.officeUiFabricReact.pivotItemTypesMod.IPivotItemProps
import typingsJapgolly.officeUiFabricReact.pivotTypesMod.IPivotProps
import typingsJapgolly.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/Pivot", JSImport.Namespace)
@js.native
object pivotMod extends js.Object {
  @js.native
  class PivotBase protected ()
    extends typingsJapgolly.officeUiFabricReact.pivotBaseMod.PivotBase {
    def this(props: IPivotProps) = this()
  }
  
  @js.native
  class PivotItem protected ()
    extends typingsJapgolly.officeUiFabricReact.pivotItemMod.PivotItem {
    def this(props: IPivotItemProps) = this()
  }
  
  val Pivot: FunctionComponent[IPivotProps] = js.native
  @js.native
  object PivotLinkFormat extends js.Object {
    /* 0 */ val links: typingsJapgolly.officeUiFabricReact.pivotTypesMod.PivotLinkFormat.links with Double = js.native
    /* 1 */ val tabs: typingsJapgolly.officeUiFabricReact.pivotTypesMod.PivotLinkFormat.tabs with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.officeUiFabricReact.pivotTypesMod.PivotLinkFormat with Double] = js.native
  }
  
  @js.native
  object PivotLinkSize extends js.Object {
    /* 1 */ val large: typingsJapgolly.officeUiFabricReact.pivotTypesMod.PivotLinkSize.large with Double = js.native
    /* 0 */ val normal: typingsJapgolly.officeUiFabricReact.pivotTypesMod.PivotLinkSize.normal with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.officeUiFabricReact.pivotTypesMod.PivotLinkSize with Double] = js.native
  }
  
}

