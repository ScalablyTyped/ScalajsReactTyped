package typingsJapgolly.wixUiCore

import japgolly.scalajs.react.facade.React.RefHandle
import org.scalajs.dom.HTMLUListElement
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.PureComponent
import typingsJapgolly.wixUiCore.anon.Columns
import typingsJapgolly.wixUiCore.anon.TypeofHorizontalMenuItem
import typingsJapgolly.wixUiCore.distEsSrcComponentsHorizontalMenuHorizontalMenuContextMod.HorizontalMenuContextValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcComponentsHorizontalMenuHorizontalMenuMod {
  
  @JSImport("wix-ui-core/dist/es/src/components/horizontal-menu/HorizontalMenu", "HorizontalMenu")
  @js.native
  open class HorizontalMenu protected ()
    extends PureComponent[HorizontalMenuProps, js.Object, Any] {
    def this(props: HorizontalMenuProps) = this()
    
    var contextValue: HorizontalMenuContextValue = js.native
    
    var rootRef: RefHandle[HTMLUListElement] = js.native
  }
  /* static members */
  object HorizontalMenu {
    
    @JSImport("wix-ui-core/dist/es/src/components/horizontal-menu/HorizontalMenu", "HorizontalMenu")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-ui-core/dist/es/src/components/horizontal-menu/HorizontalMenu", "HorizontalMenu.Item")
    @js.native
    def Item: TypeofHorizontalMenuItem = js.native
    inline def Item_=(x: TypeofHorizontalMenuItem): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/es/src/components/horizontal-menu/HorizontalMenu", "HorizontalMenu.Layout")
    @js.native
    def Layout: Columns = js.native
    inline def Layout_=(x: Columns): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Layout")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/es/src/components/horizontal-menu/HorizontalMenu", "HorizontalMenu.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  trait HorizontalMenuProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    /** Menu inline styles */
    var menuStyle: js.UndefOr[CSSProperties] = js.undefined
    
    /** Nav inline styles */
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object HorizontalMenuProps {
    
    inline def apply(): HorizontalMenuProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HorizontalMenuProps]
    }
    
    extension [Self <: HorizontalMenuProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setMenuStyle(value: CSSProperties): Self = StObject.set(x, "menuStyle", value.asInstanceOf[js.Any])
      
      inline def setMenuStyleUndefined: Self = StObject.set(x, "menuStyle", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
