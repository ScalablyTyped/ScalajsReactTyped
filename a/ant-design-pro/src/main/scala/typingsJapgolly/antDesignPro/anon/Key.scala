package typingsJapgolly.antDesignPro.anon

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Key extends StObject {
  
  var key: String
  
  var tab: Node
}
object Key {
  
  inline def apply(key: String): Key = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], tab = null)
    __obj.asInstanceOf[Key]
  }
  
  extension [Self <: Key](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setTab(value: VdomNode): Self = StObject.set(x, "tab", value.rawNode.asInstanceOf[js.Any])
    
    inline def setTabNull: Self = StObject.set(x, "tab", null)
    
    inline def setTabVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "tab", js.Array(value*))
    
    inline def setTabVdomElement(value: VdomElement): Self = StObject.set(x, "tab", value.rawElement.asInstanceOf[js.Any])
  }
}
