package typingsJapgolly.antDesignProUtils.anon

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Delete extends StObject {
  
  var cancel: Node
  
  var delete: Node
  
  var save: Node
}
object Delete {
  
  inline def apply(): Delete = {
    val __obj = js.Dynamic.literal(cancel = null, delete = null, save = null)
    __obj.asInstanceOf[Delete]
  }
  
  extension [Self <: Delete](x: Self) {
    
    inline def setCancel(value: VdomNode): Self = StObject.set(x, "cancel", value.rawNode.asInstanceOf[js.Any])
    
    inline def setCancelNull: Self = StObject.set(x, "cancel", null)
    
    inline def setCancelVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "cancel", js.Array(value*))
    
    inline def setCancelVdomElement(value: VdomElement): Self = StObject.set(x, "cancel", value.rawElement.asInstanceOf[js.Any])
    
    inline def setDelete(value: VdomNode): Self = StObject.set(x, "delete", value.rawNode.asInstanceOf[js.Any])
    
    inline def setDeleteNull: Self = StObject.set(x, "delete", null)
    
    inline def setDeleteVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "delete", js.Array(value*))
    
    inline def setDeleteVdomElement(value: VdomElement): Self = StObject.set(x, "delete", value.rawElement.asInstanceOf[js.Any])
    
    inline def setSave(value: VdomNode): Self = StObject.set(x, "save", value.rawNode.asInstanceOf[js.Any])
    
    inline def setSaveNull: Self = StObject.set(x, "save", null)
    
    inline def setSaveVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "save", js.Array(value*))
    
    inline def setSaveVdomElement(value: VdomElement): Self = StObject.set(x, "save", value.rawElement.asInstanceOf[js.Any])
  }
}
