package typingsJapgolly.three

import typingsJapgolly.three.srcCoreBufferGeometryMod.BufferGeometry
import typingsJapgolly.three.srcExtrasCoreCurveMod.Curve
import typingsJapgolly.three.srcExtrasCoreShapeMod.Shape
import typingsJapgolly.three.srcMathVector2Mod.Vector2
import typingsJapgolly.three.srcMathVector3Mod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcGeometriesExtrudeGeometryMod {
  
  @JSImport("three/src/geometries/ExtrudeGeometry", "ExtrudeGeometry")
  @js.native
  open class ExtrudeGeometry () extends BufferGeometry {
    def this(shapes: js.Array[Shape]) = this()
    def this(shapes: Shape) = this()
    def this(shapes: js.Array[Shape], options: ExtrudeGeometryOptions) = this()
    def this(shapes: Unit, options: ExtrudeGeometryOptions) = this()
    def this(shapes: Shape, options: ExtrudeGeometryOptions) = this()
    
    def addShape(shape: Shape): Unit = js.native
    def addShape(shape: Shape, options: Any): Unit = js.native
    
    def addShapeList(shapes: js.Array[Shape]): Unit = js.native
    def addShapeList(shapes: js.Array[Shape], options: Any): Unit = js.native
  }
  /* static members */
  object ExtrudeGeometry {
    
    @JSImport("three/src/geometries/ExtrudeGeometry", "ExtrudeGeometry")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJSON(data: Any): ExtrudeGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(data.asInstanceOf[js.Any]).asInstanceOf[ExtrudeGeometry]
  }
  
  trait ExtrudeGeometryOptions extends StObject {
    
    var UVGenerator: js.UndefOr[typingsJapgolly.three.srcGeometriesExtrudeGeometryMod.UVGenerator] = js.undefined
    
    /**
      * @default true
      */
    var bevelEnabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @default 0
      */
    var bevelOffset: js.UndefOr[Double] = js.undefined
    
    /**
      * @default 3
      */
    var bevelSegments: js.UndefOr[Double] = js.undefined
    
    var bevelSize: js.UndefOr[Double] = js.undefined
    
    /**
      * @default 6
      */
    var bevelThickness: js.UndefOr[Double] = js.undefined
    
    /**
      * @default 12
      */
    var curveSegments: js.UndefOr[Double] = js.undefined
    
    /**
      * @default 100
      */
    var depth: js.UndefOr[Double] = js.undefined
    
    var extrudePath: js.UndefOr[Curve[Vector3]] = js.undefined
    
    /**
      * @default 1
      */
    var steps: js.UndefOr[Double] = js.undefined
  }
  object ExtrudeGeometryOptions {
    
    inline def apply(): ExtrudeGeometryOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExtrudeGeometryOptions]
    }
    
    extension [Self <: ExtrudeGeometryOptions](x: Self) {
      
      inline def setBevelEnabled(value: Boolean): Self = StObject.set(x, "bevelEnabled", value.asInstanceOf[js.Any])
      
      inline def setBevelEnabledUndefined: Self = StObject.set(x, "bevelEnabled", js.undefined)
      
      inline def setBevelOffset(value: Double): Self = StObject.set(x, "bevelOffset", value.asInstanceOf[js.Any])
      
      inline def setBevelOffsetUndefined: Self = StObject.set(x, "bevelOffset", js.undefined)
      
      inline def setBevelSegments(value: Double): Self = StObject.set(x, "bevelSegments", value.asInstanceOf[js.Any])
      
      inline def setBevelSegmentsUndefined: Self = StObject.set(x, "bevelSegments", js.undefined)
      
      inline def setBevelSize(value: Double): Self = StObject.set(x, "bevelSize", value.asInstanceOf[js.Any])
      
      inline def setBevelSizeUndefined: Self = StObject.set(x, "bevelSize", js.undefined)
      
      inline def setBevelThickness(value: Double): Self = StObject.set(x, "bevelThickness", value.asInstanceOf[js.Any])
      
      inline def setBevelThicknessUndefined: Self = StObject.set(x, "bevelThickness", js.undefined)
      
      inline def setCurveSegments(value: Double): Self = StObject.set(x, "curveSegments", value.asInstanceOf[js.Any])
      
      inline def setCurveSegmentsUndefined: Self = StObject.set(x, "curveSegments", js.undefined)
      
      inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      inline def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
      
      inline def setExtrudePath(value: Curve[Vector3]): Self = StObject.set(x, "extrudePath", value.asInstanceOf[js.Any])
      
      inline def setExtrudePathUndefined: Self = StObject.set(x, "extrudePath", js.undefined)
      
      inline def setSteps(value: Double): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
      
      inline def setStepsUndefined: Self = StObject.set(x, "steps", js.undefined)
      
      inline def setUVGenerator(value: UVGenerator): Self = StObject.set(x, "UVGenerator", value.asInstanceOf[js.Any])
      
      inline def setUVGeneratorUndefined: Self = StObject.set(x, "UVGenerator", js.undefined)
    }
  }
  
  trait UVGenerator extends StObject {
    
    def generateSideWallUV(
      geometry: ExtrudeGeometry,
      vertices: js.Array[Double],
      indexA: Double,
      indexB: Double,
      indexC: Double,
      indexD: Double
    ): js.Array[Vector2]
    
    def generateTopUV(
      geometry: ExtrudeGeometry,
      vertices: js.Array[Double],
      indexA: Double,
      indexB: Double,
      indexC: Double
    ): js.Array[Vector2]
  }
  object UVGenerator {
    
    inline def apply(
      generateSideWallUV: (ExtrudeGeometry, js.Array[Double], Double, Double, Double, Double) => js.Array[Vector2],
      generateTopUV: (ExtrudeGeometry, js.Array[Double], Double, Double, Double) => js.Array[Vector2]
    ): UVGenerator = {
      val __obj = js.Dynamic.literal(generateSideWallUV = js.Any.fromFunction6(generateSideWallUV), generateTopUV = js.Any.fromFunction5(generateTopUV))
      __obj.asInstanceOf[UVGenerator]
    }
    
    extension [Self <: UVGenerator](x: Self) {
      
      inline def setGenerateSideWallUV(value: (ExtrudeGeometry, js.Array[Double], Double, Double, Double, Double) => js.Array[Vector2]): Self = StObject.set(x, "generateSideWallUV", js.Any.fromFunction6(value))
      
      inline def setGenerateTopUV(value: (ExtrudeGeometry, js.Array[Double], Double, Double, Double) => js.Array[Vector2]): Self = StObject.set(x, "generateTopUV", js.Any.fromFunction5(value))
    }
  }
}
