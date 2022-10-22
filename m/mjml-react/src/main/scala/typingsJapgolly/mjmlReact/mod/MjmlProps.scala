package typingsJapgolly.mjmlReact.mod

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MjmlProps extends StObject {
  
  var children: js.UndefOr[Node] = js.undefined
  
  var lang: js.UndefOr[String] = js.undefined
  
  var owa: js.UndefOr[String] = js.undefined
}
object MjmlProps {
  
  inline def apply(): MjmlProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MjmlProps]
  }
  
  extension [Self <: MjmlProps](x: Self) {
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
    
    inline def setOwa(value: String): Self = StObject.set(x, "owa", value.asInstanceOf[js.Any])
    
    inline def setOwaUndefined: Self = StObject.set(x, "owa", js.undefined)
  }
}
