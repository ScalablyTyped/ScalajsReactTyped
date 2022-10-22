package typingsJapgolly.reactNativePaper

import japgolly.scalajs.react.facade.React.Node
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.callstackReactThemeProvider.typingsHoistNonReactStaticsMod.NonReactStatics
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactNative.mod.ImageURISource
import typingsJapgolly.reactNativePaper.anon.IconPropscolorstring
import typingsJapgolly.reactNativePaper.anon.PickPropssourcecolorsizet
import typingsJapgolly.reactNativePaper.libTypescriptComponentsIconMod.IconSource
import typingsJapgolly.reactNativePaper.libTypescriptTypesMod.global.ReactNativePaper.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptComponentsCrossFadeIconMod extends Shortcut {
  
  @JSImport("react-native-paper/lib/typescript/components/CrossFadeIcon", JSImport.Default)
  @js.native
  val default: ComponentType[PickPropssourcecolorsizet] & (NonReactStatics[
    ComponentType[Props] & (js.Function1[/* hasColorSizeSourceTheme */ Props, Element]), 
    js.Object
  ]) = js.native
  
  trait Props extends StObject {
    
    /**
      * Color of the icon.
      */
    var color: String
    
    /**
      * Size of the icon.
      */
    var size: Double
    
    /**
      * Icon to display for the `CrossFadeIcon`.
      */
    var source: IconSource
    
    /**
      * @optional
      */
    var theme: Theme
  }
  object Props {
    
    inline def apply(color: String, size: Double, source: IconSource, theme: Theme): Props = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSource(value: IconSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceFunction1(value: /* props */ IconPropscolorstring => Node): Self = StObject.set(x, "source", js.Any.fromFunction1(value))
      
      inline def setSourceVarargs(value: ImageURISource*): Self = StObject.set(x, "source", js.Array(value*))
      
      inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ComponentType[PickPropssourcecolorsizet] & (NonReactStatics[
    ComponentType[Props] & (js.Function1[/* hasColorSizeSourceTheme */ Props, Element]), 
    js.Object
  ])
  
  /* This means you don't have to write `default`, but can instead just say `libTypescriptComponentsCrossFadeIconMod.foo` */
  override def _to: ComponentType[PickPropssourcecolorsizet] & (NonReactStatics[
    ComponentType[Props] & (js.Function1[/* hasColorSizeSourceTheme */ Props, Element]), 
    js.Object
  ]) = default
}
