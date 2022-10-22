package typingsJapgolly.antvGLite

import typingsJapgolly.glMatrix.mod.vec3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distShapesMod {
  
  @JSImport("@antv/g-lite/dist/shapes", "AABB")
  @js.native
  open class AABB ()
    extends typingsJapgolly.antvGLite.distShapesAabbMod.AABB {
    def this(center: vec3) = this()
    def this(center: Unit, halfExtents: vec3) = this()
    def this(center: vec3, halfExtents: vec3) = this()
  }
  /* static members */
  object AABB {
    
    @JSImport("@antv/g-lite/dist/shapes", "AABB")
    @js.native
    val ^ : js.Any = js.native
    
    inline def isEmpty(aabb: typingsJapgolly.antvGLite.distShapesAabbMod.AABB): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmpty")(aabb.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  @JSImport("@antv/g-lite/dist/shapes", "Frustum")
  @js.native
  open class Frustum ()
    extends typingsJapgolly.antvGLite.distShapesFrustumMod.Frustum {
    def this(planes: js.Array[typingsJapgolly.antvGLite.distShapesPlaneMod.Plane]) = this()
  }
  
  @JSImport("@antv/g-lite/dist/shapes", "Mask")
  @js.native
  object Mask extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.antvGLite.distShapesFrustumMod.Mask & Double] = js.native
    
    /* 2147483647 */ val INDETERMINATE: typingsJapgolly.antvGLite.distShapesFrustumMod.Mask.INDETERMINATE & Double = js.native
    
    /* 0 */ val INSIDE: typingsJapgolly.antvGLite.distShapesFrustumMod.Mask.INSIDE & Double = js.native
    
    /* 4294967295.0 */ val OUTSIDE: typingsJapgolly.antvGLite.distShapesFrustumMod.Mask.OUTSIDE & Double = js.native
  }
  
  @JSImport("@antv/g-lite/dist/shapes", "Plane")
  @js.native
  open class Plane ()
    extends typingsJapgolly.antvGLite.distShapesPlaneMod.Plane {
    def this(distance: Double) = this()
    def this(distance: Double, normal: vec3) = this()
    def this(distance: Unit, normal: vec3) = this()
  }
  
  @JSImport("@antv/g-lite/dist/shapes", "Point")
  @js.native
  open class Point ()
    extends typingsJapgolly.antvGLite.distShapesPointMod.Point {
    def this(x: Double) = this()
    def this(x: Double, y: Double) = this()
    def this(x: Unit, y: Double) = this()
  }
  
  @JSImport("@antv/g-lite/dist/shapes", "Rectangle")
  @js.native
  open class Rectangle protected ()
    extends typingsJapgolly.antvGLite.distShapesRectangleMod.Rectangle {
    def this(x: Double, y: Double, width: Double, height: Double) = this()
  }
}
