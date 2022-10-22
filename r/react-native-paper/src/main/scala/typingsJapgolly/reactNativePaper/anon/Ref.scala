package typingsJapgolly.reactNativePaper.anon

import japgolly.scalajs.react.facade.React.RefHandle
import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.reactNative.mod.Animated.AnimatedComponent
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod._Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ref extends StObject {
  
  /**
    * Content of the `Badge`.
    */
  var children: js.UndefOr[String | Double] = js.undefined
  
  var ref: js.UndefOr[RefHandle[AnimatedComponent[Instantiable0[_Text]]]] = js.undefined
  
  /**
    * Size of the `Badge`.
    */
  var size: js.UndefOr[Double] = js.undefined
  
  var style: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  /**
    * @optional
    */
  var theme: typingsJapgolly.reactNativePaper.libTypescriptTypesMod.global.ReactNativePaper.Theme
  
  /**
    * Whether the badge is visible
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object Ref {
  
  inline def apply(theme: typingsJapgolly.reactNativePaper.libTypescriptTypesMod.global.ReactNativePaper.Theme): Ref = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ref]
  }
  
  extension [Self <: Ref](x: Self) {
    
    inline def setChildren(value: String | Double): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setRef(value: RefHandle[AnimatedComponent[Instantiable0[_Text]]]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTheme(value: typingsJapgolly.reactNativePaper.libTypescriptTypesMod.global.ReactNativePaper.Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
