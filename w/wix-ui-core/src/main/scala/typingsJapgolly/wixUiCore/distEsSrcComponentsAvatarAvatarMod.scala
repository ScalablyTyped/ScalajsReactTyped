package typingsJapgolly.wixUiCore

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLImageElement
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.KeyboardEventHandler
import typingsJapgolly.wixUiCore.anon.ImgHTMLAttributesHTMLImag
import typingsJapgolly.wixUiCore.anon.Placeholder
import typingsJapgolly.wixUiCore.distEsSrcComponentsAvatarTypesMod.ContentType
import typingsJapgolly.wixUiCore.wixUiCoreInts.`1`
import typingsJapgolly.wixUiCore.wixUiCoreInts.`2`
import typingsJapgolly.wixUiCore.wixUiCoreInts.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcComponentsAvatarAvatarMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("wix-ui-core/dist/es/src/components/avatar/avatar", "Avatar")
  @js.native
  open class Avatar () extends AvatarComponent
  object Avatar {
    
    @JSImport("wix-ui-core/dist/es/src/components/avatar/avatar", "Avatar")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-ui-core/dist/es/src/components/avatar/avatar", "Avatar.defaultProps")
    @js.native
    def defaultProps: Placeholder = js.native
    inline def defaultProps_=(x: Placeholder): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/es/src/components/avatar/avatar", "Avatar.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("wix-ui-core/dist/es/src/components/avatar/avatar", "AvatarComponent")
  @js.native
  open class AvatarComponent protected () extends Component[AvatarProps & FocusableHOCProps, AvatarState, Any] {
    def this(props: AvatarProps & FocusableHOCProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: AvatarProps & FocusableHOCProps, context: Any) = this()
    
    @JSName("UNSAFE_componentWillReceiveProps")
    def UNSAFE_componentWillReceiveProps_MAvatarComponent(nextProps: AvatarProps): Unit = js.native
    
    var _handleKeyDown: KeyboardEventHandler[HTMLElement] = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MAvatarComponent(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MAvatarComponent(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MAvatarComponent(): Unit = js.native
    
    def getContent(contentType: ContentType): Element = js.native
    
    /** This is content type that will be displayed. (If img is loading then this will be the fallback) */
    def getCurrentContentType(): ContentType = js.native
    
    /** This is the resolved content type the consumer wants to display */
    def getRequestedContentType(props: Any): ContentType = js.native
    
    var img: HTMLImageElement = js.native
    
    def loadImg(): Unit = js.native
    
    def unloadImg(): Unit = js.native
  }
  /* static members */
  object AvatarComponent {
    
    @JSImport("wix-ui-core/dist/es/src/components/avatar/avatar", "AvatarComponent")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-ui-core/dist/es/src/components/avatar/avatar", "AvatarComponent.defaultProps")
    @js.native
    def defaultProps: Placeholder = js.native
    inline def defaultProps_=(x: Placeholder): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/es/src/components/avatar/avatar", "AvatarComponent.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  trait AvatarProps extends StObject {
    
    /** HTML aria-label attribute value. To be applied on the root element */
    var ariaLabel: js.UndefOr[String] = js.undefined
    
    /** Css class name to be applied to the root element */
    var className: js.UndefOr[String] = js.undefined
    
    /** Hook for testing purposes. */
    var `data-hook`: js.UndefOr[String] = js.undefined
    
    /** Props for an <img> tag to be rendered as content. */
    var imgProps: js.UndefOr[ImgHTMLAttributesHTMLImag] = js.undefined
    
    /** Limit the number of letters in the generated initials (from name). May be 1 2 or 3 only. */
    var initialsLimit: js.UndefOr[`1` | `2` | `3`] = js.undefined
    
    /** The name of the avatar user. Text initials will be generated from the name. And it will be used as default value for html `title` and `aria-label` attributes. */
    var name: js.UndefOr[String] = js.undefined
    
    /** onClick event callback. */
    var onClick: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** A node with a placeholder to be rendered as content. Will be displayed if no `text`, `name` or `imgProps` are provided. */
    var placeholder: js.UndefOr[Element] = js.undefined
    
    /** Text to render as content. */
    var text: js.UndefOr[String] = js.undefined
    
    /** HTML title attribute value. To be applied on the root element */
    var title: js.UndefOr[String] = js.undefined
  }
  object AvatarProps {
    
    inline def apply(): AvatarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AvatarProps]
    }
    
    extension [Self <: AvatarProps](x: Self) {
      
      inline def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def `setData-hook`(value: String): Self = StObject.set(x, "data-hook", value.asInstanceOf[js.Any])
      
      inline def `setData-hookUndefined`: Self = StObject.set(x, "data-hook", js.undefined)
      
      inline def setImgProps(value: ImgHTMLAttributesHTMLImag): Self = StObject.set(x, "imgProps", value.asInstanceOf[js.Any])
      
      inline def setImgPropsUndefined: Self = StObject.set(x, "imgProps", js.undefined)
      
      inline def setInitialsLimit(value: `1` | `2` | `3`): Self = StObject.set(x, "initialsLimit", value.asInstanceOf[js.Any])
      
      inline def setInitialsLimitUndefined: Self = StObject.set(x, "initialsLimit", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnClick(value: Callback): Self = StObject.set(x, "onClick", value.toJsFn)
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setPlaceholder(value: VdomElement): Self = StObject.set(x, "placeholder", value.rawElement.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait AvatarState extends StObject {
    
    var imgLoaded: Boolean
  }
  object AvatarState {
    
    inline def apply(imgLoaded: Boolean): AvatarState = {
      val __obj = js.Dynamic.literal(imgLoaded = imgLoaded.asInstanceOf[js.Any])
      __obj.asInstanceOf[AvatarState]
    }
    
    extension [Self <: AvatarState](x: Self) {
      
      inline def setImgLoaded(value: Boolean): Self = StObject.set(x, "imgLoaded", value.asInstanceOf[js.Any])
    }
  }
  
  trait FocusableHOCProps extends StObject {
    
    var focusableOnBlur: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var focusableOnFocus: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object FocusableHOCProps {
    
    inline def apply(): FocusableHOCProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FocusableHOCProps]
    }
    
    extension [Self <: FocusableHOCProps](x: Self) {
      
      inline def setFocusableOnBlur(value: Callback): Self = StObject.set(x, "focusableOnBlur", value.toJsFn)
      
      inline def setFocusableOnBlurUndefined: Self = StObject.set(x, "focusableOnBlur", js.undefined)
      
      inline def setFocusableOnFocus(value: Callback): Self = StObject.set(x, "focusableOnFocus", value.toJsFn)
      
      inline def setFocusableOnFocusUndefined: Self = StObject.set(x, "focusableOnFocus", js.undefined)
    }
  }
}
