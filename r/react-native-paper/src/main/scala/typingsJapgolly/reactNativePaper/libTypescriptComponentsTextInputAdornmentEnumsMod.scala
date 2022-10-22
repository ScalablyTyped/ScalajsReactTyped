package typingsJapgolly.reactNativePaper

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptComponentsTextInputAdornmentEnumsMod {
  
  @js.native
  sealed trait AdornmentSide extends StObject
  @JSImport("react-native-paper/lib/typescript/components/TextInput/Adornment/enums", "AdornmentSide")
  @js.native
  object AdornmentSide extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[AdornmentSide & String] = js.native
    
    @js.native
    sealed trait Left
      extends StObject
         with AdornmentSide
    /* "left" */ val Left: typingsJapgolly.reactNativePaper.libTypescriptComponentsTextInputAdornmentEnumsMod.AdornmentSide.Left & String = js.native
    
    @js.native
    sealed trait Right
      extends StObject
         with AdornmentSide
    /* "right" */ val Right: typingsJapgolly.reactNativePaper.libTypescriptComponentsTextInputAdornmentEnumsMod.AdornmentSide.Right & String = js.native
  }
  
  @js.native
  sealed trait AdornmentType extends StObject
  @JSImport("react-native-paper/lib/typescript/components/TextInput/Adornment/enums", "AdornmentType")
  @js.native
  object AdornmentType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[AdornmentType & String] = js.native
    
    @js.native
    sealed trait Affix
      extends StObject
         with AdornmentType
    /* "affix" */ val Affix: typingsJapgolly.reactNativePaper.libTypescriptComponentsTextInputAdornmentEnumsMod.AdornmentType.Affix & String = js.native
    
    @js.native
    sealed trait Icon
      extends StObject
         with AdornmentType
    /* "icon" */ val Icon: typingsJapgolly.reactNativePaper.libTypescriptComponentsTextInputAdornmentEnumsMod.AdornmentType.Icon & String = js.native
  }
  
  @js.native
  sealed trait InputMode extends StObject
  @JSImport("react-native-paper/lib/typescript/components/TextInput/Adornment/enums", "InputMode")
  @js.native
  object InputMode extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[InputMode & String] = js.native
    
    @js.native
    sealed trait Flat
      extends StObject
         with InputMode
    /* "flat" */ val Flat: typingsJapgolly.reactNativePaper.libTypescriptComponentsTextInputAdornmentEnumsMod.InputMode.Flat & String = js.native
    
    @js.native
    sealed trait Outlined
      extends StObject
         with InputMode
    /* "outlined" */ val Outlined: typingsJapgolly.reactNativePaper.libTypescriptComponentsTextInputAdornmentEnumsMod.InputMode.Outlined & String = js.native
  }
}
