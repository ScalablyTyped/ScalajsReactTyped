package typingsJapgolly.rcTabs

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLButtonElement
import typingsJapgolly.rcTabs.esInterfaceMod.EditableConfig
import typingsJapgolly.rcTabs.esInterfaceMod.TabsLocale
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esTabNavListAddButtonMod extends Shortcut {
  
  @JSImport("rc-tabs/es/TabNavList/AddButton", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[AddButtonProps & RefAttributes[HTMLButtonElement]] = js.native
  
  trait AddButtonProps extends StObject {
    
    var editable: js.UndefOr[EditableConfig] = js.undefined
    
    var locale: js.UndefOr[TabsLocale] = js.undefined
    
    var prefixCls: String
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object AddButtonProps {
    
    inline def apply(prefixCls: String): AddButtonProps = {
      val __obj = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddButtonProps]
    }
    
    extension [Self <: AddButtonProps](x: Self) {
      
      inline def setEditable(value: EditableConfig): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
      
      inline def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
      
      inline def setLocale(value: TabsLocale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  type _To = ForwardRefExoticComponent[AddButtonProps & RefAttributes[HTMLButtonElement]]
  
  /* This means you don't have to write `default`, but can instead just say `esTabNavListAddButtonMod.foo` */
  override def _to: ForwardRefExoticComponent[AddButtonProps & RefAttributes[HTMLButtonElement]] = default
}
