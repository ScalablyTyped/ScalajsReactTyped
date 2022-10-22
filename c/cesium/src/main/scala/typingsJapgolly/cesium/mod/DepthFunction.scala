package typingsJapgolly.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DepthFunction extends StObject
@JSImport("cesium", "DepthFunction")
@js.native
object DepthFunction extends StObject {
  
  @JSBracketAccess
  def apply(value: scala.Nothing): js.UndefOr[DepthFunction & scala.Nothing] = js.native
  
  /**
    * The depth test always passes.
    */
  @js.native
  sealed trait ALWAYS
    extends StObject
       with DepthFunction
  /* WebGLConstants.ALWAYS */ val ALWAYS: typingsJapgolly.cesium.mod.DepthFunction.ALWAYS & scala.Nothing = js.native
  
  /**
    * The depth test passes if the incoming depth is equal to the stored depth.
    */
  @js.native
  sealed trait EQUAL
    extends StObject
       with DepthFunction
  /* WebGLConstants.EQUAL */ val EQUAL: typingsJapgolly.cesium.mod.DepthFunction.EQUAL & scala.Nothing = js.native
  
  /**
    * The depth test passes if the incoming depth is greater than the stored depth.
    */
  @js.native
  sealed trait GREATER
    extends StObject
       with DepthFunction
  /* WebGLConstants.GREATER */ val GREATER: typingsJapgolly.cesium.mod.DepthFunction.GREATER & scala.Nothing = js.native
  
  /**
    * The depth test passes if the incoming depth is greater than or equal to the stored depth.
    */
  @js.native
  sealed trait GREATER_OR_EQUAL
    extends StObject
       with DepthFunction
  /* WebGLConstants.GEQUAL */ val GREATER_OR_EQUAL: typingsJapgolly.cesium.mod.DepthFunction.GREATER_OR_EQUAL & scala.Nothing = js.native
  
  /**
    * The depth test passes if the incoming depth is less than the stored depth.
    */
  @js.native
  sealed trait LESS
    extends StObject
       with DepthFunction
  /* WebGLConstants.LESS */ val LESS: typingsJapgolly.cesium.mod.DepthFunction.LESS & scala.Nothing = js.native
  
  /**
    * The depth test passes if the incoming depth is less than or equal to the stored depth.
    */
  @js.native
  sealed trait LESS_OR_EQUAL
    extends StObject
       with DepthFunction
  /* WebGLConstants.LEQUAL */ val LESS_OR_EQUAL: typingsJapgolly.cesium.mod.DepthFunction.LESS_OR_EQUAL & scala.Nothing = js.native
  
  /**
    * The depth test never passes.
    */
  @js.native
  sealed trait NEVER
    extends StObject
       with DepthFunction
  /* WebGLConstants.NEVER */ val NEVER: typingsJapgolly.cesium.mod.DepthFunction.NEVER & scala.Nothing = js.native
  
  /**
    * The depth test passes if the incoming depth is not equal to the stored depth.
    */
  @js.native
  sealed trait NOT_EQUAL
    extends StObject
       with DepthFunction
  /* WebGLConstants.NOTEQUAL */ val NOT_EQUAL: typingsJapgolly.cesium.mod.DepthFunction.NOT_EQUAL & scala.Nothing = js.native
}
