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

trait GoButton extends StObject {
  
  var goButton: js.UndefOr[Node] = js.undefined
}
object GoButton {
  
  inline def apply(): GoButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoButton]
  }
  
  extension [Self <: GoButton](x: Self) {
    
    inline def setGoButton(value: VdomNode): Self = StObject.set(x, "goButton", value.rawNode.asInstanceOf[js.Any])
    
    inline def setGoButtonNull: Self = StObject.set(x, "goButton", null)
    
    inline def setGoButtonUndefined: Self = StObject.set(x, "goButton", js.undefined)
    
    inline def setGoButtonVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "goButton", js.Array(value*))
    
    inline def setGoButtonVdomElement(value: VdomElement): Self = StObject.set(x, "goButton", value.rawElement.asInstanceOf[js.Any])
  }
}
