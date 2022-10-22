package typingsJapgolly.reactMdButton

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesButtonThemeClassNamesMod {
  
  @JSImport("@react-md/button/types/buttonThemeClassNames", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def buttonThemeClassNames(hasPropThemeThemeTypeButtonTypePropDisabledClassName: ButtonThemeProps): String = ^.asInstanceOf[js.Dynamic].applyDynamic("buttonThemeClassNames")(hasPropThemeThemeTypeButtonTypePropDisabledClassName.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactMdButton.reactMdButtonStrings.clear
    - typingsJapgolly.reactMdButton.reactMdButtonStrings.primary
    - typingsJapgolly.reactMdButton.reactMdButtonStrings.secondary
    - typingsJapgolly.reactMdButton.reactMdButtonStrings.warning
    - typingsJapgolly.reactMdButton.reactMdButtonStrings.error
    - typingsJapgolly.reactMdButton.reactMdButtonStrings.disabled
  */
  trait ButtonTheme extends StObject
  object ButtonTheme {
    
    inline def clear: typingsJapgolly.reactMdButton.reactMdButtonStrings.clear = "clear".asInstanceOf[typingsJapgolly.reactMdButton.reactMdButtonStrings.clear]
    
    inline def disabled: typingsJapgolly.reactMdButton.reactMdButtonStrings.disabled = "disabled".asInstanceOf[typingsJapgolly.reactMdButton.reactMdButtonStrings.disabled]
    
    inline def error: typingsJapgolly.reactMdButton.reactMdButtonStrings.error = "error".asInstanceOf[typingsJapgolly.reactMdButton.reactMdButtonStrings.error]
    
    inline def primary: typingsJapgolly.reactMdButton.reactMdButtonStrings.primary = "primary".asInstanceOf[typingsJapgolly.reactMdButton.reactMdButtonStrings.primary]
    
    inline def secondary: typingsJapgolly.reactMdButton.reactMdButtonStrings.secondary = "secondary".asInstanceOf[typingsJapgolly.reactMdButton.reactMdButtonStrings.secondary]
    
    inline def warning: typingsJapgolly.reactMdButton.reactMdButtonStrings.warning = "warning".asInstanceOf[typingsJapgolly.reactMdButton.reactMdButtonStrings.warning]
  }
  
  trait ButtonThemeProps extends StObject {
    
    /**
      * This is the specific material design button type to use. This can either be
      * set to "text" or "icon". When this is set to "text", the styles applied
      * will make buttons with just text or text with icons render nicely. When
      * this is set to "icon", the styles applied will make icon only buttons
      * render nicely.
      */
    var buttonType: js.UndefOr[ButtonType] = js.undefined
    
    /**
      * An optional className to also apply to the button for additional theming
      * and styling. This will be merged with the `Button.theme` class name styles.
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Enabling this prop will apply the disabled styles to a `Button`. When this
      * is also applied to the button component, the button will be updated so that
      * it can no longer be interacted with.
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The material design theme to apply to the button. The theme prop will
      * update the look and feel of the button by applying different background
      * and/or foreground colors.
      */
    var theme: js.UndefOr[ButtonTheme] = js.undefined
    
    /**
      * The material design theme type to apply. The themeTYpe prop will update the
      * look and feel of the button by applying different border or box shadow.
      */
    var themeType: js.UndefOr[ButtonThemeType] = js.undefined
  }
  object ButtonThemeProps {
    
    inline def apply(): ButtonThemeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ButtonThemeProps]
    }
    
    extension [Self <: ButtonThemeProps](x: Self) {
      
      inline def setButtonType(value: ButtonType): Self = StObject.set(x, "buttonType", value.asInstanceOf[js.Any])
      
      inline def setButtonTypeUndefined: Self = StObject.set(x, "buttonType", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setTheme(value: ButtonTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeType(value: ButtonThemeType): Self = StObject.set(x, "themeType", value.asInstanceOf[js.Any])
      
      inline def setThemeTypeUndefined: Self = StObject.set(x, "themeType", js.undefined)
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactMdButton.reactMdButtonStrings.flat
    - typingsJapgolly.reactMdButton.reactMdButtonStrings.outline
    - typingsJapgolly.reactMdButton.reactMdButtonStrings.contained
  */
  trait ButtonThemeType extends StObject
  object ButtonThemeType {
    
    inline def contained: typingsJapgolly.reactMdButton.reactMdButtonStrings.contained = "contained".asInstanceOf[typingsJapgolly.reactMdButton.reactMdButtonStrings.contained]
    
    inline def flat: typingsJapgolly.reactMdButton.reactMdButtonStrings.flat = "flat".asInstanceOf[typingsJapgolly.reactMdButton.reactMdButtonStrings.flat]
    
    inline def outline: typingsJapgolly.reactMdButton.reactMdButtonStrings.outline = "outline".asInstanceOf[typingsJapgolly.reactMdButton.reactMdButtonStrings.outline]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactMdButton.reactMdButtonStrings.text
    - typingsJapgolly.reactMdButton.reactMdButtonStrings.icon
  */
  trait ButtonType extends StObject
  object ButtonType {
    
    inline def icon: typingsJapgolly.reactMdButton.reactMdButtonStrings.icon = "icon".asInstanceOf[typingsJapgolly.reactMdButton.reactMdButtonStrings.icon]
    
    inline def text: typingsJapgolly.reactMdButton.reactMdButtonStrings.text = "text".asInstanceOf[typingsJapgolly.reactMdButton.reactMdButtonStrings.text]
  }
}
