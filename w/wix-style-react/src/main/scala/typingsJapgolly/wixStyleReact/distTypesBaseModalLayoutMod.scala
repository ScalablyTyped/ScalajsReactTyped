package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.React.Element
import org.scalajs.dom.HTMLButtonElement
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.react.mod.MouseEventHandler
import typingsJapgolly.react.mod.PureComponent
import typingsJapgolly.react.mod.ValidationMap
import typingsJapgolly.wixStyleReact.anon.FunctionComponentHeaderPr
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

object distTypesBaseModalLayoutMod {
  
  @JSImport("wix-style-react/dist/types/BaseModalLayout", JSImport.Default)
  @js.native
  open class default ()
    extends PureComponent[BaseModalLayoutProps, js.Object, Any]
  /* static members */
  object default {
    
    @JSImport("wix-style-react/dist/types/BaseModalLayout", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-style-react/dist/types/BaseModalLayout", "default.Content")
    @js.native
    def Content: FunctionComponent[ContentProps] = js.native
    inline def Content_=(x: FunctionComponent[ContentProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Content")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/BaseModalLayout", "default.Footer")
    @js.native
    def Footer: FunctionComponent[FooterProps] = js.native
    inline def Footer_=(x: FunctionComponent[FooterProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Footer")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/BaseModalLayout", "default.Footnote")
    @js.native
    def Footnote: FunctionComponent[FootnoteProps] = js.native
    inline def Footnote_=(x: FunctionComponent[FootnoteProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Footnote")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/BaseModalLayout", "default.Header")
    @js.native
    def Header: FunctionComponentHeaderPr = js.native
    inline def Header_=(x: FunctionComponentHeaderPr): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Header")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/BaseModalLayout", "default.Illustration")
    @js.native
    def Illustration: FunctionComponent[IllustrationProps] = js.native
    inline def Illustration_=(x: FunctionComponent[IllustrationProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Illustration")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("wix-style-react/dist/types/BaseModalLayout", "Content")
  @js.native
  val Content: FunctionComponent[ContentProps] = js.native
  
  @JSImport("wix-style-react/dist/types/BaseModalLayout", "Footer")
  @js.native
  val Footer: FunctionComponent[FooterProps] = js.native
  
  @JSImport("wix-style-react/dist/types/BaseModalLayout", "Footnote")
  @js.native
  val Footnote: FunctionComponent[FootnoteProps] = js.native
  
  /* Inlined react.react.FunctionComponent<wix-style-react.wix-style-react/dist/types/BaseModalLayout/LayoutBlocks/Header.HeaderProps> & {  Title :react.react.FunctionComponent<{}>} */
  object Header {
    
    inline def apply(props: HeaderProps): Element | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
    inline def apply(props: HeaderProps, context: Any): Element | Null = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Element | Null]
    
    @JSImport("wix-style-react/dist/types/BaseModalLayout", "Header")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-style-react/dist/types/BaseModalLayout", "Header.Title")
    @js.native
    def Title: FunctionComponent[js.Object] = js.native
    inline def Title_=(x: FunctionComponent[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Title")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/BaseModalLayout", "Header.contextTypes")
    @js.native
    def contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
    inline def contextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/BaseModalLayout", "Header.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialHeaderProps] = js.native
    inline def defaultProps_=(x: js.UndefOr[PartialHeaderProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/BaseModalLayout", "Header.displayName")
    @js.native
    def displayName: js.UndefOr[String] = js.native
    inline def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/BaseModalLayout", "Header.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapHeaderPr] = js.native
    inline def propTypes_=(x: js.UndefOr[WeakValidationMapHeaderPr]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("wix-style-react/dist/types/BaseModalLayout", "Illustration")
  @js.native
  val Illustration: FunctionComponent[IllustrationProps] = js.native
  
  type BaseModalLayout = PureComponent[BaseModalLayoutProps, js.Object, Any]
  
  trait BaseModalLayoutProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var onCloseButtonClick: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
    
    var onHelpButtonClick: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
    
    var theme: js.UndefOr[ModalTheme] = js.undefined
  }
  object BaseModalLayoutProps {
    
    inline def apply(): BaseModalLayoutProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseModalLayoutProps]
    }
    
    extension [Self <: BaseModalLayoutProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setOnCloseButtonClick(value: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onCloseButtonClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnCloseButtonClickUndefined: Self = StObject.set(x, "onCloseButtonClick", js.undefined)
      
      inline def setOnHelpButtonClick(value: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onHelpButtonClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnHelpButtonClickUndefined: Self = StObject.set(x, "onHelpButtonClick", js.undefined)
      
      inline def setTheme(value: ModalTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.standard
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.premium
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.destructive
  */
  trait ModalTheme extends StObject
  object ModalTheme {
    
    inline def destructive: typingsJapgolly.wixStyleReact.wixStyleReactStrings.destructive = "destructive".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.destructive]
    
    inline def premium: typingsJapgolly.wixStyleReact.wixStyleReactStrings.premium = "premium".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.premium]
    
    inline def standard: typingsJapgolly.wixStyleReact.wixStyleReactStrings.standard = "standard".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.standard]
  }
}
