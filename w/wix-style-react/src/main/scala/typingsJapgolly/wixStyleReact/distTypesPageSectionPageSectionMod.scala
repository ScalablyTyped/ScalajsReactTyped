package typingsJapgolly.wixStyleReact

import typingsJapgolly.propTypes.mod.ReactNodeLike
import typingsJapgolly.propTypes.mod.Requireable
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.wixStyleReact.anon.ActionsBar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPageSectionPageSectionMod {
  
  object default {
    
    /** Page Section */
    inline def apply(hasDataHookShowDividerTitleSubtitleActionsBarClassName: ActionsBar): Element = ^.asInstanceOf[js.Dynamic].apply(hasDataHookShowDividerTitleSubtitleActionsBarClassName.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("wix-style-react/dist/types/PageSection/PageSection", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-style-react/dist/types/PageSection/PageSection", "default.displayName")
    @js.native
    val displayName: String = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/PageSection/PageSection", "default.propTypes.actionsBar")
      @js.native
      val actionsBar: Requireable[ReactNodeLike] = js.native
      
      @JSImport("wix-style-react/dist/types/PageSection/PageSection", "default.propTypes.className")
      @js.native
      val className: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/PageSection/PageSection", "default.propTypes.dataHook")
      @js.native
      val dataHook: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/PageSection/PageSection", "default.propTypes.showDivider")
      @js.native
      val showDivider: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/PageSection/PageSection", "default.propTypes.subtitle")
      @js.native
      val subtitle: Requireable[ReactNodeLike] = js.native
      
      @JSImport("wix-style-react/dist/types/PageSection/PageSection", "default.propTypes.title")
      @js.native
      val title: Requireable[ReactNodeLike] = js.native
    }
  }
}
