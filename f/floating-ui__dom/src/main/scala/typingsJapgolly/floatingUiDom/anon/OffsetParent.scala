package typingsJapgolly.floatingUiDom.anon

import typingsJapgolly.floatingUiCore.srcTypesMod.Strategy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OffsetParent extends StObject {
  
  var offsetParent: org.scalajs.dom.Element
  
  var rect: typingsJapgolly.floatingUiCore.srcTypesMod.Rect
  
  var strategy: Strategy
}
object OffsetParent {
  
  inline def apply(
    offsetParent: org.scalajs.dom.Element,
    rect: typingsJapgolly.floatingUiCore.srcTypesMod.Rect,
    strategy: Strategy
  ): OffsetParent = {
    val __obj = js.Dynamic.literal(offsetParent = offsetParent.asInstanceOf[js.Any], rect = rect.asInstanceOf[js.Any], strategy = strategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[OffsetParent]
  }
  
  extension [Self <: OffsetParent](x: Self) {
    
    inline def setOffsetParent(value: org.scalajs.dom.Element): Self = StObject.set(x, "offsetParent", value.asInstanceOf[js.Any])
    
    inline def setRect(value: typingsJapgolly.floatingUiCore.srcTypesMod.Rect): Self = StObject.set(x, "rect", value.asInstanceOf[js.Any])
    
    inline def setStrategy(value: Strategy): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
  }
}
