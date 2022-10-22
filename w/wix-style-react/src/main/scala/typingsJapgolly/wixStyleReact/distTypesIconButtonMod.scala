package typingsJapgolly.wixStyleReact

import typingsJapgolly.react.mod.Component
import typingsJapgolly.wixStyleReact.anon.Priority
import typingsJapgolly.wixStyleReact.distTypesButtonButtonDottypesMod.ButtonWithAsProp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesIconButtonMod {
  
  @JSImport("wix-style-react/dist/types/IconButton", JSImport.Default)
  @js.native
  open class default () extends IconButton
  
  @js.native
  trait IconButton
    extends Component[IconButtonProps, js.Object, Any] {
    
    def focus(): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.primary
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.secondary
  */
  trait IconButtonPriority extends StObject
  object IconButtonPriority {
    
    inline def primary: typingsJapgolly.wixStyleReact.wixStyleReactStrings.primary = "primary".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.primary]
    
    inline def secondary: typingsJapgolly.wixStyleReact.wixStyleReactStrings.secondary = "secondary".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.secondary]
  }
  
  type IconButtonProps = ButtonWithAsProp[Priority]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.tiny
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.small
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.medium
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.large
  */
  trait IconButtonSize extends StObject
  object IconButtonSize {
    
    inline def large: typingsJapgolly.wixStyleReact.wixStyleReactStrings.large = "large".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.large]
    
    inline def medium: typingsJapgolly.wixStyleReact.wixStyleReactStrings.medium = "medium".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.medium]
    
    inline def small: typingsJapgolly.wixStyleReact.wixStyleReactStrings.small = "small".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.small]
    
    inline def tiny: typingsJapgolly.wixStyleReact.wixStyleReactStrings.tiny = "tiny".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.tiny]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.standard
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.inverted
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.light
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.transparent
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.premium
  */
  trait IconButtonSkin extends StObject
  object IconButtonSkin {
    
    inline def inverted: typingsJapgolly.wixStyleReact.wixStyleReactStrings.inverted = "inverted".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.inverted]
    
    inline def light: typingsJapgolly.wixStyleReact.wixStyleReactStrings.light = "light".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.light]
    
    inline def premium: typingsJapgolly.wixStyleReact.wixStyleReactStrings.premium = "premium".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.premium]
    
    inline def standard: typingsJapgolly.wixStyleReact.wixStyleReactStrings.standard = "standard".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.standard]
    
    inline def transparent: typingsJapgolly.wixStyleReact.wixStyleReactStrings.transparent = "transparent".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.transparent]
  }
}
