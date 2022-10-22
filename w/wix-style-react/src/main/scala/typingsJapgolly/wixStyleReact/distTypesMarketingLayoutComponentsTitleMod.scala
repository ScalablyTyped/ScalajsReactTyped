package typingsJapgolly.wixStyleReact

import typingsJapgolly.propTypes.mod.ReactNodeLike
import typingsJapgolly.propTypes.mod.Requireable
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.wixStyleReact.anon.AppearanceChildren
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMarketingLayoutComponentsTitleMod {
  
  object default {
    
    inline def apply(hasChildrenAppearance: AppearanceChildren): Element = ^.asInstanceOf[js.Dynamic].apply(hasChildrenAppearance.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("wix-style-react/dist/types/MarketingLayout/components/Title", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/MarketingLayout/components/Title", "default.propTypes.appearance")
      @js.native
      val appearance: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/MarketingLayout/components/Title", "default.propTypes.children")
      @js.native
      val children: Requireable[ReactNodeLike] = js.native
    }
  }
}
