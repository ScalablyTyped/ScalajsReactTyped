package typingsJapgolly.wixStyleReact

import typingsJapgolly.propTypes.mod.ReactNodeLike
import typingsJapgolly.propTypes.mod.Requireable
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.wixStyleReact.anon.DataHookSubtitle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSidebarHeaderNextSidebarHeaderNextMod {
  
  object default {
    
    /** A header within the sidebar with title, subtitle and custom content at the bottom. */
    inline def apply(hasDataHookClassNameTitleSubtitleChildren: DataHookSubtitle): Element = ^.asInstanceOf[js.Dynamic].apply(hasDataHookClassNameTitleSubtitleChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("wix-style-react/dist/types/SidebarHeaderNext/SidebarHeaderNext", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-style-react/dist/types/SidebarHeaderNext/SidebarHeaderNext", "default.displayName")
    @js.native
    val displayName: String = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/SidebarHeaderNext/SidebarHeaderNext", "default.propTypes.children")
      @js.native
      val children: Requireable[ReactNodeLike] = js.native
      
      @JSImport("wix-style-react/dist/types/SidebarHeaderNext/SidebarHeaderNext", "default.propTypes.className")
      @js.native
      val className: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/SidebarHeaderNext/SidebarHeaderNext", "default.propTypes.dataHook")
      @js.native
      val dataHook: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/SidebarHeaderNext/SidebarHeaderNext", "default.propTypes.subtitle")
      @js.native
      val subtitle: Requireable[ReactNodeLike] = js.native
      
      @JSImport("wix-style-react/dist/types/SidebarHeaderNext/SidebarHeaderNext", "default.propTypes.title")
      @js.native
      val title: Requireable[ReactNodeLike] = js.native
    }
  }
}
