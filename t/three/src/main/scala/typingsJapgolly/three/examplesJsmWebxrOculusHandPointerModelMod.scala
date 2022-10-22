package typingsJapgolly.three

import typingsJapgolly.three.examplesJsmWebxrXrhandmeshmodelMod.XRHandMeshModel
import typingsJapgolly.three.srcCoreBufferGeometryMod.BufferGeometry
import typingsJapgolly.three.srcCoreEventDispatcherMod.Event
import typingsJapgolly.three.srcCoreRaycasterMod.Intersection
import typingsJapgolly.three.srcMaterialsMaterialMod.Material
import typingsJapgolly.three.srcThreeMod.Mesh
import typingsJapgolly.three.srcThreeMod.MeshBasicMaterial
import typingsJapgolly.three.srcThreeMod.Object3D
import typingsJapgolly.three.srcThreeMod.Raycaster
import typingsJapgolly.three.srcThreeMod.Texture
import typingsJapgolly.three.srcThreeMod.Vector3
import typingsJapgolly.webxr.XRInputSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmWebxrOculusHandPointerModelMod {
  
  @JSImport("three/examples/jsm/webxr/OculusHandPointerModel", "OculusHandPointerModel")
  @js.native
  open class OculusHandPointerModel protected () extends Object3D[Event] {
    def this(hand: Object3D[Event], controller: Object3D[Event]) = this()
    
    /* private */ def _drawVerticesRing(vertices: js.Array[Double], baseVector: Vector3, ringIndex: Double): Unit = js.native
    
    /* private */ def _updatePointer(): Unit = js.native
    
    /* private */ def _updatePointerVertices(rearRadius: Double): Unit = js.native
    
    /* private */ def _updateRaycaster(): Unit = js.native
    
    var attached: Boolean = js.native
    
    def checkIntersections(objects: js.Array[Object3D[Event]]): Unit = js.native
    def checkIntersections(objects: js.Array[Object3D[Event]], recursive: Boolean): Unit = js.native
    
    var controller: Object3D[Event] = js.native
    
    def createPointer(): Unit = js.native
    
    var cursorObject: (Mesh[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SphereBufferGeometry */ Any, 
        MeshBasicMaterial
      ]) | Null = js.native
    
    var envMap: Texture | Null = js.native
    
    var hand: Object3D[Event] = js.native
    
    def intersectObject(`object`: Object3D[Event]): js.Array[Intersection[typingsJapgolly.three.srcCoreObject3DMod.Object3D[Event]]] | Unit = js.native
    def intersectObject(`object`: Object3D[Event], recursive: Boolean): js.Array[Intersection[typingsJapgolly.three.srcCoreObject3DMod.Object3D[Event]]] | Unit = js.native
    
    def intersectObjects(objects: js.Array[Object3D[Event]]): js.Array[Intersection[typingsJapgolly.three.srcCoreObject3DMod.Object3D[Event]]] | Unit = js.native
    def intersectObjects(objects: js.Array[Object3D[Event]], recursive: Boolean): js.Array[Intersection[typingsJapgolly.three.srcCoreObject3DMod.Object3D[Event]]] | Unit = js.native
    
    def isAttached(): Boolean = js.native
    
    def isPinched(): Boolean = js.native
    
    var mesh: (Mesh[BufferGeometry, Material | js.Array[Material]]) | Null = js.native
    
    var motionController: XRHandMeshModel | Null = js.native
    
    var pinched: Boolean = js.native
    
    var pointerGeometry: typingsJapgolly.three.srcThreeMod.BufferGeometry | Null = js.native
    
    var pointerMesh: (Mesh[typingsJapgolly.three.srcThreeMod.BufferGeometry, MeshBasicMaterial]) | Null = js.native
    
    var pointerObject: Object3D[Event] | Null = js.native
    
    var raycaster: Raycaster = js.native
    
    def setAttached(attached: Boolean): Unit = js.native
    
    def setCursor(distance: Double): Unit = js.native
    
    var xrInputSource: XRInputSource = js.native
  }
}
