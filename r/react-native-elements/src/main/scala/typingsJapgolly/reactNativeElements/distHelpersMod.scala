package typingsJapgolly.reactNativeElements

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.color.mod.Color
import typingsJapgolly.color.mod.ColorConstructor
import typingsJapgolly.color.mod.ColorParam
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.reactNativeElements.distConfigThemeProviderMod.ThemeProps
import typingsJapgolly.reactNativeElements.distIconsIconMod.IconType
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.ansi16
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.ansi256
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.apple
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.cmyk
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.gray
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.hcg
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.hex
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.hsl
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.hsv
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.hwb
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.keyword
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.lab
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.lch
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.onClear
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.replaceTheme
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.rgb
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.updateTheme
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.xyz
import typingsJapgolly.std.Exclude
import typingsJapgolly.std.Partial
import typingsJapgolly.std.Pick
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distHelpersMod {
  
  @JSImport("react-native-elements/dist/helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-native-elements/dist/helpers", "ScreenHeight")
  @js.native
  val ScreenHeight: Double = js.native
  
  @JSImport("react-native-elements/dist/helpers", "ScreenWidth")
  @js.native
  val ScreenWidth: Double = js.native
  
  object color extends Shortcut {
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("react-native-elements/dist/helpers", "color")
    @js.native
    open class ^[T /* <: ColorParam */] ()
      extends StObject
         with Color[T] {
      def this(obj: T) = this()
      def this(
        obj: T,
        model: /* keyof color.anon.Typeofconvert */ rgb | xyz | hcg | ansi256 | ansi16 | hex | lch | cmyk | hsl | keyword | gray | hsv | apple | hwb | lab
      ) = this()
      def this(
        obj: Unit,
        model: /* keyof color.anon.Typeofconvert */ rgb | xyz | hcg | ansi256 | ansi16 | hex | lch | cmyk | hsl | keyword | gray | hsv | apple | hwb | lab
      ) = this()
    }
    
    @JSImport("react-native-elements/dist/helpers", "color")
    @js.native
    val ^ : js.Object & ColorConstructor = js.native
    
    type _To = js.Object & ColorConstructor
    
    /* This means you don't have to write `^`, but can instead just say `color.foo` */
    override def _to: js.Object & ColorConstructor = ^
  }
  
  inline def getIconType(`type`: IconType): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getIconType")(`type`.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("react-native-elements/dist/helpers", "isIOS")
  @js.native
  val isIOS: Boolean = js.native
  
  inline def normalizeText(number: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeText")(number.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def normalizeText(number: Double, factor: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeText")(number.asInstanceOf[js.Any], factor.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def patchWebProps[T /* <: Record[Any, Any] */](hasUpdateThemeReplaceThemeOnClearRest: T): Pick[T, Exclude[/* keyof T */ String, updateTheme | replaceTheme | onClear]] = ^.asInstanceOf[js.Dynamic].applyDynamic("patchWebProps")(hasUpdateThemeReplaceThemeOnClearRest.asInstanceOf[js.Any]).asInstanceOf[Pick[T, Exclude[/* keyof T */ String, updateTheme | replaceTheme | onClear]]]
  
  inline def renderNode(Component: Any, content: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("renderNode")(Component.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def renderNode(Component: Any, content: Any, defaultProps: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("renderNode")(Component.asInstanceOf[js.Any], content.asInstanceOf[js.Any], defaultProps.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  type RneFunctionComponent[T] = FunctionComponent[T & Partial[ThemeProps[T]]]
}
