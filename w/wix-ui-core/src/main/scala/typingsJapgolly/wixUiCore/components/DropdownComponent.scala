package typingsJapgolly.wixUiCore.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.wixUiCore.distEsSrcComponentsDropdownConstantsMod.OPEN_TRIGGER_TYPE
import typingsJapgolly.wixUiCore.distEsSrcComponentsDropdownDropdownMod.DropdownProps
import typingsJapgolly.wixUiCore.distEsSrcComponentsDropdownOptionOptionFactoryMod.Option
import typingsJapgolly.wixUiCore.distEsSrcComponentsPopoverPopoverMod.Placement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DropdownComponent {
  
  inline def apply(
    initialSelectedIds: js.Array[String | Double],
    onSelect: js.UndefOr[Option] => Callback,
    openTrigger: OPEN_TRIGGER_TYPE,
    options: js.Array[Option],
    placement: Placement
  ): SharedBuilder_DropdownProps_577454351[
    typingsJapgolly.wixUiCore.distEsSrcComponentsDropdownDropdownMod.DropdownComponent
  ] = {
    val __props = js.Dynamic.literal(initialSelectedIds = initialSelectedIds.asInstanceOf[js.Any], onSelect = js.Any.fromFunction1((t0: js.UndefOr[Option]) => onSelect(t0).runNow()), openTrigger = openTrigger.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any])
    new SharedBuilder_DropdownProps_577454351[
    typingsJapgolly.wixUiCore.distEsSrcComponentsDropdownDropdownMod.DropdownComponent
  ](js.Array(this.component, __props.asInstanceOf[DropdownProps]))
  }
  
  @JSImport("wix-ui-core/dist/es/src/components/dropdown/Dropdown", "DropdownComponent")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: DropdownProps): SharedBuilder_DropdownProps_577454351[
    typingsJapgolly.wixUiCore.distEsSrcComponentsDropdownDropdownMod.DropdownComponent
  ] = new SharedBuilder_DropdownProps_577454351[
    typingsJapgolly.wixUiCore.distEsSrcComponentsDropdownDropdownMod.DropdownComponent
  ](js.Array(this.component, p.asInstanceOf[js.Any]))
}
