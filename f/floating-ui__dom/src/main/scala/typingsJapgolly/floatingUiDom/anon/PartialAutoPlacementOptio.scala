package typingsJapgolly.floatingUiDom.anon

import typingsJapgolly.floatingUiCore.srcTypesMod.Alignment
import typingsJapgolly.floatingUiCore.srcTypesMod.ElementContext
import typingsJapgolly.floatingUiCore.srcTypesMod.Padding
import typingsJapgolly.floatingUiCore.srcTypesMod.Placement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@floating-ui/core.@floating-ui/core.AutoPlacementOptions & @floating-ui/dom.@floating-ui/dom/src/types.DetectOverflowOptions> */
trait PartialAutoPlacementOptio extends StObject {
  
  var alignment: js.UndefOr[Alignment | Null] = js.undefined
  
  var allowedPlacements: js.UndefOr[js.Array[Placement]] = js.undefined
  
  var altBoundary: js.UndefOr[Boolean] = js.undefined
  
  var autoAlignment: js.UndefOr[Boolean] = js.undefined
  
  var boundary: js.UndefOr[typingsJapgolly.floatingUiDom.srcTypesMod.Boundary] = js.undefined
  
  var elementContext: js.UndefOr[ElementContext] = js.undefined
  
  var padding: js.UndefOr[Padding] = js.undefined
  
  var rootBoundary: js.UndefOr[typingsJapgolly.floatingUiCore.srcTypesMod.RootBoundary] = js.undefined
}
object PartialAutoPlacementOptio {
  
  inline def apply(): PartialAutoPlacementOptio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialAutoPlacementOptio]
  }
  
  extension [Self <: PartialAutoPlacementOptio](x: Self) {
    
    inline def setAlignment(value: Alignment): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
    
    inline def setAlignmentNull: Self = StObject.set(x, "alignment", null)
    
    inline def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
    
    inline def setAllowedPlacements(value: js.Array[Placement]): Self = StObject.set(x, "allowedPlacements", value.asInstanceOf[js.Any])
    
    inline def setAllowedPlacementsUndefined: Self = StObject.set(x, "allowedPlacements", js.undefined)
    
    inline def setAllowedPlacementsVarargs(value: Placement*): Self = StObject.set(x, "allowedPlacements", js.Array(value*))
    
    inline def setAltBoundary(value: Boolean): Self = StObject.set(x, "altBoundary", value.asInstanceOf[js.Any])
    
    inline def setAltBoundaryUndefined: Self = StObject.set(x, "altBoundary", js.undefined)
    
    inline def setAutoAlignment(value: Boolean): Self = StObject.set(x, "autoAlignment", value.asInstanceOf[js.Any])
    
    inline def setAutoAlignmentUndefined: Self = StObject.set(x, "autoAlignment", js.undefined)
    
    inline def setBoundary(value: typingsJapgolly.floatingUiDom.srcTypesMod.Boundary): Self = StObject.set(x, "boundary", value.asInstanceOf[js.Any])
    
    inline def setBoundaryUndefined: Self = StObject.set(x, "boundary", js.undefined)
    
    inline def setBoundaryVarargs(value: org.scalajs.dom.Element*): Self = StObject.set(x, "boundary", js.Array(value*))
    
    inline def setElementContext(value: ElementContext): Self = StObject.set(x, "elementContext", value.asInstanceOf[js.Any])
    
    inline def setElementContextUndefined: Self = StObject.set(x, "elementContext", js.undefined)
    
    inline def setPadding(value: Padding): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setRootBoundary(value: typingsJapgolly.floatingUiCore.srcTypesMod.RootBoundary): Self = StObject.set(x, "rootBoundary", value.asInstanceOf[js.Any])
    
    inline def setRootBoundaryUndefined: Self = StObject.set(x, "rootBoundary", js.undefined)
  }
}
