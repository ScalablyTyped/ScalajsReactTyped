package typingsJapgolly.wixStyleReact

import typingsJapgolly.propTypes.mod.InferProps
import typingsJapgolly.propTypes.mod.ReactElementLike
import typingsJapgolly.propTypes.mod.ReactNodeArray
import typingsJapgolly.propTypes.mod.Requireable
import typingsJapgolly.wixStyleReact.anon.HideBottomScrollDivider
import typingsJapgolly.wixStyleReact.anon.OnScrollAreaChanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesBaseModalLayoutLayoutBlocksContentContentMod {
  
  object Content {
    
    inline def apply(
      hasDataHookClassNameChildrenHideTopScrollDividerHideBottomScrollDividerOverflowYScrollProps: HideBottomScrollDivider
    ): Any = ^.asInstanceOf[js.Dynamic].apply(hasDataHookClassNameChildrenHideTopScrollDividerHideBottomScrollDividerOverflowYScrollProps.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    @JSImport("wix-style-react/dist/types/BaseModalLayout/LayoutBlocks/Content/Content", "Content")
    @js.native
    val ^ : js.Any = js.native
    
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/BaseModalLayout/LayoutBlocks/Content/Content", "Content.defaultProps.hideBottomScrollDivider_1")
      @js.native
      val hideBottomScrollDivider1: Boolean = js.native
      
      @JSImport("wix-style-react/dist/types/BaseModalLayout/LayoutBlocks/Content/Content", "Content.defaultProps.hideTopScrollDivider_1")
      @js.native
      val hideTopScrollDivider1: Boolean = js.native
      
      @JSImport("wix-style-react/dist/types/BaseModalLayout/LayoutBlocks/Content/Content", "Content.defaultProps.overflowY_1")
      @js.native
      val overflowY1: String = js.native
    }
    
    @JSImport("wix-style-react/dist/types/BaseModalLayout/LayoutBlocks/Content/Content", "Content.displayName")
    @js.native
    val displayName: String = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/BaseModalLayout/LayoutBlocks/Content/Content", "Content.propTypes.className")
      @js.native
      val className: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/BaseModalLayout/LayoutBlocks/Content/Content", "Content.propTypes.content")
      @js.native
      val content: Requireable[String | Double | Boolean | ReactElementLike | ReactNodeArray] = js.native
      
      @JSImport("wix-style-react/dist/types/BaseModalLayout/LayoutBlocks/Content/Content", "Content.propTypes.dataHook")
      @js.native
      val dataHook: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/BaseModalLayout/LayoutBlocks/Content/Content", "Content.propTypes.hideBottomScrollDivider")
      @js.native
      val hideBottomScrollDivider: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/BaseModalLayout/LayoutBlocks/Content/Content", "Content.propTypes.hideTopScrollDivider")
      @js.native
      val hideTopScrollDivider: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/BaseModalLayout/LayoutBlocks/Content/Content", "Content.propTypes.overflowY")
      @js.native
      val overflowY: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/BaseModalLayout/LayoutBlocks/Content/Content", "Content.propTypes.scrollProps")
      @js.native
      val scrollProps: Requireable[InferProps[OnScrollAreaChanged]] = js.native
    }
  }
}
