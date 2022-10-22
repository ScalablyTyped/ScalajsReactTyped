package typingsJapgolly.reactMdMenu.typesTypesMod

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@react-md/icon.@react-md/icon.TextIconSpacingProps, 'icon' | 'iconAfter'> */
trait MenuButtonTextIconSpacingProps extends StObject {
  
  var icon: js.UndefOr[Element | Node] = js.undefined
  
  var iconAfter: js.UndefOr[Boolean] = js.undefined
}
object MenuButtonTextIconSpacingProps {
  
  inline def apply(): MenuButtonTextIconSpacingProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MenuButtonTextIconSpacingProps]
  }
  
  extension [Self <: MenuButtonTextIconSpacingProps](x: Self) {
    
    inline def setIcon(value: Element | Node): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconAfter(value: Boolean): Self = StObject.set(x, "iconAfter", value.asInstanceOf[js.Any])
    
    inline def setIconAfterUndefined: Self = StObject.set(x, "iconAfter", js.undefined)
    
    inline def setIconNull: Self = StObject.set(x, "icon", null)
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "icon", js.Array(value*))
    
    inline def setIconVdomElement(value: VdomElement): Self = StObject.set(x, "icon", value.rawElement.asInstanceOf[js.Any])
  }
}
