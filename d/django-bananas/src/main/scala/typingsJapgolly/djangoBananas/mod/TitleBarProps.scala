package typingsJapgolly.djangoBananas.mod

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.djangoBananas.djangoBananasStrings.around
import typingsJapgolly.djangoBananas.djangoBananasStrings.between
import typingsJapgolly.djangoBananas.djangoBananasStrings.center
import typingsJapgolly.djangoBananas.djangoBananasStrings.end
import typingsJapgolly.djangoBananas.djangoBananasStrings.evenly
import typingsJapgolly.djangoBananas.djangoBananasStrings.paper
import typingsJapgolly.djangoBananas.djangoBananasStrings.primary
import typingsJapgolly.djangoBananas.djangoBananasStrings.secondary
import typingsJapgolly.djangoBananas.djangoBananasStrings.start
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TitleBarProps extends StObject {
  
  var back: js.UndefOr[Boolean | String] = js.undefined
  
  var children: js.UndefOr[js.Array[Node] | Node] = js.undefined
  
  var color: js.UndefOr[primary | secondary | paper] = js.undefined
  
  var dense: js.UndefOr[Boolean] = js.undefined
  
  var justify: js.UndefOr[start | center | end | between | around | evenly] = js.undefined
  
  var overrides: js.UndefOr[Any] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
}
object TitleBarProps {
  
  inline def apply(): TitleBarProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TitleBarProps]
  }
  
  extension [Self <: TitleBarProps](x: Self) {
    
    inline def setBack(value: Boolean | String): Self = StObject.set(x, "back", value.asInstanceOf[js.Any])
    
    inline def setBackUndefined: Self = StObject.set(x, "back", js.undefined)
    
    inline def setChildren(value: js.Array[Node] | Node): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (Element | Empty | JsNumber | Node | String)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setColor(value: primary | secondary | paper): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDense(value: Boolean): Self = StObject.set(x, "dense", value.asInstanceOf[js.Any])
    
    inline def setDenseUndefined: Self = StObject.set(x, "dense", js.undefined)
    
    inline def setJustify(value: start | center | end | between | around | evenly): Self = StObject.set(x, "justify", value.asInstanceOf[js.Any])
    
    inline def setJustifyUndefined: Self = StObject.set(x, "justify", js.undefined)
    
    inline def setOverrides(value: Any): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
