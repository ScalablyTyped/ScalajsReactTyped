package typingsJapgolly.reactNativePaper

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactNative.mod.ImageURISource
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativePaper.anon.ForceTextInputFocus
import typingsJapgolly.reactNativePaper.anon.IconPropscolorstring
import typingsJapgolly.reactNativePaper.anon.testIDstringiconReactNode
import typingsJapgolly.reactNativePaper.libTypescriptComponentsIconMod.IconSource
import typingsJapgolly.reactNativePaper.libTypescriptTypesMod.global.ReactNativePaper.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptComponentsTextInputAdornmentTextInputIconMod {
  
  /**
    * A component to render a leading / trailing icon in the TextInput
    *
    * <div class="screenshots">
    *   <figure>
    *     <img class="medium" src="screenshots/textinput-flat.icon.png" />
    *   </figure>
    * </div>
    *
    * ## Usage
    * ```js
    * import * as React from 'react';
    * import { TextInput } from 'react-native-paper';
    *
    * const MyComponent = () => {
    *   const [text, setText] = React.useState('');
    *
    *   return (
    *     <TextInput
    *       label="Password"
    *       secureTextEntry
    *       right={<TextInput.Icon name="eye" />}
    *     />
    *   );
    * };
    *
    * export default MyComponent;
    * ```
    */
  object default {
    
    inline def apply(hasNameOnPressForceTextInputFocusColorRest: Props): Element = ^.asInstanceOf[js.Dynamic].apply(hasNameOnPressForceTextInputFocusColorRest.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("react-native-paper/lib/typescript/components/TextInput/Adornment/TextInputIcon", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-paper/lib/typescript/components/TextInput/Adornment/TextInputIcon", "default.defaultProps")
    @js.native
    def defaultProps: ForceTextInputFocus = js.native
    inline def defaultProps_=(x: ForceTextInputFocus): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-paper/lib/typescript/components/TextInput/Adornment/TextInputIcon", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-native-paper/lib/typescript/components/TextInput/Adornment/TextInputIcon", "ICON_SIZE")
  @js.native
  val ICON_SIZE: /* 24 */ Double = js.native
  
  @JSImport("react-native-paper/lib/typescript/components/TextInput/Adornment/TextInputIcon", "IconAdornment")
  @js.native
  val IconAdornment: FunctionComponent[testIDstringiconReactNode] = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify $Omit<React.ComponentProps<typeof IconButton>, 'icon' | 'theme' | 'color'> * / any */ trait Props extends StObject {
    
    /**
      * Color of the icon or a function receiving a boolean indicating whether the TextInput is focused and returning the color.
      */
    var color: js.UndefOr[(js.Function1[/* isTextInputFocused */ Boolean, js.UndefOr[String]]) | String] = js.undefined
    
    /**
      * Whether the TextInput will focus after onPress.
      */
    var forceTextInputFocus: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Icon to show.
      */
    var name: IconSource
    
    /**
      * Function to execute on press.
      */
    var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    /**
      * @optional
      */
    var theme: js.UndefOr[Theme] = js.undefined
  }
  object Props {
    
    inline def apply(name: IconSource): Props = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setColor(value: (js.Function1[/* isTextInputFocused */ Boolean, js.UndefOr[String]]) | String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorFunction1(value: /* isTextInputFocused */ Boolean => js.UndefOr[String]): Self = StObject.set(x, "color", js.Any.fromFunction1(value))
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setForceTextInputFocus(value: Boolean): Self = StObject.set(x, "forceTextInputFocus", value.asInstanceOf[js.Any])
      
      inline def setForceTextInputFocusUndefined: Self = StObject.set(x, "forceTextInputFocus", js.undefined)
      
      inline def setName(value: IconSource): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameFunction1(value: /* props */ IconPropscolorstring => Node): Self = StObject.set(x, "name", js.Any.fromFunction1(value))
      
      inline def setNameVarargs(value: ImageURISource*): Self = StObject.set(x, "name", js.Array(value*))
      
      inline def setOnPress(value: Callback): Self = StObject.set(x, "onPress", value.toJsFn)
      
      inline def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  trait StyleContextType extends StObject {
    
    def forceFocus(): Unit
    
    var isTextInputFocused: Boolean
    
    var style: StyleProp[ViewStyle]
  }
  object StyleContextType {
    
    inline def apply(forceFocus: Callback, isTextInputFocused: Boolean): StyleContextType = {
      val __obj = js.Dynamic.literal(forceFocus = forceFocus.toJsFn, isTextInputFocused = isTextInputFocused.asInstanceOf[js.Any])
      __obj.asInstanceOf[StyleContextType]
    }
    
    extension [Self <: StyleContextType](x: Self) {
      
      inline def setForceFocus(value: Callback): Self = StObject.set(x, "forceFocus", value.toJsFn)
      
      inline def setIsTextInputFocused(value: Boolean): Self = StObject.set(x, "isTextInputFocused", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
