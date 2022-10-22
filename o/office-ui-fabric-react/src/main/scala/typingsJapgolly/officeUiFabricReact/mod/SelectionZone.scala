package typingsJapgolly.officeUiFabricReact.mod

import typingsJapgolly.officeUiFabricReact.anon.IsSelectedOnFocus
import typingsJapgolly.officeUiFabricReact.libUtilitiesSelectionSelectionZoneMod.ISelectionZoneProps
import typingsJapgolly.officeUiFabricReact.libUtilitiesSelectionSelectionZoneMod.ISelectionZoneState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- scala.Any because Already inherited
- scala.AnyRef because Already inherited
- typingsJapgolly.react.mod.DeprecatedLifecycle because Already inherited
- typingsJapgolly.react.mod.NewLifecycle because Already inherited
- js.Any because Already inherited
- typingsJapgolly.react.mod.ComponentLifecycle because Already inherited
- js.Object because Already inherited
- typingsJapgolly.react.mod.Component because Already inherited
- typingsJapgolly.officeUiFabricReact.libUtilitiesSelectionSelectionZoneMod.SelectionZone because Already inherited
- typingsJapgolly.officeUiFabricReact.libUtilitiesSelectionMod.SelectionZone because Already inherited
- typingsJapgolly.officeUiFabricReact.libMarqueeSelectionMod.SelectionZone because Inheritance from two classes. Inlined 
- typingsJapgolly.officeUiFabricReact.libSelectionMod.SelectionZone because Inheritance from two classes. Inlined  */ @JSImport("office-ui-fabric-react", "SelectionZone")
@js.native
open class SelectionZone protected ()
  extends typingsJapgolly.officeUiFabricReact.libDetailsListMod.SelectionZone {
  def this(props: ISelectionZoneProps) = this()
}
/* static members */
object SelectionZone {
  
  @JSImport("office-ui-fabric-react", "SelectionZone")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react", "SelectionZone.defaultProps")
  @js.native
  def defaultProps: IsSelectedOnFocus = js.native
  inline def defaultProps_=(x: IsSelectedOnFocus): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  inline def getDerivedStateFromProps(nextProps: ISelectionZoneProps, prevState: ISelectionZoneState): ISelectionZoneState = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(nextProps.asInstanceOf[js.Any], prevState.asInstanceOf[js.Any])).asInstanceOf[ISelectionZoneState]
}
