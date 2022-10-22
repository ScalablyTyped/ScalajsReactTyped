package typingsJapgolly.materialUiCore.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.materialUiCore.materialUiCoreStrings.menu
import typingsJapgolly.materialUiCore.materialUiCoreStrings.selectedMenu
import typingsJapgolly.materialUiCore.menuListMenuListMod.MenuListClassKey
import typingsJapgolly.materialUiCore.menuListMenuListMod.MenuListProps
import typingsJapgolly.materialUiStyles.withStylesWithStylesMod.ClassNameMap
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Ref
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MenuList {
  
  @JSImport("@material-ui/core", "MenuList")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    inline def autoFocusItem(value: Boolean): this.type = set("autoFocusItem", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def classes(value: Partial[ClassNameMap[MenuListClassKey]]): this.type = set("classes", value.asInstanceOf[js.Any])
    
    inline def disableListWrap(value: Boolean): this.type = set("disableListWrap", value.asInstanceOf[js.Any])
    
    inline def disabledItemsFocusable(value: Boolean): this.type = set("disabledItemsFocusable", value.asInstanceOf[js.Any])
    
    inline def innerRef(value: Ref[Any]): this.type = set("innerRef", value.asInstanceOf[js.Any])
    
    inline def innerRefFunction1(value: Any | Null => Callback): this.type = set("innerRef", js.Any.fromFunction1((t0: Any | Null) => value(t0).runNow()))
    
    inline def innerRefNull: this.type = set("innerRef", null)
    
    inline def ref(
      value: /* import warning: importer.ImportType#apply Failed type conversion: C extends {  ref :infer RefType | undefined} ? RefType : react.react.Ref<unknown> */ js.Any
    ): this.type = set("ref", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def variant(value: menu | selectedMenu): this.type = set("variant", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: MenuList.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: MenuListProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
