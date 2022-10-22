package typingsJapgolly.rcTable.libInterfaceMod

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenderedCell[RecordType] extends StObject {
  
  var children: js.UndefOr[Node] = js.undefined
  
  var props: js.UndefOr[CellType[RecordType]] = js.undefined
}
object RenderedCell {
  
  inline def apply[RecordType](): RenderedCell[RecordType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenderedCell[RecordType]]
  }
  
  extension [Self <: RenderedCell[?], RecordType](x: Self & RenderedCell[RecordType]) {
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setProps(value: CellType[RecordType]): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    inline def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
  }
}
