package typingsJapgolly.wixStyleReact

import typingsJapgolly.propTypes.mod.ReactElementLike
import typingsJapgolly.propTypes.mod.ReactNodeArray
import typingsJapgolly.propTypes.mod.Requireable
import typingsJapgolly.wixStyleReact.anon.ChildrenClassName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesBaseModalLayoutLayoutBlocksIllustrationIllustrationMod {
  
  object Illustration {
    
    inline def apply(hasDataHookClassNameChildren: ChildrenClassName): Any = ^.asInstanceOf[js.Dynamic].apply(hasDataHookClassNameChildren.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    @JSImport("wix-style-react/dist/types/BaseModalLayout/LayoutBlocks/Illustration/Illustration", "Illustration")
    @js.native
    val ^ : js.Any = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/BaseModalLayout/LayoutBlocks/Illustration/Illustration", "Illustration.propTypes.className")
      @js.native
      val className: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/BaseModalLayout/LayoutBlocks/Illustration/Illustration", "Illustration.propTypes.dataHook")
      @js.native
      val dataHook: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/BaseModalLayout/LayoutBlocks/Illustration/Illustration", "Illustration.propTypes.illustration")
      @js.native
      val illustration: Requireable[String | Double | Boolean | ReactElementLike | ReactNodeArray] = js.native
    }
  }
}
