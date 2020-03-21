package typingsJapgolly.three

import typingsJapgolly.three.bufferGeometryMod.BufferGeometry
import typingsJapgolly.three.materialsMod.SpriteMaterial
import typingsJapgolly.three.object3DMod.Object3D
import typingsJapgolly.three.threeBooleans.`true`
import typingsJapgolly.three.vector2Mod.Vector2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/objects/Sprite", JSImport.Namespace)
@js.native
object spriteMod extends js.Object {
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

