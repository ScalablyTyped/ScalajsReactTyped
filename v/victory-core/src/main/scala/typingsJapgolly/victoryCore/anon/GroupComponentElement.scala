package typingsJapgolly.victoryCore.anon

import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupComponentElement extends StObject {
  
  var groupComponent: Element
}
object GroupComponentElement {
  
  inline def apply(groupComponent: VdomElement): GroupComponentElement = {
    val __obj = js.Dynamic.literal(groupComponent = groupComponent.rawElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupComponentElement]
  }
  
  extension [Self <: GroupComponentElement](x: Self) {
    
    inline def setGroupComponent(value: VdomElement): Self = StObject.set(x, "groupComponent", value.rawElement.asInstanceOf[js.Any])
  }
}
