package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.react.mod.ValidationMap
import typingsJapgolly.wixStyleReact.anon.PartialHeaderProps
import typingsJapgolly.wixStyleReact.anon.WeakValidationMapHeaderPr
import typingsJapgolly.wixStyleReact.distTypesBaseModalLayoutLayoutBlocksContentMod.ContentProps
import typingsJapgolly.wixStyleReact.distTypesBaseModalLayoutLayoutBlocksFooterMod.FooterProps
import typingsJapgolly.wixStyleReact.distTypesBaseModalLayoutLayoutBlocksFootnoteMod.FootnoteProps
import typingsJapgolly.wixStyleReact.distTypesBaseModalLayoutLayoutBlocksHeaderMod.HeaderProps
import typingsJapgolly.wixStyleReact.distTypesBaseModalLayoutLayoutBlocksIllustrationMod.IllustrationProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesBaseModalLayoutLayoutBlocksMod {
  
  @JSImport("wix-style-react/dist/types/BaseModalLayout/LayoutBlocks", "Content")
  @js.native
  val Content: FunctionComponent[ContentProps] = js.native
  
  @JSImport("wix-style-react/dist/types/BaseModalLayout/LayoutBlocks", "Footer")
  @js.native
  val Footer: FunctionComponent[FooterProps] = js.native
  
  @JSImport("wix-style-react/dist/types/BaseModalLayout/LayoutBlocks", "Footnote")
  @js.native
  val Footnote: FunctionComponent[FootnoteProps] = js.native
  
  /* Inlined react.react.FunctionComponent<wix-style-react.wix-style-react/dist/types/BaseModalLayout/LayoutBlocks/Header.HeaderProps> & {  Title :react.react.FunctionComponent<{}>} */
  object Header {
    
    inline def apply(props: HeaderProps): Element | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
    inline def apply(props: HeaderProps, context: Any): Element | Null = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Element | Null]
    
    @JSImport("wix-style-react/dist/types/BaseModalLayout/LayoutBlocks", "Header")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-style-react/dist/types/BaseModalLayout/LayoutBlocks", "Header.Title")
    @js.native
    def Title: FunctionComponent[js.Object] = js.native
    inline def Title_=(x: FunctionComponent[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Title")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/BaseModalLayout/LayoutBlocks", "Header.contextTypes")
    @js.native
    def contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
    inline def contextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/BaseModalLayout/LayoutBlocks", "Header.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialHeaderProps] = js.native
    inline def defaultProps_=(x: js.UndefOr[PartialHeaderProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/BaseModalLayout/LayoutBlocks", "Header.displayName")
    @js.native
    def displayName: js.UndefOr[String] = js.native
    inline def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/BaseModalLayout/LayoutBlocks", "Header.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapHeaderPr] = js.native
    inline def propTypes_=(x: js.UndefOr[WeakValidationMapHeaderPr]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("wix-style-react/dist/types/BaseModalLayout/LayoutBlocks", "Illustration")
  @js.native
  val Illustration: FunctionComponent[IllustrationProps] = js.native
}
