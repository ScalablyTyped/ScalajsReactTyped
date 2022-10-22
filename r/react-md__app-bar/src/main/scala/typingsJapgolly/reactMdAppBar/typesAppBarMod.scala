package typingsJapgolly.reactMdAppBar

import japgolly.scalajs.react.facade.React.ElementType
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesAppBarMod {
  
  @JSImport("@react-md/app-bar/types/AppBar", "AppBar")
  @js.native
  val AppBar: ForwardRefExoticComponent[AppBarProps & RefAttributes[HTMLDivElement]] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactMdAppBar.reactMdAppBarStrings.none
    - typingsJapgolly.reactMdAppBar.reactMdAppBarStrings.normal
    - typingsJapgolly.reactMdAppBar.reactMdAppBarStrings.prominent
    - typingsJapgolly.reactMdAppBar.reactMdAppBarStrings.dense
    - typingsJapgolly.reactMdAppBar.reactMdAppBarStrings.`prominent-dense`
  */
  trait AppBarHeight extends StObject
  object AppBarHeight {
    
    inline def dense: typingsJapgolly.reactMdAppBar.reactMdAppBarStrings.dense = "dense".asInstanceOf[typingsJapgolly.reactMdAppBar.reactMdAppBarStrings.dense]
    
    inline def none: typingsJapgolly.reactMdAppBar.reactMdAppBarStrings.none = "none".asInstanceOf[typingsJapgolly.reactMdAppBar.reactMdAppBarStrings.none]
    
    inline def normal: typingsJapgolly.reactMdAppBar.reactMdAppBarStrings.normal = "normal".asInstanceOf[typingsJapgolly.reactMdAppBar.reactMdAppBarStrings.normal]
    
    inline def prominent: typingsJapgolly.reactMdAppBar.reactMdAppBarStrings.prominent = "prominent".asInstanceOf[typingsJapgolly.reactMdAppBar.reactMdAppBarStrings.prominent]
    
    inline def `prominent-dense`: typingsJapgolly.reactMdAppBar.reactMdAppBarStrings.`prominent-dense` = "prominent-dense".asInstanceOf[typingsJapgolly.reactMdAppBar.reactMdAppBarStrings.`prominent-dense`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactMdAppBar.reactMdAppBarStrings.top
    - typingsJapgolly.reactMdAppBar.reactMdAppBarStrings.bottom
  */
  trait AppBarPosition extends StObject
  object AppBarPosition {
    
    inline def bottom: typingsJapgolly.reactMdAppBar.reactMdAppBarStrings.bottom = "bottom".asInstanceOf[typingsJapgolly.reactMdAppBar.reactMdAppBarStrings.bottom]
    
    inline def top: typingsJapgolly.reactMdAppBar.reactMdAppBarStrings.top = "top".asInstanceOf[typingsJapgolly.reactMdAppBar.reactMdAppBarStrings.top]
  }
  
  trait AppBarProps
    extends StObject
       with HTMLAttributes[HTMLDivElement] {
    
    /**
      * The component for the `AppBar` to render as. This should normally either
      * just be the default `"header"` or a `"div"` component.
      *
      * It is generally recommended to not provide other React components for this
      * prop even though it is possible since it leads to bad practice and props
      * might not get passed as one would expect.
      */
    var component: js.UndefOr[ElementType] = js.undefined
    
    /**
      * Boolean if the `AppBar` should be fixed to the top or bottom of the page.
      */
    var fixed: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean if the fixed `AppBar` should gain elevation. This is recommended to
      * stay enabled unless you manually apply a border to help separate the
      * `AppBar` from other content.
      */
    var fixedElevation: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The position within the page to "fix" the `AppBar` when the `fixed` prop is
      * enabled.
      */
    var fixedPosition: js.UndefOr[AppBarPosition] = js.undefined
    
    /**
      * Boolean if the content of the `AppBar` should be allowed to wrap. When this
      * is omitted, it will be considered true for `"none"`, `"prominent"` and
      * `"prominent-dense"` heights
      */
    var flexWrap: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The height to use for the app bar. See the `AppBarHeight` type for more
      * information.
      */
    var height: js.UndefOr[AppBarHeight] = js.undefined
    
    /**
      * Boolean if the `AppBarNav`, `AppBarTitle`, and `AppBarActions` should
      * inherit the color that for the provided `theme`. If this value is
      * `undefined`, the color will only be inherited when the theme is set to
      * `primary` or `secondary`. However if this value is a boolean, it will be
      * used instead. So if you set this to `false` and set the `theme` to
      * `"primary"`, the defined primary text color will not be inherited.
      */
    var inheritColor: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The theme to apply to the `AppBar`.
      */
    var theme: js.UndefOr[AppBarTheme] = js.undefined
  }
  object AppBarProps {
    
    inline def apply(): AppBarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AppBarProps]
    }
    
    extension [Self <: AppBarProps](x: Self) {
      
      inline def setComponent(value: ElementType): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      inline def setFixed(value: Boolean): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
      
      inline def setFixedElevation(value: Boolean): Self = StObject.set(x, "fixedElevation", value.asInstanceOf[js.Any])
      
      inline def setFixedElevationUndefined: Self = StObject.set(x, "fixedElevation", js.undefined)
      
      inline def setFixedPosition(value: AppBarPosition): Self = StObject.set(x, "fixedPosition", value.asInstanceOf[js.Any])
      
      inline def setFixedPositionUndefined: Self = StObject.set(x, "fixedPosition", js.undefined)
      
      inline def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
      
      inline def setFlexWrap(value: Boolean): Self = StObject.set(x, "flexWrap", value.asInstanceOf[js.Any])
      
      inline def setFlexWrapUndefined: Self = StObject.set(x, "flexWrap", js.undefined)
      
      inline def setHeight(value: AppBarHeight): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setInheritColor(value: Boolean): Self = StObject.set(x, "inheritColor", value.asInstanceOf[js.Any])
      
      inline def setInheritColorUndefined: Self = StObject.set(x, "inheritColor", js.undefined)
      
      inline def setTheme(value: AppBarTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactMdAppBar.reactMdAppBarStrings.clear
    - typingsJapgolly.reactMdAppBar.reactMdAppBarStrings.primary
    - typingsJapgolly.reactMdAppBar.reactMdAppBarStrings.secondary
    - typingsJapgolly.reactMdAppBar.reactMdAppBarStrings.default
  */
  trait AppBarTheme extends StObject
  object AppBarTheme {
    
    inline def default: typingsJapgolly.reactMdAppBar.reactMdAppBarStrings.default = "default".asInstanceOf[typingsJapgolly.reactMdAppBar.reactMdAppBarStrings.default]
    
    inline def clear: typingsJapgolly.reactMdAppBar.reactMdAppBarStrings.clear = "clear".asInstanceOf[typingsJapgolly.reactMdAppBar.reactMdAppBarStrings.clear]
    
    inline def primary: typingsJapgolly.reactMdAppBar.reactMdAppBarStrings.primary = "primary".asInstanceOf[typingsJapgolly.reactMdAppBar.reactMdAppBarStrings.primary]
    
    inline def secondary: typingsJapgolly.reactMdAppBar.reactMdAppBarStrings.secondary = "secondary".asInstanceOf[typingsJapgolly.reactMdAppBar.reactMdAppBarStrings.secondary]
  }
}
