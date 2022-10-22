package typingsJapgolly.zrender

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Instantiable6
import typingsJapgolly.std.Record
import typingsJapgolly.zrender.anon.AddColorStop
import typingsJapgolly.zrender.anon.Color
import typingsJapgolly.zrender.zrenderBooleans.`false`
import typingsJapgolly.zrender.zrenderStrings.dashed
import typingsJapgolly.zrender.zrenderStrings.dotted
import typingsJapgolly.zrender.zrenderStrings.solid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object zrender {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.zrender.zrenderStrings.butt
    - typingsJapgolly.zrender.zrenderStrings.round
    - typingsJapgolly.zrender.zrenderStrings.square
  */
  trait CanvasLineCap extends StObject
  object CanvasLineCap {
    
    inline def butt: typingsJapgolly.zrender.zrenderStrings.butt = "butt".asInstanceOf[typingsJapgolly.zrender.zrenderStrings.butt]
    
    inline def round: typingsJapgolly.zrender.zrenderStrings.round = "round".asInstanceOf[typingsJapgolly.zrender.zrenderStrings.round]
    
    inline def square: typingsJapgolly.zrender.zrenderStrings.square = "square".asInstanceOf[typingsJapgolly.zrender.zrenderStrings.square]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.zrender.zrenderStrings.bevel
    - typingsJapgolly.zrender.zrenderStrings.miter
    - typingsJapgolly.zrender.zrenderStrings.round
  */
  trait CanvasLineJoin extends StObject
  object CanvasLineJoin {
    
    inline def bevel: typingsJapgolly.zrender.zrenderStrings.bevel = "bevel".asInstanceOf[typingsJapgolly.zrender.zrenderStrings.bevel]
    
    inline def miter: typingsJapgolly.zrender.zrenderStrings.miter = "miter".asInstanceOf[typingsJapgolly.zrender.zrenderStrings.miter]
    
    inline def round: typingsJapgolly.zrender.zrenderStrings.round = "round".asInstanceOf[typingsJapgolly.zrender.zrenderStrings.round]
  }
  
  type ColorStops = js.Array[Color]
  
  type GlobalCoords = Boolean
  
  /**
    * x, y, x2, y2 are all percent from 0 to 1
    */
  @js.native
  trait LinearGradient
    extends StObject
       with Instantiable6[
          /* x */ js.UndefOr[X], 
          /* y */ js.UndefOr[Y], 
          /* x2 */ js.UndefOr[X2], 
          /* y2 */ js.UndefOr[Y2], 
          /* colorStops */ js.UndefOr[ColorStops], 
          /* globalCoord */ js.UndefOr[GlobalCoords], 
          AddColorStop
        ]
  
  trait PathStyleProps extends StObject {
    
    var decal: js.UndefOr[PatternObject] = js.undefined
    
    var fill: js.UndefOr[String] = js.undefined
    
    var fillOpacity: js.UndefOr[Double] = js.undefined
    
    var lineCap: js.UndefOr[CanvasLineCap] = js.undefined
    
    /**
      * `true` is not supported.
      * `false`/`null`/`undefined` are the same.
      * `false` is used to remove lineDash in some
      * case that `null`/`undefined` can not be set.
      * (e.g., emphasis.lineStyle in echarts)
      */
    var lineDash: js.UndefOr[`false` | js.Array[Double] | solid | dashed | dotted] = js.undefined
    
    var lineDashOffset: js.UndefOr[Double] = js.undefined
    
    var lineJoin: js.UndefOr[CanvasLineJoin] = js.undefined
    
    var lineWidth: js.UndefOr[Double] = js.undefined
    
    var miterLimit: js.UndefOr[Double] = js.undefined
    
    var stroke: js.UndefOr[String] = js.undefined
    
    /**
      * Paint order, if do stroke first. Similar to SVG paint-order
      * https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/paint-order
      */
    var strokeFirst: js.UndefOr[Boolean] = js.undefined
    
    var strokeNoScale: js.UndefOr[Boolean] = js.undefined
    
    var strokeOpacity: js.UndefOr[Double] = js.undefined
    
    /**
      * Still experimental, not works weel on arc with edge cases(large angle).
      */
    var strokePercent: js.UndefOr[Double] = js.undefined
  }
  object PathStyleProps {
    
    inline def apply(): PathStyleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PathStyleProps]
    }
    
    extension [Self <: PathStyleProps](x: Self) {
      
      inline def setDecal(value: PatternObject): Self = StObject.set(x, "decal", value.asInstanceOf[js.Any])
      
      inline def setDecalUndefined: Self = StObject.set(x, "decal", js.undefined)
      
      inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillOpacity(value: Double): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
      
      inline def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setLineCap(value: CanvasLineCap): Self = StObject.set(x, "lineCap", value.asInstanceOf[js.Any])
      
      inline def setLineCapUndefined: Self = StObject.set(x, "lineCap", js.undefined)
      
      inline def setLineDash(value: `false` | js.Array[Double] | solid | dashed | dotted): Self = StObject.set(x, "lineDash", value.asInstanceOf[js.Any])
      
      inline def setLineDashOffset(value: Double): Self = StObject.set(x, "lineDashOffset", value.asInstanceOf[js.Any])
      
      inline def setLineDashOffsetUndefined: Self = StObject.set(x, "lineDashOffset", js.undefined)
      
      inline def setLineDashUndefined: Self = StObject.set(x, "lineDash", js.undefined)
      
      inline def setLineDashVarargs(value: Double*): Self = StObject.set(x, "lineDash", js.Array(value*))
      
      inline def setLineJoin(value: CanvasLineJoin): Self = StObject.set(x, "lineJoin", value.asInstanceOf[js.Any])
      
      inline def setLineJoinUndefined: Self = StObject.set(x, "lineJoin", js.undefined)
      
      inline def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
      
      inline def setLineWidthUndefined: Self = StObject.set(x, "lineWidth", js.undefined)
      
      inline def setMiterLimit(value: Double): Self = StObject.set(x, "miterLimit", value.asInstanceOf[js.Any])
      
      inline def setMiterLimitUndefined: Self = StObject.set(x, "miterLimit", js.undefined)
      
      inline def setStroke(value: String): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
      
      inline def setStrokeFirst(value: Boolean): Self = StObject.set(x, "strokeFirst", value.asInstanceOf[js.Any])
      
      inline def setStrokeFirstUndefined: Self = StObject.set(x, "strokeFirst", js.undefined)
      
      inline def setStrokeNoScale(value: Boolean): Self = StObject.set(x, "strokeNoScale", value.asInstanceOf[js.Any])
      
      inline def setStrokeNoScaleUndefined: Self = StObject.set(x, "strokeNoScale", js.undefined)
      
      inline def setStrokeOpacity(value: Double): Self = StObject.set(x, "strokeOpacity", value.asInstanceOf[js.Any])
      
      inline def setStrokeOpacityUndefined: Self = StObject.set(x, "strokeOpacity", js.undefined)
      
      inline def setStrokePercent(value: Double): Self = StObject.set(x, "strokePercent", value.asInstanceOf[js.Any])
      
      inline def setStrokePercentUndefined: Self = StObject.set(x, "strokePercent", js.undefined)
      
      inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    }
  }
  
  type X = Double
  
  type X2 = Double
  
  type Y = Double
  
  type Y2 = Double
  
  object graphic {
    
    trait Path extends StObject {
      
      var __value: js.UndefOr[(js.Array[String | Double]) | String | Double] = js.undefined
      
      var autoBatch: js.UndefOr[Boolean] = js.undefined
      
      var buildPath: js.UndefOr[
            js.Function3[
              /* ctx */ Any, 
              /* shapeCfg */ Record[String, Any], 
              /* inBatch */ js.UndefOr[Boolean], 
              Unit
            ]
          ] = js.undefined
      
      var segmentIgnoreThreshold: js.UndefOr[Double] = js.undefined
      
      var shape: js.UndefOr[Record[String, Any]] = js.undefined
      
      var strokeContainThreshold: js.UndefOr[Double] = js.undefined
      
      var style: js.UndefOr[PathStyleProps] = js.undefined
      
      var subPixelOptimize: js.UndefOr[Boolean] = js.undefined
    }
    object Path {
      
      inline def apply(): Path = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Path]
      }
      
      extension [Self <: Path](x: Self) {
        
        inline def setAutoBatch(value: Boolean): Self = StObject.set(x, "autoBatch", value.asInstanceOf[js.Any])
        
        inline def setAutoBatchUndefined: Self = StObject.set(x, "autoBatch", js.undefined)
        
        inline def setBuildPath(
          value: (/* ctx */ Any, /* shapeCfg */ Record[String, Any], /* inBatch */ js.UndefOr[Boolean]) => Callback
        ): Self = StObject.set(x, "buildPath", js.Any.fromFunction3((t0: /* ctx */ Any, t1: /* shapeCfg */ Record[String, Any], t2: /* inBatch */ js.UndefOr[Boolean]) => (value(t0, t1, t2)).runNow()))
        
        inline def setBuildPathUndefined: Self = StObject.set(x, "buildPath", js.undefined)
        
        inline def setSegmentIgnoreThreshold(value: Double): Self = StObject.set(x, "segmentIgnoreThreshold", value.asInstanceOf[js.Any])
        
        inline def setSegmentIgnoreThresholdUndefined: Self = StObject.set(x, "segmentIgnoreThreshold", js.undefined)
        
        inline def setShape(value: Record[String, Any]): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
        
        inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
        
        inline def setStrokeContainThreshold(value: Double): Self = StObject.set(x, "strokeContainThreshold", value.asInstanceOf[js.Any])
        
        inline def setStrokeContainThresholdUndefined: Self = StObject.set(x, "strokeContainThreshold", js.undefined)
        
        inline def setStyle(value: PathStyleProps): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
        
        inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
        
        inline def setSubPixelOptimize(value: Boolean): Self = StObject.set(x, "subPixelOptimize", value.asInstanceOf[js.Any])
        
        inline def setSubPixelOptimizeUndefined: Self = StObject.set(x, "subPixelOptimize", js.undefined)
        
        inline def set__value(value: (js.Array[String | Double]) | String | Double): Self = StObject.set(x, "__value", value.asInstanceOf[js.Any])
        
        inline def set__valueUndefined: Self = StObject.set(x, "__value", js.undefined)
        
        inline def set__valueVarargs(value: (String | Double)*): Self = StObject.set(x, "__value", js.Array(value*))
      }
    }
  }
}
