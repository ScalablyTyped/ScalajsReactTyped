package typingsJapgolly.floatingUiDom.anon

import typingsJapgolly.floatingUiCore.srcTypesMod.ElementContext
import typingsJapgolly.floatingUiCore.srcTypesMod.Padding
import typingsJapgolly.floatingUiDom.srcTypesMod.Promisable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@floating-ui/dom.@floating-ui/dom/src/types.SizeOptions & @floating-ui/dom.@floating-ui/dom/src/types.DetectOverflowOptions> */
trait PartialSizeOptionsDetectO extends StObject {
  
  var altBoundary: js.UndefOr[Boolean] = js.undefined
  
  @JSName("apply")
  var apply: js.UndefOr[js.Function1[/* args */ MiddlewareArgumentsavaila, Promisable[Unit]]] = js.undefined
  
  var boundary: js.UndefOr[typingsJapgolly.floatingUiDom.srcTypesMod.Boundary] = js.undefined
  
  var elementContext: js.UndefOr[ElementContext] = js.undefined
  
  var padding: js.UndefOr[Padding] = js.undefined
  
  var rootBoundary: js.UndefOr[typingsJapgolly.floatingUiCore.srcTypesMod.RootBoundary] = js.undefined
}
object PartialSizeOptionsDetectO {
  
  inline def apply(): PartialSizeOptionsDetectO = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSizeOptionsDetectO]
  }
  
  extension [Self <: PartialSizeOptionsDetectO](x: Self) {
    
    inline def setAltBoundary(value: Boolean): Self = StObject.set(x, "altBoundary", value.asInstanceOf[js.Any])
    
    inline def setAltBoundaryUndefined: Self = StObject.set(x, "altBoundary", js.undefined)
    
    inline def setApply(value: /* args */ MiddlewareArgumentsavaila => Promisable[Unit]): Self = StObject.set(x, "apply", js.Any.fromFunction1(value))
    
    inline def setApplyUndefined: Self = StObject.set(x, "apply", js.undefined)
    
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
