package typingsJapgolly.antd.anon

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.antd.libTreeTreeMod.AntTreeNodeProps
import typingsJapgolly.antd.libTreeTreeMod.TreeLeafIcon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShowLeafIcon extends StObject {
  
  var showLeafIcon: Boolean | TreeLeafIcon
}
object ShowLeafIcon {
  
  inline def apply(): ShowLeafIcon = {
    val __obj = js.Dynamic.literal(showLeafIcon = null)
    __obj.asInstanceOf[ShowLeafIcon]
  }
  
  extension [Self <: ShowLeafIcon](x: Self) {
    
    inline def setShowLeafIcon(value: Boolean | TreeLeafIcon): Self = StObject.set(x, "showLeafIcon", value.asInstanceOf[js.Any])
    
    inline def setShowLeafIconFunction1(value: /* props */ AntTreeNodeProps => Node): Self = StObject.set(x, "showLeafIcon", js.Any.fromFunction1(value))
    
    inline def setShowLeafIconNull: Self = StObject.set(x, "showLeafIcon", null)
    
    inline def setShowLeafIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "showLeafIcon", js.Array(value*))
    
    inline def setShowLeafIconVdomElement(value: VdomElement): Self = StObject.set(x, "showLeafIcon", value.rawElement.asInstanceOf[js.Any])
  }
}
