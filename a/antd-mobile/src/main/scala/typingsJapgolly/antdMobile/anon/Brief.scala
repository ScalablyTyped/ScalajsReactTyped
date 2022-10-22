package typingsJapgolly.antdMobile.anon

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Brief extends StObject {
  
  var brief: Node
  
  var index: String
}
object Brief {
  
  inline def apply(index: String): Brief = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], brief = null)
    __obj.asInstanceOf[Brief]
  }
  
  extension [Self <: Brief](x: Self) {
    
    inline def setBrief(value: VdomNode): Self = StObject.set(x, "brief", value.rawNode.asInstanceOf[js.Any])
    
    inline def setBriefNull: Self = StObject.set(x, "brief", null)
    
    inline def setBriefVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "brief", js.Array(value*))
    
    inline def setBriefVdomElement(value: VdomElement): Self = StObject.set(x, "brief", value.rawElement.asInstanceOf[js.Any])
    
    inline def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
  }
}
