package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.RefHandle
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLButtonElement
import org.scalajs.dom.HTMLSpanElement
import typingsJapgolly.react.mod.ButtonHTMLAttributes
import typingsJapgolly.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesButtonButtonCoreButtonCoreMod extends Shortcut {
  
  @JSImport("wix-style-react/dist/types/Button/ButtonCore/ButtonCore", JSImport.Default)
  @js.native
  val default: Any = js.native
  
  trait ButtonProps
    extends StObject
       with ButtonHTMLAttributes[HTMLButtonElement] {
    
    /** an element type to render as (string or function).  */
    var as: js.UndefOr[String | ComponentType[Any]] = js.undefined
    
    /** class name to be added to the content span */
    var contentClassName: js.UndefOr[String] = js.undefined
    
    /** React ref to be attached to the content span */
    var contentRef: js.UndefOr[RefHandle[HTMLSpanElement]] = js.undefined
    
    var focusableOnBlur: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var focusableOnFocus: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** URL of the page that link goes to */
    var href: js.UndefOr[String] = js.undefined
    
    /** accepts prefix icon */
    var prefixIcon: js.UndefOr[Element] = js.undefined
    
    /** accepts suffix icon  */
    var suffixIcon: js.UndefOr[Element] = js.undefined
  }
  object ButtonProps {
    
    inline def apply(): ButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ButtonProps]
    }
    
    extension [Self <: ButtonProps](x: Self) {
      
      inline def setAs(value: String | ComponentType[Any]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setContentClassName(value: String): Self = StObject.set(x, "contentClassName", value.asInstanceOf[js.Any])
      
      inline def setContentClassNameUndefined: Self = StObject.set(x, "contentClassName", js.undefined)
      
      inline def setContentRef(value: RefHandle[HTMLSpanElement]): Self = StObject.set(x, "contentRef", value.asInstanceOf[js.Any])
      
      inline def setContentRefUndefined: Self = StObject.set(x, "contentRef", js.undefined)
      
      inline def setFocusableOnBlur(value: Callback): Self = StObject.set(x, "focusableOnBlur", value.toJsFn)
      
      inline def setFocusableOnBlurUndefined: Self = StObject.set(x, "focusableOnBlur", js.undefined)
      
      inline def setFocusableOnFocus(value: Callback): Self = StObject.set(x, "focusableOnFocus", value.toJsFn)
      
      inline def setFocusableOnFocusUndefined: Self = StObject.set(x, "focusableOnFocus", js.undefined)
      
      inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      inline def setPrefixIcon(value: VdomElement): Self = StObject.set(x, "prefixIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setPrefixIconUndefined: Self = StObject.set(x, "prefixIcon", js.undefined)
      
      inline def setSuffixIcon(value: VdomElement): Self = StObject.set(x, "suffixIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setSuffixIconUndefined: Self = StObject.set(x, "suffixIcon", js.undefined)
    }
  }
  
  type _To = Any
  
  /* This means you don't have to write `default`, but can instead just say `distTypesButtonButtonCoreButtonCoreMod.foo` */
  override def _to: Any = default
}
