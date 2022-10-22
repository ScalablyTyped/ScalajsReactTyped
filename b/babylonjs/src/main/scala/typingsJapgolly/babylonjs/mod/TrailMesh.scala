package typingsJapgolly.babylonjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "TrailMesh")
@js.native
open class TrailMesh protected ()
  extends typingsJapgolly.babylonjs.legacyLegacyMod.TrailMesh {
  /**
    * @constructor
    * @param name The value used by scene.getMeshByName() to do a lookup.
    * @param generator The mesh or transform node to generate a trail.
    * @param scene The scene to add this mesh to.
    * @param diameter Diameter of trailing mesh. Default is 1.
    * @param length Length of trailing mesh. Default is 60.
    * @param autoStart Automatically start trailing mesh. Default true.
    */
  def this(name: String, generator: typingsJapgolly.babylonjs.meshesTransformNodeMod.TransformNode) = this()
  def this(
    name: String,
    generator: typingsJapgolly.babylonjs.meshesTransformNodeMod.TransformNode,
    scene: typingsJapgolly.babylonjs.sceneMod.Scene
  ) = this()
  def this(
    name: String,
    generator: typingsJapgolly.babylonjs.meshesTransformNodeMod.TransformNode,
    scene: Unit,
    diameter: Double
  ) = this()
  def this(
    name: String,
    generator: typingsJapgolly.babylonjs.meshesTransformNodeMod.TransformNode,
    scene: typingsJapgolly.babylonjs.sceneMod.Scene,
    diameter: Double
  ) = this()
  def this(
    name: String,
    generator: typingsJapgolly.babylonjs.meshesTransformNodeMod.TransformNode,
    scene: Unit,
    diameter: Double,
    length: Double
  ) = this()
  def this(
    name: String,
    generator: typingsJapgolly.babylonjs.meshesTransformNodeMod.TransformNode,
    scene: Unit,
    diameter: Unit,
    length: Double
  ) = this()
  def this(
    name: String,
    generator: typingsJapgolly.babylonjs.meshesTransformNodeMod.TransformNode,
    scene: typingsJapgolly.babylonjs.sceneMod.Scene,
    diameter: Double,
    length: Double
  ) = this()
  def this(
    name: String,
    generator: typingsJapgolly.babylonjs.meshesTransformNodeMod.TransformNode,
    scene: typingsJapgolly.babylonjs.sceneMod.Scene,
    diameter: Unit,
    length: Double
  ) = this()
  def this(
    name: String,
    generator: typingsJapgolly.babylonjs.meshesTransformNodeMod.TransformNode,
    scene: Unit,
    diameter: Double,
    length: Double,
    autoStart: Boolean
  ) = this()
  def this(
    name: String,
    generator: typingsJapgolly.babylonjs.meshesTransformNodeMod.TransformNode,
    scene: Unit,
    diameter: Double,
    length: Unit,
    autoStart: Boolean
  ) = this()
  def this(
    name: String,
    generator: typingsJapgolly.babylonjs.meshesTransformNodeMod.TransformNode,
    scene: Unit,
    diameter: Unit,
    length: Double,
    autoStart: Boolean
  ) = this()
  def this(
    name: String,
    generator: typingsJapgolly.babylonjs.meshesTransformNodeMod.TransformNode,
    scene: Unit,
    diameter: Unit,
    length: Unit,
    autoStart: Boolean
  ) = this()
  def this(
    name: String,
    generator: typingsJapgolly.babylonjs.meshesTransformNodeMod.TransformNode,
    scene: typingsJapgolly.babylonjs.sceneMod.Scene,
    diameter: Double,
    length: Double,
    autoStart: Boolean
  ) = this()
  def this(
    name: String,
    generator: typingsJapgolly.babylonjs.meshesTransformNodeMod.TransformNode,
    scene: typingsJapgolly.babylonjs.sceneMod.Scene,
    diameter: Double,
    length: Unit,
    autoStart: Boolean
  ) = this()
  def this(
    name: String,
    generator: typingsJapgolly.babylonjs.meshesTransformNodeMod.TransformNode,
    scene: typingsJapgolly.babylonjs.sceneMod.Scene,
    diameter: Unit,
    length: Double,
    autoStart: Boolean
  ) = this()
  def this(
    name: String,
    generator: typingsJapgolly.babylonjs.meshesTransformNodeMod.TransformNode,
    scene: typingsJapgolly.babylonjs.sceneMod.Scene,
    diameter: Unit,
    length: Unit,
    autoStart: Boolean
  ) = this()
}
/* static members */
object TrailMesh {
  
  @JSImport("babylonjs", "TrailMesh")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Parses a serialized trail mesh
    * @param parsedMesh the serialized mesh
    * @param scene the scene to create the trail mesh in
    * @returns the created trail mesh
    */
  inline def Parse(parsedMesh: Any, scene: typingsJapgolly.babylonjs.sceneMod.Scene): typingsJapgolly.babylonjs.meshesTrailMeshMod.TrailMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedMesh.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.meshesTrailMeshMod.TrailMesh]
}
