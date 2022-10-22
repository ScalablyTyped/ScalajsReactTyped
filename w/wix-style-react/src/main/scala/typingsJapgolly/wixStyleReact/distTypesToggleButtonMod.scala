package typingsJapgolly.wixStyleReact

import typingsJapgolly.react.mod.Component
import typingsJapgolly.wixStyleReact.anon.Border
import typingsJapgolly.wixStyleReact.distTypesButtonButtonDottypesMod.ButtonWithAsProp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesToggleButtonMod {
  
  @JSImport("wix-style-react/dist/types/ToggleButton", JSImport.Default)
  @js.native
  open class default ()
    extends Component[ToggleButtonProps, js.Object, Any]
  
  type ToggleButton = japgolly.scalajs.react.facade.React.Component[ToggleButtonProps & js.Object, js.Object]
  
  type ToggleButtonProps = ButtonWithAsProp[Border]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.standard
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.dark
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.inverted
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.destructive
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.success
  */
  trait ToggleButtonSkin extends StObject
  object ToggleButtonSkin {
    
    inline def dark: typingsJapgolly.wixStyleReact.wixStyleReactStrings.dark = "dark".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.dark]
    
    inline def destructive: typingsJapgolly.wixStyleReact.wixStyleReactStrings.destructive = "destructive".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.destructive]
    
    inline def inverted: typingsJapgolly.wixStyleReact.wixStyleReactStrings.inverted = "inverted".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.inverted]
    
    inline def standard: typingsJapgolly.wixStyleReact.wixStyleReactStrings.standard = "standard".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.standard]
    
    inline def success: typingsJapgolly.wixStyleReact.wixStyleReactStrings.success = "success".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.success]
  }
}
