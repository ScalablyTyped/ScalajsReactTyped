package typingsJapgolly.babylonjs.legacyLegacyMod

import typingsJapgolly.babylonjs.materialsShadowDepthWrapperMod.IIOptionShadowDepthMaterial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "ShadowDepthWrapper")
@js.native
open class ShadowDepthWrapper protected ()
  extends typingsJapgolly.babylonjs.indexMod.ShadowDepthWrapper {
  /**
    * Instantiate a new shadow depth wrapper.
    * It works by injecting some specific code in the vertex/fragment shaders of the base material and is used by a shadow generator to
    * generate the shadow depth map. For more information, please refer to the documentation:
    * https://doc.babylonjs.com/babylon101/shadows
    * @param baseMaterial Material to wrap
    * @param scene Define the scene the material belongs to
    * @param options Options used to create the wrapper
    */
  def this(baseMaterial: typingsJapgolly.babylonjs.materialsMaterialMod.Material) = this()
  def this(
    baseMaterial: typingsJapgolly.babylonjs.materialsMaterialMod.Material,
    scene: typingsJapgolly.babylonjs.sceneMod.Scene
  ) = this()
  def this(
    baseMaterial: typingsJapgolly.babylonjs.materialsMaterialMod.Material,
    scene: Unit,
    options: IIOptionShadowDepthMaterial
  ) = this()
  def this(
    baseMaterial: typingsJapgolly.babylonjs.materialsMaterialMod.Material,
    scene: typingsJapgolly.babylonjs.sceneMod.Scene,
    options: IIOptionShadowDepthMaterial
  ) = this()
}
