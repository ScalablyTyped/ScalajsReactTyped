package typingsJapgolly.wixStyleReact

import typingsJapgolly.propTypes.mod.ReactElementLike
import typingsJapgolly.propTypes.mod.ReactNodeArray
import typingsJapgolly.propTypes.mod.Requireable
import typingsJapgolly.propTypes.mod.Validator
import typingsJapgolly.wixStyleReact.anon.StickyStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPageContentMod {
  
  object default {
    
    inline def apply(hasChildrenStickyStyle: StickyStyle): Any = ^.asInstanceOf[js.Dynamic].apply(hasChildrenStickyStyle.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    @JSImport("wix-style-react/dist/types/Page/Content", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-style-react/dist/types/Page/Content", "default.displayName")
    @js.native
    val displayName: String = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/Page/Content", "default.propTypes.children")
      @js.native
      val children: Validator[String | Double | Boolean | ReactElementLike | ReactNodeArray] = js.native
      
      @JSImport("wix-style-react/dist/types/Page/Content", "default.propTypes.className")
      @js.native
      val className: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/Page/Content", "default.propTypes.fullScreen")
      @js.native
      val fullScreen: Requireable[Boolean] = js.native
    }
  }
}
