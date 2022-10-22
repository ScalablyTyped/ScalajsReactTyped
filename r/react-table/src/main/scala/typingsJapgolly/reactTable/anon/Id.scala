package typingsJapgolly.reactTable.anon

import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.reactTable.mod.HeaderProps
import typingsJapgolly.reactTable.mod.IdType
import typingsJapgolly.reactTable.mod.Renderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Id[D /* <: js.Object */] extends StObject {
  
  var Header: Renderer[HeaderProps[D]]
  
  var id: IdType[D]
}
object Id {
  
  inline def apply[D /* <: js.Object */](Header: Renderer[HeaderProps[D]], id: IdType[D]): Id[D] = {
    val __obj = js.Dynamic.literal(Header = Header.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id[D]]
  }
  
  extension [Self <: Id[?], D /* <: js.Object */](x: Self & Id[D]) {
    
    inline def setHeader(value: Renderer[HeaderProps[D]]): Self = StObject.set(x, "Header", value.asInstanceOf[js.Any])
    
    inline def setHeaderVdomElement(value: VdomElement): Self = StObject.set(x, "Header", value.rawElement.asInstanceOf[js.Any])
    
    inline def setId(value: IdType[D]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
