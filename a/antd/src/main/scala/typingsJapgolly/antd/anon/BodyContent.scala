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

trait BodyContent extends StObject {
  
  var bodyContent: Node
  
  var customize: Boolean
}
object BodyContent {
  
  inline def apply(customize: Boolean): BodyContent = {
    val __obj = js.Dynamic.literal(customize = customize.asInstanceOf[js.Any], bodyContent = null)
    __obj.asInstanceOf[BodyContent]
  }
  
  extension [Self <: BodyContent](x: Self) {
    
    inline def setBodyContent(value: VdomNode): Self = StObject.set(x, "bodyContent", value.rawNode.asInstanceOf[js.Any])
    
    inline def setBodyContentNull: Self = StObject.set(x, "bodyContent", null)
    
    inline def setBodyContentVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "bodyContent", js.Array(value*))
    
    inline def setBodyContentVdomElement(value: VdomElement): Self = StObject.set(x, "bodyContent", value.rawElement.asInstanceOf[js.Any])
    
    inline def setCustomize(value: Boolean): Self = StObject.set(x, "customize", value.asInstanceOf[js.Any])
  }
}
