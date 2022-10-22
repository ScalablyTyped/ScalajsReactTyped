package typingsJapgolly.babylonjs.global.BABYLON

import typingsJapgolly.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.MultiMaterial")
@js.native
open class MultiMaterial protected ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.MultiMaterial {
  /**
    * Instantiates a new Multi Material
    * A multi-material is used to apply different materials to different parts of the same object without the need of
    * separate meshes. This can be use to improve performances.
    * @see https://doc.babylonjs.com/how_to/multi_materials
    * @param name Define the name in the scene
    * @param scene Define the scene the material belongs to
    */
  def this(name: String) = this()
  def this(name: String, scene: typingsJapgolly.babylonjs.BABYLON.Scene) = this()
  
  /**
    * Array of animations
    */
  /* CompleteClass */
  var animations: Nullable[js.Array[typingsJapgolly.babylonjs.BABYLON.Animation]] = js.native
}
/* static members */
object MultiMaterial {
  
  @JSGlobal("BABYLON.MultiMaterial")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a MultiMaterial from parsed MultiMaterial data.
    * @param parsedMultiMaterial defines parsed MultiMaterial data.
    * @param scene defines the hosting scene
    * @returns a new MultiMaterial
    */
  inline def ParseMultiMaterial(parsedMultiMaterial: Any, scene: typingsJapgolly.babylonjs.BABYLON.Scene): typingsJapgolly.babylonjs.BABYLON.MultiMaterial = (^.asInstanceOf[js.Dynamic].applyDynamic("ParseMultiMaterial")(parsedMultiMaterial.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.MultiMaterial]
}
