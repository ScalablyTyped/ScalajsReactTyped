package typingsJapgolly.three

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.three.srcCoreBufferGeometryMod.BufferGeometry
import typingsJapgolly.three.srcCoreEventDispatcherMod.Event
import typingsJapgolly.three.srcCoreObject3DMod.Object3D
import typingsJapgolly.three.srcMaterialsMaterialMod.Material
import typingsJapgolly.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsMeshMod {
  
  @JSImport("three/src/objects/Mesh", "Mesh")
  @js.native
  open class Mesh[TGeometry /* <: BufferGeometry */, TMaterial /* <: Material | js.Array[Material] */] () extends Object3D[Event] {
    def this(geometry: TGeometry) = this()
    def this(geometry: TGeometry, material: TMaterial) = this()
    def this(geometry: Unit, material: TMaterial) = this()
    
    var geometry: TGeometry = js.native
    
    val isMesh: `true` = js.native
    
    var material: TMaterial = js.native
    
    var morphTargetDictionary: js.UndefOr[StringDictionary[Double]] = js.native
    
    var morphTargetInfluences: js.UndefOr[js.Array[Double]] = js.native
    
    def updateMorphTargets(): Unit = js.native
  }
}
