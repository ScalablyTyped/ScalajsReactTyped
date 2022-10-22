package typingsJapgolly.amapJsApiMap3d

import org.scalajs.dom.HTMLCanvasElement
import typingsJapgolly.amapJsApiMap3d.AMap.Object3D.MeshLine.Options
import typingsJapgolly.amapJsApiMap3d.amapJsApiMap3dStrings.line
import typingsJapgolly.amapJsApiMap3d.amapJsApiMap3dStrings.mesh
import typingsJapgolly.amapJsApiMap3d.amapJsApiMap3dStrings.points
import typingsJapgolly.amapJsApiMap3d.anon.MeshreadonlyvertexNormals
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object AMap {
    
    /* note: abstract class */ @JSGlobal("AMap.Geometry3D")
    @js.native
    open class Geometry3D ()
      extends StObject
         with typingsJapgolly.amapJsApiMap3d.AMap.Geometry3D {
      
      /* CompleteClass */
      override val vertexColors: js.Array[Double] = js.native
      
      /* CompleteClass */
      override val vertexUVs: js.Array[Double] = js.native
      
      /* CompleteClass */
      override val vertices: js.Array[Double] = js.native
    }
    object Geometry3D {
      
      @JSGlobal("AMap.Geometry3D.Line")
      @js.native
      open class Line ()
        extends StObject
           with typingsJapgolly.amapJsApiMap3d.AMap.Geometry3D.Line {
        
        /* CompleteClass */
        override val segments: js.Array[Double] = js.native
        
        /* CompleteClass */
        override val textureIndices: js.Array[Double] = js.native
        
        /* CompleteClass */
        override val `type`: line = js.native
        
        /* CompleteClass */
        override val vertexColors: js.Array[Double] = js.native
        
        /* CompleteClass */
        override val vertexUVs: js.Array[Double] = js.native
        
        /* CompleteClass */
        override val vertices: js.Array[Double] = js.native
      }
      
      @JSGlobal("AMap.Geometry3D.Mesh")
      @js.native
      open class Mesh ()
        extends StObject
           with typingsJapgolly.amapJsApiMap3d.AMap.Geometry3D.Mesh {
        
        /* CompleteClass */
        override val faces: js.Array[Double] = js.native
        
        /* CompleteClass */
        override val textureIndices: js.Array[Double] = js.native
        
        /* CompleteClass */
        override val `type`: mesh = js.native
        
        /* CompleteClass */
        override val vertexColors: js.Array[Double] = js.native
        
        /* CompleteClass */
        override val vertexUVs: js.Array[Double] = js.native
        
        /* CompleteClass */
        override val vertices: js.Array[Double] = js.native
      }
      
      @JSGlobal("AMap.Geometry3D.Points")
      @js.native
      open class Points ()
        extends StObject
           with typingsJapgolly.amapJsApiMap3d.AMap.Geometry3D.Points {
        
        /* CompleteClass */
        override val pointAreas: js.Array[Double] = js.native
        
        /* CompleteClass */
        override val pointSizes: js.Array[Double] = js.native
        
        /* CompleteClass */
        override val textureIndices: js.Array[Double] = js.native
        
        /* CompleteClass */
        override val `type`: points = js.native
        
        /* CompleteClass */
        override val vertexColors: js.Array[Double] = js.native
        
        /* CompleteClass */
        override val vertexUVs: js.Array[Double] = js.native
        
        /* CompleteClass */
        override val vertices: js.Array[Double] = js.native
      }
    }
    
    object Lights {
      
      @JSGlobal("AMap.Lights.AmbientLight")
      @js.native
      open class AmbientLight protected ()
        extends StObject
           with typingsJapgolly.amapJsApiMap3d.AMap.Lights.AmbientLight {
        def this(color: js.Tuple3[Double, Double, Double], intensity: Double) = this()
        
        /* CompleteClass */
        override def setColor(color: js.Tuple3[Double, Double, Double]): Unit = js.native
        
        /* CompleteClass */
        override def setIntensity(intensity: Double): Unit = js.native
      }
      
      @JSGlobal("AMap.Lights.DirectionLight")
      @js.native
      open class DirectionLight protected ()
        extends StObject
           with typingsJapgolly.amapJsApiMap3d.AMap.Lights.DirectionLight {
        def this(
          direction: js.Tuple3[Double, Double, Double],
          color: js.Tuple3[Double, Double, Double],
          intensity: Double
        ) = this()
        
        /* CompleteClass */
        override def setColor(direction: js.Tuple3[Double, Double, Double]): Unit = js.native
        
        /* CompleteClass */
        override def setDirection(direction: js.Tuple3[Double, Double, Double]): Unit = js.native
        
        /* CompleteClass */
        override def setIntensity(intensity: Double): Unit = js.native
        
        /* CompleteClass */
        override def update(): Unit = js.native
      }
    }
    
    @JSGlobal("AMap.Object3D")
    @js.native
    open class Object3D ()
      extends StObject
         with typingsJapgolly.amapJsApiMap3d.AMap.Object3D {
      
      /* CompleteClass */
      var DEPTH_TEST: Boolean = js.native
      
      /* CompleteClass */
      override val geometry: typingsJapgolly.amapJsApiMap3d.AMap.Geometry3D = js.native
      
      /* CompleteClass */
      var needUpdate: Boolean = js.native
      
      /* CompleteClass */
      override def reDraw(): Unit = js.native
      
      // internal
      /* CompleteClass */
      override def reset(): Unit = js.native
      
      /* CompleteClass */
      var textures: js.Array[String | HTMLCanvasElement] = js.native
      
      /* CompleteClass */
      var transparent: Boolean = js.native
    }
    object Object3D {
      
      @JSGlobal("AMap.Object3D.Line")
      @js.native
      open class Line ()
        extends StObject
           with typingsJapgolly.amapJsApiMap3d.AMap.Object3D.Line {
        
        /* CompleteClass */
        var DEPTH_TEST: Boolean = js.native
        
        /* CompleteClass */
        override val geometry: typingsJapgolly.amapJsApiMap3d.AMap.Geometry3D = js.native
        /* CompleteClass */
        @JSName("geometry")
        override val geometry_Line: typingsJapgolly.amapJsApiMap3d.AMap.Geometry3D.Line = js.native
        
        /* CompleteClass */
        var needUpdate: Boolean = js.native
        
        /* CompleteClass */
        override def reDraw(): Unit = js.native
        
        // internal
        /* CompleteClass */
        override def reset(): Unit = js.native
        
        /* CompleteClass */
        var textures: js.Array[String | HTMLCanvasElement] = js.native
        
        /* CompleteClass */
        var transparent: Boolean = js.native
      }
      
      @JSGlobal("AMap.Object3D.Mesh")
      @js.native
      open class Mesh ()
        extends StObject
           with typingsJapgolly.amapJsApiMap3d.AMap.Object3D.Mesh {
        
        /* CompleteClass */
        var DEPTH_TEST: Boolean = js.native
        
        /* CompleteClass */
        override val geometry: typingsJapgolly.amapJsApiMap3d.AMap.Geometry3D = js.native
        /* CompleteClass */
        @JSName("geometry")
        override val geometry_Mesh: typingsJapgolly.amapJsApiMap3d.AMap.Geometry3D.Mesh = js.native
        
        /* CompleteClass */
        var needUpdate: Boolean = js.native
        
        /* CompleteClass */
        override def reDraw(): Unit = js.native
        
        // internal
        /* CompleteClass */
        override def reset(): Unit = js.native
        
        /* CompleteClass */
        var textures: js.Array[String | HTMLCanvasElement] = js.native
        
        /* CompleteClass */
        var transparent: Boolean = js.native
      }
      
      @JSGlobal("AMap.Object3D.MeshAcceptLights")
      @js.native
      open class MeshAcceptLights ()
        extends StObject
           with typingsJapgolly.amapJsApiMap3d.AMap.Object3D.MeshAcceptLights {
        
        /* CompleteClass */
        var DEPTH_TEST: Boolean = js.native
        
        /* CompleteClass */
        override val geometry: typingsJapgolly.amapJsApiMap3d.AMap.Geometry3D = js.native
        /* CompleteClass */
        @JSName("geometry")
        override val geometry_Mesh: typingsJapgolly.amapJsApiMap3d.AMap.Geometry3D.Mesh = js.native
        /* CompleteClass */
        @JSName("geometry")
        override val geometry_MeshAcceptLights: MeshreadonlyvertexNormals = js.native
        
        /* CompleteClass */
        var needUpdate: Boolean = js.native
        
        /* CompleteClass */
        override def reDraw(): Unit = js.native
        
        // internal
        /* CompleteClass */
        override def reset(): Unit = js.native
        
        /* CompleteClass */
        var textures: js.Array[String | HTMLCanvasElement] = js.native
        
        /* CompleteClass */
        var transparent: Boolean = js.native
      }
      
      // inherit from WideLine
      @JSGlobal("AMap.Object3D.MeshLine")
      @js.native
      open class MeshLine protected ()
        extends StObject
           with typingsJapgolly.amapJsApiMap3d.AMap.Object3D.MeshLine {
        def this(options: Options) = this()
        
        /* CompleteClass */
        var DEPTH_TEST: Boolean = js.native
        
        /* CompleteClass */
        override val geometry: typingsJapgolly.amapJsApiMap3d.AMap.Geometry3D = js.native
        
        /* CompleteClass */
        var needUpdate: Boolean = js.native
        
        /* CompleteClass */
        override def reDraw(): Unit = js.native
        
        // internal
        /* CompleteClass */
        override def reset(): Unit = js.native
        
        /* CompleteClass */
        var textures: js.Array[String | HTMLCanvasElement] = js.native
        
        /* CompleteClass */
        var transparent: Boolean = js.native
      }
      
      @JSGlobal("AMap.Object3D.Points")
      @js.native
      open class Points ()
        extends StObject
           with typingsJapgolly.amapJsApiMap3d.AMap.Object3D.Points {
        
        /* CompleteClass */
        var DEPTH_TEST: Boolean = js.native
        
        /* CompleteClass */
        var borderColor: String = js.native
        
        /* CompleteClass */
        var borderWeight: Double = js.native
        
        /* CompleteClass */
        override val geometry: typingsJapgolly.amapJsApiMap3d.AMap.Geometry3D = js.native
        /* CompleteClass */
        @JSName("geometry")
        override val geometry_Points: typingsJapgolly.amapJsApiMap3d.AMap.Geometry3D.Points = js.native
        
        /* CompleteClass */
        var needUpdate: Boolean = js.native
        
        /* CompleteClass */
        override def reDraw(): Unit = js.native
        
        // internal
        /* CompleteClass */
        override def reset(): Unit = js.native
        
        /* CompleteClass */
        var textures: js.Array[String | HTMLCanvasElement] = js.native
        
        /* CompleteClass */
        var transparent: Boolean = js.native
      }
      
      @JSGlobal("AMap.Object3D.Prism")
      @js.native
      open class Prism protected ()
        extends StObject
           with typingsJapgolly.amapJsApiMap3d.AMap.Object3D.MeshAcceptLights {
        def this(options: typingsJapgolly.amapJsApiMap3d.AMap.Object3D.Prism.Options) = this()
        
        /* CompleteClass */
        var DEPTH_TEST: Boolean = js.native
        
        /* CompleteClass */
        override val geometry: typingsJapgolly.amapJsApiMap3d.AMap.Geometry3D = js.native
        /* CompleteClass */
        @JSName("geometry")
        override val geometry_Mesh: typingsJapgolly.amapJsApiMap3d.AMap.Geometry3D.Mesh = js.native
        /* CompleteClass */
        @JSName("geometry")
        override val geometry_MeshAcceptLights: MeshreadonlyvertexNormals = js.native
        
        /* CompleteClass */
        var needUpdate: Boolean = js.native
        
        /* CompleteClass */
        override def reDraw(): Unit = js.native
        
        // internal
        /* CompleteClass */
        override def reset(): Unit = js.native
        
        /* CompleteClass */
        var textures: js.Array[String | HTMLCanvasElement] = js.native
        
        /* CompleteClass */
        var transparent: Boolean = js.native
      }
      
      @JSGlobal("AMap.Object3D.RoundPoints")
      @js.native
      open class RoundPoints ()
        extends StObject
           with typingsJapgolly.amapJsApiMap3d.AMap.Object3D.RoundPoints {
        
        /* CompleteClass */
        var DEPTH_TEST: Boolean = js.native
        
        /* CompleteClass */
        var borderColor: String = js.native
        
        /* CompleteClass */
        var borderWeight: Double = js.native
        
        /* CompleteClass */
        override val geometry: typingsJapgolly.amapJsApiMap3d.AMap.Geometry3D = js.native
        /* CompleteClass */
        @JSName("geometry")
        override val geometry_Points: typingsJapgolly.amapJsApiMap3d.AMap.Geometry3D.Points = js.native
        
        /* CompleteClass */
        var merge: Boolean = js.native
        
        /* CompleteClass */
        var needUpdate: Boolean = js.native
        
        /* CompleteClass */
        override def reDraw(): Unit = js.native
        
        // internal
        /* CompleteClass */
        override def reset(): Unit = js.native
        
        /* CompleteClass */
        var textures: js.Array[String | HTMLCanvasElement] = js.native
        
        /* CompleteClass */
        var transparent: Boolean = js.native
      }
      
      @JSGlobal("AMap.Object3D.ThinLine")
      @js.native
      open class ThinLine protected ()
        extends StObject
           with typingsJapgolly.amapJsApiMap3d.AMap.Object3D.Line {
        def this(options: typingsJapgolly.amapJsApiMap3d.AMap.Object3D.ThinLine.Options) = this()
        
        /* CompleteClass */
        var DEPTH_TEST: Boolean = js.native
        
        /* CompleteClass */
        override val geometry: typingsJapgolly.amapJsApiMap3d.AMap.Geometry3D = js.native
        /* CompleteClass */
        @JSName("geometry")
        override val geometry_Line: typingsJapgolly.amapJsApiMap3d.AMap.Geometry3D.Line = js.native
        
        /* CompleteClass */
        var needUpdate: Boolean = js.native
        
        /* CompleteClass */
        override def reDraw(): Unit = js.native
        
        // internal
        /* CompleteClass */
        override def reset(): Unit = js.native
        
        /* CompleteClass */
        var textures: js.Array[String | HTMLCanvasElement] = js.native
        
        /* CompleteClass */
        var transparent: Boolean = js.native
      }
      
      @JSGlobal("AMap.Object3D.Wall")
      @js.native
      open class Wall ()
        extends StObject
           with typingsJapgolly.amapJsApiMap3d.AMap.Object3D.MeshAcceptLights {
        
        /* CompleteClass */
        var DEPTH_TEST: Boolean = js.native
        
        /* CompleteClass */
        override val geometry: typingsJapgolly.amapJsApiMap3d.AMap.Geometry3D = js.native
        /* CompleteClass */
        @JSName("geometry")
        override val geometry_Mesh: typingsJapgolly.amapJsApiMap3d.AMap.Geometry3D.Mesh = js.native
        /* CompleteClass */
        @JSName("geometry")
        override val geometry_MeshAcceptLights: MeshreadonlyvertexNormals = js.native
        
        /* CompleteClass */
        var needUpdate: Boolean = js.native
        
        /* CompleteClass */
        override def reDraw(): Unit = js.native
        
        // internal
        /* CompleteClass */
        override def reset(): Unit = js.native
        
        /* CompleteClass */
        var textures: js.Array[String | HTMLCanvasElement] = js.native
        
        /* CompleteClass */
        var transparent: Boolean = js.native
      }
    }
    
    @JSGlobal("AMap.Object3DGroup")
    @js.native
    open class Object3DGroup[C /* <: typingsJapgolly.amapJsApiMap3d.AMap.Object3D */] ()
      extends StObject
         with typingsJapgolly.amapJsApiMap3d.AMap.Object3DGroup[C] {
      
      /* CompleteClass */
      var DEPTH_TEST: Boolean = js.native
      
      /* CompleteClass */
      override def add(object3d: C): Unit = js.native
      
      /* CompleteClass */
      var children: js.Array[C] = js.native
      
      /* CompleteClass */
      override val geometry: typingsJapgolly.amapJsApiMap3d.AMap.Geometry3D = js.native
      
      /* CompleteClass */
      var needUpdate: Boolean = js.native
      
      /* CompleteClass */
      override def reDraw(): Unit = js.native
      
      /* CompleteClass */
      override def remove(object3d: C): Unit = js.native
      
      // internal
      /* CompleteClass */
      override def reset(): Unit = js.native
      
      /* CompleteClass */
      var textures: js.Array[String | HTMLCanvasElement] = js.native
      
      /* CompleteClass */
      var transparent: Boolean = js.native
    }
    
    @JSGlobal("AMap.Object3DLayer")
    @js.native
    open class Object3DLayer ()
      extends StObject
         with typingsJapgolly.amapJsApiMap3d.AMap.Object3DLayer {
      def this(options: typingsJapgolly.amapJsApiMap3d.AMap.Object3DLayer.Options) = this()
    }
    
    @JSGlobal("AMap.Vector3")
    @js.native
    open class Vector3 protected ()
      extends StObject
         with typingsJapgolly.amapJsApiMap3d.AMap.Vector3 {
      def this(elements: js.Tuple3[Double, Double, Double]) = this()
      def this(elements: typingsJapgolly.amapJsApiMap3d.AMap.Vector3) = this()
    }
  }
}
