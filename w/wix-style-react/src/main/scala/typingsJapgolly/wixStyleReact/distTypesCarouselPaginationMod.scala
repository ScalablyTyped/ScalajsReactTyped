package typingsJapgolly.wixStyleReact

import typingsJapgolly.propTypes.mod.Requireable
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.wixStyleReact.anon.OriginalClassName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCarouselPaginationMod {
  
  object default {
    
    inline def apply(hasClassNameOriginalClassNamePages: OriginalClassName): Element = ^.asInstanceOf[js.Dynamic].apply(hasClassNameOriginalClassNamePages.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("wix-style-react/dist/types/Carousel/Pagination", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-style-react/dist/types/Carousel/Pagination", "default.displayName")
    @js.native
    val displayName: String = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/Carousel/Pagination", "default.propTypes.className")
      @js.native
      val className: Requireable[String] = js.native
    }
  }
}
