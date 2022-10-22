package typingsJapgolly.wixStyleReact.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixStyleReact.distTypesBadgeMod.BadgeSize
import typingsJapgolly.wixStyleReact.distTypesBadgeMod.BadgeType
import typingsJapgolly.wixStyleReact.distTypesBadgeSelectMod.BadgeSelectProps
import typingsJapgolly.wixStyleReact.distTypesCommonMod.PopoverCommonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BadgeSelect {
  
  inline def apply(options: js.Array[typingsJapgolly.wixStyleReact.distTypesBadgeSelectItemMod.BadgeSelectItem]): Builder = {
    val __props = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[BadgeSelectProps]))
  }
  
  @JSImport("wix-style-react", "BadgeSelect")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixStyleReact.mod.BadgeSelect] {
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    inline def onSelect(
      value: /* option */ typingsJapgolly.wixStyleReact.distTypesBadgeSelectItemMod.BadgeSelectItem => Callback
    ): this.type = set("onSelect", js.Any.fromFunction1((t0: /* option */ typingsJapgolly.wixStyleReact.distTypesBadgeSelectItemMod.BadgeSelectItem) => value(t0).runNow()))
    
    inline def popoverProps(value: PopoverCommonProps): this.type = set("popoverProps", value.asInstanceOf[js.Any])
    
    inline def selectedId(value: String): this.type = set("selectedId", value.asInstanceOf[js.Any])
    
    inline def size(value: BadgeSize): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def `type`(value: BadgeType): this.type = set("type", value.asInstanceOf[js.Any])
    
    inline def uppercase(value: Boolean): this.type = set("uppercase", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: BadgeSelectProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
