package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.wixStyleReact.anon.ImgHTMLAttributesHTMLImag
import typingsJapgolly.wixStyleReact.wixStyleReactInts.`1`
import typingsJapgolly.wixStyleReact.wixStyleReactInts.`2`
import typingsJapgolly.wixStyleReact.wixStyleReactInts.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesAvatarAvatarCoreAvatarCoreMod extends Shortcut {
  
  @JSImport("wix-style-react/dist/types/Avatar/AvatarCore/AvatarCore", JSImport.Default)
  @js.native
  val default: Any = js.native
  
  trait AvatarCoreProps extends StObject {
    
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
  object AvatarCoreProps {
    
    inline def apply(): AvatarCoreProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AvatarCoreProps]
    }
    
    extension [Self <: AvatarCoreProps](x: Self) {
      
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
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.text
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.placeholder
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.image
  */
  trait ContentType extends StObject
  object ContentType {
    
    inline def image: typingsJapgolly.wixStyleReact.wixStyleReactStrings.image = "image".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.image]
    
    inline def placeholder: typingsJapgolly.wixStyleReact.wixStyleReactStrings.placeholder = "placeholder".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.placeholder]
    
    inline def text: typingsJapgolly.wixStyleReact.wixStyleReactStrings.text = "text".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.text]
  }
  
  type _To = Any
  
  /* This means you don't have to write `default`, but can instead just say `distTypesAvatarAvatarCoreAvatarCoreMod.foo` */
  override def _to: Any = default
}
