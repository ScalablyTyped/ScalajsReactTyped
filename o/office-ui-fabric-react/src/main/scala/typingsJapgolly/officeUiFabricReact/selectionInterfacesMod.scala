package typingsJapgolly.officeUiFabricReact

import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.change
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/utilities/selection/interfaces", JSImport.Namespace)
@js.native
object selectionInterfacesMod extends js.Object {
  val SELECTION_CHANGE: change = js.native
  @js.native
  object SelectionDirection extends js.Object {
    /* 0 */ val horizontal: typingsJapgolly.uifabricUtilities.selectionTypesMod.SelectionDirection.horizontal with Double = js.native
    /* 1 */ val vertical: typingsJapgolly.uifabricUtilities.selectionTypesMod.SelectionDirection.vertical with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.uifabricUtilities.selectionTypesMod.SelectionDirection with Double
      ] = js.native
  }
  
  @js.native
  object SelectionMode extends js.Object {
    /* 2 */ val multiple: typingsJapgolly.uifabricUtilities.selectionTypesMod.SelectionMode.multiple with Double = js.native
    /* 0 */ val none: typingsJapgolly.uifabricUtilities.selectionTypesMod.SelectionMode.none with Double = js.native
    /* 1 */ val single: typingsJapgolly.uifabricUtilities.selectionTypesMod.SelectionMode.single with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.uifabricUtilities.selectionTypesMod.SelectionMode with Double] = js.native
  }
  
}

