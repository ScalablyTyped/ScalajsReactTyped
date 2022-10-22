package typingsJapgolly.wixStyleReact

import typingsJapgolly.react.mod.Component
import typingsJapgolly.wixStyleReact.anon.AriaExpanded
import typingsJapgolly.wixStyleReact.distTypesButtonButtonDottypesMod.ButtonWithAsProp
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.none_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTextButtonMod {
  
  @JSImport("wix-style-react/dist/types/TextButton", JSImport.Default)
  @js.native
  open class default ()
    extends Component[TextButtonProps, js.Object, Any]
  
  type TextButton = japgolly.scalajs.react.facade.React.Component[TextButtonProps & js.Object, js.Object]
  
  type TextButtonProps = ButtonWithAsProp[AriaExpanded]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.tiny
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.small
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.medium
  */
  trait TextButtonSize extends StObject
  object TextButtonSize {
    
    inline def medium: typingsJapgolly.wixStyleReact.wixStyleReactStrings.medium = "medium".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.medium]
    
    inline def small: typingsJapgolly.wixStyleReact.wixStyleReactStrings.small = "small".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.small]
    
    inline def tiny: typingsJapgolly.wixStyleReact.wixStyleReactStrings.tiny = "tiny".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.tiny]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.standard
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.light
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.premium
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.dark
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.destructive
  */
  trait TextButtonSkin extends StObject
  object TextButtonSkin {
    
    inline def dark: typingsJapgolly.wixStyleReact.wixStyleReactStrings.dark = "dark".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.dark]
    
    inline def destructive: typingsJapgolly.wixStyleReact.wixStyleReactStrings.destructive = "destructive".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.destructive]
    
    inline def light: typingsJapgolly.wixStyleReact.wixStyleReactStrings.light = "light".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.light]
    
    inline def premium: typingsJapgolly.wixStyleReact.wixStyleReactStrings.premium = "premium".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.premium]
    
    inline def standard: typingsJapgolly.wixStyleReact.wixStyleReactStrings.standard = "standard".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.standard]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.none_
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.onHover
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.always
  */
  trait TextButtonUnderline extends StObject
  object TextButtonUnderline {
    
    inline def always: typingsJapgolly.wixStyleReact.wixStyleReactStrings.always = "always".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.always]
    
    inline def none: none_ = "none".asInstanceOf[none_]
    
    inline def onHover: typingsJapgolly.wixStyleReact.wixStyleReactStrings.onHover = "onHover".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.onHover]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.thin
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.normal
  */
  trait TextButtonWeight extends StObject
  object TextButtonWeight {
    
    inline def normal: typingsJapgolly.wixStyleReact.wixStyleReactStrings.normal = "normal".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.normal]
    
    inline def thin: typingsJapgolly.wixStyleReact.wixStyleReactStrings.thin = "thin".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.thin]
  }
}
