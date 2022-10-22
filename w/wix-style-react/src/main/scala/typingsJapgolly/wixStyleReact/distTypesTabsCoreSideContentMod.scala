package typingsJapgolly.wixStyleReact

import typingsJapgolly.propTypes.mod.ReactNodeLike
import typingsJapgolly.propTypes.mod.Requireable
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.wixStyleReact.anon.ContentAny
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTabsCoreSideContentMod {
  
  object default {
    
    inline def apply(hasContent: ContentAny): Element | Null = ^.asInstanceOf[js.Dynamic].apply(hasContent.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
    
    @JSImport("wix-style-react/dist/types/Tabs/core/SideContent", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/Tabs/core/SideContent", "default.propTypes.content")
      @js.native
      val content: Requireable[ReactNodeLike] = js.native
    }
  }
}
