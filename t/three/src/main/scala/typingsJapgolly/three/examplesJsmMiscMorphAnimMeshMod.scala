package typingsJapgolly.three

import typingsJapgolly.three.srcCoreBufferGeometryMod.BufferGeometry
import typingsJapgolly.three.srcMaterialsMaterialMod.Material
import typingsJapgolly.three.srcThreeMod.AnimationAction
import typingsJapgolly.three.srcThreeMod.AnimationMixer
import typingsJapgolly.three.srcThreeMod.Mesh
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmMiscMorphAnimMeshMod {
  
  @JSImport("three/examples/jsm/misc/MorphAnimMesh", "MorphAnimMesh")
  @js.native
  open class MorphAnimMesh protected ()
    extends Mesh[BufferGeometry, Material | js.Array[Material]] {
    def this(
      geometry: typingsJapgolly.three.srcThreeMod.BufferGeometry,
      material: typingsJapgolly.three.srcThreeMod.Material
    ) = this()
    
    var activeAction: AnimationAction | Null = js.native
    
    var mixer: AnimationMixer = js.native
    
    def playAnimation(label: String, fps: Double): Unit = js.native
    
    def setDirectionBackward(): Unit = js.native
    
    def setDirectionForward(): Unit = js.native
    
    def updateAnimation(delta: Double): Unit = js.native
  }
}
