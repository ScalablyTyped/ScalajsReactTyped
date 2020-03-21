package typingsJapgolly.officeUiFabricReact.mod

import typingsJapgolly.officeUiFabricReact.AnonIsSelectedOnFocus
import typingsJapgolly.officeUiFabricReact.selectionZoneMod.ISelectionZoneProps
import typingsJapgolly.officeUiFabricReact.selectionZoneMod.ISelectionZoneState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.react.mod.DeprecatedLifecycle because Already inherited
- typingsJapgolly.react.mod.NewLifecycle because Already inherited
- typingsJapgolly.react.mod.ComponentLifecycle because Already inherited
- typingsJapgolly.react.mod.Component because Already inherited
- typingsJapgolly.uifabricUtilities.baseComponentMod.BaseComponent because Already inherited
- typingsJapgolly.uifabricUtilities.mod.BaseComponent because Already inherited
- typingsJapgolly.officeUiFabricReact.utilitiesMod.BaseComponent because Already inherited
- typingsJapgolly.officeUiFabricReact.selectionZoneMod.SelectionZone because Already inherited
- typingsJapgolly.officeUiFabricReact.selectionMod.SelectionZone because Already inherited
- typingsJapgolly.officeUiFabricReact.libMarqueeSelectionMod.SelectionZone because Inheritance from two classes. Inlined 
- typingsJapgolly.officeUiFabricReact.libSelectionMod.SelectionZone because Inheritance from two classes. Inlined  */ @JSImport("office-ui-fabric-react", "SelectionZone")
@js.native
class SelectionZone protected ()
  extends typingsJapgolly.officeUiFabricReact.libDetailsListMod.SelectionZone {
  def this(props: ISelectionZoneProps) = this()
}

/* static members */
@JSImport("office-ui-fabric-react", "SelectionZone")
@js.native
object SelectionZone extends js.Object {
  var defaultProps: AnonIsSelectedOnFocus = js.native
  def getDerivedStateFromProps(nextProps: ISelectionZoneProps, prevState: ISelectionZoneState): ISelectionZoneState = js.native
}

