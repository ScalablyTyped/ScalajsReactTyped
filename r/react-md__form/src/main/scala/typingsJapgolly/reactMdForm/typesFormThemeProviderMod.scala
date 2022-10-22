package typingsJapgolly.reactMdForm

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesFormThemeProviderMod {
  
  @JSImport("@react-md/form/types/FormThemeProvider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def FormThemeProvider(hasThemeUnderlineDirectionChildren: FormThemeProviderProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("FormThemeProvider")(hasThemeUnderlineDirectionChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def useFormTheme(): FormThemeContext = ^.asInstanceOf[js.Dynamic].applyDynamic("useFormTheme")().asInstanceOf[FormThemeContext]
  inline def useFormTheme(options: FormThemeOptions): FormThemeContext = ^.asInstanceOf[js.Dynamic].applyDynamic("useFormTheme")(options.asInstanceOf[js.Any]).asInstanceOf[FormThemeContext]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactMdForm.reactMdFormStrings.none
    - typingsJapgolly.reactMdForm.reactMdFormStrings.underline
    - typingsJapgolly.reactMdForm.reactMdFormStrings.filled
    - typingsJapgolly.reactMdForm.reactMdFormStrings.outline
  */
  trait FormTheme extends StObject
  object FormTheme {
    
    inline def filled: typingsJapgolly.reactMdForm.reactMdFormStrings.filled = "filled".asInstanceOf[typingsJapgolly.reactMdForm.reactMdFormStrings.filled]
    
    inline def none: typingsJapgolly.reactMdForm.reactMdFormStrings.none = "none".asInstanceOf[typingsJapgolly.reactMdForm.reactMdFormStrings.none]
    
    inline def outline: typingsJapgolly.reactMdForm.reactMdFormStrings.outline = "outline".asInstanceOf[typingsJapgolly.reactMdForm.reactMdFormStrings.outline]
    
    inline def underline: typingsJapgolly.reactMdForm.reactMdFormStrings.underline = "underline".asInstanceOf[typingsJapgolly.reactMdForm.reactMdFormStrings.underline]
  }
  
  /* Inlined std.Required<@react-md/form.@react-md/form/types/FormThemeProvider.FormThemeOptions> */
  trait FormThemeContext extends StObject {
    
    var theme: FormTheme
    
    var underlineDirection: FormUnderlineDirection
  }
  object FormThemeContext {
    
    inline def apply(theme: FormTheme, underlineDirection: FormUnderlineDirection): FormThemeContext = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any], underlineDirection = underlineDirection.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormThemeContext]
    }
    
    extension [Self <: FormThemeContext](x: Self) {
      
      inline def setTheme(value: FormTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setUnderlineDirection(value: FormUnderlineDirection): Self = StObject.set(x, "underlineDirection", value.asInstanceOf[js.Any])
    }
  }
  
  trait FormThemeOptions extends StObject {
    
    /**
      * The current theme type.
      */
    var theme: js.UndefOr[FormTheme] = js.undefined
    
    /**
      * The current underline direction.
      */
    var underlineDirection: js.UndefOr[FormUnderlineDirection] = js.undefined
  }
  object FormThemeOptions {
    
    inline def apply(): FormThemeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormThemeOptions]
    }
    
    extension [Self <: FormThemeOptions](x: Self) {
      
      inline def setTheme(value: FormTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setUnderlineDirection(value: FormUnderlineDirection): Self = StObject.set(x, "underlineDirection", value.asInstanceOf[js.Any])
      
      inline def setUnderlineDirectionUndefined: Self = StObject.set(x, "underlineDirection", js.undefined)
    }
  }
  
  trait FormThemeProviderProps
    extends StObject
       with FormThemeOptions {
    
    var children: Node
  }
  object FormThemeProviderProps {
    
    inline def apply(): FormThemeProviderProps = {
      val __obj = js.Dynamic.literal(children = null)
      __obj.asInstanceOf[FormThemeProviderProps]
    }
    
    extension [Self <: FormThemeProviderProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactMdForm.reactMdFormStrings.left
    - typingsJapgolly.reactMdForm.reactMdFormStrings.center
    - typingsJapgolly.reactMdForm.reactMdFormStrings.right
  */
  trait FormUnderlineDirection extends StObject
  object FormUnderlineDirection {
    
    inline def center: typingsJapgolly.reactMdForm.reactMdFormStrings.center = "center".asInstanceOf[typingsJapgolly.reactMdForm.reactMdFormStrings.center]
    
    inline def left: typingsJapgolly.reactMdForm.reactMdFormStrings.left = "left".asInstanceOf[typingsJapgolly.reactMdForm.reactMdFormStrings.left]
    
    inline def right: typingsJapgolly.reactMdForm.reactMdFormStrings.right = "right".asInstanceOf[typingsJapgolly.reactMdForm.reactMdFormStrings.right]
  }
}
