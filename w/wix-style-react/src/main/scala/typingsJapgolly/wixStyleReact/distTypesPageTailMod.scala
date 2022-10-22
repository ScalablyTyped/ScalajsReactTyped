package typingsJapgolly.wixStyleReact

import typingsJapgolly.propTypes.mod.ReactElementLike
import typingsJapgolly.propTypes.mod.Requireable
import typingsJapgolly.propTypes.mod.Validator
import typingsJapgolly.react.mod.FunctionComponentElement
import typingsJapgolly.wixStyleReact.anon.Minimized
import typingsJapgolly.wixStyleReact.anon.MinimizedAny
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPageTailMod {
  
  object default {
    
    inline def apply(hasChildrenMinimized: Minimized): FunctionComponentElement[MinimizedAny] = ^.asInstanceOf[js.Dynamic].apply(hasChildrenMinimized.asInstanceOf[js.Any]).asInstanceOf[FunctionComponentElement[MinimizedAny]]
    
    @JSImport("wix-style-react/dist/types/Page/Tail", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-style-react/dist/types/Page/Tail", "default.displayName")
    @js.native
    val displayName: String = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/Page/Tail", "default.propTypes.children")
      @js.native
      val children: Validator[ReactElementLike] = js.native
      
      @JSImport("wix-style-react/dist/types/Page/Tail", "default.propTypes.minimized")
      @js.native
      val minimized: Requireable[Boolean] = js.native
    }
  }
}
