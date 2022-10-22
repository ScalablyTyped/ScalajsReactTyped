package typingsJapgolly.babylonjs.meshesIndexMod

import typingsJapgolly.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Meshes/index", "GoldbergMesh")
@js.native
open class GoldbergMesh ()
  extends typingsJapgolly.babylonjs.meshesGoldbergMeshMod.GoldbergMesh
/* static members */
object GoldbergMesh {
  
  @JSImport("babylonjs/Meshes/index", "GoldbergMesh")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Parses a serialized goldberg mesh
    * @param parsedMesh the serialized mesh
    * @param scene the scene to create the goldberg mesh in
    * @returns the created goldberg mesh
    */
  inline def Parse(parsedMesh: Any, scene: Scene): typingsJapgolly.babylonjs.meshesGoldbergMeshMod.GoldbergMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedMesh.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.meshesGoldbergMeshMod.GoldbergMesh]
}
