package typingsJapgolly.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.PositionNormalTextureVertex")
@js.native
/**
  * Creates a PositionNormalTextureVertex
  * @param position the position of the vertex (defaut: 0,0,0)
  * @param normal the normal of the vertex (defaut: 0,1,0)
  * @param uv the uv of the vertex (default: 0,0)
  */
open class PositionNormalTextureVertex ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.PositionNormalTextureVertex {
  def this(/** the position of the vertex (defaut: 0,0,0) */
  position: typingsJapgolly.babylonjs.BABYLON.Vector3) = this()
  def this(
    /** the position of the vertex (defaut: 0,0,0) */
  position: Unit,
    /** the normal of the vertex (defaut: 0,1,0) */
  normal: typingsJapgolly.babylonjs.BABYLON.Vector3
  ) = this()
  def this(
    /** the position of the vertex (defaut: 0,0,0) */
  position: typingsJapgolly.babylonjs.BABYLON.Vector3,
    /** the normal of the vertex (defaut: 0,1,0) */
  normal: typingsJapgolly.babylonjs.BABYLON.Vector3
  ) = this()
  def this(
    /** the position of the vertex (defaut: 0,0,0) */
  position: Unit,
    /** the normal of the vertex (defaut: 0,1,0) */
  normal: Unit,
    /** the uv of the vertex (default: 0,0) */
  uv: typingsJapgolly.babylonjs.BABYLON.Vector2
  ) = this()
  def this(
    /** the position of the vertex (defaut: 0,0,0) */
  position: Unit,
    /** the normal of the vertex (defaut: 0,1,0) */
  normal: typingsJapgolly.babylonjs.BABYLON.Vector3,
    /** the uv of the vertex (default: 0,0) */
  uv: typingsJapgolly.babylonjs.BABYLON.Vector2
  ) = this()
  def this(
    /** the position of the vertex (defaut: 0,0,0) */
  position: typingsJapgolly.babylonjs.BABYLON.Vector3,
    /** the normal of the vertex (defaut: 0,1,0) */
  normal: Unit,
    /** the uv of the vertex (default: 0,0) */
  uv: typingsJapgolly.babylonjs.BABYLON.Vector2
  ) = this()
  def this(
    /** the position of the vertex (defaut: 0,0,0) */
  position: typingsJapgolly.babylonjs.BABYLON.Vector3,
    /** the normal of the vertex (defaut: 0,1,0) */
  normal: typingsJapgolly.babylonjs.BABYLON.Vector3,
    /** the uv of the vertex (default: 0,0) */
  uv: typingsJapgolly.babylonjs.BABYLON.Vector2
  ) = this()
  
  /** the normal of the vertex (defaut: 0,1,0) */
  /* CompleteClass */
  var normal: typingsJapgolly.babylonjs.BABYLON.Vector3 = js.native
  
  /** the position of the vertex (defaut: 0,0,0) */
  /* CompleteClass */
  var position: typingsJapgolly.babylonjs.BABYLON.Vector3 = js.native
  
  /** the uv of the vertex (default: 0,0) */
  /* CompleteClass */
  var uv: typingsJapgolly.babylonjs.BABYLON.Vector2 = js.native
}
