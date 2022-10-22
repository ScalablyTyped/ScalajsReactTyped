package typingsJapgolly.floatingUiDom.anon

import typingsJapgolly.floatingUiCore.srcTypesMod.ElementRects
import typingsJapgolly.floatingUiCore.srcTypesMod.MiddlewareData
import typingsJapgolly.floatingUiCore.srcTypesMod.Placement
import typingsJapgolly.floatingUiCore.srcTypesMod.Platform
import typingsJapgolly.floatingUiCore.srcTypesMod.Strategy
import typingsJapgolly.floatingUiDom.srcTypesMod.Elements
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @floating-ui/dom.@floating-ui/dom/src/types.MiddlewareArguments & {  availableWidth :number,   availableHeight :number} */
trait MiddlewareArgumentsavaila extends StObject {
  
  var availableHeight: Double
  
  var availableWidth: Double
  
  var elements: Elements
  
  var initialPlacement: Placement
  
  var middlewareData: MiddlewareData
  
  var placement: Placement
  
  var platform: Platform
  
  var rects: ElementRects
  
  var strategy: Strategy
  
  var x: Double
  
  var y: Double
}
object MiddlewareArgumentsavaila {
  
  inline def apply(
    availableHeight: Double,
    availableWidth: Double,
    elements: Elements,
    initialPlacement: Placement,
    middlewareData: MiddlewareData,
    placement: Placement,
    platform: Platform,
    rects: ElementRects,
    strategy: Strategy,
    x: Double,
    y: Double
  ): MiddlewareArgumentsavaila = {
    val __obj = js.Dynamic.literal(availableHeight = availableHeight.asInstanceOf[js.Any], availableWidth = availableWidth.asInstanceOf[js.Any], elements = elements.asInstanceOf[js.Any], initialPlacement = initialPlacement.asInstanceOf[js.Any], middlewareData = middlewareData.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], rects = rects.asInstanceOf[js.Any], strategy = strategy.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[MiddlewareArgumentsavaila]
  }
  
  extension [Self <: MiddlewareArgumentsavaila](x: Self) {
    
    inline def setAvailableHeight(value: Double): Self = StObject.set(x, "availableHeight", value.asInstanceOf[js.Any])
    
    inline def setAvailableWidth(value: Double): Self = StObject.set(x, "availableWidth", value.asInstanceOf[js.Any])
    
    inline def setElements(value: Elements): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
    
    inline def setInitialPlacement(value: Placement): Self = StObject.set(x, "initialPlacement", value.asInstanceOf[js.Any])
    
    inline def setMiddlewareData(value: MiddlewareData): Self = StObject.set(x, "middlewareData", value.asInstanceOf[js.Any])
    
    inline def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    
    inline def setPlatform(value: Platform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setRects(value: ElementRects): Self = StObject.set(x, "rects", value.asInstanceOf[js.Any])
    
    inline def setStrategy(value: Strategy): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
