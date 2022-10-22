package typingsJapgolly.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait UniformType extends StObject
@JSImport("cesium", "UniformType")
@js.native
object UniformType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[UniformType & String] = js.native
  
  /**
    * A single boolean value.
    */
  @js.native
  sealed trait BOOL
    extends StObject
       with UniformType
  /* "bool" */ val BOOL: typingsJapgolly.cesium.mod.UniformType.BOOL & String = js.native
  
  /**
    * A vector of 2 boolean values.
    */
  @js.native
  sealed trait BOOL_VEC2
    extends StObject
       with UniformType
  /* "bvec2" */ val BOOL_VEC2: typingsJapgolly.cesium.mod.UniformType.BOOL_VEC2 & String = js.native
  
  /**
    * A vector of 3 boolean values.
    */
  @js.native
  sealed trait BOOL_VEC3
    extends StObject
       with UniformType
  /* "bvec3" */ val BOOL_VEC3: typingsJapgolly.cesium.mod.UniformType.BOOL_VEC3 & String = js.native
  
  /**
    * A vector of 4 boolean values.
    */
  @js.native
  sealed trait BOOL_VEC4
    extends StObject
       with UniformType
  /* "bvec4" */ val BOOL_VEC4: typingsJapgolly.cesium.mod.UniformType.BOOL_VEC4 & String = js.native
  
  /**
    * A single floating point value.
    */
  @js.native
  sealed trait FLOAT
    extends StObject
       with UniformType
  /* "float" */ val FLOAT: typingsJapgolly.cesium.mod.UniformType.FLOAT & String = js.native
  
  /**
    * A single integer value
    */
  @js.native
  sealed trait INT
    extends StObject
       with UniformType
  /* "int" */ val INT: typingsJapgolly.cesium.mod.UniformType.INT & String = js.native
  
  /**
    * A vector of 2 integer values.
    */
  @js.native
  sealed trait INT_VEC2
    extends StObject
       with UniformType
  /* "ivec2" */ val INT_VEC2: typingsJapgolly.cesium.mod.UniformType.INT_VEC2 & String = js.native
  
  /**
    * A vector of 3 integer values.
    */
  @js.native
  sealed trait INT_VEC3
    extends StObject
       with UniformType
  /* "ivec3" */ val INT_VEC3: typingsJapgolly.cesium.mod.UniformType.INT_VEC3 & String = js.native
  
  /**
    * A vector of 4 integer values.
    */
  @js.native
  sealed trait INT_VEC4
    extends StObject
       with UniformType
  /* "ivec4" */ val INT_VEC4: typingsJapgolly.cesium.mod.UniformType.INT_VEC4 & String = js.native
  
  /**
    * A 2x2 matrix of floating point values.
    */
  @js.native
  sealed trait MAT2
    extends StObject
       with UniformType
  /* "mat2" */ val MAT2: typingsJapgolly.cesium.mod.UniformType.MAT2 & String = js.native
  
  /**
    * A 3x3 matrix of floating point values.
    */
  @js.native
  sealed trait MAT3
    extends StObject
       with UniformType
  /* "mat2" */ val MAT3: typingsJapgolly.cesium.mod.UniformType.MAT3 & String = js.native
  
  /**
    * A 3x3 matrix of floating point values.
    */
  @js.native
  sealed trait MAT4
    extends StObject
       with UniformType
  /* "mat4" */ val MAT4: typingsJapgolly.cesium.mod.UniformType.MAT4 & String = js.native
  
  /**
    * A 2D sampled texture.
    */
  @js.native
  sealed trait SAMPLER_2D
    extends StObject
       with UniformType
  /* "sampler2D" */ val SAMPLER_2D: typingsJapgolly.cesium.mod.UniformType.SAMPLER_2D & String = js.native
  
  @js.native
  sealed trait SAMPLER_CUBE
    extends StObject
       with UniformType
  /* "samplerCube" */ val SAMPLER_CUBE: typingsJapgolly.cesium.mod.UniformType.SAMPLER_CUBE & String = js.native
  
  /**
    * A vector of 2 floating point values.
    */
  @js.native
  sealed trait VEC2
    extends StObject
       with UniformType
  /* "vec2" */ val VEC2: typingsJapgolly.cesium.mod.UniformType.VEC2 & String = js.native
  
  /**
    * A vector of 3 floating point values.
    */
  @js.native
  sealed trait VEC3
    extends StObject
       with UniformType
  /* "vec3" */ val VEC3: typingsJapgolly.cesium.mod.UniformType.VEC3 & String = js.native
  
  /**
    * A vector of 4 floating point values.
    */
  @js.native
  sealed trait VEC4
    extends StObject
       with UniformType
  /* "vec4" */ val VEC4: typingsJapgolly.cesium.mod.UniformType.VEC4 & String = js.native
}
