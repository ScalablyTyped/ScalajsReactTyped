package typingsJapgolly.three

import typingsJapgolly.three.examplesJsmWebxrXrhandmeshmodelMod.XRHandMeshModel
import typingsJapgolly.three.srcCoreBufferGeometryMod.BufferGeometry
import typingsJapgolly.three.srcCoreEventDispatcherMod.Event
import typingsJapgolly.three.srcMaterialsMaterialMod.Material
import typingsJapgolly.three.srcThreeMod.Mesh
import typingsJapgolly.three.srcThreeMod.Object3D
import typingsJapgolly.three.srcThreeMod.Texture
import typingsJapgolly.three.srcThreeMod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmWebxrOculusHandModelMod {
  
  @JSImport("three/examples/jsm/webxr/OculusHandModel", "OculusHandModel")
  @js.native
  open class OculusHandModel protected () extends Object3D[Event] {
    def this(controller: Object3D[Event]) = this()
    
    def checkButton(button: Object3D[Event]): Unit = js.native
    
    var controller: Object3D[Event] = js.native
    
    var envMap: Texture | Null = js.native
    
    def getPointerPosition(): Vector3 | Null = js.native
    
    def intersectBoxObject(boxObject: Object3D[Event]): Boolean = js.native
    
    var mesh: (Mesh[BufferGeometry, Material | js.Array[Material]]) | Null = js.native
    
    var motionController: XRHandMeshModel | Null = js.native
  }
}
