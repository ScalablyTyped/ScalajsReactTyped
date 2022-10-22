package typingsJapgolly.babylonjs.global.BABYLON

import typingsJapgolly.babylonjs.BABYLON.IIOptionShadowDepthMaterial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.ShadowDepthWrapper")
@js.native
open class ShadowDepthWrapper protected ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.ShadowDepthWrapper {
  /**
    * Instantiate a new shadow depth wrapper.
    * It works by injecting some specific code in the vertex/fragment shaders of the base material and is used by a shadow generator to
    * generate the shadow depth map. For more information, please refer to the documentation:
    * https://doc.babylonjs.com/babylon101/shadows
    * @param baseMaterial Material to wrap
    * @param scene Define the scene the material belongs to
    * @param options Options used to create the wrapper
    */
  def this(baseMaterial: typingsJapgolly.babylonjs.BABYLON.Material) = this()
  def this(
    baseMaterial: typingsJapgolly.babylonjs.BABYLON.Material,
    scene: typingsJapgolly.babylonjs.BABYLON.Scene
  ) = this()
  def this(
    baseMaterial: typingsJapgolly.babylonjs.BABYLON.Material,
    scene: Unit,
    options: IIOptionShadowDepthMaterial
  ) = this()
  def this(
    baseMaterial: typingsJapgolly.babylonjs.BABYLON.Material,
    scene: typingsJapgolly.babylonjs.BABYLON.Scene,
    options: IIOptionShadowDepthMaterial
  ) = this()
}
