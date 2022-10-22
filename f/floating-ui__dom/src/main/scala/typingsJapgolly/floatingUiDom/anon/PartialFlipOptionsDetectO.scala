package typingsJapgolly.floatingUiDom.anon

import typingsJapgolly.floatingUiCore.srcTypesMod.ElementContext
import typingsJapgolly.floatingUiCore.srcTypesMod.Padding
import typingsJapgolly.floatingUiCore.srcTypesMod.Placement
import typingsJapgolly.floatingUiDom.floatingUiDomStrings.bestFit
import typingsJapgolly.floatingUiDom.floatingUiDomStrings.initialPlacement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@floating-ui/core.@floating-ui/core.FlipOptions & @floating-ui/dom.@floating-ui/dom/src/types.DetectOverflowOptions> */
trait PartialFlipOptionsDetectO extends StObject {
  
  var altBoundary: js.UndefOr[Boolean] = js.undefined
  
  var boundary: js.UndefOr[typingsJapgolly.floatingUiDom.srcTypesMod.Boundary] = js.undefined
  
  var crossAxis: js.UndefOr[Boolean] = js.undefined
  
  var elementContext: js.UndefOr[ElementContext] = js.undefined
  
  var fallbackPlacements: js.UndefOr[js.Array[Placement]] = js.undefined
  
  var fallbackStrategy: js.UndefOr[bestFit | initialPlacement] = js.undefined
  
  var flipAlignment: js.UndefOr[Boolean] = js.undefined
  
  var mainAxis: js.UndefOr[Boolean] = js.undefined
  
  var padding: js.UndefOr[Padding] = js.undefined
  
  var rootBoundary: js.UndefOr[typingsJapgolly.floatingUiCore.srcTypesMod.RootBoundary] = js.undefined
}
object PartialFlipOptionsDetectO {
  
  inline def apply(): PartialFlipOptionsDetectO = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialFlipOptionsDetectO]
  }
  
  extension [Self <: PartialFlipOptionsDetectO](x: Self) {
    
    inline def setAltBoundary(value: Boolean): Self = StObject.set(x, "altBoundary", value.asInstanceOf[js.Any])
    
    inline def setAltBoundaryUndefined: Self = StObject.set(x, "altBoundary", js.undefined)
    
    inline def setBoundary(value: typingsJapgolly.floatingUiDom.srcTypesMod.Boundary): Self = StObject.set(x, "boundary", value.asInstanceOf[js.Any])
    
    inline def setBoundaryUndefined: Self = StObject.set(x, "boundary", js.undefined)
    
    inline def setBoundaryVarargs(value: org.scalajs.dom.Element*): Self = StObject.set(x, "boundary", js.Array(value*))
    
    inline def setCrossAxis(value: Boolean): Self = StObject.set(x, "crossAxis", value.asInstanceOf[js.Any])
    
    inline def setCrossAxisUndefined: Self = StObject.set(x, "crossAxis", js.undefined)
    
    inline def setElementContext(value: ElementContext): Self = StObject.set(x, "elementContext", value.asInstanceOf[js.Any])
    
    inline def setElementContextUndefined: Self = StObject.set(x, "elementContext", js.undefined)
    
    inline def setFallbackPlacements(value: js.Array[Placement]): Self = StObject.set(x, "fallbackPlacements", value.asInstanceOf[js.Any])
    
    inline def setFallbackPlacementsUndefined: Self = StObject.set(x, "fallbackPlacements", js.undefined)
    
    inline def setFallbackPlacementsVarargs(value: Placement*): Self = StObject.set(x, "fallbackPlacements", js.Array(value*))
    
    inline def setFallbackStrategy(value: bestFit | initialPlacement): Self = StObject.set(x, "fallbackStrategy", value.asInstanceOf[js.Any])
    
    inline def setFallbackStrategyUndefined: Self = StObject.set(x, "fallbackStrategy", js.undefined)
    
    inline def setFlipAlignment(value: Boolean): Self = StObject.set(x, "flipAlignment", value.asInstanceOf[js.Any])
    
    inline def setFlipAlignmentUndefined: Self = StObject.set(x, "flipAlignment", js.undefined)
    
    inline def setMainAxis(value: Boolean): Self = StObject.set(x, "mainAxis", value.asInstanceOf[js.Any])
    
    inline def setMainAxisUndefined: Self = StObject.set(x, "mainAxis", js.undefined)
    
    inline def setPadding(value: Padding): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setRootBoundary(value: typingsJapgolly.floatingUiCore.srcTypesMod.RootBoundary): Self = StObject.set(x, "rootBoundary", value.asInstanceOf[js.Any])
    
    inline def setRootBoundaryUndefined: Self = StObject.set(x, "rootBoundary", js.undefined)
  }
}
