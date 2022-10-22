package typingsJapgolly.victoryCore.anon

import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClipPathComponent extends StObject {
  
  var circleComponent: Element
  
  var clipPathComponent: Element
  
  var groupComponent: Element
  
  var rectComponent: Element
}
object ClipPathComponent {
  
  inline def apply(
    circleComponent: VdomElement,
    clipPathComponent: VdomElement,
    groupComponent: VdomElement,
    rectComponent: VdomElement
  ): ClipPathComponent = {
    val __obj = js.Dynamic.literal(circleComponent = circleComponent.rawElement.asInstanceOf[js.Any], clipPathComponent = clipPathComponent.rawElement.asInstanceOf[js.Any], groupComponent = groupComponent.rawElement.asInstanceOf[js.Any], rectComponent = rectComponent.rawElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClipPathComponent]
  }
  
  extension [Self <: ClipPathComponent](x: Self) {
    
    inline def setCircleComponent(value: VdomElement): Self = StObject.set(x, "circleComponent", value.rawElement.asInstanceOf[js.Any])
    
    inline def setClipPathComponent(value: VdomElement): Self = StObject.set(x, "clipPathComponent", value.rawElement.asInstanceOf[js.Any])
    
    inline def setGroupComponent(value: VdomElement): Self = StObject.set(x, "groupComponent", value.rawElement.asInstanceOf[js.Any])
    
    inline def setRectComponent(value: VdomElement): Self = StObject.set(x, "rectComponent", value.rawElement.asInstanceOf[js.Any])
  }
}
