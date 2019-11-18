package typingsJapgolly.three

import typingsJapgolly.three.srcCoreBufferGeometryMod.BufferGeometry
import typingsJapgolly.three.srcCoreObject3DMod.Object3D
import typingsJapgolly.three.srcMaterialsMaterialsMod.SpriteMaterial
import typingsJapgolly.three.srcMathVector2Mod.Vector2
import typingsJapgolly.three.threeNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/objects/Sprite", JSImport.Namespace)
@js.native
object srcObjectsSpriteMod extends js.Object {
  @js.native
  class Sprite () extends Object3D {
    def this(material: SpriteMaterial) = this()
    var center: Vector2 = js.native
    var geometry: BufferGeometry = js.native
    var isSprite: `true` = js.native
    var material: SpriteMaterial = js.native
    @JSName("type")
    var type_Sprite: typingsJapgolly.three.threeStrings.Sprite = js.native
  }
  
}

