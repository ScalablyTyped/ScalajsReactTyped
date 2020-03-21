package typingsJapgolly.officeUiFabricReact

import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.change
import typingsJapgolly.officeUiFabricReact.selectionZoneMod.ISelectionZoneProps
import typingsJapgolly.officeUiFabricReact.selectionZoneMod.ISelectionZoneState
import typingsJapgolly.uifabricUtilities.selectionSelectionMod.ISelectionOptions
import typingsJapgolly.uifabricUtilities.selectionSelectionMod.ISelectionOptionsWithRequiredGetKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/utilities/selection", JSImport.Namespace)
@js.native
object selectionMod extends js.Object {
  @js.native
  class Selection[TItem] protected ()
    extends typingsJapgolly.officeUiFabricReact.selectionSelectionMod.Selection[TItem] {
    /**
      * Create a new Selection. If `TItem` does not have a `key` property, you must provide an options
      * object with a `getKey` implementation. Providing options is optional otherwise.
      * (At most one `options` object is accepted.)
      */
    def this(/* import warning: parser.TsParser#functionParam Dropping repeated marker of param options because its type TItem extends IObjectWithKey ? [] | [ISelectionOptions<TItem>] : [ISelectionOptionsWithRequiredGetKey<TItem>] is not an array type */ options: js.Array[js.Any | ISelectionOptions[TItem] | ISelectionOptionsWithRequiredGetKey[TItem]]) = this()
  }
  
  @js.native
  class SelectionZone protected ()
    extends typingsJapgolly.officeUiFabricReact.selectionZoneMod.SelectionZone {
    def this(props: ISelectionZoneProps) = this()
  }
  
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
  
  /* static members */
  @js.native
  object SelectionZone extends js.Object {
    var defaultProps: AnonIsSelectedOnFocus = js.native
    def getDerivedStateFromProps(nextProps: ISelectionZoneProps, prevState: ISelectionZoneState): ISelectionZoneState = js.native
  }
  
}

