package typingsJapgolly.wixUiCore.anon

import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChildrenElement extends StObject {
  
  var children: typingsJapgolly.react.mod.global.JSX.Element
}
object ChildrenElement {
  
  inline def apply(children: VdomElement): ChildrenElement = {
    val __obj = js.Dynamic.literal(children = children.rawElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildrenElement]
  }
  
  extension [Self <: ChildrenElement](x: Self) {
    
    inline def setChildren(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
  }
}
