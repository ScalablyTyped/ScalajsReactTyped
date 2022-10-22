package typingsJapgolly.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.PositionNormalVertex")
@js.native
/**
  * Creates a PositionNormalVertex
  * @param position the position of the vertex (defaut: 0,0,0)
  * @param normal the normal of the vertex (defaut: 0,1,0)
  */
open class PositionNormalVertex ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.PositionNormalVertex {
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
  
  /** the normal of the vertex (defaut: 0,1,0) */
  /* CompleteClass */
  var normal: typingsJapgolly.babylonjs.BABYLON.Vector3 = js.native
  
  /** the position of the vertex (defaut: 0,0,0) */
  /* CompleteClass */
  var position: typingsJapgolly.babylonjs.BABYLON.Vector3 = js.native
}
