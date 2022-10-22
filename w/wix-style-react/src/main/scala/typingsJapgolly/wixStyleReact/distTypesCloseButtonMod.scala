package typingsJapgolly.wixStyleReact

import typingsJapgolly.react.mod.Component
import typingsJapgolly.wixStyleReact.anon.ClassNameDataHook
import typingsJapgolly.wixStyleReact.distTypesButtonButtonDottypesMod.ButtonWithAsProp
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.none_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCloseButtonMod {
  
  @JSImport("wix-style-react/dist/types/CloseButton", JSImport.Default)
  @js.native
  open class default ()
    extends Component[CloseButtonProps, js.Object, Any]
  
  type CloseButton = japgolly.scalajs.react.facade.React.Component[CloseButtonProps & js.Object, js.Object]
  
  type CloseButtonProps = ButtonWithAsProp[ClassNameDataHook]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.none_
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.hover
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.always
  */
  trait CloseButtonSelectionArea extends StObject
  object CloseButtonSelectionArea {
    
    inline def always: typingsJapgolly.wixStyleReact.wixStyleReactStrings.always = "always".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.always]
    
    inline def hover: typingsJapgolly.wixStyleReact.wixStyleReactStrings.hover = "hover".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.hover]
    
    inline def none: none_ = "none".asInstanceOf[none_]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.small
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.medium
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.large
  */
  trait CloseButtonSize extends StObject
  object CloseButtonSize {
    
    inline def large: typingsJapgolly.wixStyleReact.wixStyleReactStrings.large = "large".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.large]
    
    inline def medium: typingsJapgolly.wixStyleReact.wixStyleReactStrings.medium = "medium".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.medium]
    
    inline def small: typingsJapgolly.wixStyleReact.wixStyleReactStrings.small = "small".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.small]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.standard
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.standardFilled
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.light
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.lightFilled
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.dark
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.transparent
  */
  trait CloseButtonSkin extends StObject
  object CloseButtonSkin {
    
    inline def dark: typingsJapgolly.wixStyleReact.wixStyleReactStrings.dark = "dark".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.dark]
    
    inline def light: typingsJapgolly.wixStyleReact.wixStyleReactStrings.light = "light".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.light]
    
    inline def lightFilled: typingsJapgolly.wixStyleReact.wixStyleReactStrings.lightFilled = "lightFilled".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.lightFilled]
    
    inline def standard: typingsJapgolly.wixStyleReact.wixStyleReactStrings.standard = "standard".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.standard]
    
    inline def standardFilled: typingsJapgolly.wixStyleReact.wixStyleReactStrings.standardFilled = "standardFilled".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.standardFilled]
    
    inline def transparent: typingsJapgolly.wixStyleReact.wixStyleReactStrings.transparent = "transparent".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.transparent]
  }
}
