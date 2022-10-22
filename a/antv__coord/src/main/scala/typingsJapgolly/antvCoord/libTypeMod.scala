package typingsJapgolly.antvCoord

import typingsJapgolly.antvCoord.antvCoordStrings.cartesian
import typingsJapgolly.antvCoord.antvCoordStrings.custom
import typingsJapgolly.antvCoord.antvCoordStrings.fisheye
import typingsJapgolly.antvCoord.antvCoordStrings.fisheyeDotcircular
import typingsJapgolly.antvCoord.antvCoordStrings.fisheyeDotx
import typingsJapgolly.antvCoord.antvCoordStrings.fisheyeDoty
import typingsJapgolly.antvCoord.antvCoordStrings.helix
import typingsJapgolly.antvCoord.antvCoordStrings.matrix
import typingsJapgolly.antvCoord.antvCoordStrings.parallel
import typingsJapgolly.antvCoord.antvCoordStrings.polar
import typingsJapgolly.antvCoord.antvCoordStrings.reflect
import typingsJapgolly.antvCoord.antvCoordStrings.reflectDotx
import typingsJapgolly.antvCoord.antvCoordStrings.reflectDoty
import typingsJapgolly.antvCoord.antvCoordStrings.rotate
import typingsJapgolly.antvCoord.antvCoordStrings.scale
import typingsJapgolly.antvCoord.antvCoordStrings.shearDotx
import typingsJapgolly.antvCoord.antvCoordStrings.shearDoty
import typingsJapgolly.antvCoord.antvCoordStrings.translate
import typingsJapgolly.antvCoord.antvCoordStrings.transpose
import typingsJapgolly.glMatrix.mod.mat3
import typingsJapgolly.glMatrix.mod.vec3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypeMod {
  
  type Cartesian = js.Array[cartesian]
  
  type CreateTransformer = js.Function5[
    /* params */ js.Array[Boolean | Double | Matrix3 | TransformCallback], 
    /* x */ Double, 
    /* y */ Double, 
    /* width */ Double, 
    /* height */ Double, 
    Transformer | Matrix3
  ]
  
  type Custom = js.Tuple2[custom, TransformCallback]
  
  type Fisheye = js.Tuple6[fisheye, Double, Double, Double, Double, js.UndefOr[Boolean]]
  
  type FisheyeCircular = js.Tuple6[fisheyeDotcircular, Double, Double, Double, Double, js.UndefOr[Boolean]]
  
  type FisheyeX = js.Tuple4[fisheyeDotx, Double, Double, js.UndefOr[Boolean]]
  
  type FisheyeY = js.Tuple4[fisheyeDoty, Double, Double, js.UndefOr[Boolean]]
  
  type Helix = js.Tuple5[helix, Double, Double, Double, Double]
  
  type Matrix = js.Tuple2[matrix, Matrix3]
  
  type Matrix3 = mat3
  
  trait Options extends StObject {
    
    var height: js.UndefOr[Double] = js.undefined
    
    var transformations: js.UndefOr[js.Array[Transformation]] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
    
    var x: js.UndefOr[Double] = js.undefined
    
    var y: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setTransformations(value: js.Array[Transformation]): Self = StObject.set(x, "transformations", value.asInstanceOf[js.Any])
      
      inline def setTransformationsUndefined: Self = StObject.set(x, "transformations", js.undefined)
      
      inline def setTransformationsVarargs(value: Transformation*): Self = StObject.set(x, "transformations", js.Array(value*))
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  type Parallel = js.Tuple5[parallel, Double, Double, Double, Double]
  
  type Polar = js.Tuple5[polar, Double, Double, Double, Double]
  
  type Reflect = js.Array[reflect]
  
  type ReflectX = js.Array[reflectDotx]
  
  type ReflectY = js.Array[reflectDoty]
  
  type Rotate = js.Tuple2[rotate, Double]
  
  type Scale = js.Tuple3[scale, Double, Double]
  
  type ShearX = js.Tuple2[shearDotx, Double]
  
  type ShearY = js.Tuple2[shearDoty, Double]
  
  type Transform = js.Function1[/* vector */ Vector2 | Vector, Vector2 | Vector]
  
  type TransformCallback = js.Function4[/* x */ Double, /* y */ Double, /* width */ Double, /* height */ Double, Transformer]
  
  type Transformation = Translate | Cartesian | Custom | Matrix | Polar | Transpose | Scale | ShearX | ShearY | Reflect | ReflectX | ReflectY | Rotate | Helix | Parallel | Fisheye | FisheyeX | FisheyeY | FisheyeCircular
  
  trait Transformer extends StObject {
    
    var transform: js.UndefOr[Transform] = js.undefined
    
    var untransform: js.UndefOr[Transform] = js.undefined
  }
  object Transformer {
    
    inline def apply(): Transformer = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Transformer]
    }
    
    extension [Self <: Transformer](x: Self) {
      
      inline def setTransform(value: /* vector */ Vector2 | Vector => Vector2 | Vector): Self = StObject.set(x, "transform", js.Any.fromFunction1(value))
      
      inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
      
      inline def setUntransform(value: /* vector */ Vector2 | Vector => Vector2 | Vector): Self = StObject.set(x, "untransform", js.Any.fromFunction1(value))
      
      inline def setUntransformUndefined: Self = StObject.set(x, "untransform", js.undefined)
    }
  }
  
  type Translate = js.Tuple3[translate, Double, Double]
  
  type Transpose = js.Array[transpose]
  
  type Vector = js.Array[Double]
  
  type Vector2 = js.Tuple2[Double, Double]
  
  type Vector3 = vec3
}
