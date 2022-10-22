package typingsJapgolly.floatingUiDom.anon

import typingsJapgolly.floatingUiCore.srcTypesMod.Strategy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RootBoundary extends StObject {
  
  var boundary: typingsJapgolly.floatingUiCore.srcTypesMod.Boundary
  
  var element: org.scalajs.dom.Element
  
  var rootBoundary: typingsJapgolly.floatingUiCore.srcTypesMod.RootBoundary
  
  var strategy: Strategy
}
object RootBoundary {
  
  inline def apply(
    boundary: typingsJapgolly.floatingUiCore.srcTypesMod.Boundary,
    element: org.scalajs.dom.Element,
    rootBoundary: typingsJapgolly.floatingUiCore.srcTypesMod.RootBoundary,
    strategy: Strategy
  ): RootBoundary = {
    val __obj = js.Dynamic.literal(boundary = boundary.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], rootBoundary = rootBoundary.asInstanceOf[js.Any], strategy = strategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[RootBoundary]
  }
  
  extension [Self <: RootBoundary](x: Self) {
    
    inline def setBoundary(value: typingsJapgolly.floatingUiCore.srcTypesMod.Boundary): Self = StObject.set(x, "boundary", value.asInstanceOf[js.Any])
    
    inline def setElement(value: org.scalajs.dom.Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setRootBoundary(value: typingsJapgolly.floatingUiCore.srcTypesMod.RootBoundary): Self = StObject.set(x, "rootBoundary", value.asInstanceOf[js.Any])
    
    inline def setStrategy(value: Strategy): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
  }
}
