package typingsJapgolly.floatingUiCore.anon

import typingsJapgolly.floatingUiCore.srcTypesMod.RootBoundary
import typingsJapgolly.floatingUiCore.srcTypesMod.Strategy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Boundary extends StObject {
  
  var boundary: typingsJapgolly.floatingUiCore.srcTypesMod.Boundary
  
  var element: Any
  
  var rootBoundary: RootBoundary
  
  var strategy: Strategy
}
object Boundary {
  
  inline def apply(
    boundary: typingsJapgolly.floatingUiCore.srcTypesMod.Boundary,
    element: Any,
    rootBoundary: RootBoundary,
    strategy: Strategy
  ): Boundary = {
    val __obj = js.Dynamic.literal(boundary = boundary.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], rootBoundary = rootBoundary.asInstanceOf[js.Any], strategy = strategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Boundary]
  }
  
  extension [Self <: Boundary](x: Self) {
    
    inline def setBoundary(value: typingsJapgolly.floatingUiCore.srcTypesMod.Boundary): Self = StObject.set(x, "boundary", value.asInstanceOf[js.Any])
    
    inline def setElement(value: Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setRootBoundary(value: RootBoundary): Self = StObject.set(x, "rootBoundary", value.asInstanceOf[js.Any])
    
    inline def setStrategy(value: Strategy): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
  }
}
