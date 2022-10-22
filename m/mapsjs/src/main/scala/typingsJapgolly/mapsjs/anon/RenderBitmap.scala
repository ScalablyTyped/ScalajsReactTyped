package typingsJapgolly.mapsjs.anon

import japgolly.scalajs.react.Callback
import org.scalajs.dom.CanvasRenderingContext2D
import org.scalajs.dom.HTMLElement
import typingsJapgolly.mapsjs.mod.geometry
import typingsJapgolly.mapsjs.mod.point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenderBitmap extends StObject {
  
  var renderBitmap: js.UndefOr[
    js.Function4[
      /* img */ HTMLElement, 
      /* context */ CanvasRenderingContext2D, 
      /* contextSize */ Double, 
      /* bleed */ Double, 
      Unit
    ]
  ] = js.undefined
  
  var renderGeometry: js.UndefOr[js.Function2[/* shape */ geometry, /* context */ CanvasRenderingContext2D, Unit]] = js.undefined
  
  var renderPoint: js.UndefOr[js.Function2[/* pt */ point, /* context */ CanvasRenderingContext2D, Unit]] = js.undefined
}
object RenderBitmap {
  
  inline def apply(): RenderBitmap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenderBitmap]
  }
  
  extension [Self <: RenderBitmap](x: Self) {
    
    inline def setRenderBitmap(
      value: (/* img */ HTMLElement, /* context */ CanvasRenderingContext2D, /* contextSize */ Double, /* bleed */ Double) => Callback
    ): Self = StObject.set(x, "renderBitmap", js.Any.fromFunction4((t0: /* img */ HTMLElement, t1: /* context */ CanvasRenderingContext2D, t2: /* contextSize */ Double, t3: /* bleed */ Double) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setRenderBitmapUndefined: Self = StObject.set(x, "renderBitmap", js.undefined)
    
    inline def setRenderGeometry(value: (/* shape */ geometry, /* context */ CanvasRenderingContext2D) => Callback): Self = StObject.set(x, "renderGeometry", js.Any.fromFunction2((t0: /* shape */ geometry, t1: /* context */ CanvasRenderingContext2D) => (value(t0, t1)).runNow()))
    
    inline def setRenderGeometryUndefined: Self = StObject.set(x, "renderGeometry", js.undefined)
    
    inline def setRenderPoint(value: (/* pt */ point, /* context */ CanvasRenderingContext2D) => Callback): Self = StObject.set(x, "renderPoint", js.Any.fromFunction2((t0: /* pt */ point, t1: /* context */ CanvasRenderingContext2D) => (value(t0, t1)).runNow()))
    
    inline def setRenderPointUndefined: Self = StObject.set(x, "renderPoint", js.undefined)
  }
}
