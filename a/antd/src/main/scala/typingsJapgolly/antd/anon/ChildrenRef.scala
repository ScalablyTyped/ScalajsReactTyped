package typingsJapgolly.antd.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.antd.libFormHooksUseFormMod.FormInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChildrenRef[Values] extends StObject {
  
  var children: js.UndefOr[Node] = js.undefined
  
  var ref: js.UndefOr[typingsJapgolly.react.mod.Ref[FormInstance[Values]]] = js.undefined
}
object ChildrenRef {
  
  inline def apply[Values](): ChildrenRef[Values] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChildrenRef[Values]]
  }
  
  extension [Self <: ChildrenRef[?], Values](x: Self & ChildrenRef[Values]) {
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setRef(value: typingsJapgolly.react.mod.Ref[FormInstance[Values]]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefFunction1(value: FormInstance[Values] | Null => Callback): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: FormInstance[Values] | Null) => value(t0).runNow()))
    
    inline def setRefNull: Self = StObject.set(x, "ref", null)
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
  }
}
