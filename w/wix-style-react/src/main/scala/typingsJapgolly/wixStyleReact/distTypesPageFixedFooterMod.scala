package typingsJapgolly.wixStyleReact

import org.scalajs.dom.HTMLElement
import typingsJapgolly.propTypes.mod.ReactElementLike
import typingsJapgolly.propTypes.mod.Validator
import typingsJapgolly.react.mod.DetailedReactHTMLElement
import typingsJapgolly.wixStyleReact.anon.ChildrenAny
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPageFixedFooterMod {
  
  object default {
    
    inline def apply(hasChildren: ChildrenAny): DetailedReactHTMLElement[js.Object, HTMLElement] = ^.asInstanceOf[js.Dynamic].apply(hasChildren.asInstanceOf[js.Any]).asInstanceOf[DetailedReactHTMLElement[js.Object, HTMLElement]]
    
    @JSImport("wix-style-react/dist/types/Page/FixedFooter", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-style-react/dist/types/Page/FixedFooter", "default.displayName")
    @js.native
    val displayName: String = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/Page/FixedFooter", "default.propTypes.children")
      @js.native
      val children: Validator[ReactElementLike] = js.native
    }
  }
}
