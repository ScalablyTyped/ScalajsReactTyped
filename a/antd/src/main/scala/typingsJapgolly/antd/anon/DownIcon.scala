package typingsJapgolly.antd.anon

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DownIcon extends StObject {
  
  var downIcon: js.UndefOr[Node] = js.undefined
  
  var upIcon: js.UndefOr[Node] = js.undefined
}
object DownIcon {
  
  inline def apply(): DownIcon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DownIcon]
  }
  
  extension [Self <: DownIcon](x: Self) {
    
    inline def setDownIcon(value: VdomNode): Self = StObject.set(x, "downIcon", value.rawNode.asInstanceOf[js.Any])
    
    inline def setDownIconNull: Self = StObject.set(x, "downIcon", null)
    
    inline def setDownIconUndefined: Self = StObject.set(x, "downIcon", js.undefined)
    
    inline def setDownIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "downIcon", js.Array(value*))
    
    inline def setDownIconVdomElement(value: VdomElement): Self = StObject.set(x, "downIcon", value.rawElement.asInstanceOf[js.Any])
    
    inline def setUpIcon(value: VdomNode): Self = StObject.set(x, "upIcon", value.rawNode.asInstanceOf[js.Any])
    
    inline def setUpIconNull: Self = StObject.set(x, "upIcon", null)
    
    inline def setUpIconUndefined: Self = StObject.set(x, "upIcon", js.undefined)
    
    inline def setUpIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "upIcon", js.Array(value*))
    
    inline def setUpIconVdomElement(value: VdomElement): Self = StObject.set(x, "upIcon", value.rawElement.asInstanceOf[js.Any])
  }
}
