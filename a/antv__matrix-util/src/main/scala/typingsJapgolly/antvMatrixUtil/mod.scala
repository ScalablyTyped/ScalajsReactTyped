package typingsJapgolly.antvMatrixUtil

import typingsJapgolly.glMatrix.mod.ReadonlyMat2
import typingsJapgolly.glMatrix.mod.ReadonlyMat2d
import typingsJapgolly.glMatrix.mod.ReadonlyMat3
import typingsJapgolly.glMatrix.mod.ReadonlyMat4
import typingsJapgolly.glMatrix.mod.ReadonlyQuat
import typingsJapgolly.glMatrix.mod.ReadonlyVec2
import typingsJapgolly.glMatrix.mod.ReadonlyVec3
import typingsJapgolly.glMatrix.mod.mat3
import typingsJapgolly.glMatrix.mod.vec3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object ext {
    
    @JSImport("@antv/matrix-util", "ext")
    @js.native
    val ^ : js.Any = js.native
    
    inline def angleTo(v1: js.Tuple2[Double, Double], v2: js.Tuple2[Double, Double], direct: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("angleTo")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], direct.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def direction(v1: js.Array[Double], v2: js.Array[Double]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("direction")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def leftRotate(out: Any, a: Any, rad: Any): mat3 = (^.asInstanceOf[js.Dynamic].applyDynamic("leftRotate")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], rad.asInstanceOf[js.Any])).asInstanceOf[mat3]
    
    inline def leftScale(out: Any, a: Any, v: Any): mat3 = (^.asInstanceOf[js.Dynamic].applyDynamic("leftScale")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[mat3]
    
    inline def leftTranslate(out: Any, a: Any, v: Any): mat3 = (^.asInstanceOf[js.Dynamic].applyDynamic("leftTranslate")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[mat3]
    
    inline def transform(m: js.Array[Double], actions: js.Array[js.Array[Any]]): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(m.asInstanceOf[js.Any], actions.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    
    inline def vertical(out: js.Array[Double], v: js.Array[Double], flag: Boolean): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("vertical")(out.asInstanceOf[js.Any], v.asInstanceOf[js.Any], flag.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  }
  
  object mat3 {
    
    @JSImport("@antv/matrix-util", "mat3")
    @js.native
    val ^ : js.Any = js.native
    
    inline def add(out: typingsJapgolly.glMatrix.mod.mat3, a: ReadonlyMat3, b: ReadonlyMat3): typingsJapgolly.glMatrix.mod.mat3 = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.glMatrix.mod.mat3]
    
    inline def adjoint(out: typingsJapgolly.glMatrix.mod.mat3, a: ReadonlyMat3): typingsJapgolly.glMatrix.mod.mat3 = (^.asInstanceOf[js.Dynamic].applyDynamic("adjoint")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.glMatrix.mod.mat3]
    
    inline def clone_(a: ReadonlyMat3): typingsJapgolly.glMatrix.mod.mat3 = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(a.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.glMatrix.mod.mat3]
    
    inline def copy(out: typingsJapgolly.glMatrix.mod.mat3, a: ReadonlyMat3): typingsJapgolly.glMatrix.mod.mat3 = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.glMatrix.mod.mat3]
    
    inline def create(): typingsJapgolly.glMatrix.mod.mat3 = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typingsJapgolly.glMatrix.mod.mat3]
    
    inline def determinant(a: ReadonlyMat3): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("determinant")(a.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def equals_(a: ReadonlyMat3, b: ReadonlyMat3): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def exactEquals(a: ReadonlyMat3, b: ReadonlyMat3): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("exactEquals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def frob(a: ReadonlyMat3): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("frob")(a.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def fromMat2d(out: typingsJapgolly.glMatrix.mod.mat3, a: ReadonlyMat2d): typingsJapgolly.glMatrix.mod.mat3 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMat2d")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.glMatrix.mod.mat3]
    
    inline def fromMat4(out: typingsJapgolly.glMatrix.mod.mat3, a: ReadonlyMat4): typingsJapgolly.glMatrix.mod.mat3 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMat4")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.glMatrix.mod.mat3]
    
    inline def fromQuat(out: typingsJapgolly.glMatrix.mod.mat3, q: ReadonlyQuat): typingsJapgolly.glMatrix.mod.mat3 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromQuat")(out.asInstanceOf[js.Any], q.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.glMatrix.mod.mat3]
    
    inline def fromRotation(out: typingsJapgolly.glMatrix.mod.mat3, rad: Double): typingsJapgolly.glMatrix.mod.mat3 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRotation")(out.asInstanceOf[js.Any], rad.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.glMatrix.mod.mat3]
    
    inline def fromScaling(out: typingsJapgolly.glMatrix.mod.mat3, v: ReadonlyVec2): typingsJapgolly.glMatrix.mod.mat3 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromScaling")(out.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.glMatrix.mod.mat3]
    
    inline def fromTranslation(out: typingsJapgolly.glMatrix.mod.mat3, v: ReadonlyVec2): typingsJapgolly.glMatrix.mod.mat3 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromTranslation")(out.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.glMatrix.mod.mat3]
    
    inline def fromValues(
      m00: Double,
      m01: Double,
      m02: Double,
      m10: Double,
      m11: Double,
      m12: Double,
      m20: Double,
      m21: Double,
      m22: Double
    ): typingsJapgolly.glMatrix.mod.mat3 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromValues")(m00.asInstanceOf[js.Any], m01.asInstanceOf[js.Any], m02.asInstanceOf[js.Any], m10.asInstanceOf[js.Any], m11.asInstanceOf[js.Any], m12.asInstanceOf[js.Any], m20.asInstanceOf[js.Any], m21.asInstanceOf[js.Any], m22.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.glMatrix.mod.mat3]
    
    inline def identity(out: typingsJapgolly.glMatrix.mod.mat3): typingsJapgolly.glMatrix.mod.mat3 = ^.asInstanceOf[js.Dynamic].applyDynamic("identity")(out.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.glMatrix.mod.mat3]
    
    inline def invert(out: typingsJapgolly.glMatrix.mod.mat3, a: ReadonlyMat3): typingsJapgolly.glMatrix.mod.mat3 = (^.asInstanceOf[js.Dynamic].applyDynamic("invert")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.glMatrix.mod.mat3]
    
    inline def mul(out: typingsJapgolly.glMatrix.mod.mat3, a: ReadonlyMat3, b: ReadonlyMat3): typingsJapgolly.glMatrix.mod.mat3 = (^.asInstanceOf[js.Dynamic].applyDynamic("mul")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.glMatrix.mod.mat3]
    
    inline def multiply(out: typingsJapgolly.glMatrix.mod.mat3, a: ReadonlyMat3, b: ReadonlyMat3): typingsJapgolly.glMatrix.mod.mat3 = (^.asInstanceOf[js.Dynamic].applyDynamic("multiply")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.glMatrix.mod.mat3]
    
    inline def multiplyScalar(out: typingsJapgolly.glMatrix.mod.mat3, a: ReadonlyMat3, b: Double): typingsJapgolly.glMatrix.mod.mat3 = (^.asInstanceOf[js.Dynamic].applyDynamic("multiplyScalar")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.glMatrix.mod.mat3]
    
    inline def multiplyScalarAndAdd(out: typingsJapgolly.glMatrix.mod.mat3, a: ReadonlyMat3, b: ReadonlyMat3, scale: Double): typingsJapgolly.glMatrix.mod.mat3 = (^.asInstanceOf[js.Dynamic].applyDynamic("multiplyScalarAndAdd")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.glMatrix.mod.mat3]
    
    inline def normalFromMat4(out: typingsJapgolly.glMatrix.mod.mat3, a: ReadonlyMat4): typingsJapgolly.glMatrix.mod.mat3 = (^.asInstanceOf[js.Dynamic].applyDynamic("normalFromMat4")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.glMatrix.mod.mat3]
    
    inline def projection(out: typingsJapgolly.glMatrix.mod.mat3, width: Double, height: Double): typingsJapgolly.glMatrix.mod.mat3 = (^.asInstanceOf[js.Dynamic].applyDynamic("projection")(out.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.glMatrix.mod.mat3]
    
    inline def rotate(out: typingsJapgolly.glMatrix.mod.mat3, a: ReadonlyMat3, rad: Double): typingsJapgolly.glMatrix.mod.mat3 = (^.asInstanceOf[js.Dynamic].applyDynamic("rotate")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], rad.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.glMatrix.mod.mat3]
    
    inline def scale(out: typingsJapgolly.glMatrix.mod.mat3, a: ReadonlyMat3, v: ReadonlyVec2): typingsJapgolly.glMatrix.mod.mat3 = (^.asInstanceOf[js.Dynamic].applyDynamic("scale")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.glMatrix.mod.mat3]
    
    inline def set(
      out: typingsJapgolly.glMatrix.mod.mat3,
      m00: Double,
      m01: Double,
      m02: Double,
      m10: Double,
      m11: Double,
      m12: Double,
      m20: Double,
      m21: Double,
      m22: Double
    ): typingsJapgolly.glMatrix.mod.mat3 = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(out.asInstanceOf[js.Any], m00.asInstanceOf[js.Any], m01.asInstanceOf[js.Any], m02.asInstanceOf[js.Any], m10.asInstanceOf[js.Any], m11.asInstanceOf[js.Any], m12.asInstanceOf[js.Any], m20.asInstanceOf[js.Any], m21.asInstanceOf[js.Any], m22.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.glMatrix.mod.mat3]
    
    inline def str(a: ReadonlyMat3): String = ^.asInstanceOf[js.Dynamic].applyDynamic("str")(a.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def sub(out: typingsJapgolly.glMatrix.mod.mat3, a: ReadonlyMat3, b: ReadonlyMat3): typingsJapgolly.glMatrix.mod.mat3 = (^.asInstanceOf[js.Dynamic].applyDynamic("sub")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.glMatrix.mod.mat3]
    
    inline def subtract(out: typingsJapgolly.glMatrix.mod.mat3, a: ReadonlyMat3, b: ReadonlyMat3): typingsJapgolly.glMatrix.mod.mat3 = (^.asInstanceOf[js.Dynamic].applyDynamic("subtract")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.glMatrix.mod.mat3]
    
    inline def translate(out: typingsJapgolly.glMatrix.mod.mat3, a: ReadonlyMat3, v: ReadonlyVec2): typingsJapgolly.glMatrix.mod.mat3 = (^.asInstanceOf[js.Dynamic].applyDynamic("translate")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.glMatrix.mod.mat3]
    
    inline def transpose(out: typingsJapgolly.glMatrix.mod.mat3, a: ReadonlyMat3): typingsJapgolly.glMatrix.mod.mat3 = (^.asInstanceOf[js.Dynamic].applyDynamic("transpose")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.glMatrix.mod.mat3]
  }
  
  object vec2 {
    
    @JSImport("@antv/matrix-util", "vec2")
    @js.native
    val ^ : js.Any = js.native
    
    inline def add(out: typingsJapgolly.glMatrix.mod.vec2, a: ReadonlyVec2, b: ReadonlyVec2): typingsJapgolly.glMatrix.mod.vec2 = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.glMatrix.mod.vec2]
    
    inline def angle(a: ReadonlyVec2, b: ReadonlyVec2): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("angle")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def ceil(out: typingsJapgolly.glMatrix.mod.vec2, a: ReadonlyVec2): typingsJapgolly.glMatrix.mod.vec2 = (^.asInstanceOf[js.Dynamic].applyDynamic("ceil")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.glMatrix.mod.vec2]
    
    inline def clone_(a: ReadonlyVec2): typingsJapgolly.glMatrix.mod.vec2 = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(a.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.glMatrix.mod.vec2]
    
    inline def copy(out: typingsJapgolly.glMatrix.mod.vec2, a: ReadonlyVec2): typingsJapgolly.glMatrix.mod.vec2 = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.glMatrix.mod.vec2]
    
    inline def create(): typingsJapgolly.glMatrix.mod.vec2 = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typingsJapgolly.glMatrix.mod.vec2]
    
    inline def cross(out: vec3, a: ReadonlyVec2, b: ReadonlyVec2): vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("cross")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[vec3]
    
    inline def dist(a: ReadonlyVec2, b: ReadonlyVec2): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("dist")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def distance(a: ReadonlyVec2, b: ReadonlyVec2): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distance")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def div(out: typingsJapgolly.glMatrix.mod.vec2, a: ReadonlyVec2, b: ReadonlyVec2): typingsJapgolly.glMatrix.mod.vec2 = (^.asInstanceOf[js.Dynamic].applyDynamic("div")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.glMatrix.mod.vec2]
    
    inline def divide(out: typingsJapgolly.glMatrix.mod.vec2, a: ReadonlyVec2, b: ReadonlyVec2): typingsJapgolly.glMatrix.mod.vec2 = (^.asInstanceOf[js.Dynamic].applyDynamic("divide")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.glMatrix.mod.vec2]
    
    inline def dot(a: ReadonlyVec2, b: ReadonlyVec2): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("dot")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def equals_(a: ReadonlyVec2, b: ReadonlyVec2): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def exactEquals(a: ReadonlyVec2, b: ReadonlyVec2): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("exactEquals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def floor(out: typingsJapgolly.glMatrix.mod.vec2, a: ReadonlyVec2): typingsJapgolly.glMatrix.mod.vec2 = (^.asInstanceOf[js.Dynamic].applyDynamic("floor")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.glMatrix.mod.vec2]
    
    inline def forEach(a: Any, stride: Any, offset: Any, count: Any, fn: Any, arg: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(a.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], count.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], arg.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def fromValues(x: Double, y: Double): typingsJapgolly.glMatrix.mod.vec2 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromValues")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.glMatrix.mod.vec2]
    
    inline def inverse(out: typingsJapgolly.glMatrix.mod.vec2, a: ReadonlyVec2): typingsJapgolly.glMatrix.mod.vec2 = (^.asInstanceOf[js.Dynamic].applyDynamic("inverse")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.glMatrix.mod.vec2]
    
    inline def len(a: ReadonlyVec2): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("len")(a.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def length(a: ReadonlyVec2): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("length")(a.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def lerp(out: typingsJapgolly.glMatrix.mod.vec2, a: ReadonlyVec2, b: ReadonlyVec2, t: Double): typingsJapgolly.glMatrix.mod.vec2 = (^.asInstanceOf[js.Dynamic].applyDynamic("lerp")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.glMatrix.mod.vec2]
    
    inline def max(out: typingsJapgolly.glMatrix.mod.vec2, a: ReadonlyVec2, b: ReadonlyVec2): typingsJapgolly.glMatrix.mod.vec2 = (^.asInstanceOf[js.Dynamic].applyDynamic("max")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.glMatrix.mod.vec2]
    
    inline def min(out: typingsJapgolly.glMatrix.mod.vec2, a: ReadonlyVec2, b: ReadonlyVec2): typingsJapgolly.glMatrix.mod.vec2 = (^.asInstanceOf[js.Dynamic].applyDynamic("min")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.glMatrix.mod.vec2]
    
    inline def mul(out: typingsJapgolly.glMatrix.mod.vec2, a: ReadonlyVec2, b: ReadonlyVec2): typingsJapgolly.glMatrix.mod.vec2 = (^.asInstanceOf[js.Dynamic].applyDynamic("mul")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.glMatrix.mod.vec2]
    
    inline def multiply(out: typingsJapgolly.glMatrix.mod.vec2, a: ReadonlyVec2, b: ReadonlyVec2): typingsJapgolly.glMatrix.mod.vec2 = (^.asInstanceOf[js.Dynamic].applyDynamic("multiply")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.glMatrix.mod.vec2]
    
    inline def negate(out: typingsJapgolly.glMatrix.mod.vec2, a: ReadonlyVec2): typingsJapgolly.glMatrix.mod.vec2 = (^.asInstanceOf[js.Dynamic].applyDynamic("negate")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.glMatrix.mod.vec2]
    
    inline def normalize(out: typingsJapgolly.glMatrix.mod.vec2, a: ReadonlyVec2): typingsJapgolly.glMatrix.mod.vec2 = (^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.glMatrix.mod.vec2]
    
    inline def random(out: typingsJapgolly.glMatrix.mod.vec2): typingsJapgolly.glMatrix.mod.vec2 = ^.asInstanceOf[js.Dynamic].applyDynamic("random")(out.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.glMatrix.mod.vec2]
    inline def random(out: typingsJapgolly.glMatrix.mod.vec2, scale: Double): typingsJapgolly.glMatrix.mod.vec2 = (^.asInstanceOf[js.Dynamic].applyDynamic("random")(out.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.glMatrix.mod.vec2]
    
    inline def rotate(out: typingsJapgolly.glMatrix.mod.vec2, a: ReadonlyVec2, b: ReadonlyVec2, rad: Double): typingsJapgolly.glMatrix.mod.vec2 = (^.asInstanceOf[js.Dynamic].applyDynamic("rotate")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], rad.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.glMatrix.mod.vec2]
    
    inline def round(out: typingsJapgolly.glMatrix.mod.vec2, a: ReadonlyVec2): typingsJapgolly.glMatrix.mod.vec2 = (^.asInstanceOf[js.Dynamic].applyDynamic("round")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.glMatrix.mod.vec2]
    
    inline def scale(out: typingsJapgolly.glMatrix.mod.vec2, a: ReadonlyVec2, b: Double): typingsJapgolly.glMatrix.mod.vec2 = (^.asInstanceOf[js.Dynamic].applyDynamic("scale")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.glMatrix.mod.vec2]
    
    inline def scaleAndAdd(out: typingsJapgolly.glMatrix.mod.vec2, a: ReadonlyVec2, b: ReadonlyVec2, scale: Double): typingsJapgolly.glMatrix.mod.vec2 = (^.asInstanceOf[js.Dynamic].applyDynamic("scaleAndAdd")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.glMatrix.mod.vec2]
    
    inline def set(out: typingsJapgolly.glMatrix.mod.vec2, x: Double, y: Double): typingsJapgolly.glMatrix.mod.vec2 = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(out.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.glMatrix.mod.vec2]
    
    inline def sqrDist(a: ReadonlyVec2, b: ReadonlyVec2): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("sqrDist")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def sqrLen(a: ReadonlyVec2): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sqrLen")(a.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def squaredDistance(a: ReadonlyVec2, b: ReadonlyVec2): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("squaredDistance")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def squaredLength(a: ReadonlyVec2): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("squaredLength")(a.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def str(a: ReadonlyVec2): String = ^.asInstanceOf[js.Dynamic].applyDynamic("str")(a.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def sub(out: typingsJapgolly.glMatrix.mod.vec2, a: ReadonlyVec2, b: ReadonlyVec2): typingsJapgolly.glMatrix.mod.vec2 = (^.asInstanceOf[js.Dynamic].applyDynamic("sub")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.glMatrix.mod.vec2]
    
    inline def subtract(out: typingsJapgolly.glMatrix.mod.vec2, a: ReadonlyVec2, b: ReadonlyVec2): typingsJapgolly.glMatrix.mod.vec2 = (^.asInstanceOf[js.Dynamic].applyDynamic("subtract")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.glMatrix.mod.vec2]
    
    inline def transformMat2(out: typingsJapgolly.glMatrix.mod.vec2, a: ReadonlyVec2, m: ReadonlyMat2): typingsJapgolly.glMatrix.mod.vec2 = (^.asInstanceOf[js.Dynamic].applyDynamic("transformMat2")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], m.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.glMatrix.mod.vec2]
    
    inline def transformMat2d(out: typingsJapgolly.glMatrix.mod.vec2, a: ReadonlyVec2, m: ReadonlyMat2d): typingsJapgolly.glMatrix.mod.vec2 = (^.asInstanceOf[js.Dynamic].applyDynamic("transformMat2d")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], m.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.glMatrix.mod.vec2]
    
    inline def transformMat3(out: typingsJapgolly.glMatrix.mod.vec2, a: ReadonlyVec2, m: ReadonlyMat3): typingsJapgolly.glMatrix.mod.vec2 = (^.asInstanceOf[js.Dynamic].applyDynamic("transformMat3")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], m.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.glMatrix.mod.vec2]
    
    inline def transformMat4(out: typingsJapgolly.glMatrix.mod.vec2, a: ReadonlyVec2, m: ReadonlyMat4): typingsJapgolly.glMatrix.mod.vec2 = (^.asInstanceOf[js.Dynamic].applyDynamic("transformMat4")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], m.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.glMatrix.mod.vec2]
    
    inline def zero(out: typingsJapgolly.glMatrix.mod.vec2): typingsJapgolly.glMatrix.mod.vec2 = ^.asInstanceOf[js.Dynamic].applyDynamic("zero")(out.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.glMatrix.mod.vec2]
  }
  
  object vec3 {
    
    @JSImport("@antv/matrix-util", "vec3")
    @js.native
    val ^ : js.Any = js.native
    
    inline def add(out: typingsJapgolly.glMatrix.mod.vec3, a: ReadonlyVec3, b: ReadonlyVec3): typingsJapgolly.glMatrix.mod.vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.glMatrix.mod.vec3]
    
    inline def angle(a: ReadonlyVec3, b: ReadonlyVec3): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("angle")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def bezier(
      out: typingsJapgolly.glMatrix.mod.vec3,
      a: ReadonlyVec3,
      b: ReadonlyVec3,
      c: ReadonlyVec3,
      d: ReadonlyVec3,
      t: Double
    ): typingsJapgolly.glMatrix.mod.vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("bezier")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.glMatrix.mod.vec3]
    
    inline def ceil(out: typingsJapgolly.glMatrix.mod.vec3, a: ReadonlyVec3): typingsJapgolly.glMatrix.mod.vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("ceil")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.glMatrix.mod.vec3]
    
    inline def clone_(a: ReadonlyVec3): typingsJapgolly.glMatrix.mod.vec3 = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(a.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.glMatrix.mod.vec3]
    
    inline def copy(out: typingsJapgolly.glMatrix.mod.vec3, a: ReadonlyVec3): typingsJapgolly.glMatrix.mod.vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.glMatrix.mod.vec3]
    
    inline def create(): typingsJapgolly.glMatrix.mod.vec3 = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typingsJapgolly.glMatrix.mod.vec3]
    
    inline def cross(out: typingsJapgolly.glMatrix.mod.vec3, a: ReadonlyVec3, b: ReadonlyVec3): typingsJapgolly.glMatrix.mod.vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("cross")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.glMatrix.mod.vec3]
    
    inline def dist(a: ReadonlyVec3, b: ReadonlyVec3): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("dist")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def distance(a: ReadonlyVec3, b: ReadonlyVec3): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distance")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def div(out: typingsJapgolly.glMatrix.mod.vec3, a: ReadonlyVec3, b: ReadonlyVec3): typingsJapgolly.glMatrix.mod.vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("div")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.glMatrix.mod.vec3]
    
    inline def divide(out: typingsJapgolly.glMatrix.mod.vec3, a: ReadonlyVec3, b: ReadonlyVec3): typingsJapgolly.glMatrix.mod.vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("divide")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.glMatrix.mod.vec3]
    
    inline def dot(a: ReadonlyVec3, b: ReadonlyVec3): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("dot")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def equals_(a: ReadonlyVec3, b: ReadonlyVec3): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def exactEquals(a: ReadonlyVec3, b: ReadonlyVec3): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("exactEquals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def floor(out: typingsJapgolly.glMatrix.mod.vec3, a: ReadonlyVec3): typingsJapgolly.glMatrix.mod.vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("floor")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.glMatrix.mod.vec3]
    
    inline def forEach(a: Any, stride: Any, offset: Any, count: Any, fn: Any, arg: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(a.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], count.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], arg.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def fromValues(x: Double, y: Double, z: Double): typingsJapgolly.glMatrix.mod.vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromValues")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.glMatrix.mod.vec3]
    
    inline def hermite(
      out: typingsJapgolly.glMatrix.mod.vec3,
      a: ReadonlyVec3,
      b: ReadonlyVec3,
      c: ReadonlyVec3,
      d: ReadonlyVec3,
      t: Double
    ): typingsJapgolly.glMatrix.mod.vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("hermite")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.glMatrix.mod.vec3]
    
    inline def inverse(out: typingsJapgolly.glMatrix.mod.vec3, a: ReadonlyVec3): typingsJapgolly.glMatrix.mod.vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("inverse")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.glMatrix.mod.vec3]
    
    inline def len(a: ReadonlyVec3): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("len")(a.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def length(a: ReadonlyVec3): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("length")(a.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def lerp(out: typingsJapgolly.glMatrix.mod.vec3, a: ReadonlyVec3, b: ReadonlyVec3, t: Double): typingsJapgolly.glMatrix.mod.vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("lerp")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.glMatrix.mod.vec3]
    
    inline def max(out: typingsJapgolly.glMatrix.mod.vec3, a: ReadonlyVec3, b: ReadonlyVec3): typingsJapgolly.glMatrix.mod.vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("max")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.glMatrix.mod.vec3]
    
    inline def min(out: typingsJapgolly.glMatrix.mod.vec3, a: ReadonlyVec3, b: ReadonlyVec3): typingsJapgolly.glMatrix.mod.vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("min")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.glMatrix.mod.vec3]
    
    inline def mul(out: typingsJapgolly.glMatrix.mod.vec3, a: ReadonlyVec3, b: ReadonlyVec3): typingsJapgolly.glMatrix.mod.vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("mul")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.glMatrix.mod.vec3]
    
    inline def multiply(out: typingsJapgolly.glMatrix.mod.vec3, a: ReadonlyVec3, b: ReadonlyVec3): typingsJapgolly.glMatrix.mod.vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("multiply")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.glMatrix.mod.vec3]
    
    inline def negate(out: typingsJapgolly.glMatrix.mod.vec3, a: ReadonlyVec3): typingsJapgolly.glMatrix.mod.vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("negate")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.glMatrix.mod.vec3]
    
    inline def normalize(out: typingsJapgolly.glMatrix.mod.vec3, a: ReadonlyVec3): typingsJapgolly.glMatrix.mod.vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.glMatrix.mod.vec3]
    
    inline def random(out: typingsJapgolly.glMatrix.mod.vec3): typingsJapgolly.glMatrix.mod.vec3 = ^.asInstanceOf[js.Dynamic].applyDynamic("random")(out.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.glMatrix.mod.vec3]
    inline def random(out: typingsJapgolly.glMatrix.mod.vec3, scale: Double): typingsJapgolly.glMatrix.mod.vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("random")(out.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.glMatrix.mod.vec3]
    
    inline def rotateX(out: typingsJapgolly.glMatrix.mod.vec3, a: ReadonlyVec3, b: ReadonlyVec3, rad: Double): typingsJapgolly.glMatrix.mod.vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("rotateX")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], rad.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.glMatrix.mod.vec3]
    
    inline def rotateY(out: typingsJapgolly.glMatrix.mod.vec3, a: ReadonlyVec3, b: ReadonlyVec3, rad: Double): typingsJapgolly.glMatrix.mod.vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("rotateY")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], rad.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.glMatrix.mod.vec3]
    
    inline def rotateZ(out: typingsJapgolly.glMatrix.mod.vec3, a: ReadonlyVec3, b: ReadonlyVec3, rad: Double): typingsJapgolly.glMatrix.mod.vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("rotateZ")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], rad.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.glMatrix.mod.vec3]
    
    inline def round(out: typingsJapgolly.glMatrix.mod.vec3, a: ReadonlyVec3): typingsJapgolly.glMatrix.mod.vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("round")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.glMatrix.mod.vec3]
    
    inline def scale(out: typingsJapgolly.glMatrix.mod.vec3, a: ReadonlyVec3, b: Double): typingsJapgolly.glMatrix.mod.vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("scale")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.glMatrix.mod.vec3]
    
    inline def scaleAndAdd(out: typingsJapgolly.glMatrix.mod.vec3, a: ReadonlyVec3, b: ReadonlyVec3, scale: Double): typingsJapgolly.glMatrix.mod.vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("scaleAndAdd")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.glMatrix.mod.vec3]
    
    inline def set(out: typingsJapgolly.glMatrix.mod.vec3, x: Double, y: Double, z: Double): typingsJapgolly.glMatrix.mod.vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(out.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.glMatrix.mod.vec3]
    
    inline def sqrDist(a: ReadonlyVec3, b: ReadonlyVec3): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("sqrDist")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def sqrLen(a: ReadonlyVec3): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sqrLen")(a.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def squaredDistance(a: ReadonlyVec3, b: ReadonlyVec3): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("squaredDistance")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def squaredLength(a: ReadonlyVec3): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("squaredLength")(a.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def str(a: ReadonlyVec3): String = ^.asInstanceOf[js.Dynamic].applyDynamic("str")(a.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def sub(out: typingsJapgolly.glMatrix.mod.vec3, a: ReadonlyVec3, b: ReadonlyVec3): typingsJapgolly.glMatrix.mod.vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("sub")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.glMatrix.mod.vec3]
    
    inline def subtract(out: typingsJapgolly.glMatrix.mod.vec3, a: ReadonlyVec3, b: ReadonlyVec3): typingsJapgolly.glMatrix.mod.vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("subtract")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.glMatrix.mod.vec3]
    
    inline def transformMat3(out: typingsJapgolly.glMatrix.mod.vec3, a: ReadonlyVec3, m: ReadonlyMat3): typingsJapgolly.glMatrix.mod.vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("transformMat3")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], m.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.glMatrix.mod.vec3]
    
    inline def transformMat4(out: typingsJapgolly.glMatrix.mod.vec3, a: ReadonlyVec3, m: ReadonlyMat4): typingsJapgolly.glMatrix.mod.vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("transformMat4")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], m.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.glMatrix.mod.vec3]
    
    inline def transformQuat(out: typingsJapgolly.glMatrix.mod.vec3, a: ReadonlyVec3, q: ReadonlyQuat): typingsJapgolly.glMatrix.mod.vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("transformQuat")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], q.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.glMatrix.mod.vec3]
    
    inline def zero(out: typingsJapgolly.glMatrix.mod.vec3): typingsJapgolly.glMatrix.mod.vec3 = ^.asInstanceOf[js.Dynamic].applyDynamic("zero")(out.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.glMatrix.mod.vec3]
  }
}
