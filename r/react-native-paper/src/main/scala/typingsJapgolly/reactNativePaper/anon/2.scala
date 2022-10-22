package typingsJapgolly.reactNativePaper.anon

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `2` extends StObject {
  
  var left: js.UndefOr[Node] = js.undefined
  
  var right: js.UndefOr[Node] = js.undefined
}
object `2` {
  
  inline def apply(): `2` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`2`]
  }
  
  extension [Self <: `2`](x: Self) {
    
    inline def setLeft(value: VdomNode): Self = StObject.set(x, "left", value.rawNode.asInstanceOf[js.Any])
    
    inline def setLeftNull: Self = StObject.set(x, "left", null)
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def setLeftVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "left", js.Array(value*))
    
    inline def setLeftVdomElement(value: VdomElement): Self = StObject.set(x, "left", value.rawElement.asInstanceOf[js.Any])
    
    inline def setRight(value: VdomNode): Self = StObject.set(x, "right", value.rawNode.asInstanceOf[js.Any])
    
    inline def setRightNull: Self = StObject.set(x, "right", null)
    
    inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    
    inline def setRightVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "right", js.Array(value*))
    
    inline def setRightVdomElement(value: VdomElement): Self = StObject.set(x, "right", value.rawElement.asInstanceOf[js.Any])
  }
}
