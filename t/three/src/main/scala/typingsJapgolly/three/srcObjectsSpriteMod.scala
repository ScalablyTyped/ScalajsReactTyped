package typingsJapgolly.three

import typingsJapgolly.three.srcCoreBufferGeometryMod.BufferGeometry
import typingsJapgolly.three.srcCoreEventDispatcherMod.Event
import typingsJapgolly.three.srcCoreObject3DMod.Object3D
import typingsJapgolly.three.srcMaterialsMaterialsMod.SpriteMaterial
import typingsJapgolly.three.srcMathVector2Mod.Vector2
import typingsJapgolly.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsSpriteMod {
  
  @JSImport("three/src/objects/Sprite", "Sprite")
  @js.native
  open class Sprite () extends Object3D[Event] {
    def this(material: SpriteMaterial) = this()
    
    var center: Vector2 = js.native
    
    var geometry: BufferGeometry = js.native
    
    val isSprite: `true` = js.native
    
    var material: SpriteMaterial = js.native
    
    @JSName("type")
    var type_Sprite: typingsJapgolly.three.threeStrings.Sprite = js.native
  }
}
