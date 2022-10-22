package typingsJapgolly.next.anon

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.next.styledJsxMod.StyledJsxStyleRegistry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Registry extends StObject {
  
  var children: typingsJapgolly.react.mod.global.JSX.Element | Node
  
  var registry: js.UndefOr[StyledJsxStyleRegistry] = js.undefined
}
object Registry {
  
  inline def apply(): Registry = {
    val __obj = js.Dynamic.literal(children = null)
    __obj.asInstanceOf[Registry]
  }
  
  extension [Self <: Registry](x: Self) {
    
    inline def setChildren(value: typingsJapgolly.react.mod.global.JSX.Element | Node): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setRegistry(value: StyledJsxStyleRegistry): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
    
    inline def setRegistryUndefined: Self = StObject.set(x, "registry", js.undefined)
  }
}
