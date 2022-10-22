package typingsJapgolly.wixStyleReact

import org.scalajs.dom.HTMLAnchorElement
import org.scalajs.dom.HTMLButtonElement
import typingsJapgolly.react.mod.AnchorHTMLAttributes
import typingsJapgolly.react.mod.ButtonHTMLAttributes
import typingsJapgolly.react.mod.Component
import typingsJapgolly.wixStyleReact.anon.As
import typingsJapgolly.wixStyleReact.anon.DictadditionalProps
import typingsJapgolly.wixStyleReact.anon.DictadditionalPropsAs
import typingsJapgolly.wixStyleReact.anon.FullWidth
import typingsJapgolly.wixStyleReact.anon.OnClick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesButtonButtonDottypesMod {
  
  @JSImport("wix-style-react/dist/types/Button/Button.types", JSImport.Default)
  @js.native
  open class default ()
    extends Component[ButtonProps, js.Object, Any]
  
  type Button = japgolly.scalajs.react.facade.React.Component[ButtonProps & js.Object, js.Object]
  
  type ButtonAsAnchorProps[T] = AnchorHTMLAttributes[HTMLAnchorElement] & T & As
  
  type ButtonAsButtonProps[T] = ButtonHTMLAttributes[HTMLButtonElement] & T & OnClick
  
  type ButtonAsComponentProps[T] = T & DictadditionalProps
  
  type ButtonGenericProps[T] = T & DictadditionalPropsAs
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.primary
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.secondary
  */
  trait ButtonPriority extends StObject
  object ButtonPriority {
    
    inline def primary: typingsJapgolly.wixStyleReact.wixStyleReactStrings.primary = "primary".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.primary]
    
    inline def secondary: typingsJapgolly.wixStyleReact.wixStyleReactStrings.secondary = "secondary".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.secondary]
  }
  
  type ButtonProps = ButtonWithAsProp[FullWidth]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.tiny
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.small
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.medium
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.large
  */
  trait ButtonSize extends StObject
  object ButtonSize {
    
    inline def large: typingsJapgolly.wixStyleReact.wixStyleReactStrings.large = "large".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.large]
    
    inline def medium: typingsJapgolly.wixStyleReact.wixStyleReactStrings.medium = "medium".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.medium]
    
    inline def small: typingsJapgolly.wixStyleReact.wixStyleReactStrings.small = "small".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.small]
    
    inline def tiny: typingsJapgolly.wixStyleReact.wixStyleReactStrings.tiny = "tiny".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.tiny]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.standard
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.inverted
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.destructive
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.premium
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.dark
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.light
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.transparent
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.`premium-light`
  */
  trait ButtonSkin extends StObject
  object ButtonSkin {
    
    inline def dark: typingsJapgolly.wixStyleReact.wixStyleReactStrings.dark = "dark".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.dark]
    
    inline def destructive: typingsJapgolly.wixStyleReact.wixStyleReactStrings.destructive = "destructive".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.destructive]
    
    inline def inverted: typingsJapgolly.wixStyleReact.wixStyleReactStrings.inverted = "inverted".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.inverted]
    
    inline def light: typingsJapgolly.wixStyleReact.wixStyleReactStrings.light = "light".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.light]
    
    inline def premium: typingsJapgolly.wixStyleReact.wixStyleReactStrings.premium = "premium".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.premium]
    
    inline def `premium-light`: typingsJapgolly.wixStyleReact.wixStyleReactStrings.`premium-light` = "premium-light".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.`premium-light`]
    
    inline def standard: typingsJapgolly.wixStyleReact.wixStyleReactStrings.standard = "standard".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.standard]
    
    inline def transparent: typingsJapgolly.wixStyleReact.wixStyleReactStrings.transparent = "transparent".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.transparent]
  }
  
  type ButtonWithAsProp[T] = ButtonAsButtonProps[T] | ButtonAsAnchorProps[T] | ButtonGenericProps[T] | ButtonAsComponentProps[T]
}
