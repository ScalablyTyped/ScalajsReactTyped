package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Event
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.officeUiFabricReact.libUtilitiesSelectionSelectionZoneMod.ISelectionZoneProps
import typingsJapgolly.uifabricUtilities.libSelectionSelectionDottypesMod.IObjectWithKey
import typingsJapgolly.uifabricUtilities.libSelectionSelectionDottypesMod.ISelection
import typingsJapgolly.uifabricUtilities.libSelectionSelectionDottypesMod.SelectionMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SelectionZone {
  
  inline def apply(selection: ISelection[IObjectWithKey]): Builder = {
    val __props = js.Dynamic.literal(selection = selection.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ISelectionZoneProps]))
  }
  
  @JSImport("office-ui-fabric-react", "SelectionZone")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.officeUiFabricReact.mod.SelectionZone] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def componentRef(value: Callback): this.type = set("componentRef", value.toJsFn)
    
    inline def disableAutoSelectOnInputElements(value: Boolean): this.type = set("disableAutoSelectOnInputElements", value.asInstanceOf[js.Any])
    
    inline def enableTouchInvocationTarget(value: Boolean): this.type = set("enableTouchInvocationTarget", value.asInstanceOf[js.Any])
    
    inline def enterModalOnTouch(value: Boolean): this.type = set("enterModalOnTouch", value.asInstanceOf[js.Any])
    
    inline def isSelectedOnFocus(value: Boolean): this.type = set("isSelectedOnFocus", value.asInstanceOf[js.Any])
    
    inline def layout(value: js.Object): this.type = set("layout", value.asInstanceOf[js.Any])
    
    inline def onItemContextMenu(
      value: (/* item */ js.UndefOr[Any], /* index */ js.UndefOr[Double], /* ev */ js.UndefOr[Event]) => Unit | Boolean
    ): this.type = set("onItemContextMenu", js.Any.fromFunction3(value))
    
    inline def onItemInvoked(
      value: (/* item */ js.UndefOr[IObjectWithKey], /* index */ js.UndefOr[Double], /* ev */ js.UndefOr[Event]) => Callback
    ): this.type = set("onItemInvoked", js.Any.fromFunction3((t0: /* item */ js.UndefOr[IObjectWithKey], t1: /* index */ js.UndefOr[Double], t2: /* ev */ js.UndefOr[Event]) => (value(t0, t1, t2)).runNow()))
    
    inline def selectionClearedOnEscapePress(value: Boolean): this.type = set("selectionClearedOnEscapePress", value.asInstanceOf[js.Any])
    
    inline def selectionClearedOnSurfaceClick(value: Boolean): this.type = set("selectionClearedOnSurfaceClick", value.asInstanceOf[js.Any])
    
    inline def selectionMode(value: SelectionMode): this.type = set("selectionMode", value.asInstanceOf[js.Any])
    
    inline def selectionPreservedOnEmptyClick(value: Boolean): this.type = set("selectionPreservedOnEmptyClick", value.asInstanceOf[js.Any])
    
    inline def toggleWithoutModifierPressed(value: Boolean): this.type = set("toggleWithoutModifierPressed", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ISelectionZoneProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
