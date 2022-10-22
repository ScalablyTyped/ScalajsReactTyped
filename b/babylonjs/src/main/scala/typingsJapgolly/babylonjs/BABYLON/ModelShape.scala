package typingsJapgolly.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModelShape extends StObject {
  
  /**
    * indices array of the model
    * @internal
    */
  var _indices: js.Array[Double] = js.native
  
  /**
    * length of the shape in the model indices array (internal use)
    * @internal
    */
  var _indicesLength: Double = js.native
  
  /**
    * Model material (internal use)
    * @internal
    */
  var _material: Nullable[Material] = js.native
  
  /**
    * normals array of the model
    * @internal
    */
  var _normals: js.Array[Double] = js.native
  
  /**
    * Custom position function (internal use)
    * @internal
    */
  var _positionFunction: Nullable[js.Function3[/* particle */ SolidParticle, /* i */ Double, /* s */ Double, Unit]] = js.native
  
  /**
    * flat array of model positions (internal use)
    * @internal
    */
  var _shape: js.Array[Vector3] = js.native
  
  /**
    * color array of the model
    * @internal
    */
  var _shapeColors: js.Array[Double] = js.native
  
  /**
    * flat array of model UVs (internal use)
    * @internal
    */
  var _shapeUV: js.Array[Double] = js.native
  
  /**
    * Custom vertex function (internal use)
    * @internal
    */
  var _vertexFunction: Nullable[
    js.Function3[/* particle */ SolidParticle, /* vertex */ Vector3, /* i */ Double, Unit]
  ] = js.native
  
  /**
    * Get or set the shapeId
    * @deprecated Please use shapeId instead
    */
  def shapeID: Double = js.native
  def shapeID_=(shapeID: Double): Unit = js.native
  
  /**
    * The shape id
    * @internal
    */
  var shapeId: Double = js.native
}
