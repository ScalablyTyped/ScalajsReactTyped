package typingsJapgolly.three

import typingsJapgolly.three.srcCoreObject3DMod.Object3D
import typingsJapgolly.three.srcMaterialsMaterialMod.Material
import typingsJapgolly.three.srcMathColorMod.Color
import typingsJapgolly.three.srcScenesFogMod.IFog
import typingsJapgolly.three.srcTexturesTextureMod.Texture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/scenes/Scene", JSImport.Namespace)
@js.native
object srcScenesSceneMod extends js.Object {
  @js.native
  class Scene () extends Object3D {
    var autoUpdate: Boolean = js.native
    var background: Null | Color | Texture = js.native
    /**
    	 * A fog instance defining the type of fog that affects everything rendered in the scene. Default is null.
    	 */
    var fog: IFog | Null = js.native
    /**
    	 * If not null, it will force everything in the scene to be rendered with that material. Default is null.
    	 */
    var overrideMaterial: Material | Null = js.native
    @JSName("type")
    var type_Scene: typingsJapgolly.three.threeStrings.Scene = js.native
    def dispose(): Unit = js.native
    def toJSON(meta: js.Any): js.Any = js.native
  }
  
}

