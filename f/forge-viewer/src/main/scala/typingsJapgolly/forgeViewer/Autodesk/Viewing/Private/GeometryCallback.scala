package typingsJapgolly.forgeViewer.Autodesk.Viewing.Private

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeometryCallback extends StObject {
  
  var onCircularArc: js.UndefOr[
    js.Function6[
      /* cx */ Double, 
      /* cy */ Double, 
      /* start */ Double, 
      /* end */ Double, 
      /* radius */ Double, 
      /* vpId */ Double, 
      Unit
    ]
  ] = js.undefined
  
  var onEllipticalArc: js.UndefOr[
    js.Function8[
      /* cx */ Double, 
      /* cy */ Double, 
      /* start */ Double, 
      /* end */ Double, 
      /* major */ Double, 
      /* minor */ Double, 
      /* tilt */ Double, 
      /* vpId */ Double, 
      Unit
    ]
  ] = js.undefined
  
  var onLineSegment: js.UndefOr[
    js.Function5[
      /* x1 */ Double, 
      /* y1 */ Double, 
      /* x2 */ Double, 
      /* y2 */ Double, 
      /* vpId */ Double, 
      Unit
    ]
  ] = js.undefined
  
  var onOneTriangle: js.UndefOr[
    js.Function7[
      /* x1 */ Double, 
      /* y1 */ Double, 
      /* x2 */ Double, 
      /* y2 */ Double, 
      /* x3 */ Double, 
      /* y3 */ Double, 
      /* vpId */ Double, 
      Unit
    ]
  ] = js.undefined
  
  var onTexQuad: js.UndefOr[
    js.Function6[
      /* centerX */ Double, 
      /* centerY */ Double, 
      /* width */ Double, 
      /* height */ Double, 
      /* rotation */ Double, 
      /* vpId */ Double, 
      Unit
    ]
  ] = js.undefined
  
  var onVertex: js.UndefOr[js.Function3[/* cx */ Double, /* cy */ Double, /* vpId */ Double, Unit]] = js.undefined
}
object GeometryCallback {
  
  inline def apply(): GeometryCallback = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeometryCallback]
  }
  
  extension [Self <: GeometryCallback](x: Self) {
    
    inline def setOnCircularArc(
      value: (/* cx */ Double, /* cy */ Double, /* start */ Double, /* end */ Double, /* radius */ Double, /* vpId */ Double) => Callback
    ): Self = StObject.set(x, "onCircularArc", js.Any.fromFunction6((t0: /* cx */ Double, t1: /* cy */ Double, t2: /* start */ Double, t3: /* end */ Double, t4: /* radius */ Double, t5: /* vpId */ Double) => (value(t0, t1, t2, t3, t4, t5)).runNow()))
    
    inline def setOnCircularArcUndefined: Self = StObject.set(x, "onCircularArc", js.undefined)
    
    inline def setOnEllipticalArc(
      value: (/* cx */ Double, /* cy */ Double, /* start */ Double, /* end */ Double, /* major */ Double, /* minor */ Double, /* tilt */ Double, /* vpId */ Double) => Callback
    ): Self = StObject.set(x, "onEllipticalArc", js.Any.fromFunction8((t0: /* cx */ Double, t1: /* cy */ Double, t2: /* start */ Double, t3: /* end */ Double, t4: /* major */ Double, t5: /* minor */ Double, t6: /* tilt */ Double, t7: /* vpId */ Double) => (value(t0, t1, t2, t3, t4, t5, t6, t7)).runNow()))
    
    inline def setOnEllipticalArcUndefined: Self = StObject.set(x, "onEllipticalArc", js.undefined)
    
    inline def setOnLineSegment(
      value: (/* x1 */ Double, /* y1 */ Double, /* x2 */ Double, /* y2 */ Double, /* vpId */ Double) => Callback
    ): Self = StObject.set(x, "onLineSegment", js.Any.fromFunction5((t0: /* x1 */ Double, t1: /* y1 */ Double, t2: /* x2 */ Double, t3: /* y2 */ Double, t4: /* vpId */ Double) => (value(t0, t1, t2, t3, t4)).runNow()))
    
    inline def setOnLineSegmentUndefined: Self = StObject.set(x, "onLineSegment", js.undefined)
    
    inline def setOnOneTriangle(
      value: (/* x1 */ Double, /* y1 */ Double, /* x2 */ Double, /* y2 */ Double, /* x3 */ Double, /* y3 */ Double, /* vpId */ Double) => Callback
    ): Self = StObject.set(x, "onOneTriangle", js.Any.fromFunction7((t0: /* x1 */ Double, t1: /* y1 */ Double, t2: /* x2 */ Double, t3: /* y2 */ Double, t4: /* x3 */ Double, t5: /* y3 */ Double, t6: /* vpId */ Double) => (value(t0, t1, t2, t3, t4, t5, t6)).runNow()))
    
    inline def setOnOneTriangleUndefined: Self = StObject.set(x, "onOneTriangle", js.undefined)
    
    inline def setOnTexQuad(
      value: (/* centerX */ Double, /* centerY */ Double, /* width */ Double, /* height */ Double, /* rotation */ Double, /* vpId */ Double) => Callback
    ): Self = StObject.set(x, "onTexQuad", js.Any.fromFunction6((t0: /* centerX */ Double, t1: /* centerY */ Double, t2: /* width */ Double, t3: /* height */ Double, t4: /* rotation */ Double, t5: /* vpId */ Double) => (value(t0, t1, t2, t3, t4, t5)).runNow()))
    
    inline def setOnTexQuadUndefined: Self = StObject.set(x, "onTexQuad", js.undefined)
    
    inline def setOnVertex(value: (/* cx */ Double, /* cy */ Double, /* vpId */ Double) => Callback): Self = StObject.set(x, "onVertex", js.Any.fromFunction3((t0: /* cx */ Double, t1: /* cy */ Double, t2: /* vpId */ Double) => (value(t0, t1, t2)).runNow()))
    
    inline def setOnVertexUndefined: Self = StObject.set(x, "onVertex", js.undefined)
  }
}
