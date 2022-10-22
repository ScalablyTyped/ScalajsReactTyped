package typingsJapgolly.wixStyleReact

import typingsJapgolly.propTypes.mod.ReactElementLike
import typingsJapgolly.propTypes.mod.Requireable
import typingsJapgolly.propTypes.mod.Validator
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.wixStyleReact.anon.Style
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPagePageStickyMod {
  
  object PageSticky {
    
    inline def apply(hasChildrenClassNameStyleProps: Style): Element = ^.asInstanceOf[js.Dynamic].apply(hasChildrenClassNameStyleProps.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("wix-style-react/dist/types/Page/PageSticky", "PageSticky")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-style-react/dist/types/Page/PageSticky", "PageSticky.displayName")
    @js.native
    val displayName: String = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/Page/PageSticky", "PageSticky.propTypes.children")
      @js.native
      val children: Validator[ReactElementLike] = js.native
      
      @JSImport("wix-style-react/dist/types/Page/PageSticky", "PageSticky.propTypes.style")
      @js.native
      val style: Requireable[js.Object] = js.native
    }
  }
}
