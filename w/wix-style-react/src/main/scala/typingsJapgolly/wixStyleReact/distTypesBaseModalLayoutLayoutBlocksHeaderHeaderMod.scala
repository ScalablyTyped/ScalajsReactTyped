package typingsJapgolly.wixStyleReact

import typingsJapgolly.propTypes.mod.ReactElementLike
import typingsJapgolly.propTypes.mod.ReactNodeArray
import typingsJapgolly.propTypes.mod.Requireable
import typingsJapgolly.react.mod.Validator
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.wixStyleReact.anon.HeadingAppearance
import typingsJapgolly.wixStyleReact.anon.ShowHeaderDivider
import typingsJapgolly.wixStyleReact.distTypesBaseModalLayoutLayoutBlocksHeaderModalHeadingMod.headingAppearance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesBaseModalLayoutLayoutBlocksHeaderHeaderMod {
  
  object Header {
    
    inline def apply(hasDataHookClassNameTitleAppearanceShowHeaderDivider: ShowHeaderDivider): Any = ^.asInstanceOf[js.Dynamic].apply(hasDataHookClassNameTitleAppearanceShowHeaderDivider.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    @JSImport("wix-style-react/dist/types/BaseModalLayout/LayoutBlocks/Header/Header", "Header")
    @js.native
    val ^ : js.Any = js.native
    
    inline def Title(hasHeadingAppearanceChildren: HeadingAppearance): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Title")(hasHeadingAppearanceChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/BaseModalLayout/LayoutBlocks/Header/Header", "Header.defaultProps.showHeaderDivider_1")
      @js.native
      val showHeaderDivider1: Boolean = js.native
      
      @JSImport("wix-style-react/dist/types/BaseModalLayout/LayoutBlocks/Header/Header", "Header.defaultProps.titleAppearance_1")
      @js.native
      val titleAppearance1: String = js.native
    }
    
    @JSImport("wix-style-react/dist/types/BaseModalLayout/LayoutBlocks/Header/Header", "Header.displayName")
    @js.native
    val displayName: String = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/BaseModalLayout/LayoutBlocks/Header/Header", "Header.propTypes.className")
      @js.native
      val className: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/BaseModalLayout/LayoutBlocks/Header/Header", "Header.propTypes.dataHook")
      @js.native
      val dataHook: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/BaseModalLayout/LayoutBlocks/Header/Header", "Header.propTypes.showHeaderDivider")
      @js.native
      val showHeaderDivider: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/BaseModalLayout/LayoutBlocks/Header/Header", "Header.propTypes.subtitle")
      @js.native
      val subtitle: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/BaseModalLayout/LayoutBlocks/Header/Header", "Header.propTypes.title")
      @js.native
      val title: Requireable[String | Double | Boolean | ReactElementLike | ReactNodeArray] = js.native
      
      @JSImport("wix-style-react/dist/types/BaseModalLayout/LayoutBlocks/Header/Header", "Header.propTypes.titleAppearance")
      @js.native
      val titleAppearance: js.UndefOr[Validator[js.UndefOr[headingAppearance | Null]]] = js.native
    }
  }
}
