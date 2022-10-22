package typingsJapgolly.reactFlagIconCss

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.csstype.mod.Properties
import typingsJapgolly.csstype.mod.PropertiesHyphen
import typingsJapgolly.react.mod.PureComponent
import typingsJapgolly.reactFlagIconCss.anon.ReadonlyFlagIconOptions
import typingsJapgolly.reactFlagIconCss.reactFlagIconCssInts.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-flag-icon-css", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(react: Any): Instantiable0[FlagIcon] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(react.asInstanceOf[js.Any]).asInstanceOf[Instantiable0[FlagIcon]]
  inline def default(react: Any, opts: ReadonlyFlagIconOptions): Instantiable0[FlagIcon] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(react.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Instantiable0[FlagIcon]]
  
  inline def CustomFlagIconFactory(react: Any): Instantiable0[FlagIcon] = ^.asInstanceOf[js.Dynamic].applyDynamic("CustomFlagIconFactory")(react.asInstanceOf[js.Any]).asInstanceOf[Instantiable0[FlagIcon]]
  inline def CustomFlagIconFactory(react: Any, opts: ReadonlyFlagIconOptions): Instantiable0[FlagIcon] = (^.asInstanceOf[js.Dynamic].applyDynamic("CustomFlagIconFactory")(react.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Instantiable0[FlagIcon]]
  
  @JSImport("react-flag-icon-css", "FlagIcon")
  @js.native
  open class FlagIcon protected ()
    extends PureComponent[FlagIconProps, js.Object, Any] {
    def this(props: FlagIconProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: FlagIconProps, context: Any) = this()
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactFlagIconCss.reactFlagIconCssStrings.horizontal
    - typingsJapgolly.reactFlagIconCss.reactFlagIconCssStrings.vertical
  */
  trait FlagIconFlip extends StObject
  object FlagIconFlip {
    
    inline def horizontal: typingsJapgolly.reactFlagIconCss.reactFlagIconCssStrings.horizontal = "horizontal".asInstanceOf[typingsJapgolly.reactFlagIconCss.reactFlagIconCssStrings.horizontal]
    
    inline def vertical: typingsJapgolly.reactFlagIconCss.reactFlagIconCssStrings.vertical = "vertical".asInstanceOf[typingsJapgolly.reactFlagIconCss.reactFlagIconCssStrings.vertical]
  }
  
  trait FlagIconOptions extends StObject {
    
    /**
      * An object literal whose keys are your custom codes.
      */
    var customCodes: js.UndefOr[StringDictionary[String]] = js.undefined
    
    /**
      * Set this if useCssModules is true and a) you want to apply styles to FlagIcon
      * using .theme-base and/or b) you are using custom flags.
      */
    var themeStyles: js.UndefOr[
        StringDictionary[(Properties[String | `0`, String]) & (PropertiesHyphen[String | `0`, String])]
      ] = js.undefined
    
    /**
      * Use CSS modules styles (your module bundler must be correctly setup).
      */
    var useCssModules: js.UndefOr[Boolean] = js.undefined
  }
  object FlagIconOptions {
    
    inline def apply(): FlagIconOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FlagIconOptions]
    }
    
    extension [Self <: FlagIconOptions](x: Self) {
      
      inline def setCustomCodes(value: StringDictionary[String]): Self = StObject.set(x, "customCodes", value.asInstanceOf[js.Any])
      
      inline def setCustomCodesUndefined: Self = StObject.set(x, "customCodes", js.undefined)
      
      inline def setThemeStyles(
        value: StringDictionary[(Properties[String | `0`, String]) & (PropertiesHyphen[String | `0`, String])]
      ): Self = StObject.set(x, "themeStyles", value.asInstanceOf[js.Any])
      
      inline def setThemeStylesUndefined: Self = StObject.set(x, "themeStyles", js.undefined)
      
      inline def setUseCssModules(value: Boolean): Self = StObject.set(x, "useCssModules", value.asInstanceOf[js.Any])
      
      inline def setUseCssModulesUndefined: Self = StObject.set(x, "useCssModules", js.undefined)
    }
  }
  
  trait FlagIconProps extends StObject {
    
    var Component: js.UndefOr[String] = js.undefined
    
    var children: js.UndefOr[Node] = js.undefined
    
    /**
      * This is always appended as-is to class in the HTML.
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * ISO 3166-1-alpha-2 code.
      */
    var code: String
    
    var flip: js.UndefOr[FlagIconFlip] = js.undefined
    
    var rotate: js.UndefOr[FlagIconRotate] = js.undefined
    
    var size: js.UndefOr[FlagIconSize] = js.undefined
    
    /**
      *     Uses the 1x1 image if true.
      */
    var squared: js.UndefOr[Boolean] = js.undefined
    
    /**
      * This is mapped to a CSS module and appended to class in the HTML.
      */
    var styleName: js.UndefOr[String] = js.undefined
  }
  object FlagIconProps {
    
    inline def apply(code: String): FlagIconProps = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
      __obj.asInstanceOf[FlagIconProps]
    }
    
    extension [Self <: FlagIconProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setComponent(value: String): Self = StObject.set(x, "Component", value.asInstanceOf[js.Any])
      
      inline def setComponentUndefined: Self = StObject.set(x, "Component", js.undefined)
      
      inline def setFlip(value: FlagIconFlip): Self = StObject.set(x, "flip", value.asInstanceOf[js.Any])
      
      inline def setFlipUndefined: Self = StObject.set(x, "flip", js.undefined)
      
      inline def setRotate(value: FlagIconRotate): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
      
      inline def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
      
      inline def setSize(value: FlagIconSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSquared(value: Boolean): Self = StObject.set(x, "squared", value.asInstanceOf[js.Any])
      
      inline def setSquaredUndefined: Self = StObject.set(x, "squared", js.undefined)
      
      inline def setStyleName(value: String): Self = StObject.set(x, "styleName", value.asInstanceOf[js.Any])
      
      inline def setStyleNameUndefined: Self = StObject.set(x, "styleName", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactFlagIconCss.reactFlagIconCssInts.`30`
    - typingsJapgolly.reactFlagIconCss.reactFlagIconCssInts.`60`
    - typingsJapgolly.reactFlagIconCss.reactFlagIconCssInts.`90`
    - typingsJapgolly.reactFlagIconCss.reactFlagIconCssInts.`180`
    - typingsJapgolly.reactFlagIconCss.reactFlagIconCssInts.`270`
  */
  trait FlagIconRotate extends StObject
  object FlagIconRotate {
    
    inline def `180`: typingsJapgolly.reactFlagIconCss.reactFlagIconCssInts.`180` = 180.asInstanceOf[typingsJapgolly.reactFlagIconCss.reactFlagIconCssInts.`180`]
    
    inline def `270`: typingsJapgolly.reactFlagIconCss.reactFlagIconCssInts.`270` = 270.asInstanceOf[typingsJapgolly.reactFlagIconCss.reactFlagIconCssInts.`270`]
    
    inline def `30`: typingsJapgolly.reactFlagIconCss.reactFlagIconCssInts.`30` = 30.asInstanceOf[typingsJapgolly.reactFlagIconCss.reactFlagIconCssInts.`30`]
    
    inline def `60`: typingsJapgolly.reactFlagIconCss.reactFlagIconCssInts.`60` = 60.asInstanceOf[typingsJapgolly.reactFlagIconCss.reactFlagIconCssInts.`60`]
    
    inline def `90`: typingsJapgolly.reactFlagIconCss.reactFlagIconCssInts.`90` = 90.asInstanceOf[typingsJapgolly.reactFlagIconCss.reactFlagIconCssInts.`90`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactFlagIconCss.reactFlagIconCssStrings.lg
    - typingsJapgolly.reactFlagIconCss.reactFlagIconCssStrings.`2x`
    - typingsJapgolly.reactFlagIconCss.reactFlagIconCssStrings.`3x`
    - typingsJapgolly.reactFlagIconCss.reactFlagIconCssStrings.`4x`
    - typingsJapgolly.reactFlagIconCss.reactFlagIconCssStrings.`5x`
  */
  trait FlagIconSize extends StObject
  object FlagIconSize {
    
    inline def `2x`: typingsJapgolly.reactFlagIconCss.reactFlagIconCssStrings.`2x` = "2x".asInstanceOf[typingsJapgolly.reactFlagIconCss.reactFlagIconCssStrings.`2x`]
    
    inline def `3x`: typingsJapgolly.reactFlagIconCss.reactFlagIconCssStrings.`3x` = "3x".asInstanceOf[typingsJapgolly.reactFlagIconCss.reactFlagIconCssStrings.`3x`]
    
    inline def `4x`: typingsJapgolly.reactFlagIconCss.reactFlagIconCssStrings.`4x` = "4x".asInstanceOf[typingsJapgolly.reactFlagIconCss.reactFlagIconCssStrings.`4x`]
    
    inline def `5x`: typingsJapgolly.reactFlagIconCss.reactFlagIconCssStrings.`5x` = "5x".asInstanceOf[typingsJapgolly.reactFlagIconCss.reactFlagIconCssStrings.`5x`]
    
    inline def lg: typingsJapgolly.reactFlagIconCss.reactFlagIconCssStrings.lg = "lg".asInstanceOf[typingsJapgolly.reactFlagIconCss.reactFlagIconCssStrings.lg]
  }
}
