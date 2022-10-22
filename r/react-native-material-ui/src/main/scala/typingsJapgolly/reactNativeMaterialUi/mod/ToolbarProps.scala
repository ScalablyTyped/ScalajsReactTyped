package typingsJapgolly.reactNativeMaterialUi.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToolbarProps extends StObject {
  
  var centerElement: js.UndefOr[Element | String] = js.undefined
  
  var hidden: js.UndefOr[Boolean] = js.undefined
  
  var isSearchActive: js.UndefOr[Boolean] = js.undefined
  
  var leftElement: js.UndefOr[Element | String] = js.undefined
  
  var onLeftElementPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onRightElementPress: js.UndefOr[js.Function1[/* e */ RightElementPressEvent, Unit]] = js.undefined
  
  var rightElement: js.UndefOr[Element | String | js.Array[String] | ToolBarRightElement] = js.undefined
  
  var searchable: js.UndefOr[Searchable] = js.undefined
  
  var size: js.UndefOr[Double] = js.undefined
  
  var style: js.UndefOr[ToolbarStyle] = js.undefined
}
object ToolbarProps {
  
  inline def apply(): ToolbarProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToolbarProps]
  }
  
  extension [Self <: ToolbarProps](x: Self) {
    
    inline def setCenterElement(value: Element | String): Self = StObject.set(x, "centerElement", value.asInstanceOf[js.Any])
    
    inline def setCenterElementUndefined: Self = StObject.set(x, "centerElement", js.undefined)
    
    inline def setCenterElementVdomElement(value: VdomElement): Self = StObject.set(x, "centerElement", value.rawElement.asInstanceOf[js.Any])
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    inline def setIsSearchActive(value: Boolean): Self = StObject.set(x, "isSearchActive", value.asInstanceOf[js.Any])
    
    inline def setIsSearchActiveUndefined: Self = StObject.set(x, "isSearchActive", js.undefined)
    
    inline def setLeftElement(value: Element | String): Self = StObject.set(x, "leftElement", value.asInstanceOf[js.Any])
    
    inline def setLeftElementUndefined: Self = StObject.set(x, "leftElement", js.undefined)
    
    inline def setLeftElementVdomElement(value: VdomElement): Self = StObject.set(x, "leftElement", value.rawElement.asInstanceOf[js.Any])
    
    inline def setOnLeftElementPress(value: Callback): Self = StObject.set(x, "onLeftElementPress", value.toJsFn)
    
    inline def setOnLeftElementPressUndefined: Self = StObject.set(x, "onLeftElementPress", js.undefined)
    
    inline def setOnPress(value: Callback): Self = StObject.set(x, "onPress", value.toJsFn)
    
    inline def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
    
    inline def setOnRightElementPress(value: /* e */ RightElementPressEvent => Callback): Self = StObject.set(x, "onRightElementPress", js.Any.fromFunction1((t0: /* e */ RightElementPressEvent) => value(t0).runNow()))
    
    inline def setOnRightElementPressUndefined: Self = StObject.set(x, "onRightElementPress", js.undefined)
    
    inline def setRightElement(value: Element | String | js.Array[String] | ToolBarRightElement): Self = StObject.set(x, "rightElement", value.asInstanceOf[js.Any])
    
    inline def setRightElementUndefined: Self = StObject.set(x, "rightElement", js.undefined)
    
    inline def setRightElementVarargs(value: String*): Self = StObject.set(x, "rightElement", js.Array(value*))
    
    inline def setRightElementVdomElement(value: VdomElement): Self = StObject.set(x, "rightElement", value.rawElement.asInstanceOf[js.Any])
    
    inline def setSearchable(value: Searchable): Self = StObject.set(x, "searchable", value.asInstanceOf[js.Any])
    
    inline def setSearchableUndefined: Self = StObject.set(x, "searchable", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setStyle(value: ToolbarStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
