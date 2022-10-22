package typingsJapgolly.wixUiCore

import typingsJapgolly.wixUiCore.anon.Columns
import typingsJapgolly.wixUiCore.anon.TypeofHorizontalMenuItem
import typingsJapgolly.wixUiCore.distEsSrcComponentsHorizontalMenuHorizontalMenuMod.HorizontalMenuProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcComponentsHorizontalMenuMod {
  
  @JSImport("wix-ui-core/dist/es/src/components/horizontal-menu", "HorizontalMenu")
  @js.native
  open class HorizontalMenu protected ()
    extends typingsJapgolly.wixUiCore.distEsSrcComponentsHorizontalMenuHorizontalMenuMod.HorizontalMenu {
    def this(props: HorizontalMenuProps) = this()
  }
  /* static members */
  object HorizontalMenu {
    
    @JSImport("wix-ui-core/dist/es/src/components/horizontal-menu", "HorizontalMenu")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-ui-core/dist/es/src/components/horizontal-menu", "HorizontalMenu.Item")
    @js.native
    def Item: TypeofHorizontalMenuItem = js.native
    inline def Item_=(x: TypeofHorizontalMenuItem): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/es/src/components/horizontal-menu", "HorizontalMenu.Layout")
    @js.native
    def Layout: Columns = js.native
    inline def Layout_=(x: Columns): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Layout")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/es/src/components/horizontal-menu", "HorizontalMenu.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
}
