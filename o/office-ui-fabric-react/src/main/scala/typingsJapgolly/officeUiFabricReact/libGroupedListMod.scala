package typingsJapgolly.officeUiFabricReact

import typingsJapgolly.officeUiFabricReact.groupFooterTypesMod.IGroupFooterProps
import typingsJapgolly.officeUiFabricReact.groupHeaderTypesMod.IGroupHeaderProps
import typingsJapgolly.officeUiFabricReact.groupShowAllTypesMod.IGroupShowAllProps
import typingsJapgolly.officeUiFabricReact.groupSpacerTypesMod.IGroupSpacerProps
import typingsJapgolly.officeUiFabricReact.groupedListTypesMod.IGroupedListProps
import typingsJapgolly.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/GroupedList", JSImport.Namespace)
@js.native
object libGroupedListMod extends js.Object {
  @js.native
  class GroupedListBase protected ()
    extends typingsJapgolly.officeUiFabricReact.groupedListMod.GroupedListBase {
    def this(props: IGroupedListProps) = this()
  }
  
  val GroupFooter: FunctionComponent[IGroupFooterProps] = js.native
  val GroupHeader: FunctionComponent[IGroupHeaderProps] = js.native
  val GroupShowAll: FunctionComponent[IGroupShowAllProps] = js.native
  val GroupSpacer: FunctionComponent[IGroupSpacerProps] = js.native
  val GroupedList: FunctionComponent[IGroupedListProps] = js.native
  @js.native
  object CollapseAllVisibility extends js.Object {
    /* 0 */ val hidden: typingsJapgolly.officeUiFabricReact.groupedListTypesMod.CollapseAllVisibility.hidden with Double = js.native
    /* 1 */ val visible: typingsJapgolly.officeUiFabricReact.groupedListTypesMod.CollapseAllVisibility.visible with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.officeUiFabricReact.groupedListTypesMod.CollapseAllVisibility with Double
      ] = js.native
  }
  
  /* static members */
  @js.native
  object GroupedListBase extends js.Object {
    var defaultProps: AnonCompact = js.native
  }
  
}

