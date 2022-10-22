package typingsJapgolly.threeDatGui

import typingsJapgolly.three.mod.Camera
import typingsJapgolly.three.mod.Euler
import typingsJapgolly.three.mod.Fog
import typingsJapgolly.three.mod.FogExp2
import typingsJapgolly.three.mod.Light
import typingsJapgolly.three.mod.Material
import typingsJapgolly.three.mod.Mesh
import typingsJapgolly.three.mod.Object3D
import typingsJapgolly.three.mod.Scene
import typingsJapgolly.three.srcCoreBufferGeometryMod.BufferGeometry
import typingsJapgolly.three.srcCoreEventDispatcherMod.Event
import typingsJapgolly.three.srcMathVector2Mod.Vector
import typingsJapgolly.threeDatGui.anon.GUI
import typingsJapgolly.threeDatGui.anon.Inner
import typingsJapgolly.threeDatGui.anon.Recursive
import typingsJapgolly.threeDatGui.anon.Step
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  // FIXME: Get rid of the "unknown" here.
  inline def apply(dat: GUI): Unit = ^.asInstanceOf[js.Dynamic].apply(dat.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("three-dat.gui", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* augmented module */
  object datGuiAugmentingMod {
    
    @js.native
    trait GUI extends StObject {
      
      def addCamera(name: String, camera: Camera): typingsJapgolly.threeDatGui.mod.datGuiAugmentingMod.GUI = js.native
      
      def addFog(name: String, fog: Fog): typingsJapgolly.threeDatGui.mod.datGuiAugmentingMod.GUI = js.native
      def addFog(name: String, fog: FogExp2): typingsJapgolly.threeDatGui.mod.datGuiAugmentingMod.GUI = js.native
      
      def addLight(name: String, light: Light): typingsJapgolly.threeDatGui.mod.datGuiAugmentingMod.GUI = js.native
      
      def addMaterial(name: String, material: Material): typingsJapgolly.threeDatGui.mod.datGuiAugmentingMod.GUI = js.native
      
      def addMesh(
        name: String,
        mesh: Mesh[
              BufferGeometry, 
              typingsJapgolly.three.srcMaterialsMaterialMod.Material | js.Array[typingsJapgolly.three.srcMaterialsMaterialMod.Material]
            ]
      ): typingsJapgolly.threeDatGui.mod.datGuiAugmentingMod.GUI = js.native
      def addMesh(
        name: String,
        mesh: Mesh[
              BufferGeometry, 
              typingsJapgolly.three.srcMaterialsMaterialMod.Material | js.Array[typingsJapgolly.three.srcMaterialsMaterialMod.Material]
            ],
        options: Recursive
      ): typingsJapgolly.threeDatGui.mod.datGuiAugmentingMod.GUI = js.native
      
      def addObject3D(name: String, mesh: Object3D[Event]): typingsJapgolly.threeDatGui.mod.datGuiAugmentingMod.GUI = js.native
      def addObject3D(name: String, mesh: Object3D[Event], options: Inner): typingsJapgolly.threeDatGui.mod.datGuiAugmentingMod.GUI = js.native
      
      def addScene(name: String, mesh: Object3D[Event]): typingsJapgolly.threeDatGui.mod.datGuiAugmentingMod.GUI = js.native
      def addScene(name: String, mesh: Object3D[Event], options: Recursive): typingsJapgolly.threeDatGui.mod.datGuiAugmentingMod.GUI = js.native
      def addScene(name: String, mesh: Scene): typingsJapgolly.threeDatGui.mod.datGuiAugmentingMod.GUI = js.native
      def addScene(name: String, mesh: Scene, options: Recursive): typingsJapgolly.threeDatGui.mod.datGuiAugmentingMod.GUI = js.native
      
      def addVector(name: String, vector: Euler): typingsJapgolly.threeDatGui.mod.datGuiAugmentingMod.GUI = js.native
      def addVector(name: String, vector: Euler, options: Step): typingsJapgolly.threeDatGui.mod.datGuiAugmentingMod.GUI = js.native
      def addVector(name: String, vector: Vector): typingsJapgolly.threeDatGui.mod.datGuiAugmentingMod.GUI = js.native
      def addVector(name: String, vector: Vector, options: Step): typingsJapgolly.threeDatGui.mod.datGuiAugmentingMod.GUI = js.native
    }
  }
}
